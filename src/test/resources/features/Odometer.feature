
  Feature: Creating a new contract feature

  User story: As a POSMANAGER, I should be able to create a new Odemeter

  Acceptance Criterias:
  1. Verify that USER can create a new Odometer
  2. User must choose at least a Vehicle to create a Vehicles Odometer.
  3. If user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed.
  4. After clicked the save button, the information of the Odometer Details which user entered should be displayed.
  5. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
  6. When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.
  7. User should be able to enter only number in the Odometer Value input box. And it should


  Background: User is on the login page
    Given user is on the login page
    When User enters "posmanager20@info.com" and "posmanager" for Pos Manager
    Then User clicks login button

    Scenario: Verify that USER can create a new Odometer
      When user clicks More button
      Then user clicks Fleet button
      And user clicks Vehicles Odometer
      And user clicks Create button
      Then user verifies Discard button visible
      Then users clicks Discard button
      And user verifies Create button visible
      And Clicks Odometer button
      Then the new Odometer should be displayed in the table


