Feature: searchProduct

  @search

  Scenario: to verify user is able to search any product

    Given I am on the homepage
    And I enter the product name in search bar
    When I click on the search submit button
    Then I should be able to see all the products for the searched name
    And I should be able to verify the URL of the page

