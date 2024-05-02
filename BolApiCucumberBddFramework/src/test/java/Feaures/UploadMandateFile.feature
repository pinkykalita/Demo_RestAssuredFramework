Feature: Validating Upload Mandate File API

@uploadMandateFile
Scenario Outline: Verify Upload Mandate File API
	Given user has request payload available
  When user sends a POST request to "UploadMandateFileAPI"
  Then the response status code should be "200" 