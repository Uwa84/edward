Feature: trial validation
  Scenario Outline:
    Given User sets  the base API request <URL>
    And User authenticates the API request with <token>
    When User sends the API request to get all the repositories
    Then User validates the response status is <code>

    Examples:
  |URL                       |token|code|
  |                          |     |     |