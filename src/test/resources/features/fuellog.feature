#FIX10-385
Feature: As a POSMANAGER, I should be able to enter a new Fuel Log for the vehicle
  US 27 - Fleet / Vehicles / Create A New Vehicles Fuel Logs Function [S3 - MC]

  1. Verify that USER can create new Vehicles Fuel Logs.
  2. User must choose at least a Vehicle to create a Vehicles Fuel Log.
  3. If user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed.
  4. After clicked the save button, the information of the Vehicles Fuel Log Details which user entered should be displayed.
  5. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
  6. When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.
  7. User should be able to enter only number in the Odometer Value input box. And it should be displayed as a float number

#FIX10-394
  Background: I log in as a POSMANAGER
    Given user is on the login page
    When User enters "posmanager34@info.com" and "posmanager" for Pos Manager
    Then User clicks login button
    When user clicks More button
    Then user clicks Fleet button
    And user clicks Vehicles Fuel Logs button
    And user clicks Create button

 #FIX10-375
  Scenario: 1.Verify that USER can create new Vehicles Fuel Logs.
    Then user verifies Discard button visible
    Then user select first vehicle from dropdown
    And user clicks SAVE button
    Then user verifies Edit button is seen
    And user delete last saved record

#FIX10-376
  Scenario: 2. User must choose at least a Vehicle to create a Vehicles Fuel Log.
    Then user clicks SAVE button
    And user verifies vehicle label invalid

#FIX10-404
  Scenario: 3. If user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed.
    Then user enters "TOGG YOGG" as vehicle name not in list
    Then user clicks SAVE button
    And user verifies create vehicle popup is displayed

#FIX10-405
  Scenario: 4.After clicked the save button, the information of the Vehicles Fuel Log Details which user entered should be displayed.
    Then user verifies Discard button visible
    Then user select first vehicle from dropdown
    And user clicks SAVE button
    Then user verifies saved details are seen
    And user delete last saved record

#FIX10-420
  Scenario: 5. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
    Then user verifies Discard button visible
    Then user select first vehicle from dropdown
    And user clicks SAVE button
    Then user verifies Edit button is seen
    And user verifies Create button is seen

#FIX10-421
  Scenario: 6. When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.
    Then user verifies Discard button visible
    Then user select first vehicle from dropdown
    And user clicks SAVE button
    Then user verifies Edit button is seen
    And user clicks Edit button
    Then user verifies details are seen and editable
    And users clicks Discard button
    Then user clicks ok button
    Then user delete last saved record

   #FIX10-422
  Scenario: 7. User should be able to enter only number in the Odometer Value input box. And it should be displayed as a float number
    Then user verifies Discard button visible
    Then user select first vehicle from dropdown
    And user sends text value to odometer
    And user clicks SAVE button
    Then user checks odometer label turns red
    And user sends 99 value to odometer
    And user clicks SAVE button
    Then user checks odometer input shows float

