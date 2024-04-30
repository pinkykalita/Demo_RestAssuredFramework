package Resources;

public enum ResourceURL {
	
	generateTokenAPI("https://enterprisestssit.standardbank.co.za/as/token.oauth2"),
	createProcessingOptionsAPI("authenticated/processing-options"),
	GetAndUpdateProcessingOptionsAPI("authenticated/processing-options/{mandateProcessingOptionsKey}"),
	createMandateInterchangeAPI("authenticated/mandate-interchange"),
	getMandateInterchangeWithKeyAPI("authenticated/mandate-interchange/{mandateInterchangeKey}"),
	getMandateInterchangeWithQueryParamsAPI("authenticated/mandate-interchange");
	
	private String resource;
	
	ResourceURL(String resource )
	{
		this.resource = resource;
	}
	
	public String getResource()
	{
		return resource;
	}
}
