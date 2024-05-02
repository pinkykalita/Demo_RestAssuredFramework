Feature: Validating Mandate Batch API

@MandateBatch
Scenario: Verify create Mandate Batch
	Given user has request Payload with access token 
  When user sends a POST request to "CreateMandateBatchAPI"
  Then the response status code should be "200" 
  And the response should contain a valid "mandateBatchKey"
