#First feature file:

Feature: admin login
  I want to use this template for my feature file

  Scenario: admin can log in
    Given that the admin is not logged in
    And the password is not in "passwords" arrayList
    Then admin is logged in
    
  Scenario: admin has the wrong password
  Given that the admin is not logged in
  And the password is "wrong password"
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
