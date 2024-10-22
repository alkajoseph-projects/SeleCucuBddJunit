Feature: LoggedIn user view

  @testLogin
  Scenario Outline: User should be able to see the Products after login
    Given User navigated to Login page
    When User enters '<username>' and '<password>'
    And User clicks on Login button
    Then User should see the Products category and take screenshot
    Examples:
    | username | password |
    | user     | pass     |