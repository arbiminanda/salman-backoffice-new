@All
Feature: customerAccountEKYCResult feature
  Show approved, submitted and force delete list
  Show pending, rejected & waiting list and decide spesific customer
  Show all list, use filter feature and search keyword

	@TS01
  Scenario: Show approved, submitted and force delete list
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu customer account
    When user click ekyc result
    When user show submitted ekyc result
    When user show approved ekyc result
    When user show rejected ekyc result
    When user show force delete ekyc result
    
  @TS02
  Scenario: Show pending, rejected & waiting list, and reject & approve spesific customer
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu customer account
    When user click ekyc result
    When user show pending ekyc result
    When user click decide button
    When user check selfie with KTP photo
    When user check KTP photo
    When user check selfie photo
    When user check signature photo
    When user fill ekyc analysis
    When user fill recommendation
    When user click reject button
    Then user see reject result
    When user show waiting ekyc result
    When user click decide button
    When user check selfie with KTP photo
    When user check KTP photo
    When user check selfie photo
    When user check signature photo
    When user fill ekyc analysis
    When user fill recommendation
    When user click approve button
    Then user see approve result
    
  @TS03
  Scenario: Show all list, use filter feature and search keyword
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user click menu customer account
    When user click ekyc result
    When user show all ekyc result
    When user click img filter button
    When user fill start date for ekyc filter
    When user fill end date for ekyc filter
    When user click proceed button in filter
    Then user see filter result
    When user search one account in ekyc result