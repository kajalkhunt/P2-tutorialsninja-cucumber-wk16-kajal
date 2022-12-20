@regression
Feature: my accounts Test
  as a user I want to register and log in successfully
@sanity
  Scenario: User should navigate to Register page successfully

    When I am on home page
    And I Click on My Account link
    And I call method 'SelectMyAccountOptions' and pass the parameter "Register"
    Then Verify the register text "Register Account"
@sanity
  Scenario: User should navigate to Login page successfully
    When I am on home page
    And I Click on My Account link
    And I call method 'SelectMyAccountOptions' and pass the parameter as "Login"
    Then Verify the returning text "Returning Customer"
@smoke
  Scenario: User should be able to Register Account Successfully
    When I am on home page
    And I Click on My Account link
    And I call method 'SelectMyAccountOptions' and pass the parameter "Register"
    And I Enter First Name
    And I Enter Last Name
    And I Enter Email
    And I Enter Telephone
    And I Enter Password
    And I Enter Password Confirm
    And I Select Subscribe Yes radio button
    And I Click on Privacy Policy check box
    And I Click on after privacy Continue button
    And I Verify the message "Your Account Has Been Created!"
    And I Click on after message Continue button
    And I Click on My Account link
    And I Call the method 'selectMyAccountOptions' method and pass the parameter "Logout"
    And Verify the account logout text "Account Logout"
    Then I Click on after logout Continue button
@smoke
  Scenario: User should be able to login and logout successfully
    When I am on home page
    And I Click on My Account link
    And I call method 'SelectMyAccountOptions' and pass the parameter "Login"
    And I Enter Email address
    And I Enter Last Name
    And I Enter Password
    And I Click on Login button
    And Verify text "My Account"
    And I Click on My Account link
    And I Call the method 'selectMyAccountOptions' method and pass the parameter "Logout"
    And Verify the account logout text "Account Logout"
    Then I Click on after logout Continue button
