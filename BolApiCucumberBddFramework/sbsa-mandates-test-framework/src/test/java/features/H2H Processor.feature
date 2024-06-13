Feature: Validating H2H Processor

@H2HProcessor
Scenario Outline: POST2 - GPP to MMS Send GPP Pain009 Ack
	Given user has Payload with access token, "<contractreferenceToMatch>", "<messagetype>" and "<messageidentification>" 
  When user sends a POST request to "GPPPainAckAPI"
  Then the response status code should be "200" 
  Examples:
 	|	messagetype |	messageidentification							|	contractreferenceToMatch	|
 	|	Pain_009		| 100/MANIN/00210001/20240610/77790	|	8666267289QAPinky3				|
 									
@H2HProcessor
Scenario Outline: POST3 - GPP to MMS Send GPP Initiate Accept Request
	Given user has Payload with access token, "<contractreferenceToMatch>", "<messagetype>" and "<messageidentification>"
  When user sends a POST request to "GPPInitiateAcceptRequestAPI"
  Then the response status code should be "200" 
  Examples:
  |	messagetype |	messageidentification							|	contractreferenceToMatch	|
 	|	Pain_012		| 100/MANIN/00210001/20240610/77790	|	8666267289QAPinky3				|
  