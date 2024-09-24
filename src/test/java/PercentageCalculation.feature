Feature: Percentage of a number
  As a user
  I want to calculate a percentage of a number
  So that i can see the result

  Scenario: Percentage of a number
    Given I have entered 25
    And I have entered 769
    When I click Calculate Percentage
    Then I want to see the result 192.25 in my display