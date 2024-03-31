
Feature: Regesteration / Signup feature
  Description: Signup a new user or provider or admin 
  
  @t1
  Scenario: user enters valid data and type user
    Given user enters valid  data as user "Name" "Username" "Email" "Birthday" " Gender" "Password"
    And user seleceted user role
    When user confirms addition
    Then check if email and date are valid "Email" "Date"
    And Add a new user
    
    @t2
    Scenario: user enters valid data and type admin
    Given user enters valid  data as admin "Name" "Username" "Email" "Birthday" " Gender" "Password"
    And user seleceted admin role
    When user confirms addition
    Then check if email and date are valid "Email" "Date"
    And Add a new admin
    
    @t3
    Scenario: user enters valid data and type provider
    Given user enters valid  data as provider "Name" "Username" "Email" "Birthday" " Gender" "Password"
    And user seleceted provider role
    When user confirms addition
    Then check if email and date are valid "Email" "Date"
    And Add a new provider
  
  @t4  
  Scenario: user enters wrong date or email
  Given user enters wrong format for the date or email values "Email" "Birthdate"
  And user seleceted role type
  When user confirms addition
  Then check if email and date are valid "Email" "Date"
  And Show a try again dialog "Email" "Date"
    
    