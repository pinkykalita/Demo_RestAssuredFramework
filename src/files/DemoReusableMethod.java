package files;

import io.restassured.path.json.JsonPath;

public class DemoReusableMethod {
	
	public static JsonPath rawToJson(String response)
	{
		JsonPath jp = new JsonPath(response);
		return jp;
	}

}
