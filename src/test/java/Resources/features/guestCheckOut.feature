Feature: Guest Checkout


  @checkout

  Scenario: To verify user is able to check out as a guest

    Given I am on the homepage
    And I click on HTC_One _M8 _Android _L _5.0 _Lollipop
    And I click on Add to Cart Button
    And I click on shopping cart
    And I accept the term of service
    And I click on checkout as guest
    When I enter the user details
    And I select delivery method
    And I select credit card
    And I enter card details
    And I confirm the details
    Then I should be able to check out as guest



