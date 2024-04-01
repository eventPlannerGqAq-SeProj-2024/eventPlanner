
@tag
Feature: filter venues
 

  @tag1
  Scenario: filter by price
    Given user chooses filter by price
    And user enters search filter
    Then a list of venues is printed based on price

 
  Scenario: filter by unbooked date
    Given user chooses filter by unbooked date
    And user enters search filter
    Then a list of venues is printed based on unbooked date
    
    Scenario: filter by area
    Given user chooses filter by area
    And user enters search filter
    Then a list of venues is printed based on area
    
     Scenario: filter by capacity
    Given user chooses filter by capacity
    And user enters search filter
    Then a list of venues is printed based on capacity
