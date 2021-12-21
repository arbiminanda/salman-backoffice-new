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
    Then user see approved approval ekyc
    When user show pending approval
    Then user see pending approval ekyc
    When user show waiting approval
    Then user see waiting approval ekyc
    When user show rejected approval
    Then user see rejected approval ekyc
    When user show force delete approval
    Then user see force delete approval ekyc
  
  @TS02
  Scenario: Use search keyword filter
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click ekyc
    When user show all approval
    Then user see all approval ekyc
    When user search one account in approval ekyc
    
  @TS03
  Scenario: Decide submitted approval
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click ekyc
    When user show submitted approval
    Then user see submitted approval ekyc
    When user click decide approval button
    When user fill supervisor comment
    When user show dropdown action approval ekyc
    When user choose reject action
    When user click confirm approval
    Then user see approval ekyc result