@All
Feature: approvalMarketingCampaignNegative feature
  
	@TS01
  Scenario: Decide pending approval marketing campaign with null
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click marketing campaign
    When user show pending approval
    When user click decide approval marketing campaign button
    When user click approve approval marketing campaign
    Then user see supervisor comment error message approval marketing campaign
    When user clear marketing campaign file
    When user click reject approval marketing campaign
    Then user see supervisor comment and marketing image error message
    When user fill supervisor comment approval marketing campaign
    When user click propose to change data approval marketing campaign
    Then user see marketing image error message