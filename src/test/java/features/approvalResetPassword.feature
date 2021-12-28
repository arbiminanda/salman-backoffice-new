@All
Feature: approvalResetPassword feature

  @TS01
  Scenario: Show approval terms & conditions, and search account
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click reset password
    When user show completed approval
    Then user see completed approval reset password
    When user search one account in completed approval reset password
    When user show pending approval
    Then user see pending approval reset password
    When user search one account in pending approval reset password

  @TS02
  Scenario: Reset pending approval reset password
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click reset password
    When user show pending approval
    When user click reset approval reset password button
    When user click ok
    Then user see reset password result
    When user click ok
    When user click reset approval reset password button
    Then user click cancel