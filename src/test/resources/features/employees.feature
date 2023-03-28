@FIX10-393
Feature: Fidexio Application Employees Module

  User Story:
  As a Posmanager, I should be able to create and edit a new employee from Employees module

Background: For the scenarios in the feature file, user is expected to be on the Employees page
  Given user is on the login page
  When User enters "posmanager11@info.com" and "posmanager" for Pos Manager
  Then User clicks login button
  And user navigates to Employees page

  @FIX10-395
  Scenario: Verify all buttons work as expected at the employees page
    When user clicks on Follow button
    Then Following button should be displayed
    When user clicks on Create button
    Then user should go to New Employee page
    When user clicks on Advanced Search button
    Then user should be able to see Filters, Group By and Favorites
    When user clicks on Filters
    Then Absent Today, Unread Messages, Archived, Add Custom Filter should be visible
    When user clicks on Group By
    Then Manager, Coach, Department, Job, Add custom group should be visible
    When user clicks on Favorites
    Then Save current search, Add to my Dashboard should be visible
    When user clicks on Next Page, next page should open
    And user clicks on Previous Page, previous page should open

  @FIX10-396
  Scenario: Verify user can create an employee with entering only 'Name' input
    When user clicks on Create button
    And user enters Employee's Name input
    And user clicks Save button to register the employee
    Then employee information should be displayed

  @FIX10-397
  Scenario: Verify user can upload the employee's picture and delete it
    When user clicks on Create button
    And user enters Employee's Name input
    And user uploads a picture using the edit button in the image field
    Then uploaded picture should be deletable

  @FIX10-398
  Scenario: Verify 'Edit' and 'Create' buttons are displayed instead of 'Save' and 'Discard' after clicking 'Save'
    When user clicks on Create button
    And user enters Employee's Name input
    And user uploads a picture using the edit button in the image field
    And user clicks Save button to register the employee
    Then Edit and Create buttons should be displayed instead of Save and Discard

  @FIX10-399
  Scenario: Verify the information of the employee is displayed after clicking 'Save'
    When user clicks on Create button
    And user enters Employee's Name input
    And user uploads a picture using the edit button in the image field
    And user clicks Save button to register the employee
    Then employee information should be displayed

  @FIX10-400 @smoke
  Scenario: Verify an employee can be found in the search
    When user clicks on Create button
    And user enters Employee's Name input
    And user uploads a picture using the edit button in the image field
    And user clicks Save button to register the employee
    Then employee information should be displayed
    When user navigates to Employees page
    And user enters the employee name on the search box and presses the Enter key
    And user finds the employee and clicks on it
    Then employee information should be displayed

  @FIX10-401
  Scenario: Verify 'Employee created' message appears under full profile
    When user clicks on Create button
    And user enters Employee's Name input
    And user uploads a picture using the edit button in the image field
    And user clicks Save button to register the employee
    Then employee information should be displayed
    And "Employee created" message should appear under full profile

  @FIX10-402
  Scenario: Verify user is able to see the created employee in the list of employees after clicking 'Employees'
    When user clicks on Create button
    And user enters Employee's Name input
    And user uploads a picture using the edit button in the image field
    And user clicks Save button to register the employee
    Then employee information should be displayed
    When user navigates to Employees page
    And user finds the employee and clicks on it
    Then employee information should be displayed