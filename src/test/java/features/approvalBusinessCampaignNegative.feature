@All
Feature: approvalBusinessCampaignNegative feature
  
	@TS01
  Scenario: Decide pending approval business campaign with null
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click business campaign
    When user show pending approval
    When user click decide approval business campaign button
    When user click approve approval business campaign
    Then user see supervisor comment error message approval business campaign