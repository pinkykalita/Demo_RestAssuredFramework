
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import files.demoPayload;
import org.testng.annotations.DataProvider;
import java.lang.Object;
import io.restassured.path.json.JsonPath;


public class JiraAPI {
	
	
	
	@Test(dataProvider = "JiraCredentials")
	public static void CookieAuthentication(String username, String password)
	{
		RestAssured.baseURI = "http://localhost:8080";
		
		
		String response = given().log().all().header("Content-Type","application/json").and().header("User-Agent","PostmanRuntime/7.37.3").and()
			.header("Connection","keep-alive").and()
			.body(demoPayload.CookieAutorizationdata(username,password))
		.when().post("/rest/auth/1/session")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath jp = new JsonPath(response);
		String sessionCookie = jp.getString("session.value");
		System.out.println("Session cookie value= "+sessionCookie);
		
		//create issue
		String response1 = given().log().all().header("Content-Type","application/json").and().header("User-Agent","PostmanRuntime/7.37.3").and()
			.header("Connection","keep-alive").and().header("Accept", "*/*").and().header("cookie",sessionCookie).and()
			.body(demoPayload.createissuePayload())
		.when().post("rest/api/2/issue")
		.then().log().all().assertThat().statusCode(201).extract().response().asString();
		System.out.println(response1);
		
		JsonPath jp1 = new JsonPath(response1);
		String issueID = jp1.getString("id");
		System.out.println("issueID= "+issueID);
		
		//add comment using dynamic issue ID
		given().pathParam("key", issueID).log().all().header("Content-Type","application/json").and().header("User-Agent","PostmanRuntime/7.37.3").and()
		.header("Connection","keep-alive").and().header("Accept", "*/*").and().header("cookie",sessionCookie).and()
			.body(demoPayload.addCommnet())
		.when().post("rest/api/2/issue/{key}/comment")
		.then().log().all().assertThat().statusCode(201);	
		
		
	}
		
		
	
	
	

	
	
	
	@DataProvider(name="JiraCredentials")
	public static Object[][] getCredentials()
	{
		Object[][] data = {{"pinky","APItesting"}};
		return data;
	}
	
}
