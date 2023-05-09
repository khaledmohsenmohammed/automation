Feature: F01_Login
Scenario: user can login without users and password
  Given I am on the login page
  When I enter username and password
  Then I should see the home page