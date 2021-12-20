@All
Feature: approvalDeleteAccountNegative feature
  
	@TS01
  Scenario: Decide pending approval delete with null
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click delete account
    When user show pending approval
    When user click decide approval delete button
    When user fill supervisor comment
    When user empty supervisor comment
    When user click confirm delete approval
    Then user see three error messages
    When user fill money out time
    When user fill finance email
    When user click confirm delete approval
    Then user see supervisor comment error message delete
    When user fill supervisor comment
    When user empty finance email
    When user click confirm delete approval
    Then user see finance email error message
    When user empty money out time
    When user fill finance email
    When user click confirm delete approval
    Then user see money out time error message