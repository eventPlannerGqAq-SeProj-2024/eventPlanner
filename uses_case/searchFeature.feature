@tag
Feature: Search for an empty hall
  Description: This feature lets the user specific hall and informs the user if he can take add an event in it
  Actor: User

  @tag1
  Scenario: Searching for a hall
    Given User is logged in
    And User selected search for a hall
    Then Searched hall is found
    And Hall is displayed for the user
