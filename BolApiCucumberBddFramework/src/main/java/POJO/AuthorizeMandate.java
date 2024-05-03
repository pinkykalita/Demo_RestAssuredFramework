package POJO;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AuthorizeMandate {
	
	private String authoriseStatus;
    private String bankGroupId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
    private Date creationDateAndTime;
    private long customerId;
    private String customerUserKey;
    private String entityStatus;
    private long mandateBatchKey;
    private long mandateInterchangeKey;
    private String messageIdentification;
    private String status;
    private int version;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
    private Date whenModified;
	private String action;
	
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getAuthoriseStatus() {
		return authoriseStatus;
	}
	public void setAuthoriseStatus(String authoriseStatus) {
		this.authoriseStatus = authoriseStatus;
	}
	public String getBankGroupId() {
		return bankGroupId;
	}
	public void setBankGroupId(String bankGroupId) {
		this.bankGroupId = bankGroupId;
	}
	
	public Date getCreationDateAndTime() {
		return creationDateAndTime;
	}
	public void setCreationDateAndTime(Date creationDateAndTime) {
		this.creationDateAndTime = creationDateAndTime;
	}
	public void setWhenModified(Date whenModified) {
		this.whenModified = whenModified;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerUserKey() {
		return customerUserKey;
	}
	public void setCustomerUserKey(String customerUserKey) {
		this.customerUserKey = customerUserKey;
	}
	public String getEntityStatus() {
		return entityStatus;
	}
	public void setEntityStatus(String entityStatus) {
		this.entityStatus = entityStatus;
	}
	public long getMandateBatchKey() {
		return mandateBatchKey;
	}
	public void setMandateBatchKey(long mandateBatchKey) {
		this.mandateBatchKey = mandateBatchKey;
	}
	public long getMandateInterchangeKey() {
		return mandateInterchangeKey;
	}
	public void setMandateInterchangeKey(long mandateInterchangeKey) {
		this.mandateInterchangeKey = mandateInterchangeKey;
	}
	public String getMessageIdentification() {
		return messageIdentification;
	}
	public void setMessageIdentification(String messageIdentification) {
		this.messageIdentification = messageIdentification;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public Date getWhenModified() {
		return whenModified;
	}
	
	

    
	

}
