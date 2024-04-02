
Feature: get all details of a logged user or amin or provider

  @tag1
  Scenario: user gets details
    Given user wants to get his detials
    Then user or amin or provider gets details
    
    Scenario: admin gets details
    Given admin wants to get his detials
    Then user or amin or provider gets details
    
    Scenario: provider gets details
    Given provider wants to get his detials
    Then user or amin or provider gets details
