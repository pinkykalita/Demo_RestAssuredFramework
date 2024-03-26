package files;

public class payload {
	
	public static String AuthoriseMandateBatchPayload()
	{
		return "{\r\n"
				+ "    \"action\": \"I\",\r\n"
				+ "    \"authoriseStatus\": \"ACT\",\r\n"
				+ "    \"bankGroupId\": \"Standard Bank Group\",\r\n"
				+ "    \"creationDateAndTime\": \"2018-11-29T22:00:00Z[UTC]\",\r\n"
				+ "    \"customerId\": 373731,\r\n"
				+ "    \"customerUserKey\": \"513632\",\r\n"
				+ "    \"entityStatus\": \"AUTHORISATION_COMPLETE\",\r\n"
				+ "    \"mandateBatchKey\": 11497,\r\n"
				+ "    \"mandateInterchangeKey\": 5539,\r\n"
				+ "    \"messageIdentification\": \"100/MANIN/00210001/20181130/SBSAI2\",\r\n"
				+ "    \"status\": \"SENT_TO_GPP\",\r\n"
				+ "    \"version\": 0,\r\n"
				+ "    \"whenModified\": \"2018-11-30T08:44:38Z[UTC]\"\r\n"
				+ "}";
		
	}
	
	public static String AuthoriseMultipleMandateBatchPayload()
	{
		return "[\r\n"
				+ "    {\r\n"
				+ "    \"action\": \"I\",\r\n"
				+ "    \"authoriseStatus\": \"ACT\",\r\n"
				+ "    \"bankGroupId\": \"Standard Bank Group\",\r\n"
				+ "    \"creationDateAndTime\": \"2018-11-29T22:00:00Z[UTC]\",\r\n"
				+ "    \"customerId\": 373731,\r\n"
				+ "    \"customerUserKey\": \"513632\",\r\n"
				+ "    \"entityStatus\": \"AUTHORISATION_COMPLETE\",\r\n"
				+ "    \"mandateBatchKey\": 11497,\r\n"
				+ "    \"mandateInterchangeKey\": 5539,\r\n"
				+ "    \"messageIdentification\": \"100/MANIN/00210001/20181130/SBSAI2\",\r\n"
				+ "    \"status\": \"SENT_TO_GPP\",\r\n"
				+ "    \"version\": 0,\r\n"
				+ "    \"whenModified\": \"2018-11-30T08:44:38Z[UTC]\"\r\n"
				+ "    }\r\n"
				+ "]";
		
	}
	
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
	
	
	public static String CreateMandateProcessingOptionsPayload()
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

}
