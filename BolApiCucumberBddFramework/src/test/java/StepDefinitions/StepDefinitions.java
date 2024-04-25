package StepDefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

import org.testng.Assert;

import POJO.CreateMandateProcessingOptions;
import POJO.GenerateToken;
import Resources.TestDataBuild;
import Resources.Utils;
import io.cucumber.java.Scenario;
//import Files.ReusableMethod;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class StepDefinitions extends Utils{
	
	
	Response responsecode;
	RequestSpecification request;
	RequestSpecification req;
	RequestSpecification req1;
	String actualOptionKey;
	String response;
	SessionFilter session;
	String generateAccesstoken;
	String accessToken;
	Object mandateprocessingoptionsKey;
	
	TestDataBuild data = new TestDataBuild();
	CreateMandateProcessingOptions processingOptionsPayload = new CreateMandateProcessingOptions();

	
	@Given("the Generate Access Token API is available")
	public void the_generate_access_token_api_is_available() 
	{
		session = new SessionFilter();
		req = given().spec(accessTokenRequest());
	}
	@When("a request is sent to generate an access token")
	public void a_request_is_sent_to_generate_an_access_token() {
		generateAccesstoken = req.filter(session).when().log().all()
				.post("https://enterprisestssit.standardbank.co.za/as/token.oauth2")
			.then().spec(responseSpecifications()).extract().response().asString();
		System.out.println("response = "+generateAccesstoken+"\n\n");		
	}	
	@Then("the response should contain a valid access token")
	public void the_response_should_contain_a_valid_access_token() {
		//JsonPath jp = ReusableMethod.rawToJson(generateAccesstoken);
		JsonPath jp = new JsonPath(generateAccesstoken);
		accessToken = jp.getString("access_token");
		GenerateToken.setAccessToken(accessToken);
		System.out.println("accessToken = "+accessToken+"\n\n");
	}

	
	
	@Given("user has request Payload with {string} and access token")
	public void user_has_request_payload_with_and_access_token(String newKey) {
		processingOptionsPayload.setMandateProcessingOptionsKey(newKey);
		request = given().log().all().spec(requestSpecifications())
				.body(data.ProcessingOptionsPayload(newKey));
	}
	@When("user sends a POST request to create a new Mandate Processing Options")
	public void user_sends_a_post_request_to_create_a_new_mandate_processing_options() {
		responsecode = request.when().post("authenticated/processing-options")
				.then().log().all().spec(responseSpecifications()).extract().response();
		response = responsecode.asString();
	}
	@Then("the response status code should be {int}")
	public void the_response_status_code_should_be(Integer expectedStatusCode) {
		assertEquals(responsecode.getStatusCode(),200);
	}
	@And("{string} in response body should be same as {string}")
	public void in_response_body_should_be_same_as(String actualValue, String expectedValue) {
		JsonPath jp1 = new JsonPath(response);
		actualOptionKey = jp1.getString(actualValue);
		assertEquals(actualOptionKey.toString(), expectedValue);
		System.out.println("Request successfull\n");   
	}
	
	
	@Given("the user has a request prepared with the {string}")
	public void the_user_has_a_request_prepared_with_the(String pathParameter) 
	{
		req1 = given().relaxedHTTPSValidation().log().all().spec(requestSpecifications())
				.pathParam("mandateProcessingOptionsKey", pathParameter);
	}
	@When("user sends GET request")
	public void user_sends_get_request()
	{
		responsecode = req1.when().get("authenticated/processing-options/{mandateProcessingOptionsKey}")
				.then().log().all().spec(responseSpecifications()).extract().response();
		response = responsecode.asString();
	}
	
	
	
}
