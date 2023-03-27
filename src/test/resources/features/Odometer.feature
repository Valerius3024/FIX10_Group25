
Feature: Creating a new Odometer feature

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

 @wip @smoke
  Scenario: 1.Verify that USER can create a new Odometer
    When user clicks More Odometer button
    And User clicks Fleet Button
    Then User clicks Vehicles Odometer button
    And user clicks create odometer button
    And user enters  vehicle select input box
    And user select first from dropdown
    And user click save button



@wip
    Scenario:2.User must choose at least a Vehicle to create a Vehicles Odometer.
    When user clicks More Odometer button
    And User clicks Fleet Button
    Then User clicks Vehicles Odometer button
    And user clicks create odometer button
      And user click save button
      Then user should see it is invalid












