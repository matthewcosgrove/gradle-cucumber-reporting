Feature: Use API
  Scenario: POST then GET
    Given the json has been posted
    When I make a GET request
    Then the json contains an expected field