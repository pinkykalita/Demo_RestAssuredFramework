Feature: Validating H2H svc API

@H2Hsvc
Scenario Outline: Verify Create H2H mandate API
	Given user has create H2H mandate Payload with access token and "<contractreference>" and "<clientreference>" and "<messageidentification>"
  When user sends a POST request to "createH2HMandateAPI"
  Then the response status code should be "200" 
  And the response body should indicate "<responseMessage>"
  Examples:
  | contractreference		|	responseMessage	|	clientreference			|	messageidentification							|
  | 8666267289QAPinky3	|	success					|	27349246745QAPinky2	|	100/MANIN/00210001/20240610/77790	|
 
 
@H2Hsvc
Scenario Outline: Verify Update H2H mandate API
	Given user has update H2H mandate Payload with access token and "<originalcontractreference>", "<originalclientreference>" and "<messageidentification>"
  When user sends "PUT" request to "updateH2HMandateAPI"
  Then the response status code should be "200" 
 # And the response body should indicate "<responseMessage>"
  Examples:
  | originalcontractreference		|	responseMessage	|	originalclientreference	|	messageidentification							|
  | 8666267289QAPinky2					|	success					|	27349246745QAPinky2			|	100/MANIN/00210001/20240610/77790	|
 

@H2Hsvc
Scenario Outline: Verify Cancel H2H mandate API
	Given user has cancel H2H mandate Payload with access token and "<originalcontractreference>", "<originalclientreference>" and "<messageidentification>"
  When user sends "PUT" request to "cancelH2HMandateAPI"
  Then the response status code should be "200" 
 # And the response body should indicate "<responseMessage>"
  Examples:
  | originalcontractreference		|	responseMessage	|	originalclientreference	|	messageidentification							|
  | 8666267289QAPinky2					|	success					|	27349246745QAPinky2			|	100/MANIN/00210001/20240610/77790	|