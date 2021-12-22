@All
Feature: approvalMarketingCampaign feature
  
	@TS01
  Scenario: Show approval marketing campaign and search account
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click marketing campaign
    When user show active approval
    Then user see active approval marketing campaign
    When user show inactive approval
    Then user see inactive approval marketing campaign
    When user show deleted approval
    Then user see deleted approval marketing campaign
    When user show all approval
    Then user see all approval marketing campaign
    When user search one account in all approval marketing campaign 
    
  @TS02
  Scenario: Decide pending approval marketing campaign
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click marketing campaign
    When user show pending approval
    When user click decide approval marketing campaign button
    When user clear marketing campaign file
    When user upload marketing campaign file
    When user fill supervisor comment approval marketing campaign
    When user click approve approval marketing campaign
    Then user see decide approval marketing campaign result