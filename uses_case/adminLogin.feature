#First feature file:

Feature: Admin login
  Description: Administrator log in featue
  Actor: Administrator

  Scenario: Admin can log in
    Given that the admin is not logged in
    And the password is "Admin1"
    Then the admin log in succeeds
    And the admin is logged in
    
  Scenario: Admin cannot log in
  Given that the admin is not logged in
  And the password is not "Admin1"
  Then the admin log in fails
  And the admin is not logged in
  
  

  #@tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
   # When I check for the <value> in step
   # Then I verify the <status> in step

   # Examples: 
   #   | name  | value | status  |
   #   | name1 |     5 | success |
   #   | name2 |     7 | Fail    |
