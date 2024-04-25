Feature: Validating Processing Options Mandate

Scenario: Verify that access token is successfully generated using Generate Access Token API
	Given the Generate Access Token API is available
  When a request is sent to generate an access token
  Then the response should contain a valid access token

Scenario Outline: Verify that Mandate Processing Options are successfully created using Processing Options API
	Given user has request Payload with "<newKey>" and access token
  When user sends a POST request to create a new Mandate Processing Options
  Then the response status code should be 200 
  And  "mandateProcessingOptionsKey" in response body should be same as "<newKey>"
  
  Examples:
  | newKey |
  | 199000  |
  
Scenario Outline: Verify that user can retrieve the processing options after successful creation
	Given the user has a request prepared with the "<path parameter>"
	When user sends GET request
	Then the response status code should be 200
	And "mandateProcessingOptionsKey" in response body should be same as "<path parameter>"
	Examples:
  | path parameter |
  | 117  |
	
Scenario: Verify that user can update the mandate processing option
	Given  the user has request payload for update mandate
	When user sends PUT request with the "mandateProcessingOptionsKey" as path parameter
	Then the response status code should be 200
	And  the response should contain the details of the updated processing option

Scenario: Verify the error is displayed when creating a mandate processing options with existing key 
	Given existing processing option is present for the specified mandateProcessingOptionsKey
	When user sends a POST request to create a mandate processing option with the same "mandateProcessingOptionsKey" 
	Then the response status code should be 500
	And the error message should indicate "The mandate processing option already exists for this key"
	
Scenario: Verify that error is displayed when creating mandates without bearer token
	Given
	When 
	Then the response status code should be 401
	And the error message should indicate "Unauthorized"