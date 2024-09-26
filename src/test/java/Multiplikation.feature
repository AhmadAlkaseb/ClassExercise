Feature: Multiply numbers
  As a user
  I want to multiply two numbers
  So that i can see the result

  Scenario: Multiply two numbers
    Given I have the number 8
    And I have the number 5
    When I click Multiply
    Then I want to see the result 40 in my display.