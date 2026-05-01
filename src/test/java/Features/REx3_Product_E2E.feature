Feature: products feature

  Background:
    Given user is on Swag lab login
    When user enter username on swaglab login page "UN"
    And wait for 2 seconds
    And user enter password on swaglab login page "PWD"
    And wait for 3 seconds
    And user click on login btn on swaglab login page
    And wait for 3 seconds

@ProductE2e
  Scenario: TC6- purchase product E2E
    When user click on backpack products add to cart btn
    And user click on cartlink
    And user click on checkout button
    And user enter FN as "abc"
    And user enter LN as "xyz"
    And user enter zip code as "1111"
    And user click on continue button
    And user click on Finish button
    Then order success message should be visible with messgae "Thank you for your order!"


