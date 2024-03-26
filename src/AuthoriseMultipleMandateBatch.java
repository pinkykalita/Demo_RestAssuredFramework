import static io.restassured.RestAssured.given;

import files.payload;
import io.restassured.RestAssured;

public class AuthoriseMultipleMandateBatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI = "http://localhost:8080";
		given().log().all().header("Content-Type","application/json").and().header("User-Agent","PostmanRuntime/7.37.0").and().header("Accept","*/*")
		.and().header("Accept-Encoding","gzip, deflate, br").and().header("Connection","keep-alive")
		.body(payload.AuthoriseMultipleMandateBatchPayload())
		.when().post("api/v1/mandates/authenticated/mandate-batch/authorise-multiple")
		.then().log().all().assertThat().statusCode(200);

	}

}
