
Feature: Regesteration / Signup feature
  Description: Signup a new user or provider or admin 

  Scenario: user enters valid data and type user
    Given user enters valid  data "Name" "Username" "Email" "Birthday" " Gender" "Password"
    And user seleceted user role
    When user confirms addition
    Then check if email and date are valid "Email" "Date"
    And Add a new user
    
    Scenario: user enters valid data and type admin
    Given user enters valid  data "Name" "Username" "Email" "Birthday" " Gender" "Password"
    And user seleceted admin role
    When user confirms addition
    Then check if email and date are valid "Email" "Date"
    And Add a new admin
    
    Scenario: user enters valid data and type provider
    Given user enters valid  data "Name" "Username" "Email" "Birthday" " Gender" "Password"
    And user seleceted provider role
    When user confirms addition
    Then check if email and date are valid "Email" "Date"
    And Add a new provider
    
  Scenario: user enters wrong date or email
  Given user enters wrong format for the date or email values "Name" "Username" "Email" "Birthday" " Gender" "Password"
  And user seleceted role type
  When user confirms addition
  Then check if email and date are valid "Email" "Date"
  And Show a try again dialog
    
    