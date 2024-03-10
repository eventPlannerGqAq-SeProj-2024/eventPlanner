
Feature: Adding a new event for a specific user
  Description: User wants to add a new event
  Actor: User

  Scenario: Adding an event
    Given User is logged in
    And User selected add a new event option 
    And Event details dialog is displayed
    And User enters all details for the event
    Then Add a new event to the userEventsList
    And Addition is successful

