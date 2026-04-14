Feature: login feature with Scenario outline

  Scenario Outline: S7-login to application
    Given user in at signup page
    When user enters "<Name>" inside form
    And user enters age as <Age>
    And user confirm gender as "<Gender>"
    Then user gets created

    Examples:
    | Name   |  Age |  Gender   |
    | Amol   | 20   |  Male     |
    | Sonali | 30   |  Female   |
    | Monika | 28   |  Female   |



