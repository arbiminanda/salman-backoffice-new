@All
Feature: customerAccountEKYCstatusNegative feature
  Decide with null & invalid analysis and recommendation
  Use filter feature with null and invalid date

	@TS01
  Scenario: Decide with null analysis and recommendation
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu customer account
    When user click e-kyc result
    When user show filter pending e-kyc result
    When user click decide button
    When user click reject button
    Then user see analysis error message
    Then user see recommendation error message
    When user fill ekyc analysis
    When user click propose change data button
    Then user see recommendation error message
    When user empty ekyc analysis
    When user fill recommendation
    When user click approve button
    Then user see analysis error message