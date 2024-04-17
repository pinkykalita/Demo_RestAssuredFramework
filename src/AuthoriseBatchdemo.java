import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.ReusableMethod;
import files.payload;


public class AuthoriseBatchdemo {

		@Test(dataProvider = "credentials")
		public static void authorizeBatch(String customerId,String customerUserKey,String mandateBatchKey,String mandateInterchangeKey)
		{
			RestAssured.baseURI = "http://localhost:8080";
			
			RestAssured.useRelaxedHTTPSValidation();
			
			SessionFilter session = new SessionFilter();
			
			/*Generate accessToken*/
			String generateAccesstoken = given().formParam("client_id", "0c7b708b-d115-4955-868f-af34dd01012f").and()
				.formParam("client_secret", "S3cr3t-75bf6-522ed").and()
				.formParam("grant_type", "client_credentials").and()
				.formParam("Bearer", "    \"access_token\": \"eyJhbGciOiJSUzI1NiIsImtpZCI6ImRpZC0xIiwicGkuYXRtIjoieHkwaCJ9.eyJzY3AiOltdLCJhdXRob3JpemF0aW9uX2RldGFpbHMiOltdLCJjbGllbnRfaWQiOiIwYzdiNzA4Yi1kMTE1LTQ5NTUtODY4Zi1hZjM0ZGQwMTAxMmYiLCJpc3MiOiJodHRwczovL2VudGVycHJpc2VzdHNzaXQuc3RhbmRhcmRiYW5rLmNvLnphIiwianRpIjoibEJ4SXhwTFNzVGhoV1NCTm5TWTNObiIsInN1YiI6IjBjN2I3MDhiLWQxMTUtNDk1NS04NjhmLWFmMzRkZDAxMDEyZiIsIm5iZiI6MTcxMTA4ODEzMCwiaWQiOiIwYzdiNzA4Yi1kMTE1LTQ5NTUtODY4Zi1hZjM0ZGQwMTAxMmYiLCJpYXQiOjE3MTEwODgxMzAsImV4cCI6MTcxMTA5MTczMH0.YRKuK35ME9ggWE6tNNiGNFcd9jZtBl7bHR8cQKPbv-X75imccqTEDyRp3d7yOF41lZfh_WDgIZW7Q0DE7X1RJliR0HSqSiMgIaLfDFUc2EGW38VVoVHaIsrGttozir15_wypL84vDyHkh2DWbL06JTejLbNC0YFIJ8lwIGfYUGRuILHT00muuZ934BDu_e7jtWFz-_HjGEoeSqyGp0MDLfcCzV9Zy-28ywduBKpGelA5BMjcw7o_DGFnupF3id5kvasaVbQaH0gC9K9jwedjyxgQgNB8BvdocHvuBdDoTkD3YgxpJZ0QmYsDLPQCAl__DE6aN_tlKjCO2fx6em3XjQ\",\r\n"
						+ "")
			.filter(session).when().log().all().post("https://enterprisestssit.standardbank.co.za/as/token.oauth2")
			.then().assertThat().statusCode(200).extract().response().asString();
			
			System.out.println("response = "+generateAccesstoken+"\n\n");
			
			JsonPath jp = ReusableMethod.rawToJson(generateAccesstoken);
			String accessToken = jp.getString("access_token");
			
			
			/*AuthoriseMandateBatch*/
			//given().log().all().header("Bearer " + "\"access_token\":"+accessToken+"");
			given().log().all().header("Authorization", "Bearer" + accessToken).header("Content-Type","application/json").and().header("User-Agent","PostmanRuntime/7.37.0").and().header("Accept","*/*")
				.and().header("Accept-Encoding","gzip, deflate, br").and().header("Connection","keep-alive")
				.body(payload.AuthoriseMandateBatchPayload(customerId,customerUserKey,mandateBatchKey,mandateInterchangeKey))
			.filter(session).when().post("/api/v1/mandates/authenticated/mandate-batch/authorise")
			.then().log().all().assertThat().statusCode(200);
			
			
			/*AuthoriseMultipleMandateBatch*/
			given().relaxedHTTPSValidation().log().all().header("Content-Type","application/json").and().header("User-Agent","PostmanRuntime/7.37.0").and().header("Accept","*/*")
				.and().header("Accept-Encoding","gzip, deflate, br").and().header("Connection","keep-alive")
				.body(payload.AuthoriseMultipleMandateBatchPayload(customerId,customerUserKey,mandateBatchKey,mandateInterchangeKey))
			.filter(session).when().post("api/v1/mandates/authenticated/mandate-batch/authorise-multiple")
			.then().log().all().assertThat().statusCode(200);
			
		}
		
	

		@DataProvider(name="credentials")
		public static Object[][] getData()
		{
			Object[][] data = {{"373731","513632","11497","5539"}};
			return data;
		}
	
	
	
	
	
	
}
