Feature:
  as a user
  I want to add two or more numbers
  so that i can quickly see the result

  Scenario: Add two numbers
    Given i have the number 5
    And i have the number 10
    When press Add
    Then i want to see the result 15 in my display

  Scenario: Add three numbers
    Given i have the number 5
    And i have the number 10
    And i have the number 8
    When press Add
    Then i want to see the result 23 in my display

  Scenario: Add two numbers
    Given i have -154
    And i have 24
    When press Add
    Then i want to see the result -130 in my display
