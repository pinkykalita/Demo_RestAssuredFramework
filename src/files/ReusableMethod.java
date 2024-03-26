package files;

import io.restassured.path.json.JsonPath;

public class ReusableMethod {
	
	public static JsonPath rawToJson(String getupdatedresponse)
	{
		JsonPath jp1 = new JsonPath(getupdatedresponse);
		return jp1;
	}

}
