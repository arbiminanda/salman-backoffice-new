@All
Feature: approvalEKYCNegative feature
  Show approved, pending, waiting, rejected, and force delete
  Use search keyword filter
  Decide submitted approval

	@TS01
  Scenario: Decide submitted approval
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click ekyc
    When user show submitted approval
    When user click decide approval button
    When user click confirm approval
    Then user see supervisor comment and actions error message
    When user fill supervisor comment
    When user click confirm approval
    Then user see actions error message
    When user show dropdown action approval ekyc
    When user choose reject action
    When user empty supervisor comment
    When user click confirm approval
    Then user see supervisor comment error message