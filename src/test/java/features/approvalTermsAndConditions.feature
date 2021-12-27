@All
Feature: approvalTermsAndConditions feature
  
	@TS01
  Scenario: Show approval terms & conditions, and search account
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click terms and conditions
    When user show active approval
    Then user see active approval terms and conditions
    When user search one account in active approval terms and conditions
    When user show inactive approval
    Then user see inactive approval terms and conditions
    When user search one account in inactive approval terms and conditions
    When user show pending approval
    Then user see pending approval terms and conditions
    When user search one account in pending approval terms and conditions 
    
  @TS02
  Scenario: Decide pending approval terms and conditions
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click terms and conditions
    When user show pending approval
    When user click decide approval terms and conditions button
    When user fill supervisor comment approval terms and conditions
    When user click approve approval terms and conditions
    Then user see decide approval terms and conditions result