package StepDefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

import java.io.IOException;

import POJO.CreateMandateInterchange;

//import org.testng.Assert;

import POJO.CreateMandateProcessingOptions;
import POJO.GenerateToken;
import Resources.ResourceURL;
import Resources.TestDataBuild;
import Resources.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.filter.session.SessionFilter;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class MandatesAPIStepDefinitions extends Utils{
	
	
	Response responsecode;
	Response reuestResponse;
	Response generateAccesstokenrequest;
	RequestSpecification request;
	RequestSpecification req;
	RequestSpecification req1;
	String actualOptionKey;
	String response;
	SessionFilter session;
	String generateAccesstoken;
	static String accessToken;
	Object mandateprocessingoptionsKey;
	ResourceURL resourceAPI;
	String mandateInterchangeKey;
	
	
	
	TestDataBuild data = new TestDataBuild();
	CreateMandateProcessingOptions processingOptionsPayload = new CreateMandateProcessingOptions();
	CreateMandateInterchange interchangePayload = new CreateMandateInterchange();

	
	/*generate access token*/
	@Given("the Generate Access Token API is available")
	public void the_generate_access_token_api_is_available() throws IOException 
	{
		session = new SessionFilter();
		req = given().spec(accessTokenRequest());
	}
	@When("a request is sent to {string}")
	public void a_request_is_sent_to(String resource) 
	{
		resourceAPI = ResourceURL.valueOf(resource);
		
		generateAccesstokenrequest = req.filter(session).when()
				.post(resourceAPI.getResource());	
	}	
	@Then("the response should contain a valid access token")
	public void the_response_should_contain_a_valid_access_token() {
		generateAccesstoken = generateAccesstokenrequest.then().spec(successresponseSpecifications()).extract().response().asString();
		accessToken = rawToJson(generateAccesstoken);
		GenerateToken.setAccessToken(accessToken);
		System.out.println("accessToken = "+accessToken+"\n\n");
	}

	
	/*create mandate processing option options*/
	@Given("user has request Payload with {string} and access token")
	public void user_has_request_payload_with_and_access_token(String newKey) throws IOException 
	{ 
		processingOptionsPayload.setMandateProcessingOptionsKey(newKey);
		request = given().spec(requestSpecifications())
				.body(data.CreateProcessingOptionsPayload(newKey));
	}
	@When("user sends a POST request to {string}")
	public void user_sends_a_post_request_to(String resource)
	{
		resourceAPI = ResourceURL.valueOf(resource);
		reuestResponse = request.when().post(resourceAPI.getResource());
	}
	@Then("the response status code should be {string}")
	public void the_response_status_code_should_be(String expectedStatusCode)
	{
		responsecode = reuestResponse.then().spec(responseSpecifications(expectedStatusCode)).extract().response();
		int statusCode = responsecode.getStatusCode();
		response = responsecode.asString();
		assertEquals(statusCode,Integer.parseInt(expectedStatusCode));
	}
	@And("{string} in response body should be same as {string}")
	public void in_response_body_should_be_same_as(String keyValue, String expectedValue) 
	{
		assertEquals(getJsonPath(response,keyValue), expectedValue);  
	}
	
	
	/*retrieve mandate option*/
	@Given("the user has a request prepared with the {string}")
	public void the_user_has_a_request_prepared_with_the(String pathParameter) throws IOException 
	{
		req1 = given().relaxedHTTPSValidation().spec(requestSpecifications())
				.pathParam("mandateProcessingOptionsKey", pathParameter);
	}
	@When("user sends {string} request to {string}")
	public void user_sends_request_to(String method, String resource)
	{
		resourceAPI = ResourceURL.valueOf(resource);
		
		switch (method.toUpperCase()) {
        case "GET":
        	reuestResponse = req1.when().get(resourceAPI.getResource());
            break;
        case "PUT":
        	reuestResponse = req1.when().put(resourceAPI.getResource());
            break;
		}
	}
	
	
	/*update mandate processing option*/
	@Given("user has request Payload with {string} and {string}")
	public void user_has_request_payload_with(String pathParameter, String fuAuditRequired) throws IOException
	{
		req1 = given().spec(requestSpecifications()).pathParam("mandateProcessingOptionsKey", pathParameter)
				.body(data.UpdateProcessingOptionsPayload(pathParameter, fuAuditRequired));
	}
	@Then("verify that updated fuAuditRequired should be same as {string} using {string}")
	public void verify_that_updated_fu_audit_required_should_be_same_as_using(String expectedfuAuditRequired, String resource) throws IOException 
	{
		user_sends_request_to("GET",resource);
		String actualfuauditrequired = getJsonPath(response,"fuAuditRequired");
		assertEquals(actualfuauditrequired,expectedfuAuditRequired);
		System.out.println(actualfuauditrequired+" in response is same as the update value  "+expectedfuAuditRequired);
	}
	
	
	/*create mandate with existing mandate processing key*/
	@When("user sends a POST request with existing mandateProcessingOptionsKey to {string}")
	public void user_sends_a_post_request_with_existing_mandate_processing_options_key_to(String resource) 
	{
		resourceAPI = ResourceURL.valueOf(resource);
		reuestResponse = request.when().post(resourceAPI.getResource());
	}
	@Then("the response body should indicate {string}")
	public void the_response_body_should_indicate(String errormMessage) 
	{
		assertEquals(response, errormMessage);
	}
	
	
	/*unauthorized access*/
	@Given("user has request Payload with {string}")
	public void user_has_request_payload_with(String newKey) throws IOException 
	{
		accessToken = "eyJhbGciOiJSUzI1NiIsImtpZCI6ImRpZC0xIiwicGkuYXRtIjoieHkwaCJ9.eyJzY3AiOltdLCJhdXRob3JpemF";
		GenerateToken.setAccessToken(accessToken);
		processingOptionsPayload.setMandateProcessingOptionsKey(newKey);
		request = given().spec(requestSpecifications())
				.body(data.CreateProcessingOptionsPayload(newKey));
	}
	@When("user sends a POST request without bearer token to {string}")
	public void user_sends_a_post_request_without_bearer_token_to(String resource)
	{
		resourceAPI = ResourceURL.valueOf(resource);
		reuestResponse = request.when().post(resourceAPI.getResource());
	}


	/*create Mandate Interchange*/
	@Given("user has request Payload with access token and {string}")
	public void user_has_request_payload_with_access_token_and(String newKey) throws IOException 
	{
		interchangePayload.setCustomerKey(newKey);
		request = given().spec(requestSpecifications())
				.body(data.CreateMandateInterchangePayload(newKey));
	}

	@Then("the response should return {string}")
	public void the_response_should_return(String keyValue)
	{
		
		mandateInterchangeKey = getJsonPath(response,keyValue);
		System.out.println("mandateInterchangeKey returned in response = "+mandateInterchangeKey);
		
	}
	
	/*get Mandate Interchange with Key*/
	@Given("request prepared with {string}")
	public void request_prepared_with(String interchangekey) throws IOException 
	{
		req1 = given().spec(requestSpecifications())
				.pathParam("mandateInterchangeKey", interchangekey);
	}
	
	/*get Mandate Interchange with query parameters*/
	@Given("request prepared with query parameters {string},{string},{string}")
	public void request_prepared_with_query_parameters(String customerkey, String filename, String uploadedusername) throws IOException 
	{
		req1 = given().spec(requestSpecifications())
				.queryParam("customerKey", customerkey)
				.queryParam("fileName", filename)
				.queryParam("uploadedUsername", uploadedusername);
	}
	
	/*No mandate interchange data found*/
	@Given("request prepared with query parameters {string},{string}")
	public void request_prepared_with_query_parameters(String customerkey, String uploadedusername) throws IOException 
	{
		req1 = given().spec(requestSpecifications())
				.queryParam("customerKey", customerkey)
				.queryParam("uploadedUsername", uploadedusername);
    }

}
