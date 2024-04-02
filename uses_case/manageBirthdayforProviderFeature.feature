
Feature: Managing a birthday for a specific user by the provider
  Description: Provider manages a selected event that exists for a specific user
  Actor: Provider

  @tag1
  Scenario: Managing event nameb
    Given Provider chooses to change nameb
    And 	Provider enters new name to replace old nameb
    Then Provider changes name successfullyb

   Scenario: Managing event Date unbookedb
    Given Provider chooses to change Dateb
    And 	Provider enters new unbooked Date to replace old Dateb
    Then Provider changes Date successfullyb

   Scenario: Managing event Date bookedb
    Given Provider chooses to change Dateb
    And 	Provider enters new booked Date to replace old Dateb
    Then Provider doesnt changes Dateb
    
   Scenario: Managing event themeb
    Given Provider chooses to change themeb
    And 	Provider enters new theme to replace old themeb
    Then Provider changes theme successfullyb
    
   Scenario: Managing event descriptionb
    Given Provider chooses to change descriptionb
    And 	Provider enters new description to replace old descriptionb
    Then Provider changes description successfullyb
    
    Scenario: Managing event attendee countb
    Given Provider chooses to change attendee countb
    And 	Provider enters new attendee count to replace old attendee countb
    Then Provider changes attendee count successfullyb
    
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
    