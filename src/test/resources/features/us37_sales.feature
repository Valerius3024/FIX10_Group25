@US37
Feature: Fidexio Application Sales Functionality

  Background: User is on the home page
    Given user is on the login page
    When User enters "salesmanager19@info.com" and "salesmanager" for Pos Manager
    And User clicks login button

  Scenario: Verify that all buttons work as expected at the Customers page
    When user go to new customer page
    Then user check if all button work as expected


  Scenario Outline: Verify user can create a customer with entering only Name input box.
    When user go to new customer page
    And user enters name "<customerName>" to name input
    And user click to save button
    And user sees the "<customerName>" card
    Then user delete the card
    Examples:
      | customerName |
      | Ahmet        |
      | Mahmut       |


    #Scenario: Verify user can upload the customer's picture and delete it
     # When user go to new customer page
     # Then user add new picture "C:\Users\xxx\Desktop\Fidexio\landscape-1192669__340.jpg"
      #And user enters name "Murat" to name input
      #And user sees the "Murat" card
      #Then user delete the card


  Scenario: Verify Edit button display instead of Save button and Create button display instead of Discard after saving
    When user go to new customer page
    And user enters name "cydeo" to name input
    And user click to save button
    Then user should see "Edit" and "Create" text button
    Then user delete the card

  @wip
  Scenario Outline: Verify after clicked the save button, the information of the customer which user entered should be displayed.
    When user go to new customer page
    And user enters name "<CustomerName>" to name input
    And user enters streetName"<StreetName>" to street input
    And user enter city"<CityName>" to city input
    #And user enter state"<StateName>" to state input
    And user enter city"<zipCode>" to zip input
    And user click to save button
    Then check every input print on the customer card
      | <StreetName> |
      | <CityName>   |
      #| <StateName>  |
      | <zipCode>    |
    Then user delete the card

    Examples:
      | CustomerName | StreetName    | CityName | StateName | zipCode |
      | Ahmet        | Keystone Lane | Fairfax  | Virginia  | 19700   |
      | Hasan        | Fatih sokak   | Gebze    | Maryland  | 21000   |