@VehicleContracts @smoke
Feature: Creating a new contract feature

  User story: As a Posmanager, I should be able to create a new Vehicle Contract

  Acceptance Criterias:
  1- Verify that user can create a new Contract.(User enters only Vehicle,Type,Activation Cost,Recurring Cost Amount)
  2- User must choose at least a Vehicle to create a Vehicle Contract
  3- If user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed
  4- After clicked the save button, the information of the Contract Details which user entered should be displayed
  5- After clicked the save button, Edit button display instead of Save button and Create button display instead of Discard button
  6- When user clicks the Edit button the form should be open by displaying the all the information and it be ready to edit
  7- User should be able to enter only number in the Activation Cost input box. And it should be displayed as float number
  8- Service type should display as Leasing by default


  Background: User should access to fleet page and click the Vehicle Contracts button
    Given user is on the login page
    When User enters "posmanager23@info.com" and "posmanager" for Pos Manager
    And User clicks login button
    And User navigates to fleet page
    Then Clicks Vehicle Contracts button


  # ------ AC1 : Verify that user can create a new Contract.(User enters only Vehicle,Type,Activation Cost,Recurring Cost Amount) --------

  @KS1
  Scenario: User should be able to create a new Contract (User enters only Vehicle,Type,Activation Cost,Recurring Cost Amount)
    When User clicks create button
    And user selects "Mercedes" Vehicle
    And user selects "Leasing" Type
    And user enters "300" Activation Cost
    And user enters "600" Recurring Cost Amount
    When user clicks Save button
    And Clicks Vehicle Contracts button
    Then the new contract should be displayed in the table




