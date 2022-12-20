@regression
Feature: Desktop Page Test
  as a user I want to arrange products and add to shopping cart
@sanity
  Scenario: User should be able to select product in alphabetical order

    Given I am on home page
    And I mouse hover to desktop tab
    And I click on show all desktops
    And I select sortby descending position "Name Z to A"
    Then verify the Product will arrange in Descending order
@smoke
  Scenario: User should be able to add product to shopping cart successfully

    Given I am on home page
    And I mouse hover to desktop tab
    And I click on show all desktops
    And I select sortby ascending position "Name (A - Z)"
    And I select product "HP LP3065"
    And Verify the HP Text "HP LP3065"
    And I Select Delivery Date "2023-01-30"
    And I Enter Qty "1" using Select class
    And I Click on Add to Cart button
    And Verify the Message "Success: You have added HP LP3065 to your shopping cart!"
    And I Click on link shopping cart display into success message
    And Verify the text "Shopping Cart"
    And Verify the Product name "HP LP3065"
    And Verify the Delivery Date "Delivery Date: 2023-01-30"
    And Verify the Model "Product 21"
    Then Verify the Todat "£74.73"
