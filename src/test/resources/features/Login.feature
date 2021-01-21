Feature:

  @login
  Scenario: Validate successful login to the website
    Given User on login page
    Then user input username
    Then user input password
    Then user click login button
    And Validate successful login to the website