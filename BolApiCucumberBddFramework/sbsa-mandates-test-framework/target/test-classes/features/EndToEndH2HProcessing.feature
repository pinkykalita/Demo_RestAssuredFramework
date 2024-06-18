Feature: Validating end to end H2H Processing

@endtoendCreateH2HMandate
Scenario Outline: Verify Create H2H mandate API
	Given user has create H2H mandate Payload with access token and "<contractreference>" and "<clientreference>" and "<messageidentification>"
  When user sends a POST request to "createH2HMandateAPI"
  Then the response status code should be "200" 
  And the response body should indicate "<responseMessage>"
  Examples:
  | contractreference				|	responseMessage	|	clientreference				|	messageidentification							|
  | 8666267289ContractRef1	|	success					|	27349246745ClientRef1	|	100/MANIN/00210001/20240618/77790	|
  
@endtoendCreateH2HMandate  
Scenario Outline: POST2 - GPP to MMS Send GPP Pain009 Ack
	Given user has Payload with access token, "<contractreferenceToMatch>", "<messagetype>" and "<messageidentification>" 
  When user sends a POST request to "GPPPainAckAPI"
  Then the response status code should be "200" 
  Examples:
 	|	messagetype |	messageidentification							|	contractreferenceToMatch			|
 	|	Pain_009		| 100/MANIN/00210001/20240618/77790	|	8666267289ContractRef1				|

@endtoendCreateH2HMandate 									
Scenario Outline: POST3 - GPP to MMS Send GPP Initiate Accept Request
	Given user has Payload with access token, "<contractreferenceToMatch>", "<messagetype>" and "<messageidentification>"
  When user sends a POST request to "GPPPainAckAPI"
  Then the response status code should be "200" 
  Examples:
  |	messagetype |	messageidentification							|	contractreferenceToMatch			|
 	|	Pain_012		| 100/MANIN/00210001/20240618/77790	|	8666267289ContractRef1				|

@endtoendCreateH2HMandate  	
Scenario Outline: Verify Get Mandate Batch By Customer Id
	Given request with path parameter "<CustomerId>" and "<queryparam>"
  When user sends "GET" request to "getMandateBatchAPICustomerId"
  Then the response status code should be "200"
  And extract the mandate with "<contractreferenceToMatch>" from response
  And status in response body should be "<statusExpected>"
  And action in response body should be "<actionExpected>"
  Examples:
  | queryparam 	|	CustomerId	|	contractreferenceToMatch			|	statusExpected	|	actionExpected	|
  | true				|	373731			|	8666267289ContractRef1				|	ACC							|	I								|
  
@endtoendUpdateH2HMandate  	
Scenario Outline: Verify Update H2H mandate API
	Given user has update H2H mandate Payload with access token and "<originalcontractreference>", "<originalclientreference>" and "<messageidentification>"
  When user sends "PUT" request to "updateH2HMandateAPI"
  Then the response status code should be "200" 
  Examples:
  | originalcontractreference				|	originalclientreference		|	messageidentification							|
  | 8666267289ContractRef1					|	27349246745ClientRef1			|	100/MANAM/00210001/20240618/77790	|
  
@endtoendUpdateH2HMandate
Scenario Outline: POST5 - GPP to MMS Send GPP Pain010 Ack
	Given user has Payload with access token, "<contractreferenceToMatch>", "<messagetype>" and "<messageidentification>" 
  When user sends a POST request to "GPPPainAckAPI"
  Then the response status code should be "200" 
  Examples:
 	|	messagetype |	messageidentification							|	contractreferenceToMatch			|
 	|	Pain_010		| 100/MANAM/00210001/20240618/77790	|	8666267289ContractRef1				|

@endtoendUpdateH2HMandate
Scenario Outline: POST6 - GPP to MMS Send GPP Amend Accept Request
	Given user has Payload with access token, "<contractreferenceToMatch>", "<messagetype>" and "<messageidentification>"
  When user sends a POST request to "GPPPainAckAPI"
  Then the response status code should be "200" 
  Examples:
  |	messagetype |	messageidentification							|	contractreferenceToMatch			|
 	|	Pain_012		| 100/MANAM/00210001/20240618/77790	|	8666267289ContractRef1				|
 	
@endtoendUpdateH2HMandate
Scenario Outline: Verify Get Mandate Batch By Customer Id
	Given request with path parameter "<CustomerId>" and "<queryparam>"
  When user sends "GET" request to "getMandateBatchAPICustomerId"
  Then the response status code should be "200"
  And extract the mandate with "<contractreferenceToMatch>" from response
  And status in response body should be "<statusExpected>"
  And action in response body should be "<actionExpected>"
  Examples:
  | queryparam 	|	CustomerId	|	contractreferenceToMatch			|	statusExpected	|	actionExpected	|
  | true				|	373731			|	8666267289ContractRef1				|	ACC							|	A								|
  
 @endtoendCancelH2HMandate
 Scenario Outline: Verify Cancel H2H mandate API
	Given user has cancel H2H mandate Payload with access token and "<originalcontractreference>", "<originalclientreference>" and "<messageidentification>"
  When user sends "PUT" request to "cancelH2HMandateAPI"
  Then the response status code should be "200"  
  Examples:
  | originalcontractreference				|	originalclientreference		|	messageidentification							|
  | 8666267289ContractRef1					|	27349246745ClientRef1			|	100/MANCN/00210001/20240618/77790	|  	 
  
 #@endtoendCancelH2HMandate 
 Scenario Outline: POST8 - GPP to MMS Send GPP Pain011 Ack
	Given user has Payload with access token, "<contractreferenceToMatch>", "<messagetype>" and "<messageidentification>" 
  When user sends a POST request to "GPPPainAckAPI"
  Then the response status code should be "200" 
  Examples:
 	|	messagetype |	messageidentification							|	contractreferenceToMatch			|
 	|	Pain_011		| 100/MANCN/00210001/20240618/77790	|	8666267289ContractRef1				|	
 	
 #@endtoendCancelH2HMandate
 Scenario Outline: POST6 - GPP to MMS Send GPP Amend Accept Request
	Given user has Payload with access token, "<contractreferenceToMatch>", "<messagetype>" and "<messageidentification>"
  When user sends a POST request to "GPPPainAckAPI"
  Then the response status code should be "200" 
  Examples:
  |	messagetype |	messageidentification							|	contractreferenceToMatch			|
 	|	Pain_012		| 100/MANCN/00210001/20240618/77790	|	8666267289ContractRef1				|	
 	
@endtoendCancelH2HMandate
Scenario Outline: Verify Get Mandate Batch By Customer Id
	Given request with path parameter "<CustomerId>" and "<queryparam>"
  When user sends "GET" request to "getMandateBatchAPICustomerId"
  Then the response status code should be "200"
  And extract the mandate with "<contractreferenceToMatch>" from response
  And status in response body should be "<statusExpected>"
  And action in response body should be "<actionExpected>"
  Examples:
  | queryparam 	|	CustomerId	|	contractreferenceToMatch			|	statusExpected	|	actionExpected	|
  | true				|	373731			|	8666267289ContractRef1				|	ACC							|	C								|
   	