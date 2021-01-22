
Feature:

#  Background:
#    Given User on login page
#    Then user input username
#    Then user input password
#    Then user click login button

    @SwagLabsTest
  Scenario: Validate error message
    Given User on login page
    Then user input username
    Then user input password
    Then user click login button
    And User verify that page title "Swag Labs"
    Then User Should click dropdown box
    Then User should click Price (Low to High) option
#    And Verify that dropdown box has "Price (Low to High)" text
    And User click ADD TO CARD button
    Then User click cart icon
    Then Verify that user in the cart page
    Then User click CHECKOUT button
    Then User click CONTINUE button
    And  User should see "Error: First Name is required" error message

  @login
  Scenario: Validate successful login to the website
#    Given User on login page
#    Then user input username
#    Then user input password
#    Then user click login button
    And User verify that page title "Swag Labs"

  @login
  Scenario: Validate 'Price Low to High' from dropdown shows the lowest price item first
    Given User Should click dropdown box
    Then User should click Price (Low to High) option
#    And Verify that dropdown box has "Price (Low to High)" text

  @login
  Scenario: Valiodate error message
#  Validate that after adding the lowest price item to the cart and checking out WITHOUT entering a first name, an error message appears
    When User click ADD TO CARD button
    Then User click cart icon
    Then Verify that user in the cart page
    Then User click CHECKOUT button
    Then User click CONTINUE button
    And  User should see "Error: First Name is required" error message