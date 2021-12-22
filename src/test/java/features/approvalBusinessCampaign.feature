@All
Feature: approvalBusinessCampaign feature
  
	@TS01
  Scenario: Show approval marketing campaign and search account
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click business campaign
    When user show active approval
    Then user see active approval business campaign
    When user show inactive approval
    Then user see inactive approval business campaign
    When user show deleted approval
    Then user see deleted approval business campaign
    When user show all approval
    Then user see all approval business campaign
    When user search one account in all approval business campaign 
    
  @TS02
  Scenario: Decide pending approval business campaign
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click business campaign
    When user show pending approval
    When user click decide approval business campaign button
    When user fill supervisor comment approval business campaign
    When user click approve approval business campaign
    Then user see decide approval business campaign result