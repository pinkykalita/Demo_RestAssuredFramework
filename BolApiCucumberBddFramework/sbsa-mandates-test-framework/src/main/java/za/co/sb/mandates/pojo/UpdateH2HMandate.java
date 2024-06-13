package za.co.sb.mandates.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class UpdateH2HMandate {

	
	private String countryCode;
	private String messageIdentification;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
	private Date creationDateTime;
	private String initiatingParty;
	private String amendmentReason;
	private String clientReference;
	private String debtorAuthenticationRequired;
	private String installmentOccurrence;
	private String creditorAbbreviatedShortName;
	private String originalClientReference;
	private String originalContractReference;
	private String originalCreditorName;
	private String originalDebtorName;
	private String originalDebtorBankBranchNumber;
	private String authenticationType;
	private int requestTransmissionNumber;
	private String collectionDay;
	private String installmentAmountCurrency;
	private double installmentAmount;
	private String debtorName;
	private String debtorAccountType;
	private String debtorBankBranchNumber;
	private String messageAuthenticationCode;
	private String mandateReferenceNumber;
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
	public String getAmendmentReason() {
		return amendmentReason;
	}
	public void setAmendmentReason(String amendmentReason) {
		this.amendmentReason = amendmentReason;
	}
	public String getClientReference() {
		return clientReference;
	}
	public void setClientReference(String clientReference) {
		this.clientReference = clientReference;
	}
	public String getDebtorAuthenticationRequired() {
		return debtorAuthenticationRequired;
	}
	public void setDebtorAuthenticationRequired(String debtorAuthenticationRequired) {
		this.debtorAuthenticationRequired = debtorAuthenticationRequired;
	}
	public String getInstallmentOccurrence() {
		return installmentOccurrence;
	}
	public void setInstallmentOccurrence(String installmentOccurrence) {
		this.installmentOccurrence = installmentOccurrence;
	}
	public String getCreditorAbbreviatedShortName() {
		return creditorAbbreviatedShortName;
	}
	public void setCreditorAbbreviatedShortName(String creditorAbbreviatedShortName) {
		this.creditorAbbreviatedShortName = creditorAbbreviatedShortName;
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
	public String getOriginalCreditorName() {
		return originalCreditorName;
	}
	public void setOriginalCreditorName(String originalCreditorName) {
		this.originalCreditorName = originalCreditorName;
	}
	public String getOriginalDebtorName() {
		return originalDebtorName;
	}
	public void setOriginalDebtorName(String originalDebtorName) {
		this.originalDebtorName = originalDebtorName;
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
	public String getCollectionDay() {
		return collectionDay;
	}
	public void setCollectionDay(String collectionDay) {
		this.collectionDay = collectionDay;
	}
	public String getInstallmentAmountCurrency() {
		return installmentAmountCurrency;
	}
	public void setInstallmentAmountCurrency(String installmentAmountCurrency) {
		this.installmentAmountCurrency = installmentAmountCurrency;
	}
	public double getInstallmentAmount() {
		return installmentAmount;
	}
	public void setInstallmentAmount(double installmentAmount) {
		this.installmentAmount = installmentAmount;
	}
	public String getDebtorName() {
		return debtorName;
	}
	public void setDebtorName(String debtorName) {
		this.debtorName = debtorName;
	}
	public String getDebtorAccountType() {
		return debtorAccountType;
	}
	public void setDebtorAccountType(String debtorAccountType) {
		this.debtorAccountType = debtorAccountType;
	}
	public String getDebtorBankBranchNumber() {
		return debtorBankBranchNumber;
	}
	public void setDebtorBankBranchNumber(String debtorBankBranchNumber) {
		this.debtorBankBranchNumber = debtorBankBranchNumber;
	}
	public String getMessageAuthenticationCode() {
		return messageAuthenticationCode;
	}
	public void setMessageAuthenticationCode(String messageAuthenticationCode) {
		this.messageAuthenticationCode = messageAuthenticationCode;
	}
	public String getMandateReferenceNumber() {
		return mandateReferenceNumber;
	}
	public void setMandateReferenceNumber(String mandateReferenceNumber) {
		this.mandateReferenceNumber = mandateReferenceNumber;
	}
		
	
	
	
}
