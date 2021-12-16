Feature: customerAccountVerifications feature
  Show unverified, verified, and all list
  Search one account

	Scenario: Show unverified, verified, and all list
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu customer account
    When user click verifications
    When user show unverified list
    When user show verified list
    When user show all list in verifications
    When user search one account in verifications