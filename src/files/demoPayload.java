package files;

public class demoPayload {
	
	
	public static String AddlocationPayload() 
	{
		return "{\r\n"
				+ "  \"location\": {\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "  },\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "  \"name\": \"Old Test Location abc\",\r\n"
				+ "  \"phone_number\": \"(+91) 983 893 3937\",\r\n"
				+ "  \"address\": \"29, side layout, cohen 09\",\r\n"
				+ "  \"types\": [\r\n"
				+ "    \"shoe park\",\r\n"
				+ "    \"shop\"\r\n"
				+ "  ],\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "  \"language\": \"French-IN\"\r\n"
				+ "}\r\n"
				+ "";
	}
		
	
	public static String mockResponse()
	{
		return("\"acceptanceType\": \"W\",\r\n"
				+ "		    \"fuAuditRequired\": \"N\",\r\n"
				+ "		    \"fuAuthorisationRequired\": \"N\",\r\n"
				+ "		    \"fuInterimAuditType\": \"F\",\r\n"
				+ "		    \"h2hAuditRequired\": \"N\",\r\n"
				+ "		    \"h2hAuthorisationRequired\": \"N\",\r\n"
				+ "		    \"h2hInterimAuditType\": \"F\",\r\n"
				+ "		    \"mandateProcessingOptionsKey\": 99991");
	}
	
	
	public static String coursePrice()
	{
		
		return "{\r\n"
				+ "  \"dashboard\": {\r\n"
				+ "    \"purchaseAmount\": 910,\r\n"
				+ "    \"website\": \"rahulshettyacademy.com\"\r\n"
				+ "  },\r\n"
				+ "  \"courses\": [\r\n"
				+ "    {\r\n"
				+ "      \"title\": \"Selenium Python\",\r\n"
				+ "      \"price\": 50,\r\n"
				+ "      \"copies\": 6\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"title\": \"Cypress\",\r\n"
				+ "      \"price\": 40,\r\n"
				+ "      \"copies\": 4\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"title\": \"RPA\",\r\n"
				+ "      \"price\": 45,\r\n"
				+ "      \"copies\": 10\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}\r\n"
				+"";
	}
	
	
	public static String addBookData()
	{
		String addBookPayload = "{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\"bckjkjd\",\r\n"
				+ "\"aisle\":\"22745\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}\r\n"
				+ "";
		return addBookPayload;
	}
	
	public static String addBookfromTC(String aisle, String isbn)
	{
		String addBookPayload = "{\r\n"
				+ "\r\n"
				+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "}\r\n"
				+ "";
		return addBookPayload;
	}

}
