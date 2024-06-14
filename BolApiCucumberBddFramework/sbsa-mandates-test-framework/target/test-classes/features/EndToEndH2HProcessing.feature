Feature: Validating end to end H2H Processing

@endtoendCreateH2HMandate
Scenario Outline: Verify Create H2H mandate API
	Given user has create H2H mandate Payload with access token and "<contractreference>" and "<clientreference>" and "<messageidentification>"
  When user sends a POST request to "createH2HMandateAPI"
  Then the response status code should be "200" 
  And the response body should indicate "<responseMessage>"
  Examples:
  | contractreference		|	responseMessage	|	clientreference			|	messageidentification							|
  | 8666267289QAPinky4	|	success					|	27349246745QAPinky2	|	100/MANIN/00210001/20240614/77790	|
  
@endtoendCreateH2HMandate  
Scenario Outline: POST2 - GPP to MMS Send GPP Pain009 Ack
	Given user has Payload with access token, "<contractreferenceToMatch>", "<messagetype>" and "<messageidentification>" 
  When user sends a POST request to "GPPPainAckAPI"
  Then the response status code should be "200" 
  Examples:
 	|	messagetype |	messageidentification							|	contractreferenceToMatch	|
 	|	Pain_009		| 100/MANIN/00210001/20240614/77790	|	8666267289QAPinky4				|

@endtoendCreateH2HMandate 									
Scenario Outline: POST3 - GPP to MMS Send GPP Initiate Accept Request
	Given user has Payload with access token, "<contractreferenceToMatch>", "<messagetype>" and "<messageidentification>"
  When user sends a POST request to "GPPInitiateAcceptRequestAPI"
  Then the response status code should be "200" 
  Examples:
  |	messagetype |	messageidentification							|	contractreferenceToMatch	|
 	|	Pain_012		| 100/MANIN/00210001/20240614/77790	|	8666267289QAPinky4				|

@endtoendCreateH2HMandate  	
Scenario Outline: Verify Get Mandate Batch By Customer Id
	Given request with path parameter "<CustomerId>" and "<queryparam>"
  When user sends "GET" request to "getMandateBatchAPICustomerId"
  Then the response status code should be "200"
  And extract the mandate with "<contractreferenceToMatch>" from response
  And status in response body should be ACC
  And action in response body should be I
  Examples:
  | queryparam 	|	CustomerId	|	contractreferenceToMatch	|	statusValue	|	actionValue	|
  | true				|	373731			|	8666267289QAPinky4				|	ACC					|	I						|
  
 	
 	