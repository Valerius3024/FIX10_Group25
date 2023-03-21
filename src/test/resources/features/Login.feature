Feature: As a user I should login to the application with valid credentials

#	Scenario: User logs in as SalesManager
#		Given user is on the login page
#		When User logs in as a SalesManager with valid credentials

#	Scenario: User logs in as Pos Manager
#		Given user is on the login page
#		When User logs in as a PosManager with valid credentials

  Scenario: User logs in as Pos Manager
    Given user is on the login page
    When User enters "posmanager5@info.com" and "posmanager" for Pos Manager
    Then User clicks login button
