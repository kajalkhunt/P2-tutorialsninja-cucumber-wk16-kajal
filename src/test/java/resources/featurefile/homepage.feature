@regression
Feature: Home Page Test
  as a user I want to navigate to tabs
@sanity
  Scenario: User should navigate to desktop page successfully

    Given I am on home page
    And I mouse hover to desktop tab
    And I click on show all desktops
    Then verify desktop text message

@sanity
  Scenario: User should navigate to laptop and notebooks page successfully

    Given I am on home page
    And I mouse hover to laptop and desktop tab
    And I click on show all laptop and notebooks
    Then verify laptop and notebooks text
@smoke
  Scenario: User should navigate to components page successfully

    Given I am on home page
    And I mouse hover to component tab
    And I click on show all components
    Then verify components text