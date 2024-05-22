Feature: EmailAfriend

  @email

  Scenario: to verify that registered user is able to refer a product to a friend

    Given I am on the homepage
    And I click on register button
    And I enter the registration details
    And I should be registered successfully
    And I click on electronics button
    And I click on camera & photo button
    And I click on Leica T Mirrorless Digital Camera
    And I click on email a friend button
    When I enter friends details
    Then email should be successfully sent
    

