import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import files.demoPayload;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.lang.Object;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class JiraSessionFilterDemo {
	
	@Test(dataProvider = "JiraCredentials")
	public static void sessionFilterDemo(String username, String password)
	{
		RestAssured.baseURI = "http://localhost:8080";
		
		SessionFilter sessioncookie = new SessionFilter();
		
		//login
		String response = given().relaxedHTTPSValidation().log().all().header("Content-Type","application/json").and().header("User-Agent","PostmanRuntime/7.37.3").and()
				.header("Connection","keep-alive").and()
				.body(demoPayload.CookieAutorizationdata(username,password))
		.filter(sessioncookie).when().post("/rest/auth/1/session")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		//create issue
		String response1 = given().log().all().header("Content-Type","application/json").and().header("User-Agent","PostmanRuntime/7.37.3").and()
				.header("Connection","keep-alive").and().header("Accept", "*/*").and()
				.body(demoPayload.createissuePayload())
		.filter(sessioncookie).when().post("rest/api/2/issue")
		.then().log().all().assertThat().statusCode(201).extract().response().asString();
		System.out.println(response1);
				
		JsonPath jp = new JsonPath(response1);
		String issueID = jp.getString("id");
		
				
		//Add comment
		String expectedMessage = "Adding comments and attachments from Eclipse Test";
		given().pathParam("key",issueID).log().all().header("Accept","*/*").header("Connection",sessioncookie)
			.header("Content-Type","application/json")
			//.and().body(demoPayload.addCommnet())
			.and().body("{\r\n"
				+ "    \"body\": \""+expectedMessage+"\",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}")
		.filter(sessioncookie).when().post("/rest/api/2/issue/{key}/comment")
		.then().log().all().assertThat().statusCode(201);
		
	
		//Send an attachment
		String attachmentPath = "C:\\Users\\bbdnet10211\\eclipse-workspace\\Demo_RestAssuredFramework\\Resource\\JiraAPIAttachment";
		given().pathParam("key",issueID).log().all().header("X-Atlassian-Token", "no-check")
			.header("Content-Type","multipart/form-data")
			.multiPart("file", new File(attachmentPath))
		.filter(sessioncookie).when().post("rest/api/2/issue/{key}/attachments")
		.then().log().all().assertThat().statusCode(200);
		
		
		//get issue with all fields
		given().pathParam("key",issueID).log().all()
		.filter(sessioncookie).when().get("rest/api/2/issue/{key}")
		.then().log().all().assertThat().statusCode(200);
		
		
		//parsing json response from get with selected fields and verify that the comment and attachment was added
		String issueDetails = given().pathParam("key",issueID).queryParam("fileds","comment").log().all()
		.filter(sessioncookie).when().get("rest/api/2/issue/{key}")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath jp1 = new JsonPath(issueDetails);
		String commentID = jp1.get("fields.comment.comments.id").toString();//to convert the id to string
		if(commentID.equalsIgnoreCase(issueID))  //to make sure that comment of same issue is fetched
		{
			String comment = jp1.get("fields.comment.comments.id.body").toString(); //get the comment body
			Assert.assertEquals(comment, expectedMessage);
			System.out.println("Comment = "+comment);
		}
		
		
		
	}
	
	@DataProvider(name="JiraCredentials")
	public static Object[][] getCredentials()
	{
		Object[][] data = {{"pinky","APItesting"}};
		return data;
	}
	
	

}
