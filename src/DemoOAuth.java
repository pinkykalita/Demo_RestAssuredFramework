import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import files.DemoReusableMethod;
import files.demoPayload;

import org.testng.Assert;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.lang.Object;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DemoOAuth {

	@Test
	public static void demoOAuth()
	{
		
		RestAssured.baseURI = "https://rahulshettyacademy.com/";
		
		SessionFilter session = new SessionFilter();
		
		String response = given().formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com").and()
			.formParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W").and()
			.formParam("grant_type", "client_credentials").and()
			.formParam("scope", "trust")
		.when().log().all().post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println("response = "+response);
		
		JsonPath jp = DemoReusableMethod.rawToJson(response);
		String accessToken = jp.getString("access_token");
		
		String result = given().log().all().queryParams("access_token", accessToken)
		.when().get("/oauthapi/getCourseDetails")
		.then().log().all().assertThat().statusCode(401).extract().response().asString();
		
		System.out.println("result = "+result);
	}
	
	
}
