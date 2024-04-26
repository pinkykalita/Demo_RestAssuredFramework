package Resources;

import POJO.GenerateToken;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.session.SessionFilter;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Utils {

	RequestSpecification accessTokenRequestSpec;
	ResponseSpecification responseSpec;
	SessionFilter session;
	RequestSpecification requestSpec;
	
	public RequestSpecification accessTokenRequest()
	{
		RestAssured.baseURI = "https://mandates.dev.tc01572-dev.afs1-nprd.aws-za.sbgrp.cloud";
		RestAssured.useRelaxedHTTPSValidation();
		session = new SessionFilter();
		
		accessTokenRequestSpec = new RequestSpecBuilder().addFormParam("client_id", "0c7b708b-d115-4955-868f-af34dd01012f").and()
				.addFormParam("client_secret", "S3cr3t-75bf6-522ed").and()
				.addFormParam("grant_type", "client_credentials").and()
				.addFormParam("Bearer", "    \"access_token\": \"eyJhbGciOiJSUzI1NiIsImtpZCI6ImRpZC0xIiwicGkuYXRtIjoieHkwaCJ9.eyJzY3AiOltdLCJhdXRob3JpemF0aW9uX2RldGFpbHMiOltdLCJjbGllbnRfaWQiOiIwYzdiNzA4Yi1kMTE1LTQ5NTUtODY4Zi1hZjM0ZGQwMTAxMmYiLCJpc3MiOiJodHRwczovL2VudGVycHJpc2VzdHNzaXQuc3RhbmRhcmRiYW5rLmNvLnphIiwianRpIjoibEJ4SXhwTFNzVGhoV1NCTm5TWTNObiIsInN1YiI6IjBjN2I3MDhiLWQxMTUtNDk1NS04NjhmLWFmMzRkZDAxMDEyZiIsIm5iZiI6MTcxMTA4ODEzMCwiaWQiOiIwYzdiNzA4Yi1kMTE1LTQ5NTUtODY4Zi1hZjM0ZGQwMTAxMmYiLCJpYXQiOjE3MTEwODgxMzAsImV4cCI6MTcxMTA5MTczMH0.YRKuK35ME9ggWE6tNNiGNFcd9jZtBl7bHR8cQKPbv-X75imccqTEDyRp3d7yOF41lZfh_WDgIZW7Q0DE7X1RJliR0HSqSiMgIaLfDFUc2EGW38VVoVHaIsrGttozir15_wypL84vDyHkh2DWbL06JTejLbNC0YFIJ8lwIGfYUGRuILHT00muuZ934BDu_e7jtWFz-_HjGEoeSqyGp0MDLfcCzV9Zy-28ywduBKpGelA5BMjcw7o_DGFnupF3id5kvasaVbQaH0gC9K9jwedjyxgQgNB8BvdocHvuBdDoTkD3YgxpJZ0QmYsDLPQCAl__DE6aN_tlKjCO2fx6em3XjQ\",\r\n"
						+ "")
				.build();
		return accessTokenRequestSpec;
		
	}
	
	public RequestSpecification requestSpecifications()
	{
		String accessToken = GenerateToken.getAccessToken();
		
		requestSpec = new RequestSpecBuilder().setBaseUri("https://dev.cib.appfactory01.standardbank.co.za/mandates/api/v1/mandates/")
				.setRelaxedHTTPSValidation()
				.addHeader("Authorization", "Bearer " + accessToken)
				.addHeader("Content-Type", "application/json")
				.addHeader("User-Agent", "PostmanRuntime/7.37.0")
				.addHeader("Accept", "*/*")
				.addHeader("Accept-Encoding", "gzip, deflate, br")
				.addHeader("Connection", "keep-alive")
				.build();
		return requestSpec;
		
	}
	
	public ResponseSpecification successresponseSpecifications()
	{
		responseSpec = new ResponseSpecBuilder().expectStatusCode(200)
				.build();
		return responseSpec;
	}
	
	public ResponseSpecification alreadyexistsresponseSpecifications()
	{
		responseSpec = new ResponseSpecBuilder().expectStatusCode(500)
				.build();
		return responseSpec;
	}
	
	public ResponseSpecification unauthorizedresponseSpecifications()
	{
		responseSpec = new ResponseSpecBuilder().expectStatusCode(401)
				.build();
		return responseSpec;
	}
	
	
	
}
