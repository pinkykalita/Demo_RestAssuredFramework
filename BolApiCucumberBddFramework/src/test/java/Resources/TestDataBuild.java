package Resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import POJO.AuthorizeMandate;
import POJO.CancelBatchInstructionList;
import POJO.CancelMandateBatch;
import POJO.CreateMandateBatch;
import POJO.CreateMandateInterchange;
import POJO.CreateMandateProcessingOptions;
import POJO.ErrorList;
import POJO.MandateInstructionList;
import POJO.UpdateMandateBatch;
import POJO.UpdateMandateInterchange;
import POJO.UpdateMandateProcessingOptions;
import POJO.UploadMandateFile;
import POJO.updateBatchInstructionList;



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
		
		mandateInterchangeObject.setCreationDateAndTime("2024-03-18T08:04:03.768Z[UTC]");
		mandateInterchangeObject.setCustomerId("BOL Customer");
		mandateInterchangeObject.setCustomerKey(newKey);
		mandateInterchangeObject.setFailedMandateCount(0);
		mandateInterchangeObject.setFileName("Test23May24.xml");
		mandateInterchangeObject.setStatus("T");
		mandateInterchangeObject.setSubmissionChannel("File Upload");
		mandateInterchangeObject.setTotalMandateFieldCount(0);
		mandateInterchangeObject.setUploadedUsername("Test User123");
		mandateInterchangeObject.setWhenModified("2024-03-18T08:04:03.768Z[UTC]");
		
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
		String filePath = "src\\test\\java\\Resources\\uploadMandateFile";

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
		String filePath = "src\\test\\java\\Resources\\uploadMandateFile204";

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
		String filePath = "src\\test\\java\\Resources\\uploadMandateFile403";

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
		String filePath = "src\\test\\java\\Resources\\uploadMandateFile500";

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
	
	
	public CreateMandateBatch createmandateBatchPayload() throws ParseException
	{
		CreateMandateBatch mandateBatchObject = new CreateMandateBatch();
		List<MandateInstructionList> instructionList = new ArrayList<>();
		MandateInstructionList instructionListObject = new MandateInstructionList();
		
		
		mandateBatchObject.setAction("I");
		mandateBatchObject.setAuthoriseStatus("ACT");
		mandateBatchObject.setBankGroupId("Standard Bank Group");
		mandateBatchObject.setCanAuthorise(false);
		Date creationDateAndTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2024-04-16T07:06:00Z[UTC]");
		mandateBatchObject.setCreationDateAndTime(creationDateAndTime);
		mandateBatchObject.setCustomerId(373731);
		mandateBatchObject.setCustomerUserKey("513632");
		
	    
	
		instructionListObject.setAction("I");
		instructionListObject.setAdjustmentCategory("N");
		instructionListObject.setAuthenticationType("REAL TIME");
		instructionListObject.setClientReference("PerfTest2");
		instructionListObject.setCollectionDay("07");
		instructionListObject.setContractReference("SBZA1811302709");
		instructionListObject.setCountryCode("ZA");
		Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2024-04-16T07:06:00Z[UTC]");
		instructionListObject.setCreationDateAndTime(date);
		instructionListObject.setCreditorAbbreviatedShortName("Vinot001");
		instructionListObject.setCreditorAccountNumber("001299751");
		instructionListObject.setCreditorBankBranch("051001");
		instructionListObject.setCreditorEmailDetails("junzismail@gmail.com");
		instructionListObject.setCreditorName("BOL Customer");
		instructionListObject.setCreditorSchemeId(1);
		instructionListObject.setCreditorTelephoneDetails("+27-118765434");
		instructionListObject.setDateAdjustmentRuleIndicator("Y");
		instructionListObject.setDebitValueType("FIXED");
		instructionListObject.setDebtorAccountName("Testing SITONE");
		instructionListObject.setDebtorAccountNumber("10005296372");
		instructionListObject.setDebtorAccountType("CACC");
		instructionListObject.setDebtorAuthenticationRequired("0227");
		instructionListObject.setDebtorBankBranch("051001");
		instructionListObject.setDebtorBankName("STANDARD BANK");
		instructionListObject.setDebtorBicCode("SBZAZAJJ");
		instructionListObject.setDebtorEmailDetails("ravi@test.com");
		instructionListObject.setDebtorIdentification("8007086600092");
		instructionListObject.setDebtorIdentificationType("I");
		instructionListObject.setDebtorName("Testing SITONE");
		instructionListObject.setDebtorTelephoneDetails("+27-616481422");
		instructionListObject.setEntryClass("Vinot001");
		instructionListObject.setFrequency("MNTH");
		instructionListObject.setInitiatingParty("Junaid");
		instructionListObject.setInstallmentAmount(11.47);
		instructionListObject.setInstallmentAmountCurrency("ZAR");
		instructionListObject.setInstallmentOccurrence("RCUR");
		instructionListObject.setInstructedAgent("210000");
		instructionListObject.setInstructingAgent("210001");;
		Date mandateInitiationDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2024-04-16T07:06:00Z[UTC]");
		instructionListObject.setMandateInitiationDate(mandateInitiationDate);
		instructionListObject.setMandateInstrumentKey(101);
		instructionListObject.setMaxCollectionAmount(15);
		instructionListObject.setMaxCollectionAmountCurrency("ZAR");
		instructionListObject.setRequestTransmissionNumber(1);
		instructionListObject.setStatus("PEN");
		instructionListObject.setSubmissionMechanism("Host to Host");
		instructionListObject.setTrackingIndicator("T");
		instructionListObject.setUltimateCreditorName("R");
		instructionListObject.setVersion(0);
		Date whenModifiedDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2024-04-16T07:06:00Z[UTC]");
		instructionListObject.setWhenModified(whenModifiedDate);
	
	
		mandateBatchObject.setMandateInterchangeKey(3);
		mandateBatchObject.setVersion(0);
		
		
		instructionList.add(instructionListObject);
		mandateBatchObject.setMandateInstructionList(instructionList);
		
		return mandateBatchObject;
	}
	
	
	public CancelMandateBatch cancelmandateBatchPayload(String key) throws ParseException
	{
		CancelMandateBatch mandateBatchObject = new CancelMandateBatch();
		
		
		List<CancelBatchInstructionList> cancelinstructionList = new ArrayList<>();
		CancelBatchInstructionList cancelinstructionListObject = new CancelBatchInstructionList();
		
		List<ErrorList> errorListobj = new ArrayList<>();
		ErrorList errorlistObject = new ErrorList();
		
		mandateBatchObject.setAcceptedCount(0);
		mandateBatchObject.setAction("I");
		mandateBatchObject.setAuthoriseStatus("ACT");
		mandateBatchObject.setBankGroupId("Standard Bank Group");
		mandateBatchObject.setCanAuthorise(false);
		Date creationDateAndTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2024-04-16T07:06:00Z[UTC]");
		mandateBatchObject.setCreationDateAndTime(creationDateAndTime);
		mandateBatchObject.setCustomerId(373731);
		mandateBatchObject.setCustomerUserKey("513632");
		mandateBatchObject.setCutOffRequired(false);
		mandateBatchObject.setEntityStatus("RC");
		//mandateBatchObject.setErrorList(null);
		mandateBatchObject.setFailedCount(0);
		mandateBatchObject.setMandateBatchKey(key);
		mandateBatchObject.setMandateInterchangeKey(3);
		mandateBatchObject.setPendingCount(0);
		mandateBatchObject.setStatus("FUP");
		mandateBatchObject.setTotalCount(0);
		mandateBatchObject.setVersion(0);
		Date whenmodified = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2024-04-16T07:06:00Z[UTC]");
		mandateBatchObject.setWhenModified(whenmodified);
		
		
		cancelinstructionListObject.setAction("Z");
		cancelinstructionListObject.setAdjustmentCategory("N");
		cancelinstructionListObject.setAuthenticationType("REAL TIME");
		cancelinstructionListObject.setClientReference("ClntRef");
		cancelinstructionListObject.setCollectionDay("3");
		cancelinstructionListObject.setContractReference("Nifnb11jan24_3");
		cancelinstructionListObject.setCountryCode("ZA");
		Date CreationDateAndTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2024-04-16T07:06:00Z[UTC]");
		cancelinstructionListObject.setCreationDateAndTime(CreationDateAndTime);
		cancelinstructionListObject.setCreditorAbbreviatedShortName("AC Col");
		cancelinstructionListObject.setCreditorAccountNumber("051001");
		cancelinstructionListObject.setCreditorBankBranch("051001");
		cancelinstructionListObject.setCreditorBicCode("SBZAZAJJ");
		cancelinstructionListObject.setCreditorEmailDetails("junzismail@gmail.com");
		cancelinstructionListObject.setCreditorName("BOL Customer");
		cancelinstructionListObject.setCreditorSchemeId(1);
		cancelinstructionListObject.setCreditorTelephoneDetails("+27-821234567");
		cancelinstructionListObject.setDateAdjustmentRuleIndicator("Y");
		cancelinstructionListObject.setDebitValueType("VARIABLE");
		cancelinstructionListObject.setDebtorAccountName("pinky kalita");
		cancelinstructionListObject.setDebtorAccountNumber("10005296372");
		cancelinstructionListObject.setDebtorAccountType("CACC");
		cancelinstructionListObject.setDebtorAuthenticationRequired("0227");
		cancelinstructionListObject.setDebtorBankBranch("051001");
		cancelinstructionListObject.setDebtorBankName("STANDARD BANK");
		cancelinstructionListObject.setDebtorBicCode("SBZAZAJJ");
		cancelinstructionListObject.setDebtorEmailDetails("ismail@gmail.com");
		cancelinstructionListObject.setDebtorIdentification("6507170138083");
		cancelinstructionListObject.setDebtorIdentificationType("I");
		cancelinstructionListObject.setDebtorName("Testing SITONE");
		cancelinstructionListObject.setDebtorTelephoneDetails("+27-0786774545");
		cancelinstructionListObject.setEntryClass("Vinot001");
		//cancelinstructionListObject.setErrorList(null);
		cancelinstructionListObject.setFrequency("WEEK");
		cancelinstructionListObject.setInitiatingParty("Junaid");
		cancelinstructionListObject.setInstallmentAmount(60.00);
		cancelinstructionListObject.setInstallmentAmountCurrency("ZAR");
		cancelinstructionListObject.setInstallmentOccurrence("RCUR");
		cancelinstructionListObject.setInstructedAgent("210000");
		cancelinstructionListObject.setInstructingAgent("210001");;
		cancelinstructionListObject.setMandateBatchKey(key);
		Date mandateInitiationDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2024-04-16T07:06:00Z[UTC]");
		cancelinstructionListObject.setMandateInitiationDate(mandateInitiationDate);
		cancelinstructionListObject.setMandateInstructionKey(6);
		cancelinstructionListObject.setMandateInstrumentKey(101);
		cancelinstructionListObject.setMandateKey(6);
		cancelinstructionListObject.setMandateReferenceNumber("0003202401110004394946");
		cancelinstructionListObject.setMandateRequestTransactionId("00012024-04-15000000028");
		cancelinstructionListObject.setMessageIdentification("100/MANIN/00210001/20240502/000000");
		cancelinstructionListObject.setOriginalMrti("00012024-04-15000000028");
		cancelinstructionListObject.setRequestTransmissionNumber(1);
		cancelinstructionListObject.setStatus("ACC");
		cancelinstructionListObject.setSubmissionMechanism("Host to Host");
		cancelinstructionListObject.setSuspended(false);
		cancelinstructionListObject.setTrackingIndicator("T");
		cancelinstructionListObject.setUltimateCreditorName("R");
		cancelinstructionListObject.setUltimateDebtorName("Test");
		cancelinstructionListObject.setVersion(0);
		Date whenModifiedDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2024-04-16T07:06:00Z[UTC]");
		cancelinstructionListObject.setWhenModified(whenModifiedDate);

		
		cancelinstructionList.add(cancelinstructionListObject);
		mandateBatchObject.setMandateInstructionList(cancelinstructionList);
		
		return mandateBatchObject;
		
	}
	
	
	public UpdateMandateBatch updatemandateBatchPayload(String key) throws ParseException
	{
		UpdateMandateBatch mandateBatchObject = new UpdateMandateBatch();
		
		
		List<updateBatchInstructionList> updatelinstructionList = new ArrayList<>();
		updateBatchInstructionList updateinstructionListObject = new updateBatchInstructionList();
		
		List<ErrorList> errorListobj = new ArrayList<>();
		ErrorList errorlistObject = new ErrorList();
		
		
		mandateBatchObject.setAcceptedCount(0);
		mandateBatchObject.setAction("I");
		mandateBatchObject.setAuthoriseStatus("ACT");
		mandateBatchObject.setBankGroupId("Standard Bank Group");
		mandateBatchObject.setCanAuthorise(false);
		Date creationDateAndTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2024-04-16T07:06:00Z[UTC]");
		mandateBatchObject.setCreationDateAndTime(creationDateAndTime);
		mandateBatchObject.setCustomerId(373731);
		mandateBatchObject.setCustomerUserKey("513632");
		mandateBatchObject.setCutOffRequired(false);
		mandateBatchObject.setEntityStatus("RC");
		//mandateBatchObject.setErrorList(null);
		mandateBatchObject.setFailedCount(0);
		mandateBatchObject.setMandateBatchKey(key);
			
		
		updateinstructionListObject.setAction("Z");
		updateinstructionListObject.setAdjustmentCategory("N");
		updateinstructionListObject.setAuthenticationType("REAL TIME");
		updateinstructionListObject.setClientReference("ClntRef");
		updateinstructionListObject.setCollectionDay("3");
		updateinstructionListObject.setContractReference("Nifnb11jan24_3");
		updateinstructionListObject.setCountryCode("ZA");
		Date CreationDateAndTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2024-04-16T07:06:00Z[UTC]");
		updateinstructionListObject.setCreationDateAndTime(CreationDateAndTime);
		updateinstructionListObject.setCreditorAbbreviatedShortName("AC Col");
		updateinstructionListObject.setCreditorAccountNumber("051001");
		updateinstructionListObject.setCreditorBankBranch("051001");
		updateinstructionListObject.setCreditorBicCode("SBZAZAJJ");
		updateinstructionListObject.setCreditorEmailDetails("newupdatedemail123@outlook.com");
		updateinstructionListObject.setCreditorName("Standard Bank HTH");
		updateinstructionListObject.setCreditorSchemeId(1);
		updateinstructionListObject.setCreditorTelephoneDetails("+27-821234567");
		updateinstructionListObject.setDateAdjustmentRuleIndicator("Y");
		updateinstructionListObject.setDebitValueType("VARIABLE");
		updateinstructionListObject.setDebtorAccountName("Dhananjay");
		updateinstructionListObject.setDebtorAccountNumber("250655");
		updateinstructionListObject.setDebtorAccountType("CACC");
		updateinstructionListObject.setDebtorAuthenticationRequired("0227");
		updateinstructionListObject.setDebtorBankBranch("250655");
		updateinstructionListObject.setDebtorBankName("STANDARD BANK");
		updateinstructionListObject.setDebtorBicCode("SBZAZAJJ");
		updateinstructionListObject.setDebtorEmailDetails("pinky@gmail.com");
		updateinstructionListObject.setDebtorIdentification("6507170138083");
		updateinstructionListObject.setDebtorIdentificationType("I");
		updateinstructionListObject.setDebtorName("Testing SITONE");
		updateinstructionListObject.setDebtorTelephoneDetails("+27-0786774545");
		updateinstructionListObject.setEntryClass("Vinot001");
		updateinstructionListObject.setErrorList(null);
		updateinstructionListObject.setFrequency("WEEK");
		updateinstructionListObject.setInitiatingParty("TestUser123");
		updateinstructionListObject.setInstallmentAmount(60.00);
		updateinstructionListObject.setInstallmentAmountCurrency("ZAR");
		updateinstructionListObject.setInstallmentOccurrence("RCUR");
		updateinstructionListObject.setInstructedAgent("210000");
		updateinstructionListObject.setInstructingAgent("210001");;
		updateinstructionListObject.setMandateBatchKey(key);
		Date mandateInitiationDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2024-04-16T07:06:00Z[UTC]");
		updateinstructionListObject.setMandateInitiationDate(mandateInitiationDate);
		updateinstructionListObject.setMandateInstructionKey(10);
		updateinstructionListObject.setMandateInstrumentKey(101);
		updateinstructionListObject.setMandateKey(6);
		updateinstructionListObject.setMandateReferenceNumber("0003202401110004394946");
		updateinstructionListObject.setMandateRequestTransactionId("00012024-04-15000000028");
		updateinstructionListObject.setMessageIdentification("100/MANIN/00210001/20240502/000000");
		updateinstructionListObject.setOriginalMrti("00012024-04-15000000028");
		updateinstructionListObject.setRequestTransmissionNumber(1);
		updateinstructionListObject.setStatus("ACC");
		updateinstructionListObject.setSubmissionMechanism("Host to Host");
		updateinstructionListObject.setSuspended(false);
		updateinstructionListObject.setTrackingIndicator("T");
		updateinstructionListObject.setUltimateCreditorName("R");
		updateinstructionListObject.setUltimateDebtorName("TestUser456");
		updateinstructionListObject.setVersion(0);
		Date whenModifiedDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2024-04-16T07:06:00Z[UTC]");
		updateinstructionListObject.setWhenModified(whenModifiedDate);

		mandateBatchObject.setMandateInterchangeKey(3);
		mandateBatchObject.setPendingCount(0);
		mandateBatchObject.setStatus("FUP");
		mandateBatchObject.setTotalCount(0);
		mandateBatchObject.setVersion(0);
		Date whenmodified = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2024-04-16T07:06:00Z[UTC]");
		mandateBatchObject.setWhenModified(whenmodified);
		
		updatelinstructionList.add(updateinstructionListObject);
		mandateBatchObject.setMandateInstructionList(updatelinstructionList);
		
		return mandateBatchObject;
		
	}
	
	
	public AuthorizeMandate authoriseSingleleMandateBatchPayload() throws ParseException
	{
		AuthorizeMandate authorizeMandateObj = new AuthorizeMandate();
		
		authorizeMandateObj.setAction("I");
		authorizeMandateObj.setAuthoriseStatus("ACT");
		authorizeMandateObj.setBankGroupId("Standard Bank Group");
		Date creationDateAndTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2018-11-29T22:00:00Z[UTC]");
		authorizeMandateObj.setCreationDateAndTime(creationDateAndTime);
		authorizeMandateObj.setCustomerId(373731);
		authorizeMandateObj.setCustomerUserKey("513632");
		authorizeMandateObj.setEntityStatus("AUTHORISATION_COMPLETE");
		authorizeMandateObj.setMandateBatchKey(82);
		authorizeMandateObj.setMandateInterchangeKey(5539);
		authorizeMandateObj.setMessageIdentification("100/MANIN/00210001/20181130/SBSAI2");
		authorizeMandateObj.setVersion(0);
		Date whenModifiedDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2018-11-30T08:44:38Z[UTC]");
		authorizeMandateObj.setWhenModified(whenModifiedDate);
		
		return authorizeMandateObj;
	}
	
	public List<AuthorizeMandate> authoriseMultipleMandateBatchPayload() throws ParseException
	{
		List<AuthorizeMandate> authorizeMandateList = new ArrayList<>();
		
		AuthorizeMandate authorizeMandateObj1 = new AuthorizeMandate();

		authorizeMandateObj1.setAction("I");
		authorizeMandateObj1.setAuthoriseStatus("ACT");
		authorizeMandateObj1.setBankGroupId("Standard Bank Group");
		Date creationDateAndTime1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2018-11-29T22:00:00Z[UTC]");
		authorizeMandateObj1.setCreationDateAndTime(creationDateAndTime1);
		authorizeMandateObj1.setCustomerId(373731);
		authorizeMandateObj1.setCustomerUserKey("513632");
		authorizeMandateObj1.setMandateBatchKey(11);
		authorizeMandateObj1.setMandateInterchangeKey(5539);
		authorizeMandateObj1.setMessageIdentification("100/MANIN/00210001/20181130/SBSAI2");
		authorizeMandateObj1.setVersion(0);
		Date whenModifiedDate1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2018-11-30T08:44:38Z[UTC]");
		authorizeMandateObj1.setWhenModified(whenModifiedDate1);
		
		authorizeMandateList.add(authorizeMandateObj1);
		
		
		AuthorizeMandate authorizeMandateObj2 = new AuthorizeMandate();
		
		authorizeMandateObj2.setAction("I");
		authorizeMandateObj2.setAuthoriseStatus("ACT");
		authorizeMandateObj2.setBankGroupId("Standard Bank Group");
		Date creationDateAndTime2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2018-11-29T22:00:00Z[UTC]");
		authorizeMandateObj2.setCreationDateAndTime(creationDateAndTime2);
		authorizeMandateObj2.setCustomerId(373731);
		authorizeMandateObj2.setCustomerUserKey("513632");
		authorizeMandateObj2.setMandateBatchKey(10);
		authorizeMandateObj2.setMandateInterchangeKey(5539);
		authorizeMandateObj2.setMessageIdentification("100/MANIN/00210001/20181130/SBSAI2");
		authorizeMandateObj2.setVersion(0);
		Date whenModifiedDate2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2018-11-30T08:44:38Z[UTC]");
		authorizeMandateObj2.setWhenModified(whenModifiedDate2);
		
		authorizeMandateList.add(authorizeMandateObj2);
		
		return authorizeMandateList;
			
	}
	
	public AuthorizeMandate MandateBatch500codePayload() throws ParseException
	{
		AuthorizeMandate authorizeMandateObj = new AuthorizeMandate();
		
		authorizeMandateObj.setAction("I");
		authorizeMandateObj.setAuthoriseStatus("ACT");
		authorizeMandateObj.setBankGroupId("Standard Bank Group");
		Date creationDateAndTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2018-11-29T22:00:00Z[UTC]");
		authorizeMandateObj.setCreationDateAndTime(creationDateAndTime);
		authorizeMandateObj.setCustomerId(373731);
		authorizeMandateObj.setCustomerUserKey("513632");
		authorizeMandateObj.setEntityStatus("AUTHORISATION_COMPLETE");
		authorizeMandateObj.setMandateBatchKey(14);
		authorizeMandateObj.setMandateInterchangeKey(5539);
		authorizeMandateObj.setMessageIdentification("100/MANIN/00210001/20181130/SBSAI2");
		authorizeMandateObj.setVersion(0);
		Date whenModifiedDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse("2018-11-30T08:44:38Z[UTC]");
		authorizeMandateObj.setWhenModified(whenModifiedDate);
		
		return authorizeMandateObj;
	}
	
}
