@All
Feature: approvalBusinessCampaignNegative feature
  
	@TS01
  Scenario: Decide pending approval business campaign with null
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click terms and conditions
    When user show pending approval
    When user click decide approval terms and conditions button
    When user click reject approval terms and conditions
    Then user see supervisor comment error message approval terms and conditions