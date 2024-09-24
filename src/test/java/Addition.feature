## User Story
Feature: Add numbers
  As a user,
  I want to add numbers,
  so that I can quickly see the result.

## Acceptance Test
  Scenario: Add two numbers
    Given I have the number 5
    And I have the number 10
    When I press Add
    Then I want to see the result 15 in my display.