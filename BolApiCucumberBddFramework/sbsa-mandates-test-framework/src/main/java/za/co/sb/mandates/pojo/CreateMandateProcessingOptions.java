package za.co.sb.mandates.pojo;

public class CreateMandateProcessingOptions {
	
	private String acceptanceType;
	private String fuAuditRequired;
    private String fuAuthorisationRequired;
    private String fuInterimAuditType;
    private String h2hAuditRequired;
    private String h2hAuthorisationRequired;
    private String h2hInterimAuditType;
    private Object mandateProcessingOptionsKey;
    private String acceptanceTypeEnum;
    private String fuInterimAuditTypeEnum;
    private String h2hInterimAuditTypeEnum;
    
    
    public String getAcceptanceTypeEnum() {
		return acceptanceTypeEnum;
	}
	public void setAcceptanceTypeEnum(String acceptanceTypeEnum) {
		this.acceptanceTypeEnum = acceptanceTypeEnum;
	}
	public String getFuInterimAuditTypeEnum() {
		return fuInterimAuditTypeEnum;
	}
	public void setFuInterimAuditTypeEnum(String fuInterimAuditTypeEnum) {
		this.fuInterimAuditTypeEnum = fuInterimAuditTypeEnum;
	}
	public String getH2hInterimAuditTypeEnum() {
		return h2hInterimAuditTypeEnum;
	}
	public void setH2hInterimAuditTypeEnum(String h2hInterimAuditTypeEnum) {
		this.h2hInterimAuditTypeEnum = h2hInterimAuditTypeEnum;
	}
    public String getAcceptanceType() {
		return acceptanceType;
	}
	public void setAcceptanceType(String acceptanceType) {
		this.acceptanceType = acceptanceType;
	}
	public String getFuAuditRequired() {
		return fuAuditRequired;
	}
	public void setFuAuditRequired(String fuAuditRequired) {
		this.fuAuditRequired = fuAuditRequired;
	}
	public String getFuAuthorisationRequired() {
		return fuAuthorisationRequired;
	}
	public void setFuAuthorisationRequired(String fuAuthorisationRequired) {
		this.fuAuthorisationRequired = fuAuthorisationRequired;
	}
	public String getFuInterimAuditType() {
		return fuInterimAuditType;
	}
	public void setFuInterimAuditType(String fuInterimAuditType) {
		this.fuInterimAuditType = fuInterimAuditType;
	}
	public String getH2hAuditRequired() {
		return h2hAuditRequired;
	}
	public void setH2hAuditRequired(String h2hAuditRequired) {
		this.h2hAuditRequired = h2hAuditRequired;
	}
	public String getH2hAuthorisationRequired() {
		return h2hAuthorisationRequired;
	}
	public void setH2hAuthorisationRequired(String h2hAuthorisationRequired) {
		this.h2hAuthorisationRequired = h2hAuthorisationRequired;
	}
	public String getH2hInterimAuditType() {
		return h2hInterimAuditType;
	}
	public void setH2hInterimAuditType(String h2hInterimAuditType) {
		this.h2hInterimAuditType = h2hInterimAuditType;
	}
	public Object getMandateProcessingOptionsKey() {
		return mandateProcessingOptionsKey;
	}
	public void setMandateProcessingOptionsKey(Object newKey) {
		this.mandateProcessingOptionsKey = newKey;
	}
	
	
	
}
