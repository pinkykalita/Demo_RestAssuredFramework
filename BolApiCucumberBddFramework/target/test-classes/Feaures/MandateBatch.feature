Feature: Validating Mandate Batch API

@MandateBatch  
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