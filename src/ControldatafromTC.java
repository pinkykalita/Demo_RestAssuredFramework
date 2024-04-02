import org.testng.annotations.Test;
import files.DemoReusableMethod;
import files.demoPayload;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class ControldatafromTC {
	
	@Test
	public void addBook()
	{
		RestAssured.baseURI = "http://216.10.245.166";
		
		String response = given().log().all().header("Content-Type", "application/json")
		//.body(demoPayload.addBook("2274545456","testISBN"))
		.body(demoPayload.addBookData())
		.when().post("Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath jp = DemoReusableMethod.rawToJson(response);
		String id = jp.getString("ID");
		System.out.println("ID= "+id);
		
		
	}
	
	
	@Test
	public void addBookSendDatafromTC()
	{
		RestAssured.baseURI = "http://216.10.245.166";
		
		String response = given().log().all().header("Content-Type", "application/json")
		.body(demoPayload.addBookfromTC("20001","testtytyISBN"))
		.when().post("Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath jp = new JsonPath(response);
		String id = jp.getString("ID");
		System.out.println("ID= "+id);
		
		
	}

}
