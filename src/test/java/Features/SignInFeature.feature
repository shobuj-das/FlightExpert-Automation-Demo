Feature: Sign in page
  Scenario: Sign in with valid credentials
    Given User should be on the sign in page
    When user enter valid username and password
   # And User click on eye button beside password
    And User click on the sign in button
    Then User should be on the home page
    And User should see the profile option on home page
    And Validate all assertion

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

  Scenario: Checkbox validation
    Given User should be on the sign in page
    When User enter credentials to the email and password field
    Then Checkbox should be checked by default
    And User clicks on the checkbox
    Then Credentials should remain in the email and password fields
    And The checkbox should be unchecked
    And User clicks on the checkbox
    Then The checkbox should be checked

  Scenario Outline: User should not be able to sign in with invalid credentials
    Given User should be on the sign in page
    When User enters <email> in the email field
    And User enters <password> in the password field
    And User click on the sign in button
    Then User should see <emailErrorMgs> <passwordErrorMgs> <signInErrorMgs> error message
    And Validate all assertion
    Examples:
      | email                | password        | emailErrorMgs           | passwordErrorMgs       | signInErrorMgs                            |
      | "shobuj@yopmail.com" | ""              | ""                      | "Password is required" | ""                                        |
      | ""                   | "shobuj123"     | "Email is required"     | ""                     | ""                                        |
      | "shobuj@yopmail.com" | "incorrectPass" | ""                      | ""                     | "The provided credentials are incorrect." |
      | "testing"            | "shobuj1234"    | "Must be a valid email" | ""                     | ""                                        |
      | "testing@"           | "shobuj123"     | "Must be a valid email" | ""                     | ""                                        |