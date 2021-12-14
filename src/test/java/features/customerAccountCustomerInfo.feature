@All
Feature: customerAccountCostumerInfo Feature
  View the specific customer information detail uses both account name and account number
  Use transaction record filter feature	
  View specific box account transaction
  Download transaction log
  Change handphone number
	
	@TS01
  Scenario: View the specific customer information detail uses both account name and account number
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user navigates Customer Information Dashboard Page
    When user select Account type to Both
    When user fill all customer information
    When user click button detail
		Then user is on Customer Information Detail Page
	
	@TS02	
	Scenario: Use transaction record filter feature	
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user navigates Customer Information Dashboard Page
    When user select Account type to Both
    When user fill all customer information
    When user click button detail
		When user trying to filter transaction record feature
    When user fill some infomation on feature number
    Then user success filtering transaction record
  
  @TS03  
  Scenario: View specific box account transaction	
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user navigates Customer Information Dashboard Page
    When user select Account type to Both
    When user fill all customer information
    When user click button detail
		When user click button Change box account number
    When user choose one of box account
    When user click Proceed button
    Then user see all data on chosen box account
  
  @TS04
  Scenario: Change handphone number
  	Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user navigates Customer Information Dashboard Page
    When user select Account type to Both
    When user fill all customer information
    When user click button detail
		When user click Change handphone number button
  	When user fill new handphone number
  	When user click Save Change button
  	Then user success change handphone number
  
  @TS05
  Scenario: Download transaction log	
    Given user is on homepage
    When user navigates to Login Page
    When user enters username and Password
    When user navigates Customer Information Dashboard Page
    When user select Account type to Both
    When user fill all customer information
    When user click button detail
		When user click download transaction log button
    When user choose format file
    When user click Download button
    Then user see all data on chosen box account    