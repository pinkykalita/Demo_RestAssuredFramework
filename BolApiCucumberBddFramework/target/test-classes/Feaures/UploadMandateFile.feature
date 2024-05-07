Feature: Validating Upload Mandate File API

@uploadMandateFile
Scenario Outline: Verify Upload Mandate File API
	Given user has request payload available
  When user sends a POST request to "UploadMandateFileAPI"
  Then the response status code should be "200" 
 
@skip    
Scenario Outline: Verify 204 statuscode 
	Given user has no content in request payload
	When user sends a POST request to "UploadMandateFileAPI"
	Then the response status code should be "204"
  
@skip     
Scenario Outline: Verify 403 statuscode 
	Given user has request payload available that is not allowed
	When user sends a POST request to "UploadMandateFileAPI"
	Then the response status code should be "403"
  
@skip   
Scenario Outline: Verify 401 statuscode 
	Given user has request payload available
	When user sends a POST request without bearer token to "UploadMandateFileAPI"
	Then the response status code should be "401"
	Examples:
  | mandatebatchkey |
  | 					| 

@uploadMandateFile
 Scenario Outline: Verify 500 statuscode 
	Given user has request payload available with invalid data
	When user sends a POST request to "UploadMandateFileAPI"
	Then the response status code should be "500"
	Examples:
  | Status			|	todate					|
  | T						|	2022-03-10			|
  
 