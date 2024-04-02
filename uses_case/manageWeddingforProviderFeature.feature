
Feature: Managing an event for a specific user by the provider
  Description: Provider manages a selected event that exists for a specific user
  Actor: Provider

  @tag1
  Scenario: Managing event namew
    Given Provider chooses to change namew
    And 	Provider enters new name to replace old namew
    Then Provider changes name successfullyw

   Scenario: Managing event Date unbookedw
    Given Provider chooses to change Datew
    And 	Provider enters new unbooked Date to replace old Datew
    Then Provider changes Date successfullyw

   Scenario: Managing event Date bookedw
    Given Provider chooses to change Datew
    And 	Provider enters new booked Date to replace old Datew
    Then Provider doesnt changes Datew
    
   Scenario: Managing event themew
    Given Provider chooses to change themew
    And 	Provider enters new theme to replace old themew
    Then Provider changes theme successfullyw
    
   Scenario: Managing event descriptionw
    Given Provider chooses to change descriptionw
    And 	Provider enters new description to replace old descriptionw
    Then Provider changes description successfullyw
    
    Scenario: Managing event attendee countw
    Given Provider chooses to change attendee countw
    And 	Provider enters new attendee count to replace old attendee countw
    Then Provider changes attendee count successfullyw
    
    Scenario: Managing event Officiant
    Given Provider chooses to change Officiant
    And 	Provider enters new Officiant to replace old Officiant
    Then Provider changes Officiant successfully
    
    Scenario: Managing event Cake
    Given Provider chooses to change Cake
    And 	Provider enters new Cake to replace old Cake
    Then Provider changes Cake successfully
    
    Scenario: Managing event Wedding_type
    Given Provider chooses to change Wedding_type
    And 	Provider enters new Wedding_type to replace old Wedding_type
    Then Provider changes Wedding_type successfully
    
    Scenario: Managing event DJ
    Given Provider chooses to change DJ
    And 	Provider enters new DJ to replace old DJ
    Then Provider changes DJ successfully
    
    Scenario: Managing event Bride
    Given Provider chooses to change Bride
    And 	Provider enters new Bride to replace old Bride
    Then Provider changes Bride successfully
    
    Scenario: Managing event groom
    Given Provider chooses to change groom
    And 	Provider enters new groom to replace old groom
    Then Provider changes groom successfully
    
 
    