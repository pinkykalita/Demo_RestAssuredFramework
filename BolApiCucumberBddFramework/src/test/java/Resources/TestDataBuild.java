package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import POJO.CreateMandateInterchange;
import POJO.CreateMandateProcessingOptions;
import POJO.UpdateMandateInterchange;
import POJO.UpdateMandateProcessingOptions;
import POJO.UploadMandateFile;

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

	public UploadMandateFile uploadMandateFilePayload(String ID) throws IOException
	{
		UploadMandateFile fileUploadObject = new UploadMandateFile();
		//FileInputStream file = new FileInputStream("C:\\Users\\bbdnet10211\\eclipse-workspace\\BOLAPIFramework\\src\\test\\java\\Resources\\uploadMandateFile");
		String filePath = "C:\\Users\\bbdnet10211\\eclipse-workspace\\BOLAPIFramework\\src\\test\\java\\Resources\\uploadMandateFile";
		String payload = readFileAsString(filePath);
		
		fileUploadObject.setMandateInterchangeId(ID);
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
}
