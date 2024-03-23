@tag
Feature: addVenue
 adding new venue by provider

  @tag1
  Scenario: provider adds new venue with correct information
    Given provider is logged in
    And provider chooses to add new venue
    And provider enters venue information 
    And information is correct
    Then the new venue is added

  @tag2
  Scenario: provider adds new venue with incorrect information
    Given provider is logged in
    And provider chooses to add new venue
    And provider enters venue information 
    And information is incorrect
    Then the new venue isnt added