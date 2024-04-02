
Feature: Managing an event for a specific user by the provider
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
    