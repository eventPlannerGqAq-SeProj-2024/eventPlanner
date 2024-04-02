
Feature: Managing a birthday for a specific user by the provider
  Description: Provider manages a selected event that exists for a specific user
  Actor: Provider

  @tag1
  Scenario: Managing event name
    Given Provider chooses to change name
    And 	Provider enters new name to replace old name
    Then Provider changes name successfully

   Scenario: Managing event Date unbooked
    Given Provider chooses to change Date
    And 	Provider enters new unbooked Date to replace old Date
    Then Provider changes Date successfully

   Scenario: Managing event Date booked
    Given Provider chooses to change Date
    And 	Provider enters new booked Date to replace old Date
    Then Provider doesnt changes Date
    
   Scenario: Managing event theme
    Given Provider chooses to change theme
    And 	Provider enters new theme to replace old theme
    Then Provider changes theme successfully
    
   Scenario: Managing event description
    Given Provider chooses to change description
    And 	Provider enters new description to replace old description
    Then Provider changes description successfully
    
    Scenario: Managing event attendee count
    Given Provider chooses to change attendee count
    And 	Provider enters new attendee count to replace old attendee count
    Then Provider changes attendee count successfully
    
    Scenario: Managing event age
    Given Provider chooses to change age
    And 	Provider enters new age to replace old age
    Then Provider changes age successfully
    
     Scenario: Managing event cake
    Given Provider chooses to change cake
    And 	Provider enters new cake to replace old cake
    Then Provider changes cake successfully
    
     Scenario: Managing event Celibrant name
    Given Provider chooses to change Celibrant name
    And 	Provider enters new Celibrant name to replace old Celibrant name
    Then Provider changes Celibrant name successfully
    