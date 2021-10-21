Feature: Login

Scenario: Successful Login with Valid Credentials
   Given User Launch Chrome browser
   When User opens URL "https://www.saucedemo.com/"
   And User enters Username as "standard_user" and Password as "secret_sauce"
   And Click on Login
   Then Page Title should be "Swag Labs"
   And close browser
   
Scenario Outline: Login Data Driven //To perform Data Driven Testing(test with multiple data sets) we use Scenario Outline
   Given User Launch Chrome browser
   When User opens URL "https://www.saucedemo.com/"
   And User enters Username as "<username>" and Password as "<password>"
   And Click on Login
   Then Error message should be "Sorry, this user has been locked out"
   And close browser
   
   Examples://takes the multiple sets of data from Examples
      |username|password|
      |locked_out_user|secret_sauce|
      