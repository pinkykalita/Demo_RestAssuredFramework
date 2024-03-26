import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import files.ReusableMethod;
import files.payload;

public class basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		/*add place*/
		String response = given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").and().header("Connection", "keep-alive").and().header("Accept-Encoding","gzip, deflate, br")
		.and().header("Accept", "*/*").and().header("User-Agent","PostmanRuntime/7.37.0")
		.body(payload.AddlocationPayload())
		.when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope",equalTo("APP"))
		.header("Server","Apache/2.4.52 (Ubuntu)").extract().response().asString();
		
		System.out.println(response);
		
		//JsonPath jp = new JsonPath(response);
		JsonPath jp = ReusableMethod.rawToJson(response);
		String placeID = jp.getString("place_id");
		
		System.out.println("placeID = "+placeID);
		
		/*update place*/
		String newAddress = "new address lane 123 gopanpally 121ooeowfoowoiowiiew";
		given().log().all().header("Content-Type","application/json").and().header("User-Agent","PostmanRuntime/7.37.0")
		.and().header("Accept","*/*").and().header("Accept-Encoding","gzip, deflate, br").and().header("Connection","keep-alive")
		.body("{\r\n"
				+ "\"place_id\":\""+placeID+"\",\r\n"
				+ "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "")
		.when().put("maps/api/place/update/json")
		.then().assertThat().statusCode(200).body("msg",equalTo("Address successfully updated"));
		
		/*get updated address*/
		String getupdatedresponse = given().log().all().queryParam("place_id", placeID).and().queryParam("key","qaclick123")
		.when().get("maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		//System.out.println("response: "+getupdatedresponse);
		
		JsonPath jp1 = ReusableMethod.rawToJson(getupdatedresponse);
		String updatedaddress = jp1.getString("address");
		System.out.println("New address after Put: "+updatedaddress);
		
		Assert.assertEquals(newAddress, updatedaddress);
		
		
	}

}
