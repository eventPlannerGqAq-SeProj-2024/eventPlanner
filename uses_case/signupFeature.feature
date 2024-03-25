
Feature: Regesteration / Signup feature
  Description: Signup a new user or provider or admin 

  Scenario: Regesteration
    Given User selects a role
    And user enters details
    Then Add a new user with the selected type with the given details
    And Registeration is successfull
    