Feature: Validating Mandate Interchange API

@MandateInterchange 
Scenario Outline: Verify that Mandate Interchange are successfully created using Create Mandate Intercahnege API
	Given user has request Payload with access token and "<customerkey>" 
  When user sends a POST request to "createMandateInterchangeAPI"
  Then the response status code should be "200" 
  And "customerKey" in response body should be same as "<customerkey>"
  Examples:
  | customerkey	|
  | 19  				|

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
	And "customerkey" in response body should be same as "<customerkey>"
	And "fileName" in response body should be same as "<filename>"
	And "uploadedUsername" in response body should be same as "<uploadedusername>"
	Examples:
  | customerkey |	filename	|	uploadedusername	|
  | 19					|	TEST.xml	|	Test User123			|
  
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