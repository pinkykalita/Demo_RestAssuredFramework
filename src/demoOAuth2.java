import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.parsing.Parser;

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


public class demoOAuth2 {
	
	@Test
	public static void AuthorizationCodeDemo()
	{
		
		//got string URl manually by hitting the google link given in the postman: https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php
		String url ="https://rahulshettyacademy.com/getCourse.php?state=verifyfjdss&code=4%2FvAHBQUZU6o4WJ719NrGBzSELBFVBI9XbxvOtYpmYpeV47bFVExkaxWaF_XR14PHtTZf7ILSEeamywJKwo_BYs9M&scope=email+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email+openid&authuser=0&session_state=0c32992f0d47e93d273922018ade42d1072b9d1f..a35c&prompt=none#";

		String partialcode=url.split("code=")[1]; //splits the entire string based on "Code=" so now [0] will have the string before code=
		//and at [1] will be other all part of the string appearing after code= delimitter

		String code=partialcode.split("&scope")[0];

		System.out.println(code);

		String response =

		                given().urlEncodingEnabled(false).queryParams("code",code).queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")

		                        .queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")

		                        .queryParams("grant_type", "authorization_code")

		                        .queryParams("state", "verifyfjdss")

		                        .queryParams("session_state", "ff4a89d1f7011eb34eef8cf02ce4353316d9744b..7eb8")

		                     // .queryParam("scope", "email+openid+https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email")

		                       

		                        .queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")

		                        .when().log().all()

		                        .post("https://www.googleapis.com/oauth2/v4/token").asString();

		// System.out.println(response);

		JsonPath jsonPath = new JsonPath(response);

		    String accessToken = jsonPath.getString("access_token");

		    System.out.println(accessToken);

		String r2=    given().contentType("application/json").

		queryParams("access_token", accessToken).expect().defaultParser(Parser.JSON)

		.when()

		           .get("https://rahulshettyacademy.com/getCourse.php")

		.asString();

		System.out.println(r2);



		}



		}
