package za.co.sb.mandates.pojo;

public class GenerateToken {
	
	private static String accessToken;

	 public static String getAccessToken() {
		return accessToken;
	}

	public static void setAccessToken(String accessToken) {
		GenerateToken.accessToken = accessToken;
	}

	 
}
