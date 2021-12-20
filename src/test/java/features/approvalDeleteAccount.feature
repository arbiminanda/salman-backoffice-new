@All
Feature: approvalDeleteAccount feature
  
	@TS01
  Scenario: Search in deleted and pending approval delete
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click delete account
    When user show deleted approval
    When user search one account in deleted approval delete
    When user empty search keyword field
    When user show pending approval
    When user search one account in pending approval delete 
    
  @TS02
  Scenario: Decide pending approval delete
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click delete account
    When user show pending approval
    When user click decide approval delete button
    When user fill supervisor comment
    When user fill finance email
    When user fill money out time