package za.co.sb.mandates.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CancelH2HMandate {

	
	private String countryCode;
	private String messageIdentification;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
	private Date creationDateTime;
	private String initiatingParty;
	private String cancellationReason;
	private String originalClientReference;
	private String originalContractReference;
	private String originalTrackingCancellationIndicator;
	private String originalCreditorName;
	private String originalCreditorAbbreviatedShortName;
	private String originalDebtorAccountName;
	private String originalDebtorBankBranchNumber;
	private String authenticationType;
	private int requestTransmissionNumber;
	private String originalMandateReferenceNumber;
	
	
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getMessageIdentification() {
		return messageIdentification;
	}
	public void setMessageIdentification(String messageIdentification) {
		this.messageIdentification = messageIdentification;
	}
	public Date getCreationDateTime() {
		return creationDateTime;
	}
	public void setCreationDateTime(Date creationDateTime) {
		this.creationDateTime = creationDateTime;
	}
	public String getInitiatingParty() {
		return initiatingParty;
	}
	public void setInitiatingParty(String initiatingParty) {
		this.initiatingParty = initiatingParty;
	}
	public String getCancellationReason() {
		return cancellationReason;
	}
	public void setCancellationReason(String cancellationReason) {
		this.cancellationReason = cancellationReason;
	}
	public String getOriginalClientReference() {
		return originalClientReference;
	}
	public void setOriginalClientReference(String originalClientReference) {
		this.originalClientReference = originalClientReference;
	}
	public String getOriginalContractReference() {
		return originalContractReference;
	}
	public void setOriginalContractReference(String originalContractReference) {
		this.originalContractReference = originalContractReference;
	}
	public String getOriginalTrackingCancellationIndicator() {
		return originalTrackingCancellationIndicator;
	}
	public void setOriginalTrackingCancellationIndicator(String originalTrackingCancellationIndicator) {
		this.originalTrackingCancellationIndicator = originalTrackingCancellationIndicator;
	}
	public String getOriginalCreditorName() {
		return originalCreditorName;
	}
	public void setOriginalCreditorName(String originalCreditorName) {
		this.originalCreditorName = originalCreditorName;
	}
	public String getOriginalCreditorAbbreviatedShortName() {
		return originalCreditorAbbreviatedShortName;
	}
	public void setOriginalCreditorAbbreviatedShortName(String originalCreditorAbbreviatedShortName) {
		this.originalCreditorAbbreviatedShortName = originalCreditorAbbreviatedShortName;
	}
	public String getOriginalDebtorAccountName() {
		return originalDebtorAccountName;
	}
	public void setOriginalDebtorAccountName(String originalDebtorAccountName) {
		this.originalDebtorAccountName = originalDebtorAccountName;
	}
	public String getOriginalDebtorBankBranchNumber() {
		return originalDebtorBankBranchNumber;
	}
	public void setOriginalDebtorBankBranchNumber(String originalDebtorBankBranchNumber) {
		this.originalDebtorBankBranchNumber = originalDebtorBankBranchNumber;
	}
	public String getAuthenticationType() {
		return authenticationType;
	}
	public void setAuthenticationType(String authenticationType) {
		this.authenticationType = authenticationType;
	}
	public int getRequestTransmissionNumber() {
		return requestTransmissionNumber;
	}
	public void setRequestTransmissionNumber(int requestTransmissionNumber) {
		this.requestTransmissionNumber = requestTransmissionNumber;
	}
	public String getOriginalMandateReferenceNumber() {
		return originalMandateReferenceNumber;
	}
	public void setOriginalMandateReferenceNumber(String originalMandateReferenceNumber) {
		this.originalMandateReferenceNumber = originalMandateReferenceNumber;
	}
	
	
	
	
}
