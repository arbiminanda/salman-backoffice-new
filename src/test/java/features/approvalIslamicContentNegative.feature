@All
Feature: approvalMarketingCampaignNegative feature
  
	@TS01
  Scenario: Decide pending approval islamic content with null
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click islamic content
    When user show pending approval
    When user click decide approval islamic content button
    When user clear islamic content file
    When user upload invalid islamic content file
    When user click approve approval islamic content
    Then user see supervisor comment error message approval islamic content
    When user fill supervisor comment approval islamic content
    When user click reject approval islamic content
    Then user see islamic content image error message
    