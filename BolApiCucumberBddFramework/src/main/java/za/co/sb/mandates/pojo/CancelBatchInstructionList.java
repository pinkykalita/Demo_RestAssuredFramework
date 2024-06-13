package za.co.sb.mandates.pojo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CancelBatchInstructionList {
	
	private String action;
	private String adjustmentCategory;
    private String authenticationType;
    private String clientReference;
    private String collectionDay;
    private String contractReference;
    private String countryCode;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
    private Date creationDateAndTime;
    
    private String creditorAbbreviatedShortName;
    private String creditorAccountNumber;
    private String creditorBankBranch;
    private String creditorBicCode;
	private String creditorEmailDetails;
    private String creditorName;
    private int creditorSchemeId;
    private String creditorTelephoneDetails;
    private String dateAdjustmentRuleIndicator;
    private String debitValueType;
    private String debtorAccountName;
    private String debtorAccountNumber;
    private String debtorAccountType;
    private String debtorAuthenticationRequired;
    private String debtorBankBranch;
    private String debtorBankName;
    private String debtorBicCode;
    private String debtorEmailDetails;
    private String debtorIdentification;
    private String debtorIdentificationType;
    private String debtorName;
    private String debtorTelephoneDetails;
    private String entryClass;
    private List<ErrorList> errorList;
	private String frequency;
    private String initiatingParty;
    private double installmentAmount;
    private String installmentAmountCurrency;
    private String installmentOccurrence;
    private String instructedAgent;
    private String instructingAgent;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
    private Date mandateInitiationDate;   
    
    private int mandateInstrumentKey;
    private double maxCollectionAmount;
    private String maxCollectionAmountCurrency;
    private int requestTransmissionNumber;
    private String status;
    private String submissionMechanism;
    private String trackingIndicator;
    private String ultimateCreditorName;
    private int version;
    private String mandateBatchKey;
    private int mandateInstructionKey;
	private int mandateKey;
    private String mandateReferenceNumber;
	private String mandateRequestTransactionId;
    private String messageIdentification;
    private String originalMrti;
    private boolean suspended;
    private String ultimateDebtorName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "UTC")
    private Date whenModified;
    
    
    public Date getWhenModified() {
		return whenModified;
	}
	public void setWhenModified(Date whenModified) {
		this.whenModified = whenModified;
	}
	public String getUltimateDebtorName() {
		return ultimateDebtorName;
	}
	public void setUltimateDebtorName(String ultimateDebtorName) {
		this.ultimateDebtorName = ultimateDebtorName;
	}
	public boolean isSuspended() {
	return suspended;
}
public void setSuspended(boolean suspended) {
	this.suspended = suspended;
}
	public String getMandateRequestTransactionId() {
		return mandateRequestTransactionId;
	}
	public void setMandateRequestTransactionId(String mandateRequestTransactionId) {
		this.mandateRequestTransactionId = mandateRequestTransactionId;
	}
	public String getMessageIdentification() {
		return messageIdentification;
	}
	public void setMessageIdentification(String messageIdentification) {
		this.messageIdentification = messageIdentification;
	}
	public String getOriginalMrti() {
		return originalMrti;
	}
	public void setOriginalMrti(String originalMrti) {
		this.originalMrti = originalMrti;
	}
	public String getMandateReferenceNumber() {
		return mandateReferenceNumber;
	}
	public void setMandateReferenceNumber(String mandateReferenceNumber) {
		this.mandateReferenceNumber = mandateReferenceNumber;
	}
	public int getMandateKey() {
		return mandateKey;
	}
	public void setMandateKey(int mandateKey) {
		this.mandateKey = mandateKey;
	}
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getAdjustmentCategory() {
		return adjustmentCategory;
	}
	public void setAdjustmentCategory(String adjustmentCategory) {
		this.adjustmentCategory = adjustmentCategory;
	}
	public String getAuthenticationType() {
		return authenticationType;
	}
	public void setAuthenticationType(String authenticationType) {
		this.authenticationType = authenticationType;
	}
	public String getClientReference() {
		return clientReference;
	}
	public void setClientReference(String clientReference) {
		this.clientReference = clientReference;
	}
	public String getCollectionDay() {
		return collectionDay;
	}
	public void setCollectionDay(String collectionDay) {
		this.collectionDay = collectionDay;
	}
	public String getContractReference() {
		return contractReference;
	}
	public void setContractReference(String contractReference) {
		this.contractReference = contractReference;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public Date getCreationDateAndTime() {
		return creationDateAndTime;
	}
	public void setCreationDateAndTime(Date creationDateAndTime) {
		this.creationDateAndTime = creationDateAndTime;
	}
	public String getCreditorAbbreviatedShortName() {
		return creditorAbbreviatedShortName;
	}
	public void setCreditorAbbreviatedShortName(String creditorAbbreviatedShortName) {
		this.creditorAbbreviatedShortName = creditorAbbreviatedShortName;
	}
	public String getCreditorAccountNumber() {
		return creditorAccountNumber;
	}
	public void setCreditorAccountNumber(String creditorAccountNumber) {
		this.creditorAccountNumber = creditorAccountNumber;
	}
	public String getCreditorBankBranch() {
		return creditorBankBranch;
	}
	public void setCreditorBankBranch(String creditorBankBranch) {
		this.creditorBankBranch = creditorBankBranch;
	}
	public String getCreditorEmailDetails() {
		return creditorEmailDetails;
	}
	public void setCreditorEmailDetails(String creditorEmailDetails) {
		this.creditorEmailDetails = creditorEmailDetails;
	}
	public String getCreditorName() {
		return creditorName;
	}
	public void setCreditorName(String creditorName) {
		this.creditorName = creditorName;
	}
	public int getCreditorSchemeId() {
		return creditorSchemeId;
	}
	public void setCreditorSchemeId(int creditorSchemeId) {
		this.creditorSchemeId = creditorSchemeId;
	}
	public String getCreditorTelephoneDetails() {
		return creditorTelephoneDetails;
	}
	public void setCreditorTelephoneDetails(String creditorTelephoneDetails) {
		this.creditorTelephoneDetails = creditorTelephoneDetails;
	}
	public String getDateAdjustmentRuleIndicator() {
		return dateAdjustmentRuleIndicator;
	}
	public void setDateAdjustmentRuleIndicator(String dateAdjustmentRuleIndicator) {
		this.dateAdjustmentRuleIndicator = dateAdjustmentRuleIndicator;
	}
	public String getDebitValueType() {
		return debitValueType;
	}
	public void setDebitValueType(String debitValueType) {
		this.debitValueType = debitValueType;
	}
	public String getDebtorAccountName() {
		return debtorAccountName;
	}
	public void setDebtorAccountName(String debtorAccountName) {
		this.debtorAccountName = debtorAccountName;
	}
	public String getDebtorAccountNumber() {
		return debtorAccountNumber;
	}
	public void setDebtorAccountNumber(String debtorAccountNumber) {
		this.debtorAccountNumber = debtorAccountNumber;
	}
	public String getDebtorAccountType() {
		return debtorAccountType;
	}
	public void setDebtorAccountType(String debtorAccountType) {
		this.debtorAccountType = debtorAccountType;
	}
	public String getDebtorAuthenticationRequired() {
		return debtorAuthenticationRequired;
	}
	public void setDebtorAuthenticationRequired(String debtorAuthenticationRequired) {
		this.debtorAuthenticationRequired = debtorAuthenticationRequired;
	}
	public String getDebtorBankBranch() {
		return debtorBankBranch;
	}
	public void setDebtorBankBranch(String debtorBankBranch) {
		this.debtorBankBranch = debtorBankBranch;
	}
	public String getDebtorBankName() {
		return debtorBankName;
	}
	public void setDebtorBankName(String debtorBankName) {
		this.debtorBankName = debtorBankName;
	}
	public String getDebtorBicCode() {
		return debtorBicCode;
	}
	public void setDebtorBicCode(String debtorBicCode) {
		this.debtorBicCode = debtorBicCode;
	}
	public String getDebtorEmailDetails() {
		return debtorEmailDetails;
	}
	public void setDebtorEmailDetails(String debtorEmailDetails) {
		this.debtorEmailDetails = debtorEmailDetails;
	}
	public String getDebtorIdentification() {
		return debtorIdentification;
	}
	public void setDebtorIdentification(String debtorIdentification) {
		this.debtorIdentification = debtorIdentification;
	}
	public String getDebtorIdentificationType() {
		return debtorIdentificationType;
	}
	public void setDebtorIdentificationType(String debtorIdentificationType) {
		this.debtorIdentificationType = debtorIdentificationType;
	}
	public String getDebtorName() {
		return debtorName;
	}
	public void setDebtorName(String debtorName) {
		this.debtorName = debtorName;
	}
	public String getDebtorTelephoneDetails() {
		return debtorTelephoneDetails;
	}
	public void setDebtorTelephoneDetails(String debtorTelephoneDetails) {
		this.debtorTelephoneDetails = debtorTelephoneDetails;
	}
	public String getEntryClass() {
		return entryClass;
	}
	public void setEntryClass(String entryClass) {
		this.entryClass = entryClass;
	}
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public String getInitiatingParty() {
		return initiatingParty;
	}
	public void setInitiatingParty(String initiatingParty) {
		this.initiatingParty = initiatingParty;
	}
	public double getInstallmentAmount() {
		return installmentAmount;
	}
	public void setInstallmentAmount(double installmentAmount) {
		this.installmentAmount = installmentAmount;
	}
	public String getInstallmentAmountCurrency() {
		return installmentAmountCurrency;
	}
	public void setInstallmentAmountCurrency(String installmentAmountCurrency) {
		this.installmentAmountCurrency = installmentAmountCurrency;
	}
	public String getInstallmentOccurrence() {
		return installmentOccurrence;
	}
	public void setInstallmentOccurrence(String installmentOccurrence) {
		this.installmentOccurrence = installmentOccurrence;
	}
	public String getInstructedAgent() {
		return instructedAgent;
	}
	public void setInstructedAgent(String instructedAgent) {
		this.instructedAgent = instructedAgent;
	}
	public String getInstructingAgent() {
		return instructingAgent;
	}
	public void setInstructingAgent(String instructingAgent) {
		this.instructingAgent = instructingAgent;
	}
	public Date getMandateInitiationDate() {
		return mandateInitiationDate;
	}
	public void setMandateInitiationDate(Date mandateInitiationDate) {
		this.mandateInitiationDate = mandateInitiationDate;
	}
	public int getMandateInstrumentKey() {
		return mandateInstrumentKey;
	}
	public void setMandateInstrumentKey(int mandateInstrumentKey) {
		this.mandateInstrumentKey = mandateInstrumentKey;
	}
	public double getMaxCollectionAmount() {
		return maxCollectionAmount;
	}
	public void setMaxCollectionAmount(double maxCollectionAmount) {
		this.maxCollectionAmount = maxCollectionAmount;
	}
	public String getMaxCollectionAmountCurrency() {
		return maxCollectionAmountCurrency;
	}
	public void setMaxCollectionAmountCurrency(String maxCollectionAmountCurrency) {
		this.maxCollectionAmountCurrency = maxCollectionAmountCurrency;
	}
	public int getRequestTransmissionNumber() {
		return requestTransmissionNumber;
	}
	public void setRequestTransmissionNumber(int requestTransmissionNumber) {
		this.requestTransmissionNumber = requestTransmissionNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSubmissionMechanism() {
		return submissionMechanism;
	}
	public void setSubmissionMechanism(String submissionMechanism) {
		this.submissionMechanism = submissionMechanism;
	}
	public String getTrackingIndicator() {
		return trackingIndicator;
	}
	public void setTrackingIndicator(String trackingIndicator) {
		this.trackingIndicator = trackingIndicator;
	}
	public String getUltimateCreditorName() {
		return ultimateCreditorName;
	}
	public void setUltimateCreditorName(String ultimateCreditorName) {
		this.ultimateCreditorName = ultimateCreditorName;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getCreditorBicCode() {
		return creditorBicCode;
	}
	public void setCreditorBicCode(String creditorBicCode) {
		this.creditorBicCode = creditorBicCode;
	}
	public String getMandateBatchKey() {
		return mandateBatchKey;
	}
	public void setMandateBatchKey(String key) {
		this.mandateBatchKey = key;
	}
	public List<ErrorList> getErrorList() {
		return errorList;
	}
	public void setErrorList(List<ErrorList> errorList) {
		this.errorList = errorList;
	}
	
	public int getMandateInstructionKey() {
		return mandateInstructionKey;
	}
	public void setMandateInstructionKey(int mandateInstructionKey) {
		this.mandateInstructionKey = mandateInstructionKey;
	}

    
    
}
