Feature: Calculate the insurance prime for a custome

Scenario: The customer is a 20 years old married man
	Given is a 20 years old married man
	When Calculate the premiun
	Then Show 300
	
Scenario Outline: The customer is or not a 20 years old married man
	Given is a 20 years old married man
	When Calculate the premiun
	Then Show 300