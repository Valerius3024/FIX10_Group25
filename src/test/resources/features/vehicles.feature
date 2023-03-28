@FIX10-382
Feature: Fidexio Application Vehicles Module

  User Story:
  As a POSMANAGER, I should be able to create a new Vehicle.

Background: For the scenarios in the feature file, user is expected to be on the Employees page
  Given user is on the login page
  When User enters "posmanager11@info.com" and "posmanager" for Pos Manager
  Then User clicks login button
  And user navigates to Vehicles page

@FIX10-450
Scenario: Verify user can create a new vehicle
  When user clicks on Create button in Vehicles page
  And user chooses the model for the new vehicle
  And user enters license plate for the new vehicle
  And user chooses the car type from tags
  And user fills all the fields in general properties
  And user fills all the fields in additional properties
  And user fills all the fields in engine properties
  And user clicks on Save button in Vehicles page
  Then user should be able to see the registered vehicle

@FIX10-451
Scenario: Verify user needs to enter at least 'Model' and 'License Plate' to create a vehicle
  When user clicks on Create button in Vehicles page
  And user clicks on Save button in Vehicles page
  Then user should see The following fields are invalid notification for model and plate

@FIX10-452
Scenario: Verify 'Create a Model' popup is displayed when user tries to enter a model which is not on the model list
  When user clicks on Create button in Vehicles page
  And user enters a new model for the vehicle
  Then "Create a Model" popup should be displayed

@FIX10-453 @smoke
Scenario: Verify the information of the vehicle is displayed after clicking 'Save'
  When user clicks on Create button in Vehicles page
  And user chooses the model for the new vehicle
  And user enters license plate for the new vehicle
  And user chooses the car type from tags
  And user fills all the fields in general properties
  And user fills all the fields in additional properties
  And user fills all the fields in engine properties
  And user clicks on Save button in Vehicles page
  Then user should be able to see the registered vehicle
  When user navigates back to the Vehicles page
  Then user searches for the created vehicle going through the pages and finds it

@FIX10-454
Scenario: Verify 'Edit' and 'Create' buttons are displayed instead of 'Save' and 'Discard' after clicking 'Save'
  When user clicks on Create button in Vehicles page
  And user chooses the model for the new vehicle
  And user enters license plate for the new vehicle
  And user chooses the car type from tags
  And user fills all the fields in general properties
  And user fills all the fields in additional properties
  And user fills all the fields in engine properties
  And user clicks on Save button in Vehicles page
  Then Edit and Create buttons should be displayed instead of Save and Discard in Vehicles page

@FIX10-455
Scenario: Verify the form displays all the information and is ready to be edited when user clicks 'Edit'
  When user clicks on Create button in Vehicles page
  And user chooses the model for the new vehicle
  And user enters license plate for the new vehicle
  And user chooses the car type from tags
  And user fills all the fields in general properties
  And user fills all the fields in additional properties
  And user fills all the fields in engine properties
  And user clicks on Save button in Vehicles page
  Then all the information should be displayed
  And form should be ready to be edited when user clicks Edit

@FIX10-456
Scenario: Verify user is able to enter only digits in 'Seat Number' and 'Doors Number'
  When user clicks on Create button in Vehicles page
  And user chooses the model for the new vehicle
  And user enters license plate for the new vehicle
  And user chooses the car type from tags
  And user fills all the fields in general properties
  And user enters string for number of seats and doors
  And user fills all the fields in engine properties
  And user clicks on Save button in Vehicles page
  Then user should see The following fields are invalid notification for seats and doors