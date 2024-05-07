Feature: Validating Mandate Batch Audit API

@AuditBatch
Scenario: Verify Audit of single mandate batch
	Given user has single mandate batch payload available
	When user sends a POST request to "singleMandateBatchAuditAPI"
	Then the response status code should be "200" 

@AuditBatch
Scenario: Verify autorization of multiple mandate batch
	Given user has multiple mandate batch payload available
	When user sends a POST request to "multipleMandateBatchAuditAPI"
	Then the response status code should be "200"

@AuditBatch
Scenario Outline: Verify 403 statuscode
	Given user has mandate batch payload available
	When user sends a POST request to "<resource>"
	Then the response status code should be "403"
	Examples:
  | resource											|
  | singleMandateBatchAuditAPI		|
  |	multipleMandateBatchAuditAPI	|

@AuditBatch
Scenario Outline: Verify 401 statuscode
	Given user has mandate batch payload available that is not allowed
	When user sends a POST request without bearer token to "<resource>"
	Then the response status code should be "401"
	Examples:
  | resource											|
  | singleMandateBatchAuditAPI		|
  |	multipleMandateBatchAuditAPI	|

@AuditBatch
Scenario outline: Verify 500 statuscode
	Given user has mandate batch payload available with incorrect data
	When user sends a POST request to "<resource>"
	Then the response status code should be "200"
	Examples:
  | resource											|
  | singleMandateBatchAuditAPI		|
  |	multipleMandateBatchAuditAPI	|
