@CalendarFunctionality
Feature:

  User Story:

  *As a Posmanager, I should be able to create and to see my meetings and
  events on my calendar from "Calendar" module

  *For this ERP application, the calendar function is very crucial.
  Anyone in the team can contribute and plan their agenda using the calendar.
  To prevent any conflict, events should be created, edited and displayed by all team members.

  Acceptance Criteria:
  1- User first lands on weekly display
  2- User can change display between Day-Week-Month
  3- User can create event by clicking on time box
  4- User can see event details when click the event on the calander.
  5- User can edit a created event.
  6- User can delete the created event.

  Background: User should access Discuss page and click the Calender button
    Given user is on the login page
    When User enters "posmanager10@info.com" and "posmanager" for Pos Manager
    And User clicks login button
    Then User clicks calender button

  @calender1
  Scenario: User first lands on weekly display
    Then The title should contain week under the calender button

  @calender2
  Scenario: User can change display between Day-Week-Month
    When User clicks day button
    Then the day number should be displayed under the calender button
    And User clicks week button
    Then The title should contain week under the calender button
    And User clicks month button
    Then the month name should be displayed under the calender button

  @calender3
  Scenario: User can create event by clicking on time box
    When User can click the time box
    And User can writes "something" on the summary box
    Then User can click the create button.

  @calender4
  Scenario: User can see event details when click the event on the calander.
    When User can click the event icon on the tme box.


  @calender5
  Scenario: User can edit a created event
    When User can click the event icon on the tme box.
    And User can click the edit button.
    And User can click the meeting subject box.
    And User can change the name of the event with "anything"
    And User can click tags box and write "Feedback Meeting".
    And User can select the Feedback Meeting.
    And User can click reminder box and write "30 Minute(s)".
    And User can select the 30 minutes.
    And User can click location box.
    And User can write "Meeting Room 15".
    And User can click description box.
    And User can write  the "please be prepared".
    And Options dropdown can be clickable
    And User can select the only internal users.
    Then User can save the changes.

  @calender6
  Scenario: User can delete the created event.
    When User can click the event icon on the tme box.
    And User can delete the event.
    Then User can see empty box on the event time box.