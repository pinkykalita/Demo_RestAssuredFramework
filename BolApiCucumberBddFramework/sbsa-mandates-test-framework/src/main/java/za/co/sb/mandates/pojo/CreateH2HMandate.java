package za.co.sb.mandates.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CreateH2HMandate {

	
	private String countryCode;
	private String messageIdentification;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
	private Date creationDateTime;
	private String initiatingParty;
	private String clientReference;
	private String contractReference;
	private String trackingIndicator;
	private String debtorAuthenticationRequired;
	private String installmentOccurrence;
	private String frequency;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
    private Date mandateInitiationDate;
	private double installmentAmount;
	private String installmentAmountCurrency;
	private String maximumCollectionAmountCurrency;
	private double maximumCollectionAmount;
	private String creditorName;
	private String creditorTelephoneContactDetails;
	private String creditorAccountNumber;
	private String creditorBankBranchNumber;
	private String creditorAbbreviatedShortName;
	private String debtorName;
	private String debtorIdentification;
	private String debtorAccountNumber;
	private String debtorAccountType;
	private String debtorBankBranchNumber;
	private String debtorIdentificationType;
	private String authenticationType;
	private int requestTransmissionNumber;
	private String collectionDay;
	private String dateAdjustmentRuleIndicator;
	private String adjustmentCategory;
	private String debitValueType;
	
	
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
	public void setCreationDateTime(Date creationDateAndTime) {
		this.creationDateTime = creationDateAndTime;
	}
	public String getInitiatingParty() {
		return initiatingParty;
	}
	public void setInitiatingParty(String initiatingParty) {
		this.initiatingParty = initiatingParty;
	}
	public String getClientReference() {
		return clientReference;
	}
	public void setClientReference(String clientReference) {
		this.clientReference = clientReference;
	}
	public String getContractReference() {
		return contractReference;
	}
	public void setContractReference(String contractReference) {
		this.contractReference = contractReference;
	}
	public String getTrackingIndicator() {
		return trackingIndicator;
	}
	public void setTrackingIndicator(String trackingIndicator) {
		this.trackingIndicator = trackingIndicator;
	}
	public String getDebtorAuthenticationRequired() {
		return debtorAuthenticationRequired;
	}
	public void setDebtorAuthenticationRequired(String string) {
		this.debtorAuthenticationRequired = string;
	}
	public String getInstallmentOccurrence() {
		return installmentOccurrence;
	}
	public void setInstallmentOccurrence(String installmentOccurrence) {
		this.installmentOccurrence = installmentOccurrence;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public Date getMandateInitiationDate() {
		return mandateInitiationDate;
	}
	public void setMandateInitiationDate(Date mandateInitiationDate) {
		this.mandateInitiationDate = mandateInitiationDate;
	}
	public double getInstallmentAmount() {
		return installmentAmount;
	}
	public void setInstallmentAmount(double d) {
		this.installmentAmount = d;
	}
	public String getInstallmentAmountCurrency() {
		return installmentAmountCurrency;
	}
	public void setInstallmentAmountCurrency(String installmentAmountCurrency) {
		this.installmentAmountCurrency = installmentAmountCurrency;
	}
	public String getMaximumCollectionAmountCurrency() {
		return maximumCollectionAmountCurrency;
	}
	public void setMaximumCollectionAmountCurrency(String maximumCollectionAmountCurrency) {
		this.maximumCollectionAmountCurrency = maximumCollectionAmountCurrency;
	}
	public double getMaximumCollectionAmount() {
		return maximumCollectionAmount;
	}
	public void setMaximumCollectionAmount(double d) {
		this.maximumCollectionAmount = d;
	}
	public String getCreditorName() {
		return creditorName;
	}
	public void setCreditorName(String creditorName) {
		this.creditorName = creditorName;
	}
	public String getCreditorTelephoneContactDetails() {
		return creditorTelephoneContactDetails;
	}
	public void setCreditorTelephoneContactDetails(String creditorTelephoneContactDetails) {
		this.creditorTelephoneContactDetails = creditorTelephoneContactDetails;
	}
	public String getCreditorAccountNumber() {
		return creditorAccountNumber;
	}
	public void setCreditorAccountNumber(String string) {
		this.creditorAccountNumber = string;
	}
	public String getCreditorBankBranchNumber() {
		return creditorBankBranchNumber;
	}
	public void setCreditorBankBranchNumber(String string) {
		this.creditorBankBranchNumber = string;
	}
	public String getCreditorAbbreviatedShortName() {
		return creditorAbbreviatedShortName;
	}
	public void setCreditorAbbreviatedShortName(String creditorAbbreviatedShortName) {
		this.creditorAbbreviatedShortName = creditorAbbreviatedShortName;
	}
	public String getDebtorName() {
		return debtorName;
	}
	public void setDebtorName(String debtorName) {
		this.debtorName = debtorName;
	}
	public String getDebtorIdentification() {
		return debtorIdentification;
	}
	public void setDebtorIdentification(String string) {
		this.debtorIdentification = string;
	}
	public String getDebtorAccountNumber() {
		return debtorAccountNumber;
	}
	public void setDebtorAccountNumber(String string) {
		this.debtorAccountNumber = string;
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
	public void setDebtorBankBranchNumber(String string) {
		this.debtorBankBranchNumber = string;
	}
	public String getDebtorIdentificationType() {
		return debtorIdentificationType;
	}
	public void setDebtorIdentificationType(String debtorIdentificationType) {
		this.debtorIdentificationType = debtorIdentificationType;
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
	public void setCollectionDay(String string) {
		this.collectionDay = string;
	}
	public String getDateAdjustmentRuleIndicator() {
		return dateAdjustmentRuleIndicator;
	}
	public void setDateAdjustmentRuleIndicator(String dateAdjustmentRuleIndicator) {
		this.dateAdjustmentRuleIndicator = dateAdjustmentRuleIndicator;
	}
	public String getAdjustmentCategory() {
		return adjustmentCategory;
	}
	public void setAdjustmentCategory(String adjustmentCategory) {
		this.adjustmentCategory = adjustmentCategory;
	}
	public String getDebitValueType() {
		return debitValueType;
	}
	public void setDebitValueType(String debitValueType) {
		this.debitValueType = debitValueType;
	}
	
	
	
	
	
	
	
}
