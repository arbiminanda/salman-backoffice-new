@All
Feature: customerAccountConnectToMambu Feature
  Retry one account that has not been connected to mambu
  Seeing a list of all accounts and accounts that have been connected
	@TS01
  Scenario: Retry one account that has not been connected to mambu
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user navigate to Connect to Mambu Page
    When user choose one of account and click Retry
		Then user success Retry
	
	@TS02	
	Scenario: Use filter feature	
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user navigate to Connect to Mambu Page
    When user trying to filter Connected
    When user trying to filter All
    
    