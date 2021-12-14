@All
Feature: customerAccountCostumerInfoNegative Feature
  View the specific customer information detail with incorrect search data
  
  @TS01
  Scenario: View the specific customer information detail with incorrect search data first
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user navigates Customer Information Dashboard Page
    When user click button submit
    Then account data failed message is displayed
    When user fill customer information except account name and number
    When user click button submit 
    Then account failed message is displayed
  
  @TS02  
  Scenario: Change handphone number with incorrect number
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user navigates Customer Information Dashboard Page
    When user select Account type to Both
    When user fill all customer information
    When user click button detail
		When user click Change handphone number button
  	When user click Save Change button
  	Then null number failed message is displayed
  	When user fill invalid format handphone number
  	When user click Save Change button
  	Then invalid number failed message is displayed