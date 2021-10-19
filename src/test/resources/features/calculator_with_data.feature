@calculator
Feature: Calculator feature
  As a user,
  I should be able
  to use the calculator,
  de that I can dof
  arithmetic operations.
# Scenario Outline is used to run some scenario
  @wip2
  Scenario Outline: Add 2 numbers multiple example
    Given calculator app is open
    When I add <num1> with <num2>
    Then I should get result <expectedResult> displayed
    Examples:
      | num1 | num2 | expectedResult |
      | 3    | 4    | 7              |
      | 4    | 7    | 11             |
      | 6    | 11   | 17             |
      | 61   | 11   | 72             |



  ## below line is how we add tag to a feature at scenario level
#  @addition
#  Scenario: Add 2 numbers example 1
#    Given calculator app is open
#    When I add 2 with 2
#    Then I should get result 4 displayed
#
#  Scenario: Add 2 numbers example 2
#    Given calculator app is open
#    When I add 3 with 2
#    Then I should get result 5 displayed
#
#  Scenario: Add 2 numbers example
#    Given calculator app is open
#    When I add 21 with 20
#    Then I should get result 41 displayed
