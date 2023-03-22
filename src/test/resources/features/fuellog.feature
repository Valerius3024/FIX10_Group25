Feature: As a POSMANAGER, I should be able to enter a new Fuel Log for the vehicle
  US 27 - Fleet / Vehicles / Create A New Vehicles Fuel Logs Function [S3 - MC]

  1. Verify that USER can create new Vehicles Fuel Logs.
  2. User must choose at least a Vehicle to create a Vehicles Fuel Log.
  3. If user tries to enter a vehicle which is not on the Vehicle list and click the save button, Create a Vehicle popup should be displayed.
  4. After clicked the save button, the information of the Vehicles Fuel Log Details which user entered should be displayed.
  5. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
  6. When user clicks the Edit button the form should open by displaying the all the information and it be ready to edit.
  7. User should be able to enter only number in the Odometer Value input box. And it should be displayed as a float number

  Background: I log in as a POSMANAGER
    Given user is on the login page
    When User enters "posmanager34@info.com" and "posmanager" for Pos Manager
    Then User clicks login button

  Scenario: 1.Verify that USER can create new Vehicles Fuel Logs.
    When user clicks More button
    Then user clicks Fleet button
    And user clicks Vehicles Fuel Logs button
    And user clicks Create button
    Then user verifies Discard button visible
    Then users clicks Discard button
    And user verifies Create button visible
