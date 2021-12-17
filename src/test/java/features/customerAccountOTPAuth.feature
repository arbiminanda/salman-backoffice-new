@All
Feature: customerAccountOTPAuth feature
  Show done list and search with keyword
  Show waiting list and generate otp
	
	@TS01
	Scenario: Show done list and search with keyword
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu customer account
    When user click otp auth
    When user show done otp auth
    When user search one account in done otp auth
  
  @TS02
  Scenario: Show waiting list and search with keyword
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu customer account
    When user click otp auth
    When user show done otp auth
    When user show waiting otp auth
    When user click generate otp button
    Then user success generate otp
    When user search one account in waiting otp auth   