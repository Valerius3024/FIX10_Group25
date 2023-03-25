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
  5- User can edit a created event

  Background: User should access Discuss page and click the Calender button
    Given user is on the login page
    When User enters "posmanager25@info.com" and "posmanager" for Pos Manager
    And User clicks login button
    Then User clicks calender button

  @calender1
  Scenario: User first lands on weekly display
    Then the week number should be displayed under the calender button

  @calender2
  Scenario: User can change display between Day-Week-Month
    When User clicks day button
    Then the day number should be displayed under the calender button
    And User clicks week button
    Then the week number should be displayed under the calender button
    And User clicks month button
    Then the month name should be displayed under the calender button

  @calender3
  Scenario: User can create event by clicking on time box
    When User can click the time box
    And User can writes "something" on the summary box
    Then User can click the create button.

  @calender4
  Scenario: User can see event details when click the event on the calander.
    When User can click the event button


