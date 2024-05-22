Feature: lastComment

  @comment

  Scenario: to verify that user is able to see the comment visible at last on the list.

    Given I am on the homepage
    And I click on the details button on nopcommerce new release
    And I enter the title and comment
    When I click on the new comment submit button
    Then I should be able to verify my comment is last in the list