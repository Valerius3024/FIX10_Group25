Feature: Creating a new vehicle model feature

  User Story: As a POSMANAGER, I should be able to create a new Vehicle Model.

  1. Verify that USER can create a new Vehicle Model.
  2. User must choose at least a model name and a make to create a Vehicles Services Log.
  3. After clicked the save button, the information of the Vehicle Model which user entered should be displayed.
  4. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
  5. When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.

  Background: I log in as a POSMANAGER
    Given user is on the login page
    When User enters "posmanager27@info.com" and "posmanager" for Pos Manager
    Then User clicks login button
    And User navigates to fleet page
    And user clicks Vehicle Model button
    And User clicks create button

    Scenario: User should be able to create a new vehicle model
      When user enters "Shelby 1967" model name
      And user enters "Mustang" brand name
      And user adds the vehicle model image
      And user clicks save button
      Then User see the new vehicle model