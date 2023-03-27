@FIX10-391
Feature: Fidexio Application Sales Functionality

  Background: User is on the home page
    Given user is on the login page
    When User enters "salesmanager19@info.com" and "salesmanager" for Pos Manager
    And User clicks login button

  @FIX10-426
  Scenario: Verify that all buttons work as expected at the Customers page
    When user go to new customer page
    Then user check if all button work as expected

  @FIX10-430
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

  @FIX10-431
  Scenario: Verify user can upload the customer's picture and delete it
    When user go to new customer page
    Then user add new picture "C:\Users\xxx\Desktop\Fidexio\landscape-1192669__340.jpg"
    And user enters name "Murat" to name input
    And user click to save button
    And user display profile image
    Then user delete the card

@FIX10-432
  Scenario:Verify 'Edit' and 'Create' button display after clicking save button
    When user go to new customer page
    And user enters name "cydeo" to name input
    And user click to save button
    Then user should see "Edit" and "Create" text button
    Then user delete the card

@FIX10-433
  Scenario Outline: Verify information of the customer which user entered should be displayed after saving
    When user go to new customer page
    And user enters name "<CustomerName>" to name input
    And user enters streetName"<StreetName>" to street input
    And user enter city"<CityName>" to city input
    And user enter city"<zipCode>" to zip input
    And user click to save button
    Then check every input print on the customer card
      | <StreetName> |
      | <CityName>   |
      | <zipCode>    |
    Then user delete the card

    Examples:
      | CustomerName | StreetName    | CityName | zipCode |
      | Ahmet        | Keystone Lane | Fairfax  | 19700   |
      | Hasan        | Fatih sokak   | Gebze    | 21000   |

@FIX10-435 @smoke
  Scenario Outline: Verify that the user should be able to see created customer
  in the list of the customers after clicking the Customers module
    When user go to new customer page
    And user enters name "<CustomerName>" to name input
    And user enters email "<email>" to email input
    And user click to save button
    And user go to customer list page
    And user search "<CustomerName>" in search bar
    And user find the customer by email "<email>"
    Then user delete the card

    Examples:
      | CustomerName | email           |
      | Ahmet        | ahmet@ahmet.com |
      | Hasan        | hasan@hasan.com |

@FIX10-434
  Scenario: Verify that the "Contact created" message appears under full profile and
  customer's name is displayed on the page title.
    When user go to new customer page
    And user enters name "Cydeo" to name input
    And user click to save button
    And user sees the "Contact created" text at the buttom
    And user display the name "Cydeo" on the title
    Then user delete the card
