Feature:
  as a user
  I want to find the modulus of a number by 2
  so that i can quickly see the result

  Scenario: modulus of 10 by 3
    Given I have the number 10
    And I have the number 3
    When I press Modulus
    Then I want to see the result 1 in my display.

  Scenario: modulus of -15 by 4
    Given I have the number -15
    And I have the number 4
    When I press Modulus
    Then I want to see the result -3 in my display.

  Scenario: modulus of 20 by 7
    Given I have the number 20
    And I have the number 7
    When I press Modulus
    Then I want to see the result 6 in my display.
