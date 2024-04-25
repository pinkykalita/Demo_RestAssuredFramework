package POJO;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CreateMandateBatch {
	
		private String authoriseStatus;
	    private String bankGroupId;
	    private boolean canAuthorise;
	    
	    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
	    private Date creationDateAndTime;
	    
	    private int customerId;
	    private String customerUserKey;
	    private String entityStatus;
	    private List<POJO.mandateInstructionList> mandateInstructionList;
	    private int mandateInterchangeKey;
	    private String messageIdentification;
	    private int version;

	
	
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
		public String getEntityStatus() {
			return entityStatus;
		}
		public void setEntityStatus(String entityStatus) {
			this.entityStatus = entityStatus;
		}
		public List<mandateInstructionList> getMandateInstructionList() {
			return mandateInstructionList;
		}
		public void setMandateInstructionList(List<POJO.mandateInstructionList> mandateInstructionList) {
			this.mandateInstructionList = mandateInstructionList;
		}
		public int getMandateInterchangeKey() {
			return mandateInterchangeKey;
		}
		public void setMandateInterchangeKey(int mandateInterchangeKey) {
			this.mandateInterchangeKey = mandateInterchangeKey;
		}
		public String getMessageIdentification() {
			return messageIdentification;
		}
		public void setMessageIdentification(String messageIdentification) {
			this.messageIdentification = messageIdentification;
		}
		public int getVersion() {
			return version;
		}
		public void setVersion(int version) {
			this.version = version;
		}
		
	

}
