@FIX10-390
Feature: As a POSMANAGER, I should be able to design survey from Surveys module
  US 36 - Surveys Functionality [S3 - MS]

  1. Verify that all buttons work as expected at the survey design stage.
  2. User must enter a survey title to create a survey.
  3. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
  4. After clicked the Save button, "Attachment(s)", "Action", "Test Survey", "Print Survey", "Share and invite by email" and "View result" buttons should be displayed.
  5. After clicked the Save button, "Add an item" should be not displayed.
  6. User can choose "User can come back in the previous page" and/or "Login required" under the Options tab.
  7. "Survey created" message should be displayed under the survey form sheet, after clicked the save button.
  8. Verify that the user should be able to see created survey is listed after clicking the Surveys module.

  Background: I log in as a POSMANAGER
    Given user is on the login page
    When User enters "posmanager24@info.com" and "posmanager" for Pos Manager
    And User clicks login button
    And user clicks Surveys button
    And user is on the Surveys page
    And user clicks create survey button

  @FIX10-488
  Scenario: Verify that all buttons work as expected at the survey design stage.
    When user enters survey title
    And user clicks design survey button
    Then user can click start survey button
    Then user can click back to survey button
    Then user deletes recently created survey

  @FIX10-379 @smoke
  Scenario: Verify user must enter a survey title to create a survey.
    When user doesn't enter title
    And user clicks survey save button
    Then user can't create a survey

  @FIX10-381
  Scenario: Verify after clicked the Save button,Edit button display instead of Save button and Create button display instead of Discard button.
    When user enters survey title
    And user clicks survey save button
    Then survey save button turns into survey edit button
    Then survey discard button turns into survey create button
    Then user deletes recently created survey

  @FIX10-415
  Scenario: Verify after clicked the Save button, "Attachment(s)", "Action", "Test Survey", "Print Survey", "Share and invite by email" and "View result" buttons should be displayed.
    When user enters survey title
    And user clicks survey save button
    Then user can see survey attachments button
    Then user can see survey action button
    Then user can see test survey button
    Then user can see print survey button
    Then user can see survey share and invite by email button
    Then user can see survey view result button
    Then user deletes recently created survey

  @FIX10-416
  Scenario: Verify after clicked the Save button, "Add an item" should be not displayed.
    When user enters survey title
    And user clicks survey save button
    Then user can't see add an item button
    Then user deletes recently created survey

  @FIX10-417
  Scenario: Verify user can choose "User can come back in the previous page" and/or "Login required" under the Options tab.
    When user clicks survey options button
    Then user can choose user can come back in the previous page checkbox
    Then user can choose login required checkbox

  @FIX10-418
  Scenario: Verify "Survey created" message should be displayed under the survey form sheet, after clicked the save button.
    When user enters survey title
    And user clicks survey save button
    Then user can see survey created message
    Then user deletes recently created survey

  @FIX10-419
  Scenario: Verify that the user should be able to see created survey is listed after clicking the Surveys module.
    When user enters survey title
    And user clicks survey save button
    And user clicks Surveys button
    Then user can see recently created survey on the survey list module
    Then user deletes recently created survey


