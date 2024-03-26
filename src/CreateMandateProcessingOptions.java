import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

import files.payload;

public class CreateMandateProcessingOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "http://localhost:8080";
		
		/*create mandate*/
		String response = given().log().all().header("Content-Type","application/json").and().header("User-Agent","PostmanRuntime/7.37.0")
		.and().header("Accept","*/*").and().header("Accept-Encoding","gzip, deflate, br").and().header("Connection","keep-alive")
		.body(payload.CreateMandateProcessingOptionsPayload())
		.when().post("api/v1/mandates/authenticated/processing-options")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(response);
		
		JsonPath jp = new JsonPath(response);
		String ProcessingOptionsKey = jp.getString("mandateProcessingOptionsKey");
		
		System.out.println("ProcessingOptionsKey = "+ProcessingOptionsKey);
		
		/*update mandate*/
		String newKey = "9999";
		given().log().all().header("Content-Type","application/json").and().header("User-Agent","PostmanRuntime/7.37.0")
		.and().header("Accept","*/*").and().header("Accept-Encoding","gzip, deflate, br").and().header("Connection","keep-alive")
		.body("{\r\n"
				+ "    \"acceptanceType\": \"W\",\r\n"
				+ "    \"fuAuditRequired\": \"N\",\r\n"
				+ "    \"fuAuthorisationRequired\": \"N\",\r\n"
				+ "    \"fuInterimAuditType\": \"F\",\r\n"
				+ "    \"h2hAuditRequired\": \"N\",\r\n"
				+ "    \"h2hAuthorisationRequired\": \"N\",\r\n"
				+ "    \"h2hInterimAuditType\": \"F\",\r\n"
				+ "    \"mandateProcessingOptionsKey\": "+newKey+"\r\n"
				+ "}")
		.when().put("api/v1/mandates/authenticated/processing-options")
		.then().assertThat().statusCode(200).body("put the key for body element to be testted",equalTo("Mandate successfully updated"));
		
		/*get mandate*/
		given().log().all().queryParam("mandateProcessingOptionsKey", newKey)
		.when().get("api/v1/mandates/authenticated/processing-options")
		.then().assertThat().statusCode(200);
		
	}

}
