
Feature: Managing a birthday for a specific user by the provider by mocking
  Description: Provider manages a selected event that exists for a specific user by mocking
  Actor: Provider

  @tag1
  Scenario: Managing event nameb by mocking
    Given Provider chooses to change nameb by mocking
    And 	Provider enters new name to replace old nameb by mocking
    Then Provider changes name successfullyb by mocking

   Scenario: Managing event Date unbookedb by mocking
    Given Provider chooses to change Dateb by mocking
    And 	Provider enters new unbooked Date to replace old Dateb by mocking
    Then Provider changes Date successfullyb by mocking

   Scenario: Managing event Date bookedb by mocking
    Given Provider chooses to change Dateb by mocking
    And 	Provider enters new booked Date to replace old Dateb by mocking
    Then Provider doesnt changes Dateb by mocking
    
   Scenario: Managing event themeb by mocking
    Given Provider chooses to change themeb by mocking
    And 	Provider enters new theme to replace old themeb by mocking
    Then Provider changes theme successfullyb by mocking
    
   Scenario: Managing event descriptionb by mocking
    Given Provider chooses to change descriptionb by mocking
    And 	Provider enters new description to replace old descriptionb by mocking
    Then Provider changes description successfullyb by mocking
    
    Scenario: Managing event attendee countb by mocking
    Given Provider chooses to change attendee countb by mocking
    And 	Provider enters new attendee count to replace old attendee countb by mocking
    Then Provider changes attendee count successfullyb by mocking
    
    Scenario: Managing event age by mocking
    Given Provider chooses to change age by mocking
    And 	Provider enters new age to replace old age by mocking
    Then Provider changes age successfully by mocking
    
     Scenario: Managing event cake by mocking
    Given Provider chooses to change cake by mocking
    And 	Provider enters new cake to replace old cake by mocking
    Then Provider changes cake successfully by mocking
    
     Scenario: Managing event Celibrant name by mocking
    Given Provider chooses to change Celibrant name by mocking
    And 	Provider enters new Celibrant name to replace old Celibrant name by mocking
    Then Provider changes Celibrant name successfully by mocking
    