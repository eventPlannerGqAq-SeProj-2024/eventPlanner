
Feature: Regesteration / Signup feature
  Description: Signup a new user or provider or admin 

  Scenario: user enters valid data
    Given user enters valid  data
    When user confirms addition
    Then send a request to the provider
    
  Scenario: user enters wrong date
  Given user entered wrong format for the date
  When user confirms addition
  Then 
    
    