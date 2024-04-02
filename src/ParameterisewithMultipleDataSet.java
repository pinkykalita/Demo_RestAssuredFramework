import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import java.lang.Object;
import files.DemoReusableMethod;
import files.demoPayload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class ParameterisewithMultipleDataSet {

	
	 @Test(dataProvider = "data-provider")
	public void addBook(String aisle, String isbn)
	{
		RestAssured.baseURI = "http://216.10.245.166";
		
		String response = given().log().all().header("Content-Type", "application/json")
		.body(demoPayload.addBookfromTC(aisle,isbn))
		.when().post("Library/Addbook.php")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath jp = DemoReusableMethod.rawToJson(response);
		String ID = jp.get("ID");
		System.out.println(ID);	
	}
	
	
	@DataProvider(name = "data-provider")
	public static Object[][] getData()
	{
		 Object[][] data= {{"245","testISBN1"}, {"21230","testISBN2"}, {"454545","testISBN3"}};
		 return(data);
	}
	
	
	
	
}
