
Feature: Adding a new event for a specific user
  Description: User wants to add a new event
  Actor: User

  Scenario: user enters complete data on unbooked date
    Given User selected add a new event option 
    And User enters all details for the event

   
    Given User enters all details for the event
    And User doesnt enter a booked date
    Then Add a new event to the userEventsList
  

   Scenario: user enters complete data on booked date
 
   
    Given User enters all details for the event
    And User enters a booked date
    Then add new event fails
    And user tries again
    
  Scenario: user enters incomplete data

      
    Given User doesnt enter all details for the event
    Then add new event fails
    And user tries again