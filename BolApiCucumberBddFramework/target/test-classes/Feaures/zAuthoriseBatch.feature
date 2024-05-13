Feature: Validating Mandate Batch Authorise API


Scenario: Verify autorization of single mandate batch
	Given user has single mandate batch payload available
	When user sends a POST request to "singleMandateBatchAuthoriseAPI"
	Then the response status code should be "200" 


Scenario: Verify autorization of multiple mandate batch
	Given user has multiple mandate batch payload available
	When user sends a POST request to "multipleMandateBatchAuthoriseAPI"
	Then the response status code should be "200"


Scenario: Verify 403 statuscode
	Given user has mandate batch payload available
	When user sends a POST request to "<resource>"
	Then the response status code should be "403"
	Examples:
  | resource													|
  | singleMandateBatchAuthoriseAPI		|
  |	multipleMandateBatchAuthoriseAPI	|


Scenario: Verify 401 statuscode
	Given user has mandate batch payload available that is not allowed
	When user sends a POST request without bearer token to "<resource>"
	Then the response status code should be "401"
	Examples:
  | resource													|
  | singleMandateBatchAuthoriseAPI		|
  |	multipleMandateBatchAuthoriseAPI	|
  
@AuthoriseBatch
Scenario: Verify 500 statuscode
	Given user has mandate batch payload available with incorrect data
	When user sends a POST request to "<resource>"
	Then the response status code should be "500"
	And the response body should contain "<errorMessage>"
	Examples:
  | resource													|	errorMessage										|
 # | singleMandateBatchAuthoriseAPI		| not found	|
  |	multipleMandateBatchAuthoriseAPI	| not found	|