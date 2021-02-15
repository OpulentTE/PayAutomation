# new feature
# Tags: optional

Feature: Test login details

  Scenario Outline: Validate login details on DekoPay website
    Given I am on DekoPay Website
    When I enter my "<username>"
    And I type my "<password>"
    And I click sign in button
    Then I should see my dashboard

    Examples:
      | username    | password   | error message |
      | Lanre.Lawal | DekoQA2020 |               |
      | Lanre.Lawal | DekoQA2021 | .                                              |
      | LanreLawal  | DekoQA2020 | Sorry, the details you provided were incorrect. |
      |             | DekoQA2020 | Sorry, the details you provided were incorrect. |
      | Larri.Lawal |            | Sorry, the details you provided were incorrect. |
