package za.co.sb.mandates.resources;

public enum ResourceURL {
	
	generateTokenAPI("https://enterprisestssit.standardbank.co.za/as/token.oauth2"),
	createProcessingOptionsAPI("authenticated/processing-options"),
	GetAndUpdateProcessingOptionsAPI("authenticated/processing-options/{mandateProcessingOptionsKey}"),
	createMandateInterchangeAPI("authenticated/mandate-interchange"),
	getMandateInterchangeWithKeyAPI("authenticated/mandate-interchange/{mandateInterchangeKey}"),
	getMandateInterchangeWithQueryParamsAPI("authenticated/mandate-interchange"),
	updateMandateInterchangeAPI("authenticated/mandate-interchange/{mandateInterchangeKey}"),
	UploadMandateFileAPI("authenticated/upload-mandate-file"),
	CreateMandateBatchAPI("authenticated/mandate-batch/create"),
	getMandateBatchAPICustomerId("authenticated/mandate-batch/{customerId}"),
	getMandateBatchAPICustomerIdMandteBatchKey("authenticated/mandate-batch/{customerId}/{mandateBatchKey}"),
	getMandateBatchAPI("authenticated/mandate-batch/{mandateBatchKey}"),
	cancelMandateBatchAPI("authenticated/mandate-batch/cancel/{mandateBatchKey}"),
	updateMandateBatchAPI("authenticated/mandate-batch/update/{mandateBatchKey}"),
	createH2HMandateAPI("authenticated/h2h/create-mandate"),
	updateH2HMandateAPI("authenticated/h2h/update-mandate"),
	cancelH2HMandateAPI("authenticated/h2h/cancel-mandate"),
	GPPPainAckAPI("authenticated/gpp-stub"),
	GPPInitiateAcceptRequestAPI("authenticated/gpp-stub");
	
	
	
	
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
