Feature: Validating Mandate Interchange API

@uploadMandateFile
Scenario Outline: Verify Upload Mandate File API
	Given user has request with access token and "<ID>" 
  When user sends a POST request to "UploadMandateFileAPI"
  Then the response status code should be "200" 
  And "mandateInterchangeId" in response body should be same as "<ID>"
  Examples:
  | ID	|
  | 10	|