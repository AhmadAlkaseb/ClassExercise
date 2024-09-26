Feature:
  as a user
  I want to divide numbers
  so that I can get the result of a number divided by a certain amount

  Scenario: Divide two numbers
    Given I have the number 10
    And I have the number 2
    When press Divide
    Then I want to see the result 5 in my display.

  Scenario: Divide three numbers
    Given I have the number 100
    And I have the number 2
    And I have the number 2
    When press Divide
    Then I want to see the result 25 in my display.

  Scenario: Divide four numbers
    Given I have the number 10
    And I have the number 2
    And I have the number 2
    And I have the number 2
    When press Divide
    Then I want to see the result 1.25 in my display.