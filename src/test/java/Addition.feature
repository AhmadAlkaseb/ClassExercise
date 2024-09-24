Feature:
  as a user
  I want to add two or more numbers
  so that i can quickly see the result

  Scenario: Add two numbers
    Given I have the number 5
    And I have the number 10
    When press Add
    Then I want to see the result 15 in my display.

  Scenario: Add three numbers
    Given I have the number 5
    And I have the number 10
    And I have the number 8
    When press Add
    Then I want to see the result 23 in my display.

  Scenario: Add two numbers
    Given I have the number -154
    And I have the number 24
    When press Add
    Then I want to see the result -130 in my display.
