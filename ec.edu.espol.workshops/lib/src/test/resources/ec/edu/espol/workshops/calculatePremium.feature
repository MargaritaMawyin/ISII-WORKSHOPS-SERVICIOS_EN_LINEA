Feature: Calculate the insurance prime for a customer
	
Scenario Outline: The insurance prime for a customer is or not 500
	Given the customer is a "<age>" years old "<civilState>" "<gender>"
	When calculate the insurance prime and ask if is 500
	Then the answer should be "<answer>"
	
Examples:
 | 	age	|	civilState	| 	gender 	| 	answer 	|
 | 	20	| 	married 	| 	male 	| 	No 		|
 | 	46	| 	married 	| 	female 	| 	No 		|
 | 	65 	| 	single 		|	male 	| 	Yes	 	|