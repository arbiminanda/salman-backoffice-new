@All
Feature: approvalPrivacyPolicy feature
  
	@TS01
  Scenario: Show approval terms & conditions, and search account
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click privacy policy
    When user show active approval
    Then user see active approval privacy policy
    When user search one account in active approval privacy policy
    When user show inactive approval
    Then user see inactive approval privacy policy
    When user search one account in inactive approval privacy policy
    When user show pending approval
    Then user see pending approval privacy policy
    When user search one account in pending approval privacy policy 
    
  @TS02
  Scenario: Decide pending approval privacy policy
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click privacy policy
    When user show pending approval
    When user click decide approval privacy policy button
    When user fill supervisor comment approval privacy policy
    When user click approve approval privacy policy
    Then user see decide approval privacy policy result