package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import POJO.CreateMandateBatch;
import POJO.CreateMandateInterchange;
import POJO.CreateMandateProcessingOptions;
import POJO.UpdateMandateInterchange;
import POJO.UpdateMandateProcessingOptions;
import POJO.UploadMandateFile;
import POJO.mandateInstructionList;

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
		//FileInputStream file = new FileInputStream("C:\\Users\\bbdnet10211\\eclipse-workspace\\BOLAPIFramework\\src\\test\\java\\Resources\\uploadMandateFile");
		String filePath = "C:\\Users\\bbdnet10211\\eclipse-workspace\\BOLAPIFramework\\src\\test\\java\\Resources\\uploadMandateFile";
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
	
	public CreateMandateBatch mandateBatchPayload()
	{
		CreateMandateBatch mandateBatchObject = new CreateMandateBatch();
		mandateInstructionList instructionListObject = new mandateInstructionList();
		
		mandateBatchObject.setAction("I");
		mandateBatchObject.setAuthoriseStatus("ACT");
		mandateBatchObject.setBankGroupId("Standard Bank Group");
		mandateBatchObject.setCanAuthorise(false);
		mandateBatchObject.setCreationDateAndTime("2024-04-16T07:06:00Z[UTC]");
		mandateBatchObject.setCustomerId(373731);
		mandateBatchObject.setCustomerUserKey("513632");
		mandateBatchObject.setMandateInterchangeKey(3);
		mandateBatchObject.setVersion(0);
		
		
		return mandateBatchObject;
	}
	
	public mandateInstructionList mandateInstructionListPayload()
	{
		mandateInstructionList instructionListObject = new mandateInstructionList();
		
		instructionListObject.setAction("I");
		instructionListObject.setAdjustmentCategory("N");
		instructionListObject.setAuthenticationType("REAL TIME");
		instructionListObject.setClientReference("PerfTest2");
		instructionListObject.setCollectionDay("07");
		instructionListObject.setContractReference("SBZA1811302709");
		instructionListObject.setCountryCode("ZA");
		instructionListObject.setCreationDateAndTime("2018-11-30T08:43:53Z[UTC]");
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
		instructionListObject.setItinstallmentAmountCurrencyCurrency("ZAR");
		instructionListObject.setInstallmentOccurrence("RCUR");
		instructionListObject.setInstructedAgent("210000");
		instructionListObject.setInstructedAgent("210001");
		instructionListObject.setMandateInitiationDate("2024-04-16T07:06:00Z[UTC]");
		instructionListObject.setMandateInstrumentKey(101);
		instructionListObject.setMaxCollectionAmount(15);
		instructionListObject.setMaxCollectionAmountCurrency("ZAR");
		instructionListObject.setRequestTransmissionNumber(1);
		instructionListObject.setStatus("PEN");
		instructionListObject.setSubmissionMechanism("Host to Host");
		instructionListObject.setTrackingIndicator("T");
		instructionListObject.setUltimateCreditorName("R");
		instructionListObject.setVersion(0);
		instructionListObject.setWhenModified("2024-04-16T07:06:00Z[UTC]");
		
		return instructionListObject;
	}
	
}
