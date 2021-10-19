@ui @go_home
Feature: Google Search
  As a user
  I should be able to search by keyword
  and get my result


    #modify this to  make it data driven scenarion that search for multiple keywords
  Scenario Outline: User search by keyword <keyword>
    Given user is at home page
    When user search for keyword "<keyword>"
    Then we should see result page
    And the title should start with "<keyword>"
    Examples:
      | keyword    |
      | cybertruck |
      | selenium   |
      | sdet jobs  |
