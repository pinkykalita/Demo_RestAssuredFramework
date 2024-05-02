package POJO;

public class UploadMandateFile {
	
	private String payload;
	private int mandateInterchangeId;
	private String mandateMessageType;
	private String externalReference01;
	private String externalReference02;
	private String messageName;
	private String targetPartnerId;
	
	
	public String getMandateMessageType() {
		return mandateMessageType;
	}
	public void setMandateMessageType(String mandateMessageType) {
		this.mandateMessageType = mandateMessageType;
	}
	public String getExternalReference01() {
		return externalReference01;
	}
	public void setExternalReference01(String externalReference01) {
		this.externalReference01 = externalReference01;
	}
	public String getExternalReference02() {
		return externalReference02;
	}
	public void setExternalReference02(String externalReference02) {
		this.externalReference02 = externalReference02;
	}
	public String getMessageName() {
		return messageName;
	}
	public void setMessageName(String messageName) {
		this.messageName = messageName;
	}
	public String getTargetPartnerId() {
		return targetPartnerId;
	}
	public void setTargetPartnerId(String targetPartnerId) {
		this.targetPartnerId = targetPartnerId;
	}
	public int getMandateInterchangeId() {
		return mandateInterchangeId;
	}
	public void setMandateInterchangeId(int i) {
		this.mandateInterchangeId = i;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
	
}
