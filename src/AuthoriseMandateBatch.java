import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import files.payload;

public class AuthoriseMandateBatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "http://localhost:8080";
		given().log().all().header("Content-Type","application/json").and().header("User-Agent","PostmanRuntime/7.37.0").and().header("Accept","*/*")
		.and().header("Accept-Encoding","gzip, deflate, br").and().header("Connection","keep-alive")
		.body(payload.AuthoriseMandateBatchPayload())
		.when().post("api/v1/mandates/authenticated/mandate-batch/authorise")
		.then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP"))
		.header("Server","Apache/2.4.52 (Ubuntu)");
	}

}
