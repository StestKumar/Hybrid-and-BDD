Feature: Registration

@register

  Scenario: To verify user should be able to register successfully

    Given I am on the homepage
    And I click on register button
    When I enter the registration details
    Then I should be registered successfully