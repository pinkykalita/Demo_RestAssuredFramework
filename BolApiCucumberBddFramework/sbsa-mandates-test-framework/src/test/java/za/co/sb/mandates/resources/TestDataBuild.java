package za.co.sb.mandates.resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import za.co.sb.mandates.pojo.CancelBatchInstructionList;
import za.co.sb.mandates.pojo.CancelH2HMandate;
import za.co.sb.mandates.pojo.CancelMandateBatch;
import za.co.sb.mandates.pojo.CreateH2HMandate;
import za.co.sb.mandates.pojo.CreateMandateBatch;
import za.co.sb.mandates.pojo.CreateMandateInterchange;
import za.co.sb.mandates.pojo.CreateMandateProcessingOptions;
import za.co.sb.mandates.pojo.ErrorList;
import za.co.sb.mandates.pojo.MandateInstructionList;
import za.co.sb.mandates.pojo.UpdateH2HMandate;
import za.co.sb.mandates.pojo.UpdateMandateBatch;
import za.co.sb.mandates.pojo.UpdateMandateInterchange;
import za.co.sb.mandates.pojo.UpdateMandateProcessingOptions;
import za.co.sb.mandates.pojo.UploadMandateFile;
import za.co.sb.mandates.pojo.gppstub;
import za.co.sb.mandates.pojo.updateBatchInstructionList;



public class TestDataBuild {
	
	public CreateMandateProcessingOptions CreateProcessingOptionsPayload(String newKey)
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
	
	public UpdateMandateProcessingOptions UpdateProcessingOptionsPayload(String Key, String expectedfuAuditRequired)
	{
		UpdateMandateProcessingOptions mandateProcessingObject = new UpdateMandateProcessingOptions();
		
		mandateProcessingObject.setAcceptanceType("W");
		mandateProcessingObject.setFuAuditRequired(expectedfuAuditRequired);
		mandateProcessingObject.setFuAuthorisationRequired("N");
		mandateProcessingObject.setFuInterimAuditType("F");
		mandateProcessingObject.setH2hAuditRequired("Y");
		mandateProcessingObject.setH2hAuthorisationRequired("N");
		mandateProcessingObject.setH2hInterimAuditType("F");
		mandateProcessingObject.setMandateProcessingOptionsKey(Key);
		mandateProcessingObject.setAcceptanceTypeEnum("AS_AND_WHEN");
		mandateProcessingObject.setFuInterimAuditTypeEnum("FULL");
		mandateProcessingObject.setH2hInterimAuditTypeEnum("FULL");
		
		return mandateProcessingObject;
	}
	
	public CreateMandateInterchange CreateMandateInterchangePayload(String newKey)
	{
		CreateMandateInterchange mandateInterchangeObject = new CreateMandateInterchange();
		
		mandateInterchangeObject.setCustomerId("BOL Customer");
		mandateInterchangeObject.setCustomerKey(newKey);
		mandateInterchangeObject.setFailedMandateCount(0);
		mandateInterchangeObject.setFileName("TEST.xml");
		mandateInterchangeObject.setStatus("T");
		mandateInterchangeObject.setSubmissionChannel("File Upload");
		mandateInterchangeObject.setTotalMandateFieldCount(0);
		mandateInterchangeObject.setUploadedUsername("Test User123");
		
		return mandateInterchangeObject;
	}
	
	public UpdateMandateInterchange UpdateMandateInterchangePayload(String key, String filename, String uploadedUsername)
	{
		UpdateMandateInterchange mandateInterchangeObject = new UpdateMandateInterchange();
		
		mandateInterchangeObject.setCreationDateAndTime("2024-03-18T08:04:03.768Z[UTC]");
		mandateInterchangeObject.setCustomerId("BOL Customer");
		mandateInterchangeObject.setCustomerKey(123456);
		mandateInterchangeObject.setFailedMandateCount(0);
		mandateInterchangeObject.setFileName(filename);
		mandateInterchangeObject.setMandateInterchangeKey(key);
		mandateInterchangeObject.setStatus("T");
		mandateInterchangeObject.setSubmissionChannel("File Upload");
		mandateInterchangeObject.setTotalMandateFieldCount(0);
		mandateInterchangeObject.setUploadedUsername(uploadedUsername);
		mandateInterchangeObject.setWhenModified("2024-03-18T08:04:03.768Z[UTC]");
		
		return mandateInterchangeObject;
	}

	public UploadMandateFile uploadMandateFilePayload() throws IOException
	{
		UploadMandateFile fileUploadObject = new UploadMandateFile();
		
		//String filePath = "C:\\Users\\bbdnet10211\\eclipse-workspace\\BOLAPIFramework\\src\\test\\java\\Resources\\uploadMandateFile";
		String filePath = "src\\test\\java\\za\\co\\sb\\mandates\\resources\\uploadMandateFile";

		String payload = readFileAsString(filePath);
		
		fileUploadObject.setMandateInterchangeId(10);
		fileUploadObject.setPayload(payload);
		fileUploadObject.setMandateMessageType("I");
		fileUploadObject.setExternalReference01("ref1");
		fileUploadObject.setExternalReference02("ref2");
		fileUploadObject.setMessageName("ABC");
		fileUploadObject.setTargetPartnerId("09876");
		
		return fileUploadObject;
	}
	
