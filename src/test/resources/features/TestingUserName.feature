Feature: Login Functionality

  As a user I can login the application with different username

  @UserNameTest
  Scenario Outline: Validate user names are working
    Given User on login page
    Then user enter "<username>" and "<password>"
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |