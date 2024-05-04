Feature: Validating Mandate Batch API


Scenario: Verify create Mandate Batch
	Given user has request Payload with access token 
  When user sends a POST request to "CreateMandateBatchAPI"
  Then the response status code should be "200" 
  And the response should contain a valid "mandateBatchKey"
  

Scenario Outline: Verify get Mandate Batch
	Given request with path parameter "<mandatebatchkey>"
  When user sends "GET" request to "getMandateBatchAPI"
  Then the response status code should be "200" 
  And "mandateBatchKey" in response body should be same as "<mandatebatchkey>"
  Examples:
  | mandatebatchkey |
  | 6								|
  
 
Scenario Outline: Verify Cancel Mandate Batch
	Given request payload with path parameter "<mandatebatchkey>"
  When user sends "PUT" request to "cancelMandateBatchAPI"
  Then the response status code should be "200" 
 # And return "404" statuscode on "GET" request with same path parameter "<mandatebatchkey>"
  Examples:
  | mandatebatchkey |
  | 34							|
  

@MandateBatch
Scenario Outline: Verify Update Mandate Batch
	Given update payload with path parameter "<mandatebatchkey>"
  When user sends "PUT" request to "updateMandateBatchAPI"
  Then the response status code should be "200" 
  Examples:
  | mandatebatchkey |		
  | 12								|	
  
  