	public static String readFileAsString(String filePath) throws IOException 
	{
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
	
	public UploadMandateFile uploadMandateFile204Payload() throws IOException
	{
		UploadMandateFile fileUploadObject = new UploadMandateFile();
		
		//String filePath = "C:\\Users\\bbdnet10211\\eclipse-workspace\\BOLAPIFramework\\src\\test\\java\\Resources\\uploadMandateFile204";
		String filePath = "src\\test\\java\\za\\co\\sb\\mandates\\resources\\uploadMandateFile204";

		String payload = readFileAsString(filePath);
		
		fileUploadObject.setMandateInterchangeId(11);
		fileUploadObject.setPayload(payload);
		fileUploadObject.setMandateMessageType("I");
		fileUploadObject.setExternalReference01("ref1");
		fileUploadObject.setExternalReference02("ref2");
		fileUploadObject.setMessageName("ABC");
		fileUploadObject.setTargetPartnerId("09877");
		
		return fileUploadObject;
	}
	
	public UploadMandateFile uploadMandateFile403Payload() throws IOException
	{
		UploadMandateFile fileUploadObject = new UploadMandateFile();
		
		//String filePath = "C:\\Users\\bbdnet10211\\eclipse-workspace\\BOLAPIFramework\\src\\test\\java\\Resources\\uploadMandateFile403";
		String filePath = "src\\test\\java\\za\\co\\sb\\mandates\\resources\\uploadMandateFile403";

		String payload = readFileAsString(filePath);
		
		fileUploadObject.setMandateInterchangeId(11);
		fileUploadObject.setPayload(payload);
		fileUploadObject.setMandateMessageType("I");
		fileUploadObject.setExternalReference01("ref1");
		fileUploadObject.setExternalReference02("ref2");
		fileUploadObject.setMessageName("ABC");
		fileUploadObject.setTargetPartnerId("09877");
		
		return fileUploadObject;
	}
	
	public UploadMandateFile uploadMandateFile500Payload() throws IOException
	{
		UploadMandateFile fileUploadObject = new UploadMandateFile();
		
		//String filePath = "C:\\Users\\bbdnet10211\\eclipse-workspace\\BOLAPIFramework\\src\\test\\java\\Resources\\uploadMandateFile500";
		String filePath = "src\\test\\java\\za\\co\\sb\\mandates\\resources\\uploadMandateFile500";

		String payload = readFileAsString(filePath);
		
		fileUploadObject.setMandateInterchangeId(11);
		fileUploadObject.setPayload(payload);
		fileUploadObject.setMandateMessageType("I");
		fileUploadObject.setExternalReference01("ref1");
		fileUploadObject.setExternalReference02("ref2");
		fileUploadObject.setMessageName("ABC");
		fileUploadObject.setTargetPartnerId("09877");
		
		return fileUploadObject;
	}
	
	public CreateH2HMandate createH2HMandatePayload(String contractreference, String clientreference, String messageidentification) throws ParseException
	{
		CreateH2HMandate H2HmandateObject = new CreateH2HMandate();
		H2HmandateObject.setCountryCode("ZA");
		H2HmandateObject.setMessageIdentification(messageidentification);
		Date creationDateAndTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2024-06-14T09:33:00Z[UTC]");
		H2HmandateObject.setCreationDateTime(creationDateAndTime);
		H2HmandateObject.setInitiatingParty("TestCustName3");
		H2HmandateObject.setClientReference(clientreference);
		H2HmandateObject.setContractReference(contractreference);
		H2HmandateObject.setTrackingIndicator("T");
		H2HmandateObject.setDebtorAuthenticationRequired("0227");
		H2HmandateObject.setInstallmentOccurrence("RCUR");
		H2HmandateObject.setFrequency("MNTH");
		Date mandateInitiationDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2024-06-14T09:33:00Z[UTC]");
		H2HmandateObject.setMandateInitiationDate(mandateInitiationDate);
		H2HmandateObject.setInstallmentAmount(500.00);
		H2HmandateObject.setInstallmentAmountCurrency("ZAR");
		H2HmandateObject.setMaximumCollectionAmountCurrency("ZAR");
		H2HmandateObject.setMaximumCollectionAmount(750.00);
		H2HmandateObject.setCreditorName("TM Lesotho Customer 14");
		H2HmandateObject.setCreditorTelephoneContactDetails("+27-77045632");
		H2HmandateObject.setCreditorAccountNumber("072843799");
		H2HmandateObject.setCreditorBankBranchNumber("020909");
		H2HmandateObject.setCreditorAbbreviatedShortName("ACMandates");
		H2HmandateObject.setDebtorName("Vodacom");
		H2HmandateObject.setDebtorIdentification("9005127904092");
		H2HmandateObject.setDebtorAccountNumber("04047846102");
		H2HmandateObject.setDebtorAccountType("SVGS");
		H2HmandateObject.setDebtorBankBranchNumber("301105");
		H2HmandateObject.setDebtorIdentificationType("I");
		H2HmandateObject.setAuthenticationType("REAL TIME");
		H2HmandateObject.setRequestTransmissionNumber(1);
		H2HmandateObject.setCollectionDay("06");
		H2HmandateObject.setDateAdjustmentRuleIndicator("N");
		H2HmandateObject.setAdjustmentCategory("N");
		H2HmandateObject.setDebitValueType("VARIABLE");
		
		return H2HmandateObject;
	}
	
	public UpdateH2HMandate updateH2HMandatePayload(String originalcontractreference, String originalclientreference, String messageidentification) throws ParseException
	{
		UpdateH2HMandate updateH2HmandateObject = new UpdateH2HMandate();
		
		updateH2HmandateObject.setCountryCode("za");
		updateH2HmandateObject.setMessageIdentification(messageidentification);
		Date creationDateAndTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2024-06-18T09:33:00Z[UTC]");
		updateH2HmandateObject.setCreationDateTime(creationDateAndTime);
		updateH2HmandateObject.setInitiatingParty("TestCustName");
		updateH2HmandateObject.setAmendmentReason("MD18");
		updateH2HmandateObject.setClientReference("27349246745ServiceTestPinky");
		updateH2HmandateObject.setDebtorAuthenticationRequired("0227");
		updateH2HmandateObject.setInstallmentOccurrence("RCUR");
		updateH2HmandateObject.setCreditorAbbreviatedShortName("OMFINANCE");
		updateH2HmandateObject.setOriginalClientReference(originalclientreference);
		updateH2HmandateObject.setOriginalContractReference(originalcontractreference);
		updateH2HmandateObject.setOriginalCreditorName("TM Lesotho Customer 14");
		updateH2HmandateObject.setOriginalDebtorName("Vodacom");
		updateH2HmandateObject.setOriginalDebtorBankBranchNumber("301105");
		updateH2HmandateObject.setAuthenticationType("REAL TIME");
		updateH2HmandateObject.setRequestTransmissionNumber(1);
		updateH2HmandateObject.setCollectionDay("06");
		updateH2HmandateObject.setInstallmentAmountCurrency("ZAR");
		updateH2HmandateObject.setInstallmentAmount(500.00);
		updateH2HmandateObject.setDebtorName("Vodacom");
		updateH2HmandateObject.setDebtorAccountType("SVGS");
		updateH2HmandateObject.setDebtorBankBranchNumber("632005");
		updateH2HmandateObject.setMessageAuthenticationCode("IWYE9822");
		updateH2HmandateObject.setMandateReferenceNumber("16803");
		
		return updateH2HmandateObject;
		
	}
	
	
	public CancelH2HMandate CancelH2HMandatePayload(String originalcontractreference, String originalclientreference, String messageidentification) throws ParseException
	{
		CancelH2HMandate cancelH2HMandateObject = new CancelH2HMandate();
		
		cancelH2HMandateObject.setCountryCode("ZA");
		cancelH2HMandateObject.setMessageIdentification(messageidentification);
		Date creationDateAndTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2024-06-18T12:55:00Z[UTC]");
		cancelH2HMandateObject.setCreationDateTime(creationDateAndTime);
		cancelH2HMandateObject.setInitiatingParty("pinky kalita");
		cancelH2HMandateObject.setCancellationReason("CEXP");
		cancelH2HMandateObject.setOriginalClientReference(originalclientreference);
		cancelH2HMandateObject.setOriginalContractReference(originalcontractreference);
		cancelH2HMandateObject.setOriginalTrackingCancellationIndicator("T");
		cancelH2HMandateObject.setOriginalCreditorName("TM Lesotho Customer 14");
		cancelH2HMandateObject.setOriginalCreditorAbbreviatedShortName("ACMandates");
		cancelH2HMandateObject.setOriginalDebtorAccountName("Vodacom");
		cancelH2HMandateObject.setOriginalDebtorBankBranchNumber("301105");
		cancelH2HMandateObject.setAuthenticationType("REAL TIME");
		cancelH2HMandateObject.setRequestTransmissionNumber(1);
		cancelH2HMandateObject.setOriginalMandateReferenceNumber("16803");
		
		return cancelH2HMandateObject;
		
	}
	
	
	public gppstub gppstubPayload(String messagetype, String originalmessageRequestTransactionId, String messageidentification) throws IOException
	{
		gppstub gppstubObject = new gppstub();
		
		String filePath = "src\\test\\java\\za\\co\\sb\\mandates\\resources\\gppmessage";
		String gppmessage = readFileAsString(filePath);
		
		gppstubObject.setMessageType(messagetype);
		gppstubObject.setKey("onlyiknowthekey");
		gppstubObject.setMessageIdentification(messageidentification);
		gppstubObject.setOriginalMessageRequestTransactionId(originalmessageRequestTransactionId);
		gppstubObject.setGppMessage(gppmessage);
		
		return gppstubObject;
	}
	
	
	
	
	
}
