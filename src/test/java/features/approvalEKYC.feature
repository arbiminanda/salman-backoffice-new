@All
Feature: approvalEKYC feature
  Show approved, pending, waiting, rejected, and force delete
  Use search keyword filter
  Decide submitted approval

	@TS01
  Scenario: Show approved, pending, waiting, rejected, and force delete
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click ekyc
    When user show approved approval
    When user show pending approval
    When user show waiting approval
    When user show rejected approval
    When user show force delete approval
  
  @TS02
  Scenario: Use search keyword filter
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click ekyc
    When user show all approval
    When user search one account in approval ekyc
    
  @TS03
  Scenario: Decide submitted approval
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click ekyc
    When user show submitted approval
    When user click decide approval button
    When user fill supervisor comment
    When user show dropdown action approval ekyc
    When user choose reject action
    When user click confirm approval
    Then user see approval ekyc result