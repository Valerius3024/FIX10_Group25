@US37
Feature: Fidexio Application Sales Functionality
  Background: User is on the home page
    Given user is on the login page
    When User enters "salesmanager19@info.com" and "salesmanager" for Pos Manager
    Then User clicks login button

    Scenario: Verify that all buttons work as expected at the Customers page
      When user go to new customer page
      Then user check if all button work as expected

