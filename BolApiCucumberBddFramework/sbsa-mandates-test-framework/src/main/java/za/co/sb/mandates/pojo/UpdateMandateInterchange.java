package za.co.sb.mandates.pojo;

public class UpdateMandateInterchange 
{
	
	private String creationDateAndTime;
	private String customerId;
    private int customerKey;
    private int failedMandateCount;
    private String fileName;
    private String status;
    private String submissionChannel;
    private int totalMandateFieldCount;
    private String uploadedUsername;
    private String whenModified;
    private String mandateInterchangeKey;
	
	public String getMandateInterchangeKey() {
		return mandateInterchangeKey;
	}
	public void setMandateInterchangeKey(String mandateInterchangeKey) {
		this.mandateInterchangeKey = mandateInterchangeKey;
	}
	public String getCreationDateAndTime() {
		return creationDateAndTime;
	}
	public void setCreationDateAndTime(String creationDateAndTime) {
		this.creationDateAndTime = creationDateAndTime;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public int getCustomerKey() {
		return customerKey;
	}
	public void setCustomerKey(int customerKey) {
		this.customerKey = customerKey;
	}
	public int getFailedMandateCount() {
		return failedMandateCount;
	}
	public void setFailedMandateCount(int failedMandateCount) {
		this.failedMandateCount = failedMandateCount;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSubmissionChannel() {
		return submissionChannel;
	}
	public void setSubmissionChannel(String submissionChannel) {
		this.submissionChannel = submissionChannel;
	}
	public int getTotalMandateFieldCount() {
		return totalMandateFieldCount;
	}
	public void setTotalMandateFieldCount(int totalMandateFieldCount) {
		this.totalMandateFieldCount = totalMandateFieldCount;
	}
	public String getUploadedUsername() {
		return uploadedUsername;
	}
	public void setUploadedUsername(String uploadedUsername) {
		this.uploadedUsername = uploadedUsername;
	}
	public String getWhenModified() {
		return whenModified;
	}
	public void setWhenModified(String whenModified) {
		this.whenModified = whenModified;
	}
	

}
