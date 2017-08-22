Feature: Search product

  Scenario: Not authorized user searching a product

    Given I open main page
#    And I close pop-up window
    And I enter a product name Iphone in search field
    And I click on submit button
    Then the first one should contain text in title Iphone