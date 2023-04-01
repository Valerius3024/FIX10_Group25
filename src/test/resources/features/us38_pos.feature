@US38
Feature: Fidexio Application Inventory Functionality

  User Story: As a PosManager, I should be able to check and edit the Inventory of the company.
  So that I can list all products in the company, I can add new products to inventory,
  I can select the Product type, I can set prices (cost & sales), I can give a barcode to the product.
  I can set a product picture

  Acceptance Criteria:
  1. The user can create a product with entering only Product Name.
  2. User can upload the profile picture and delete it.
  3. "Can be Sold" and "Can be Purchased" are checked by default.
  4. After clicked the Save button, Edit button display instead of Save button and Create button display instead of Discard button.
  5. After clicked the save button, the information of the Product which user entered should be displayed.
  6. User should be able to enter only number in the Cost input box. And it should be displayed as a float number.
  7. Verify that a new product can be found in the search.

  Background: User is on the home page
    Given user is on the login page
    When User enters "posmanager39@info.com" and "posmanager" for Pos Manager
    Then User clicks login button


    #@ensar
    #---------AC 1. The user can create a product with entering only Product Name
  Scenario: Verify user can create a product with entering only Product Name.
    When user clicks inventory button
    And user clicks products button
    And user clicks the create button
    And user enter "istanbul" product name
    Then user clicks product save button

    #@ensar
      #---------AC 2. User can upload the profile picture and delete it.
  Scenario: Verify user can upload the profile picture and delete it
    When user clicks inventory button
    And user clicks products button
    And user enters "istanbul" to searchBox
    And user clicks the product file
    And user clicks edit button
    And user clicks editProfile button
    And user selects foto file "/Users/tuohetiansaerding/Desktop/Screen Shot 2023-03-02 at 19.26.54.png"
    And user clicks delete foto button

      #@ensar
      #----------AC 3. "Can be Sold" and "Can be Purchased" are checked by default.
  Scenario: Verify user "Can be Sold" and "Can be Purchased" are checked by default.
    When user clicks inventory button
    And user clicks products button
    And user clicks create button
    And user check can be sold check box is checked by default
    And user check can be purchased check box is checked by default

    #@ensar
      #----------AC 4. After clicked the Save button,
      # Edit button display instead of Save button and Create button display instead of Discard button.
  Scenario: Verify user After clicked the Save button,Edit button display instead of Save button and Create button display instead of Discard button.
      When user clicks inventory button
      And user clicks products button
      And user clicks create button
      And user enter "xdxdxd" product name
      And user clicks save button
      And user should see the Edit and the Create button instead of Save and Create button
      And user clicks action button
      And user clicks delete button
      Then user clicks ok button after delete













