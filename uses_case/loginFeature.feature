#First feature file:
Feature: Login
  Description: login feature
  Actor: Administrator or user or planner

  #Admin:
  @Scenario1A
  Scenario: Admin can log in
    Given that the admin is not logged in
    And admin enters correct user name "user name" or password "password"
    Then the admin log in succeeds
    And the admin is logged in

  @Scenario2A
  Scenario: Admin has wrong password or username
    Given that the admin is not logged in
    And admin enters wrong user name "user name" or password "password"
    Then the admin log in fails
    And the admin is not logged in

  #User:
  @Scenario2U
  Scenario: User can log in
    Given that the user is not logged in
    And the user enters correct "user name" and "password"
    Then the user log in succeeds
    And the user is logged in

  @Scenario2U
  Scenario: user has wrong password or username
    Given that the user is not logged in
    And user enters wrong "user name" or "password"
    Then the user log in fails
    And the user is not logged in

  #Planner:
  @Scenario2P
  Scenario: Planner can log in
    Given that the planner is not logged in
    And the planner enters correct "user name" and "password"
    Then the planner log in succeeds
    And the planner is logged in

  @Scenario2P
  Scenario: Planner has wrong password or username
    Given that the planner is not logged in
    And planner enters wrong "user name" or "password"
    Then the planner log in fails
    And the planner is not logged in
