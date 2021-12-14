Feature: customerAccountPassedCustomerNegative Feature
  Doing a review of one account with empty comment
  
  Scenario: Doing a review of one account with empty comment
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user navigates to Passed Customer Page
    When user choose one of account and click Review
    When user click Review button
    Then user fail to Review