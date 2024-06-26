package Resources;

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
	getMandateBatchAPI("authenticated/mandate-batch/{mandateBatchKey}"),
	cancelMandateBatchAPI("authenticated/mandate-batch/cancel/{mandateBatchKey}"),
	updateMandateBatchAPI("authenticated/mandate-batch/update/{mandateBatchKey}"),
	singleMandateBatchAuthoriseAPI("authenticated/mandate-batch/authorise"),
	multipleMandateBatchAuthoriseAPI("authenticated/mandate-batch/authorise-multiple"),
	singleMandateBatchAuditAPI("authenticated/mandate-batch/audit"),
	multipleMandateBatchAuditAPI("authenticated/mandate-batch/audit-multiple"),
	singleMandateBatchDeclineAPI("authenticated/mandate-batch/decline"),
	multipleMandateBatchDeclineAPI("authenticated/mandate-batch/decline-multiple");
	
	
	
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
