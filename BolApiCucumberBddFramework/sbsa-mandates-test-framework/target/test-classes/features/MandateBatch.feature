Feature: Validating Mandate Batch API

  
@MandateBatch
Scenario Outline: Verify Get Mandate Batch By Customer Id & Mandate Batch Key
	Given request with path parameter "<CustomerId>" and "<MandteBatchKey>" and "<queryparam>"
  When user sends "GET" request to "getMandateBatchAPICustomerIdMandteBatchKey"
  Then the response status code should be "200" 
  Examples:
  |	queryparam	| MandteBatchKey 	|	CustomerId	|
  |	true				| 136								|	373731			|
  

@MandateBatch
Scenario Outline: Verify Get Mandate Batch By Customer Id
	Given request with path parameter "<CustomerId>" and "<queryparam>"
  When user sends "GET" request to "getMandateBatchAPICustomerId"
  Then the response status code should be "200" 
  Examples:
  | queryparam 	|	CustomerId	|
  | true				|	373731			|
  
  