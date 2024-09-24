## User Story
Feature: Subtract numbers
  As a user,
  I want to subtract numbers,
  so that I can quickly see the result.

## Acceptance Test
  Scenario: Subtract two numbers
    Given I have the number 50
    And I have the number 10
    When I press Subtract
    Then I want to see the result 40 in my display.

  Scenario: Subtract three numbers
    Given I have the number 50
    And I have the number 10
    And I have the number 10
    When I press Subtract
    Then I want to see the result 30 in my display.

  Scenario: Subtract nine numbers
    Given I have the number 50
    And I have the number 10
    And I have the number 10
    And I have the number 10
    And I have the number 10
    And I have the number 10
    And I have the number 10
    And I have the number 10
    And I have the number 10
    When I press Subtract
    Then I want to see the result -30 in my display.