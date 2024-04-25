package Resources;

import POJO.CreateMandateProcessingOptions;

public class TestDataBuild {
	
	public CreateMandateProcessingOptions ProcessingOptionsPayload(String newKey)
	{
		CreateMandateProcessingOptions mandateProcessingObject = new CreateMandateProcessingOptions();
		
		mandateProcessingObject.setAcceptanceType("W");
		mandateProcessingObject.setFuAuditRequired("N");
		mandateProcessingObject.setFuAuthorisationRequired("N");
		mandateProcessingObject.setFuInterimAuditType("F");
		mandateProcessingObject.setH2hAuditRequired("Y");
		mandateProcessingObject.setH2hAuthorisationRequired("N");
		mandateProcessingObject.setH2hInterimAuditType("F");
		mandateProcessingObject.setMandateProcessingOptionsKey(newKey);
		mandateProcessingObject.setAcceptanceTypeEnum("AS_AND_WHEN");
		mandateProcessingObject.setFuInterimAuditTypeEnum("FULL");
		mandateProcessingObject.setH2hInterimAuditTypeEnum("FULL");
		
		return mandateProcessingObject;
	}

}
