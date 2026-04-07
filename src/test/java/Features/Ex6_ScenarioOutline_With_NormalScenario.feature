Feature: login feature with Scenario outline

  Scenario Outline: S8-login to application
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



  Scenario: S9-login to application
    Given user in at signup page
    When user enters "mahesh" inside form
    And user enters age as 30
    And user confirm gender as "Male"
    Then user gets created
