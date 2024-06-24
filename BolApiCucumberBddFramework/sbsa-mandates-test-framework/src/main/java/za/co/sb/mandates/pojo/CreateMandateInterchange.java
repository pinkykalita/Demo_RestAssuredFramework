package za.co.sb.mandates.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CreateMandateInterchange {
	
	 private String customerId; 
	 private String customerKey;
	 private int failedMandateCount;
	 private String fileName;
	 private String status;
	 private String submissionChannel;
	 private int totalMandateFieldCount;
	 private String uploadedUsername;
	 @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
	 private Date creationDateAndTime;
	 @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
	 private Date whenModified;
	  
	
	 
	public Date getWhenModified() {
		return whenModified;
	}
	public void setWhenModified(Date whenModified) {
		this.whenModified = whenModified;
	}
	
	public Date getCreationDateAndTime() {
		return creationDateAndTime;
	}
	public void setCreationDateAndTime(Date creationDateAndTime) {
		this.creationDateAndTime = creationDateAndTime;
	}
	public String getCustomerKey() {
		return customerKey;
	}
	public void setCustomerKey(String newKey) {
		this.customerKey = newKey;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getUploadedUsername() {
		return uploadedUsername;
	}
	public void setUploadedUsername(String uploadedUsername) {
		this.uploadedUsername = uploadedUsername;
	}
	public String getSubmissionChannel() {
		return submissionChannel;
	}
	public void setSubmissionChannel(String submissionChannel) {
		this.submissionChannel = submissionChannel;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTotalMandateFieldCount() {
		return totalMandateFieldCount;
	}
	public void setTotalMandateFieldCount(int totalMandateFieldCount) {
		this.totalMandateFieldCount = totalMandateFieldCount;
	}
	public int getFailedMandateCount() {
		return failedMandateCount;
	}
	public void setFailedMandateCount(int failedMandateCount) {
		this.failedMandateCount = failedMandateCount;
	}
	public void setCreationDateTime(Date creationDateAndTime) {
		// TODO Auto-generated method stub
		
	}
	
	 
	 
	 

}
