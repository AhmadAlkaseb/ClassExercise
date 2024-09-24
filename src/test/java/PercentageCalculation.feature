Feature: Percentage Calculation
  As a user
  I want to calculate a percentage of a number
  So that i can see the result

  Scenario: Percentage of a number
    Given I have the number 25
    And I have the number 769
    When I click Calculate Percentage
    Then I want to see the result 192.25 in my display.

  Scenario: How many percent are A of B
    Given I have the number 7
    And I have the number 28
    When I click Get Percent
    Then I want to see the result 25 in my display.