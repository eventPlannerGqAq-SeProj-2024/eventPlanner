
Feature: Managing a birthday for a specific user by the provider
  Description: Provider manages a selected event that exists for a specific user
  Actor: Provider

  @tag1
  Scenario: Managing event nameb by scanner
    Given Provider chooses to change nameb by scanner
    And 	Provider enters new name to replace old nameb by scanner
    Then Provider changes name successfullyb by scanner

   Scenario: Managing event Date unbookedb by scanner
    Given Provider chooses to change Dateb by scanner
    And 	Provider enters new unbooked Date to replace old Dateb by scanner
    Then Provider changes Date successfullyb by scanner

   Scenario: Managing event Date bookedb by scanner
    Given Provider chooses to change Dateb by scanner
    And 	Provider enters new booked Date to replace old Dateb by scanner
    Then Provider doesnt changes Dateb by scanner
    
   Scenario: Managing event themeb by scanner
    Given Provider chooses to change themeb by scanner
    And 	Provider enters new theme to replace old themeb by scanner
    Then Provider changes theme successfullyb by scanner
    
   Scenario: Managing event descriptionb by scanner
    Given Provider chooses to change descriptionb by scanner
    And 	Provider enters new description to replace old descriptionb by scanner
    Then Provider changes description successfullyb by scanner
    
    Scenario: Managing event attendee countb by scanner
    Given Provider chooses to change attendee countb by scanner
    And 	Provider enters new attendee count to replace old attendee countb by scanner
    Then Provider changes attendee count successfullyb by scanner
    
    Scenario: Managing event age by scanner
    Given Provider chooses to change age by scanner
    And 	Provider enters new age to replace old age by scanner
    Then Provider changes age successfully by scanner
    
     Scenario: Managing event cake by scanner
    Given Provider chooses to change cake by scanner
    And 	Provider enters new cake to replace old cake by scanner
    Then Provider changes cake successfully by scanner
    
     Scenario: Managing event Celibrant name by scanner
    Given Provider chooses to change Celibrant name by scanner
    And 	Provider enters new Celibrant name to replace old Celibrant name by scanner
    Then Provider changes Celibrant name successfully by scanner
     