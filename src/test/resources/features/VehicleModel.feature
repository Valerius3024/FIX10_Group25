@vehicleModel
Feature: Creating a new vehicle model feature

  User Story: As a POSMANAGER, I should be able to create a new Vehicle Model.

  1. Verify that USER can create a new Vehicle Model.
  2. User must choose at least a model name and a make to create a new Vehicle Model.
  3. After clicked the save button, the information of the Vehicle Model which user entered should be displayed.
  4. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
  5. When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.

  Background: I log in as a POSMANAGER
    Given user is on the login page
    When User enters "posmanager27@info.com" and "posmanager" for Pos Manager
    Then User clicks login button
    And User navigates to fleet page
    And user clicks Vehicle Model button
    And User clicks the create button
    When user enters "Shelby 1967" model name

    Scenario: User should be able to create a new vehicle model
      And user enters "Mustang" brand name
      And user clicks the save button
      Then User see the new vehicle model

    Scenario: User should be able to create a new vehicle model at least one model name
      And user clicks the save button
      Then user should see the error message

    Scenario: user should be able to see new vehicle model after the model creating
      And user enters "Mustang" brand name
      And user clicks the save button
      Then User see the new vehicle model

    Scenario: user should be able to see Edit and Create button
      And user enters "Mustang" brand name
      And user clicks the save button
      Then user should see Edit and Create button

    Scenario: user should see everything as editable after clicking the edit button
      And user enters "Mustang" brand name
      And user clicks the save button
      Then user should see Edit and Create button
      Then user should see everything as editable