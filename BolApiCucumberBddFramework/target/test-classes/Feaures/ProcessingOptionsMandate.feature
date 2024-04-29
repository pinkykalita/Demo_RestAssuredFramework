Feature: Validating Processing Options Mandate

Scenario: Verify that access token is successfully generated using Generate Access Token API
	Given the Generate Access Token API is available
  When a request is sent to "generateTokenAPI"
  Then the response should contain a valid access token

Scenario Outline: Verify that Mandate Processing Options are successfully created using Processing Options API
	Given user has request Payload with "<newKey>" and access token
  When user sends a POST request to "createProcessingOptionsAPI"
  Then the response status code should be "200" 
  And  "mandateProcessingOptionsKey" in response body should be same as "<newKey>"
  Examples:
  | newKey |
  | 10027  |
  
Scenario Outline: Verify that user can retrieve the processing options after successful creation
	Given the user has a request prepared with the "<path parameter>"
	When user sends "GET" request to "GetAndUpdateProcessingOptionsAPI"
	Then the response status code should be "200"
	And "mandateProcessingOptionsKey" in response body should be same as "<path parameter>"
	Examples:
  | path parameter 	|
  | 100025  				|
	
Scenario Outline: Verify that user can update the mandate processing option
	Given user has request Payload with "<path parameter>" and "<updatevalue>"
	When user sends "PUT" request to "GetAndUpdateProcessingOptionsAPI"
	Then the response status code should be "200"
	And "mandateProcessingOptionsKey" in response body should be same as "<path parameter>"
	And  "fuAuditRequired" in response body should be same as "<updatevalue>"
	Examples:
  | path parameter	|	updatevalue	|
  | 100020  				|	Y						|

Scenario Outline: Verify the error is displayed when creating a mandate processing options with existing key 
	Given user has request Payload with "<existingKey>" and access token
	When user sends a POST request with existing mandateProcessingOptionsKey to "createProcessingOptionsAPI"
	Then the response status code should be "500"
	And the response body should indicate "<errorMessage>"
	Examples:
  | existingKey |	errorMessage																							|
  | 100025  		|	The mandate processing option already exists for this key	|
	
Scenario Outline: Verify that error is displayed when creating mandates without bearer token
	Given user has request Payload with "<newKey>"
	When user sends a POST request without bearer token to "createProcessingOptionsAPI"
	Then the response status code should be "401"
	#And the response body should indicate "<errorMessage>"
	Examples:
  | newKey 	|	errorMessage	|
  | 1005  	|	Unauthorized	|