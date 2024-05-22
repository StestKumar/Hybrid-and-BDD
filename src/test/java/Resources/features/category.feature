Feature: category

  @category

  Scenario Outline: To verify user should be able to navigate to each category page successfully
    Given I am on the homepage
    When I click on "<category name>" button
    Then I should be able to verify that user is navigated to "<url>" page

    Examples:
      | category name     | url               |
      | Computers         | Computers         |
      | Electronics       | Electronics       |
      | Apparel           | Apparel           |
      | Digital downloads | Digital downloads |
      | Books             | Books             |
      | Jewelry           | Jewelry           |
      | Gift Cards        | Gift Cards        |
