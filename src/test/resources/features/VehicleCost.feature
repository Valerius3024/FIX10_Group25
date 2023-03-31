@VehicleCost
Feature: Creating a new cost feature

  User story: As a Posmanager, I should be able to create a new Vehicle Cost

  Acceptance Criterias:
  1. Verify that USER can create a new Vehicle Costs.
  2. User must choose at least a Vehicle to create a Vehicle Cost.
  3. If user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed.
  4. After clicked the save button, the information of the Cost Details which user entered should be displayed.
  5. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
  6. When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.
  7. User should be able to enter only number in the Total Price input box. And it should be displayed as a float number.

  Background: User should access to fleet page and click the Vehicle Costs button
    Given user is on the login page
    When User enters "posmanager23@info.com" and "posmanager" for Pos Manager
    And User clicks login button
    And User navigates to fleet page
    And Clicks Vehicle Costs button
    And User clicks on create button


   # ------ AC1: Verify that USER can create a new Vehicle Costs. --------

   @FIX10-478 #@wip
  Scenario: User should be able to create a new Vehicle Costs
    When user selects "Mercedes" Vehicle
    And user selects "Summer tires" cost detail Type
    And user enters "700" for Total Price
    And enters "Lewis Hamilton" in cost description
    When user clicks Save button
    And Clicks Vehicle Costs button
    Then the new vehicle costs should be displayed


  # ------ AC2: User must choose at least a Vehicle to create a Vehicle Cost. --------

  @FIX10-479 #@wip
  Scenario: The user must select at least one vehicle to create vehicle cost
    When user has not selected any vehicle
    And user selects "Summer tires" cost detail Type
    And user enters "700" for Total Price
    And enters "Lewis Hamilton" in cost description
    When user clicks Save button
    Then user should see the error message


  # ------ AC3: If user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed --------


  @FIX10-480 @smoke #@wip
  Scenario: When user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed
    When user enter a vehicle "Ferrari"
    And user clicks Save button
    Then Create a Vehicle popup should be displayed



   # ------ AC4: After clicked the save button, the information of the Cost Details which user entered should be displayed. --------

  @FIX10-481 #@wip
  Scenario: After clicked the save button, the information of the Cost Details which user entered should be displayed
    When user selects "Mercedes" Vehicle
    And user selects "Summer tires" cost detail Type
    And user enters "700" for Total Price
    And enters "Lewis Hamilton" in cost description
    When user clicks Save button
    Then Cost details should be displayed
      | vehicle         | Mercedes/Class A/1-MER-001 |
      | type            | Summer tires               |
      | totalPrice      | 700.00                     |
      | costDescription | Lewis Hamilton             |


   # ------ AC5: After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button. --------

  @FIX10-482 #@wip
  Scenario: After clicked the save button, Edit button display instead of Save button and Create button display instead of Discard button
    When user selects "Mercedes" Vehicle
    And user selects "Summer tires" cost detail Type
    And user enters "700" for Total Price
    And enters "Lewis Hamilton" in cost description
    And user should see Save and Discard button
    When user clicks Save button
    Then user should see Edit and Create button instead of Save button and Create button

    # ------ AC6: When user clicks the Edit button the form should be open by displaying the all the information and it be ready to edit --------

  @FIX10-483 #@wip
  Scenario: When user clicks the Edit button the form should be open by displaying the all the information and it be ready to edit
    When user selects "Mercedes" Vehicle
    And user selects "Summer tires" cost detail Type
    And user enters "700" for Total Price
    And enters "Lewis Hamilton" in cost description
    And user clicks Save button
    When user clicks the Edit button
    Then The form should be display and ready to edit

     # ------ AC7: User should be able to enter only number in the Total Price input box. And it should be displayed as float number --------

  @FIX10-484 #@wip
  Scenario Outline: User should be able to enter number. And it should be displayed as float number
    When user selects "Mercedes/Class A/1-MER-001" Vehicle
    And user enters "<number>" Total Price
    And user clicks Save button
    Then number should be displayed as float number
    Examples:
      | number |
      | 300    |
      | 500.00 |



  @FIX10-485 #@wip
  Scenario: User enter any value other than number and error message display
    When user selects "Mercedes/Class A/1-MER-001" Vehicle
    And user enters "ipsum" Total Price
    And user clicks Save button
    Then user should see the error message







