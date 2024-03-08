
@tag
Feature: Signup feature
  Description: Signup a new user or provider or admin 

  Scenario: Admin signup
    Given Registeration is selected
    And user selects admin role
    And user enters personal details "Name" "email" "birthday" "gender"
    And   User enteres a new username "newUsername" and a password "password"
    Then Add a new admin with the details and user name and password
    And Registeration is successfull
    
    Scenario: User signup
    Given Registeration is selected
    And user selects user role
    And user enters personal details "Name" "email" "birthday" "gender"
    And   User enteres a new username "newUsername" and a password "password"
    Then Add a new user with the details and user name and password
    And Registeration is successfull
    
    
    Scenario: Provider signup
    Given Registeration is selected
    And user selects provider role
    And user enters personal details "Name" "email" "birthday" "gender"
    And   User enteres a new username "newUsername" and a password "password"
    Then Add a new provider with the details and user name and password
    And Registeration is successfull
    

