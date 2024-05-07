package Resources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import POJO.GenerateToken;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Utils {

	RequestSpecification accessTokenRequestSpec;
	ResponseSpecification responseSpec;
	SessionFilter session;
	RequestSpecification requestSpec;
	
	public RequestSpecification accessTokenRequest() throws IOException
	{
		RestAssured.useRelaxedHTTPSValidation();
		session = new SessionFilter();
		accessTokenRequestSpec = new RequestSpecBuilder()
				.setBaseUri(getGlobalValues("generateToken"))
				.addFormParam("client_id", "0c7b708b-d115-4955-868f-af34dd01012f").and()
				.addFormParam("client_secret", "S3cr3t-75bf6-522ed").and()
				.addFormParam("grant_type", "client_credentials").and()
				.addFormParam("Bearer", "    \"access_token\": \"eyJhbGciOiJSUzI1NiIsImtpZCI6ImRpZC0xIiwicGkuYXRtIjoieHkwaCJ9.eyJzY3AiOltdLCJhdXRob3JpemF0aW9uX2RldGFpbHMiOltdLCJjbGllbnRfaWQiOiIwYzdiNzA4Yi1kMTE1LTQ5NTUtODY4Zi1hZjM0ZGQwMTAxMmYiLCJpc3MiOiJodHRwczovL2VudGVycHJpc2VzdHNzaXQuc3RhbmRhcmRiYW5rLmNvLnphIiwianRpIjoibEJ4SXhwTFNzVGhoV1NCTm5TWTNObiIsInN1YiI6IjBjN2I3MDhiLWQxMTUtNDk1NS04NjhmLWFmMzRkZDAxMDEyZiIsIm5iZiI6MTcxMTA4ODEzMCwiaWQiOiIwYzdiNzA4Yi1kMTE1LTQ5NTUtODY4Zi1hZjM0ZGQwMTAxMmYiLCJpYXQiOjE3MTEwODgxMzAsImV4cCI6MTcxMTA5MTczMH0.YRKuK35ME9ggWE6tNNiGNFcd9jZtBl7bHR8cQKPbv-X75imccqTEDyRp3d7yOF41lZfh_WDgIZW7Q0DE7X1RJliR0HSqSiMgIaLfDFUc2EGW38VVoVHaIsrGttozir15_wypL84vDyHkh2DWbL06JTejLbNC0YFIJ8lwIGfYUGRuILHT00muuZ934BDu_e7jtWFz-_HjGEoeSqyGp0MDLfcCzV9Zy-28ywduBKpGelA5BMjcw7o_DGFnupF3id5kvasaVbQaH0gC9K9jwedjyxgQgNB8BvdocHvuBdDoTkD3YgxpJZ0QmYsDLPQCAl__DE6aN_tlKjCO2fx6em3XjQ\",\r\n"
						+ "")
				.build();
		return accessTokenRequestSpec;
		
	}
	
	public RequestSpecification requestSpecifications() throws IOException
	{
		String accessToken = GenerateToken.getAccessToken();
		if (requestSpec == null)
		{
			PrintStream log = new PrintStream(new FileOutputStream("Log.txt",true));
			
			requestSpec = new RequestSpecBuilder()
					.setBaseUri(getGlobalValues("DevEnv"))
					.setRelaxedHTTPSValidation()
					.addFilter(RequestLoggingFilter.logRequestTo(log))
					.addFilter(ResponseLoggingFilter.logResponseTo(log))
					.addHeader("Authorization", "Bearer " + accessToken)
					.addHeader("Content-Type", "application/json")
					.addHeader("User-Agent", "PostmanRuntime/7.37.0")
					.addHeader("Accept", "*/*")
					.addHeader("Accept-Encoding", "gzip, deflate, br")
					.addHeader("Connection", "keep-alive")
					.build();
		}return requestSpec;
		
		
	}
	
	public static String getGlobalValues(String key) throws IOException {
		
		Properties properties = new Properties();
		FileInputStream propertiesfile = new FileInputStream("src\\test\\java\\Resources\\Global.properties");
		properties.load(propertiesfile);
		return (String) properties.get(key);
	}
	
	public ResponseSpecification responseSpecifications(String expectedStatusCode)
	{
		switch (expectedStatusCode) {
        case "200":
            responseSpec = new ResponseSpecBuilder().expectStatusCode(200).build();
            break;
        case "401":
            responseSpec = new ResponseSpecBuilder().expectStatusCode(401).build();
            break;
        case "403":
            responseSpec = new ResponseSpecBuilder().expectStatusCode(403).build();
            break;
        case "404":
            responseSpec = new ResponseSpecBuilder().expectStatusCode(404).build();
            break;
        case "500":
            responseSpec = new ResponseSpecBuilder().expectStatusCode(500).build();
            break;
        default:
            throw new IllegalArgumentException("Unsupported status code: " + expectedStatusCode);
    }
		return responseSpec;
		
	}
	
	public ResponseSpecification successresponseSpecifications()
	{
		responseSpec = new ResponseSpecBuilder().expectStatusCode(200)
				.build();
		return responseSpec;
	}
		
	public String rawToJson(String generateAccesstoken)
	{
		JsonPath jp = new JsonPath(generateAccesstoken);
		return jp.getString("access_token");
	}
	
	public String getJsonPath(String response, String keyValue)
	{
		JsonPath jp = new JsonPath(response);
		return jp.get(keyValue).toString();
	}
	
}
