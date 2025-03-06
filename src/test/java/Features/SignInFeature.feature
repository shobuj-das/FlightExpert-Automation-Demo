Feature: Sign in page
#  Scenario: Sign in with valid credentials
#    Given User should be on the sign in page
#    When user enter valid username and password
#   # And User click on eye button beside password
#    And User click on the sign in button
#    Then User should be on the home page

#  Scenario: Sign in with invalid email
#    Given User should be on the sign in page
#    When user enter valid email
#    And user enter invalid password
#    And User click on the sign in button
#    Then Error message should be displayed

  Scenario: UI validation
    Given User should be on the sign in page
    Then Sign in page should be appeared after clicking button
    And Sign in page labeled as "Sign In"
    And Email field should be present
    And Password field should be present
#    And No grammartical error in the sign in page
    And Mandatory fields are labeled with asterisk sign
    And Email field labeled as "Email Address *" on sign in page
    And Password field labeled as "Password *" on the sign in page
    And Email field is labeled with placeholder text "Enter email address"
    And Password field is labeled with placeholder text "Enter password"
    And Eye icon is present in the password field
    And Close button is present on the sign in page
    And Checkbox is present on the sign in page
    And Checkbox is labeled as "Remember me"
    And Checkbox is checked by default
    And Forget password link text is present
    And Sign in button is present
    And Sign in with Facebook button is present
    And Sign in with Google button is present
    And Create an account link text is present
#    And Sign in button colour is matched with design document
#    And Checkbox colour is matched with design document
    And Validate all assertion

  Scenario Outline: User should not be able to sign in with invalid credentials
    Given User should be on the sign in page
    When User enter <email> on the email field
    And User enter <password> on the password field
    And User click on the sign in button
    Then User should see an <errorMgs> error message
    Examples:
      | email                | password    | errorMgs               |
      | "shobuj@yopmail.com" | ""          | "Password is required" |
      | ""                   | "shobuj123" | "Email is required"    |
