@All
Feature: approvalIslamicContent feature
  
	@TS01
  Scenario: Show approval islamic content and search account
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click islamic content
    When user show active approval
    Then user see active approval islamic content
    When user show inactive approval
    Then user see inactive approval islamic content
    When user show deleted approval
    Then user see deleted approval islamic content
    When user show all approval
    Then user see all approval islamic content
    When user search one account in all approval islamic content 
    
  @TS02
  Scenario: Decide pending approval islamic content
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu approval
    When user click islamic content
    When user show pending approval
    When user click decide approval islamic content button
    When user clear islamic content file
    When user upload islamic content file
    When user fill supervisor comment approval islamic content
    When user click approve approval islamic content
    Then user see decide approval islamic content result