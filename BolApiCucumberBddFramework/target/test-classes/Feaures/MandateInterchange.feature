Feature: Validating Mandate Interchange API

@MandateInterchange
Scenario Outline: Verify that Mandate Interchange are successfully created using Create Mandate Intercahnege API
	Given user has request Payload with access token and "<customerkey>" 
  When user sends a POST request to "createMandateInterchangeAPI"
  Then the response status code should be "200" 
  And "customerKey" in response body should be same as "<customerkey>"
  Examples:
  | customerkey	|
  | 195  				|

@MandateInterchange
Scenario Outline: Verify that user can retrieve the Mandate Interchange using mandateInterchangeKey
	Given request prepared with "<interchange key>"
	When user sends "GET" request to "getMandateInterchangeWithKeyAPI"
	Then the response status code should be "200"
	And "mandateInterchangeKey" in response body should be same as "<interchange key>"
	Examples:
  | interchange key |
  | 12							|  	
 
@MandateInterchange
Scenario Outline: Verify that user can retrieve the Mandate Interchange with query parameters
	Given request prepared with query parameters "<customerkey>","<filename>","<uploadedusername>"
	When user sends "GET" request to "getMandateInterchangeWithQueryParamsAPI"
	Then the response status code should be "200"
	And response should return only the data that contains "<customerkey>" and "<filename>" and "<uploadedusername>" 
	Examples:
  | customerkey |	filename								|	uploadedusername	|
  | 123456			|	fortestingpurpose.xml	  |	tester1234							|	
  
 
@MandateInterchange
Scenario Outline: Verify that Mandate Interchange is successfully updated using PUT request to updateMandateInterchangeAPI 
	Given a request with "<interchange key>" and payload to update "<filename>","<uploadedusername>" 
  When user sends "PUT" request to "updateMandateInterchangeAPI"
  Then the response status code should be "200"
  And "fileName" in response body should be same as "<filename>"
  And "uploadedUsername" in response body should be same as "<uploadedusername>"
  And "customerKey" in response body should be same as "123456"
 	Examples:
  | interchange key | filename							|	uploadedusername	|
  | 12							| fortestingpurpose.xml	|	tester1234			|
 

@MandateInterchange
Scenario Outline: Verify that 404 statuscode is displayed on GET request for getMandateInterchangeWithQueryParamsAPI when no data found
	Given request prepared with query parameters "<customerkey>","<uploadedusername>"
	When user sends "GET" request to "getMandateInterchangeWithQueryParamsAPI"
	Then the response status code should be "404"
	Examples:
  | customerkey |	uploadedusername	|
  | 12					|	Test User123			| 
  
@MandateInterchange
Scenario Outline: Verify that 404 statuscode is displayed on GET request for getMandateInterchangeWithKeyAPI when no data found
	Given request prepared with "<interchange key>"
	When user sends "GET" request to "getMandateInterchangeWithKeyAPI"
	Then the response status code should be "404"
	Examples:
  | interchange key |
  | 12454						|
  
@skip 
Scenario Outline: Verify that GET request to getMandateInterchangeWithQueryParamsAPI with incorrect query params returns 500 statuscode 
	Given request prepared with query parameters "<Status>"
	When user sends "GET" request to "getMandateInterchangeWithQueryParamsAPI"
	Then the response status code should be "500"
	Examples:
  | Status			|	todate					|
  | T						|	2022-03-10			|
 
@skip 
 Scenario Outline: Verify that 403 statuscode 
	Given request prepared with "<interchange key>"
	When user sends "GET" request to "getMandateInterchangeWithKeyAPI"
	Then the response status code should be "403"
	Examples:
  | interchange key |
  | 								| 