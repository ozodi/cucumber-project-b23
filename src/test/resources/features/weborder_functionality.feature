
Feature: Weborder app should work as expected

  @wip
  Scenario: User should see all product from the list according to available product
    Given we should see all order page
    And we provide valid credentials
    When we select "Order" tab from sidebar
    Then we should see below options in Product dropdown list
      | MyMoney     |
      | FamilyAlbum |
      | ScreenSaver |