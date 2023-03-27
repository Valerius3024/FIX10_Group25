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
    And Clicks Vehicle Contracts button
    And User clicks create button


  # ------ AC1: Verify that user can create a new Contract.(User enters only Vehicle,Type,Activation Cost,Recurring Cost Amount) --------

  @FIX10-377  #@wip
  Scenario: User should be able to create a new Contract (User enters only Vehicle,Type,Activation Cost,Recurring Cost Amount)
    When user selects "Mercedes" Vehicle
    And user selects "Leasing" Type
    And user enters "300" Activation Cost
    And user enters "600" Recurring Cost Amount
    When user clicks Save button
    And Clicks Vehicle Contracts button
    Then the new contract should be displayed in the table


  # ------ AC2: User must choose at least a Vehicle to create a Vehicle Contract --------

  @FIX10-378 @smoke #@wip 
  Scenario: The user must select at least one vehicle to create vehicle contract
    When user has not selected any vehicle
    And user selects "Leasing" Type
    And user enters "300" Activation Cost
    And user enters "600" Recurring Cost Amount
    When user clicks Save button
    Then user should see the error message


   # ------ AC3: If user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed --------

  @FIX10-406 #@wip
  Scenario: When user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed
    When user enter a vehicle "Ferrari"
    And user clicks Save button
    Then Create a Vehicle popup should be displayed



  # ------ AC4: After clicked the save button, the information of the Contract Details which user entered should be displayed --------

  @FIX10-407 #@wip
  Scenario: After clicked the save button, the information of the Contract Details which user entered should be displayed
    When user selects "Mercedes/Class A/1-MER-001" Vehicle
    And user selects "Leasing" Type
    And user enters "300" Activation Cost
    And user enters "600" Recurring Cost Amount
    When user clicks Save button
    Then Contract details should be displayed
      | vehicle                | Mercedes/Class A/1-MER-001 |
      | type                   | Leasing                    |
      | activationCost         | 300.00                     |
      | recurringCostAmount    | 600.00                     |
      | recurringCostFrequency | Yearly                     |


  # ------ AC5: After clicked the save button, Edit button display instead of Save button and Create button display instead of Discard button --------

   @FIX10-408 #@wip
  Scenario: After clicked the save button, Edit button display instead of Save button and Create button display instead of Discard button
    When user selects "Mercedes/Class A/1-MER-001" Vehicle
    And user selects "Leasing" Type
    And user enters "300" Activation Cost
    And user enters "600" Recurring Cost Amount
    And user should see Save and Discard button
    When user clicks Save button
    Then user should see Edit and Create button instead of Save button and Create button


  # ------ AC6: When user clicks the Edit button the form should be open by displaying the all the information and it be ready to edit --------

  @FIX10-409 #@wip
  Scenario: When user clicks the Edit button the form should be open by displaying the all the information and it be ready to edit
    When user selects "Mercedes/Class A/1-MER-001" Vehicle
    And user selects "Leasing" Type
    And user enters "300" Activation Cost
    And user enters "600" Recurring Cost Amount
    And user clicks Save button
    When user clicks the Edit button
    Then the form should be display and ready to edit


   # ------ AC7: User should be able to enter only number in the Activation Cost input box. And it should be displayed as float number --------

  @FIX10-410 #@wip
  Scenario Outline: User should be able to enter number. And it should be displayed as float number
    When user selects "Mercedes/Class A/1-MER-001" Vehicle
    And user enters "<number>" Activation Cost
    And user clicks Save button
    Then number should be displayed as float number
    Examples:
      | number |
      | 300    |
      | 500.00 |


  @FIX10-411 #@wip
  Scenario: User enter any value other than number and error message display
    When user selects "Mercedes/Class A/1-MER-001" Vehicle
    And user enters "ipsum" Activation Cost
    And user clicks Save button
    Then user should see the error message


  # ------ AC8: Service type should display as Leasing by default  --------

  @FIX10-412 #@wip
  Scenario: When user tries to create a contract user should see Service type as Leasing by default
   Then user should see service type as "Leasing" by default
















