@regression
Feature: Laptops and notebooks Test
  as a user I want to place order successfully
@sanity
  Scenario: User should able to display product price high to low
    Given I am on home page
    And I mouse hover to laptop and desktop tab
    And I click on show all laptop and notebooks
    And I select Sort By "Price (High > Low)"
    Then Verify the Product price will arrange in High to Low order
@smoke
    Scenario: User should be able to place order successfully
      Given I am on home page
      And I mouse hover to laptop and desktop tab
      And I click on show all laptop and notebooks
      And I select Sort By "Price (High > Low)"
      And Select Product "MacBook"
    And Verify the text "MacBook"
    And I Click on ‘Add To Cart’ button
    And Verify the message "Success: You have added MacBook to your shopping cart!"
    And I Click on link “shopping cart” display into success message
    And Verify the text after adding "Shopping Cart"
    And Verify the Product name after adding "MacBook"
    And I Change Quantity "2"
    And I Click on “Update” Tab
    And Verify the message "Success: You have modified your shopping cart!"
    And Verify the Total "£737.45"
    And I Click on “Checkout” button
    And Verify the text "Checkout"
    And Verify the Text "New Customer"
    And I Click on Guest Checkout radio button
    And I Click on Continue tab
    And I Fill the mandatory fields
    And I Click on Continue Button
    And I Add Comments About your order into text area
    And I Check the Terms & Conditions check box
    And I Click on Continue button again
    And Verify the lastMessage "Warning: Payment method required!"
