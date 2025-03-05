Feature: Signin
  Scenario: Sign in with valid credentials
    Given User should be on the login page
    When user enter valid username and password
   # And User click on eye button beside password
    And User click on the sign in button
    Then User should be on the home page

  Scenario: Sign in with invalid email
    Given User should be on the login page
    When user enter valid email
    And user enter invalid password
    And User click on the sign in button
    Then Error message should be displayed

  Scenario:  
