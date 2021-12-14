@All
Feature: customerAccountCostumerInfoNegative Feature
  View the specific customer information detail with incorrect search data
  
  @TS01
  Scenario: View the specific customer information detail with incorrect search data first
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user navigates Customer Information Dashboard Page
    When user select Account type to Both
    When user click button submit
    Then failed message is displayed
    When user fill customer information except account name and number
    When user click button submit 
    Then failed message is displayed
    When user fill account name or number
    When user click button submit
    When user click button detail
		Then user is on Customer Information Detail Page 
  
  @TS02  
  Scenario: Change handphone number with incorrect number
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user navigates Customer Information Dashboard Page
    When user click Change handphone number button
  	When user click Save Change button
  	Then failed message is displayed
  	When user fill with invalid format handphone number
  	When user click Save Change button
  	Then failed message is displayed