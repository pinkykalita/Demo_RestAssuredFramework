Feature: Validating Mandate Interchange API

Scenario Outline: Verify that Mandate Interchange are successfully created using Create Mandate Intercahnege API
	Given user has request Payload with access token and "<newKey>" 
  When user sends a POST request to "createMandateInterchangeAPI"
  Then the response status code should be "200" 
  And "customerKey" in response body should be same as "<newKey>"
  And the response should return "mandateInterchangeKey"
  Examples:
  | newKey	|
  | 19  		|
 

Scenario Outline: Verify that user can retrieve the Mandate Interchange using mandateInterchangeKey
	Given request prepared with "<interchange key>"
	When user sends "GET" request to "getMandateInterchangeWithKeyAPI"
	Then the response status code should be "200"
	And "mandateInterchangeKey" in response body should be same as "<interchange key>"
	Examples:
  | interchange key |
  | 12							|  	
  