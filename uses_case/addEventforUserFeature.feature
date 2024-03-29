
Feature: Adding a new event for a specific user
  Description: User wants to add a new event
  Actor: User

  Scenario: user enters complete data on unbooked date
    And User selected add a new event option 
    And User enters all details for the event
    And User doesnt enter a booked date
    Then Add a new event to the userEventsList
    And Addition is successful

   Scenario: user enters complete data on booked date
    Given user is logged in
    And User selected add a new event option 
    And User enters all details for the event
    And User enters a booked date
    Then add new event fails
    And Addition is unsuccessful
    
  Scenario: user enters incomplete data
    Given user is logged in
    And User selected add a new event option 
    And User doesnt enter all details for the event
    Then add new event fails
    And Addition is unsuccessful