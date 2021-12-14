@All
Feature: customerAccountPassedCustomer Feature
  Doing a review of one account
  Seeing a list of all accounts and accounts that have been reviewed
  Searching for one of the accounts
	
	@TS01
  Scenario: Review one account that has not been reviewed
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user navigates to Passed Customer Page
    When user choose one of account and click Review
    When user enter comment 
    When user click Review button
    Then user success Review
  
  @TS02  
  Scenario: Use filter feature and search one account  
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user navigates to Passed Customer Page
    When user trying to filtering Reviewed
    When user trying to filter All Passed Customer
    When user search one account in Passed Customer
    
    