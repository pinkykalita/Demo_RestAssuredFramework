package POJO;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CancelMandateBatch {

	private int acceptedCount;
    private String action;
    private String authoriseStatus;
    private String bankGroupId;
    private boolean canAuthorise;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
    private Date creationDateAndTime;
    private int customerId;
    private String customerUserKey;
    private boolean cutOffRequired;
    private String entityStatus;
    private List<ErrorList> errorList;
    private int failedCount;
    private String mandateBatchKey;
    private List<CancelBatchInstructionList> mandateInstructionList;
    private int mandateInterchangeKey;
    private int pendingCount;
    private String status;
    private int totalCount;
    private int version;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
    private Date whenModified;
    
    
    public int getAcceptedCount() {
		return acceptedCount;
	}
	public void setAcceptedCount(int acceptedCount) {
		this.acceptedCount = acceptedCount;
	}
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
	public boolean isCanAuthorise() {
		return canAuthorise;
	}
	public void setCanAuthorise(boolean canAuthorise) {
		this.canAuthorise = canAuthorise;
	}
	public Date getCreationDateAndTime() {
		return creationDateAndTime;
	}
	public void setCreationDateAndTime(Date creationDateAndTime) {
		this.creationDateAndTime = creationDateAndTime;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerUserKey() {
		return customerUserKey;
	}
	public void setCustomerUserKey(String customerUserKey) {
		this.customerUserKey = customerUserKey;
	}
	public boolean isCutOffRequired() {
		return cutOffRequired;
	}
	public void setCutOffRequired(boolean cutOffRequired) {
		this.cutOffRequired = cutOffRequired;
	}
	public String getEntityStatus() {
		return entityStatus;
	}
	public void setEntityStatus(String entityStatus) {
		this.entityStatus = entityStatus;
	}
	public List<ErrorList> getErrorList() {
		return errorList;
	}
	public void setErrorList(List<ErrorList> errorList) {
		this.errorList = errorList;
	}
	public int getFailedCount() {
		return failedCount;
	}
	public void setFailedCount(int failedCount) {
		this.failedCount = failedCount;
	}
	public String getMandateBatchKey() {
		return mandateBatchKey;
	}
	public void setMandateBatchKey(String key) {
		this.mandateBatchKey = key;
	}
	public List<CancelBatchInstructionList> getMandateInstructionList() {
		return mandateInstructionList;
	}
	public void setMandateInstructionList(List<CancelBatchInstructionList> mandateInstructionList) {
		this.mandateInstructionList = mandateInstructionList;
	}
	public int getMandateInterchangeKey() {
		return mandateInterchangeKey;
	}
	public void setMandateInterchangeKey(int key) {
		this.mandateInterchangeKey = key;
	}
	public int getPendingCount() {
		return pendingCount;
	}
	public void setPendingCount(int pendingCount) {
		this.pendingCount = pendingCount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
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
	public void setWhenModified(Date whenModified) {
		this.whenModified = whenModified;
	}
	
}
