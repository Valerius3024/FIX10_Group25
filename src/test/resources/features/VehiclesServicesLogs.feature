
Feature: Vehicles Services Logs
  User story:
  As a POSMANAGER, I should be able to create a new Vehicles Services Logs.

  Acceptance criterias:
  1. Verify that USER can create a new Vehicles Services Logs.
  2. User must choose at least a Vehicle to create a Vehicles Services Log.
  3. If user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed.
  4. After clicked the save button, the information of the Service Details which user entered should be displayed.
  5. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
  6. When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.
  7. User should be able to enter only number in the Total Price input box. And it should be displayed as a float number.
  8. Service Type should display as "Repair and Maintenance" by default

  Background:User should be able to login as POSMANAGER and navigates to fleet-vehicles services logs page
    Given user is on the login page
    When User enters "posmanager17@info.com" and "posmanager" for Pos Manager
    And User clicks login button
    And User navigates to fleet option
    Then User clicks Vehicles Services Logs button


  Scenario: User should be able to create a new Vehicles Services Logs.
    Given user is on the Vehicles Services Logs
    And user clicks create button
    And user enters "opel" to vehicle input box
    And user select a vehicle from list
    And user enters "Tax roll" to service type input box
    And user enters "500" to total price input box
    And user enters "75000" to odometer value input box
    And user clicks save button
    Then the new log should be displayed in the table


    Scenario: User must choose at least a vehicle to create a Vehicles Services Log.
      Given user is on the Vehicles Services Logs
      And user clicks create button
      And user has not selected any vehicle
      And user enters "Summer tires" to service type input box
      And user enters "5000" to total price input box
      And user enters "100000" to odometer value input box
      And user clicks save button
      Then user should see the error message


  Scenario:  If user tries to enter a vehicle which is not on the Vehicle list and click the save button,
  Create a Vehicle popup should be displayed

    Given user is on the Vehicles Services Logs
    And user clicks create button
    And user enters "mazda" to vehicle input box
    And user clicks save button
    Then Create a Vehicle popup should be displayed

