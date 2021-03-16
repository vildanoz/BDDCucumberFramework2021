@checkout
Feature: Checkout Dashboard
  Background:
    Given user is logged in the shopping area

  Scenario Outline:Order checkout
    When user clicks on item with name "<Item>"
    And user clicks on the add to cart button
    And user clicks on the shopping car button
    And user clicks on the checkout button
    And user enters order information as "<FirstName>", "<LastName>","<ZipCode>"
    And user clicks on the continue button
    Then user sees the item name matches that of the "<Item>"
    Examples:
      |Item                   |FirstName |LastName|ZipCode|
      |Sauce Labs Backpack    |Michale   |Smith   |12345  |
      |Sauce Labs Bike Light  |Lisa      |Bernel  |07504  |
      |Sauce Labs Fleece Jacket |Alex    |Averin  |08098  |
