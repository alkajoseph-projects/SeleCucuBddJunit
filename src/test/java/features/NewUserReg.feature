Feature: New user view

  Scenario Outline: User should be able to see the Products after login
    Given User navigated to Login page
    When User clicks on New user registration
    And User enters details
    And User clicks on submit button
    Then User should see the registration is successful

    Examples:
      | username | password |
      | user     | pass     |