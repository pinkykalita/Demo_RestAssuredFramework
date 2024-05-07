Feature: Validating Mandate Batch API

@MandateBatch
Scenario: Verify create Mandate Batch
	Given user has request Payload with access token 
  When user sends a POST request to "CreateMandateBatchAPI"
  Then the response status code should be "200" 
  And the response should contain a valid "mandateBatchKey"
  
  
@MandateBatch
Scenario Outline: Verify get Mandate Batch
	Given request with path parameter "<mandatebatchkey>"
  When user sends "GET" request to "getMandateBatchAPI"
  Then the response status code should be "200" 
  And "mandateBatchKey" in response body should be same as "<mandatebatchkey>"
  Examples:
  | mandatebatchkey |
  | 6								|
  
@MandateBatch    
Scenario Outline: Verify Update Mandate Batch
	Given update payload with path parameter "<mandatebatchkey>"
  When user sends "PUT" request to "updateMandateBatchAPI"
  Then the response status code should be "200" 
  And the response should contain the updated value 
  Examples:
  | mandatebatchkey |		
  | 12							|	
  
@MandateBatch
Scenario Outline: Verify 404 statuscode 
	Given request with path parameter "<mandatebatchkey>"
	When user sends "GET" request to "getMandateBatchAPI"
	Then the response status code should be "404"
	Examples:
  | mandatebatchkey |
  | 	4654564				| 
  
  
@skip  
Scenario Outline: Verify Cancel Mandate Batch
	Given request payload with path parameter "<mandatebatchkey>"
  When user sends "PUT" request to "cancelMandateBatchAPI"
  Then the response status code should be "200" 
 	And "GET" request with path parameter "<mandatebatchkey>" to "getMandateBatchAPI" should return "404" ststus code
  Examples:
  | mandatebatchkey |
  | 6							|

@skip  
Scenario Outline: Verify 403 statuscode 
	Given update payload with path parameter "<mandatebatchkey>"
	When user sends "PUT" request to "updateMandateBatchAPI"
	Then the response status code should be "403"
	Examples:
  | mandatebatchkey |
  | 					| 
  
@skip  
Scenario Outline: Verify 401 statuscode 
	Given update payload with path parameter "<mandatebatchkey>"
	When user sends "PUT" request to "updateMandateBatchAPI"
	Then the response status code should be "401"
	Examples:
  | mandatebatchkey |
  | 					| 

@skip   
Scenario Outline: Verify 500 statuscode 
	Given update payload with path parameter "<mandatebatchkey>"
	When user sends "PUT" request to "updateMandateBatchAPI"
	Then the response status code should be "500"
	Examples:
  | mandatebatchkey |
  | 					| 
  
