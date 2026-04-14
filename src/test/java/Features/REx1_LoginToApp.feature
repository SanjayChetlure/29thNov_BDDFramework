Feature: login functionality

  Scenario: TC1-login with valid credentials
    Given user is on Swag lab login
    When user enter username on swaglab login page "standard_user"
    And user enter password on swaglab login page "secret_sauce"
    And user click on login btn on swaglab login page
    Then home page visible with logo text "Swag Labs"
