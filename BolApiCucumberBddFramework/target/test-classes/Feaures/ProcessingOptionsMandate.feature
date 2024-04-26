Feature: Validating Processing Options Mandate

Scenario: Verify that access token is successfully generated using Generate Access Token API
	Given the Generate Access Token API is available
  When a request is sent to generate an access token
  Then the response should contain a valid access token

Scenario Outline: Verify that Mandate Processing Options are successfully created using Processing Options API
	Given user has request Payload with "<newKey>" and access token
  When user sends a POST request to create a new Mandate Processing Options
  Then the response status code should be "<expectedStatusCode>" 
  And  "mandateProcessingOptionsKey" in response body should be same as "<newKey>"
  
  Examples:
  | newKey |	expectedStatusCode	|
  | 100012  |	200	|
  
Scenario Outline: Verify that user can retrieve the processing options after successful creation
	Given the user has a request prepared with the "<path parameter>"
	When user sends GET request with access token
	Then the response status code should be "<expectedStatusCode>" 
	And "mandateProcessingOptionsKey" in response body should be same as "<path parameter>"
	
	Examples:
  | path parameter |	expectedStatusCode	|
  | 117  |	200	|
	
Scenario Outline: Verify that user can update the mandate processing option
	Given user has request Payload with "<path parameter>" and "<updatevalue>"
	When user sends PUT request with access token
	Then the response status code should be "<expectedStatusCode>" 
	And "mandateProcessingOptionsKey" in response body should be same as "<path parameter>"
	And  "fuInterimAuditType" in response body should be same as "<updatevalue>"
	
	Examples:
  | path parameter |	updatevalue	|	expectedStatusCode	|
  | 117  |	N	|	200	|

Scenario Outline: Verify the error is displayed when creating a mandate processing options with existing key 
	Given user has request Payload with "<existingKey>" and access token
	When user sends a POST request to create a new Mandate Processing Options
	Then the response status code should be "<expectedStatusCode>" 
	And the response body should indicate "<errorMessage>"
	
	Examples:
  | existingKey |	errorMessage	|	expectedStatusCode	|
  | 117  |	The mandate processing option already exists for this key	|	500	|
	
Scenario Outline: Verify that error is displayed when creating mandates without bearer token
	Given user has request Payload with "<newKey>"
	When user sends a POST request to create a new Mandate Processing Options
	Then the response status code should be "<expectedStatusCode>" 
	And the response body should indicate "<Unauthorized>"
	
	Examples:
  | newKey |	errorMessage	| expectedStatusCode	|
  | 1002  |	Unauthorized	|	401	|