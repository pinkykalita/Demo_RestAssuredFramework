Feature: Validating Mandate Batch Decline API

@AuthoriseBatch
Scenario: Verify decline of a mandate batch
	Given user has decline payload available for a mandate batch
	When user sends a POST request to "singleMandateBatchDeclineAPI"
	Then the response status code should be "200" 

@AuthoriseBatch
Scenario: Verify autorization of multiple mandate batch
	Given user has multiple mandate batch payload available
	When user sends a POST request to "multipleMandateBatchDeclineAPI"
	Then the response status code should be "200"

@AuthoriseBatch
Scenario: Verify 403 statuscode
	Given user has mandate batch payload available
	When user sends a POST request to "<resource>"
	Then the response status code should be "403"
	Examples:
  | resource													|
  | singleMandateBatchDeclineAPI		|
  |	multipleMandateBatchDeclineAPI	|

@AuthoriseBatch
Scenario: Verify 401 statuscode
	Given user has mandate batch payload available that is not allowed
	When user sends a POST request without bearer token to "<resource>"
	Then the response status code should be "401"
	Examples:
  | resource												|
  | singleMandateBatchDeclineAPI		|
  |	multipleMandateBatchDeclineAPI	|
  
@AuthoriseBatch
Scenario: Verify 500 statuscode
	Given user has mandate batch payload available with incorrect data
	When user sends a POST request to "<resource>"
	Then the response status code should be "200"
	Examples:
  | resource												|
  | singleMandateBatchDeclineAPI		|
  |	multipleMandateBatchDeclineAPI	|