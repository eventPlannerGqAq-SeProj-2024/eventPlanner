
Feature: Admin user deletion feature
  Description: Admin can remove any user from any role from the system except for other admins
  Actor: Admin

  @tag1
  Scenario: Removing a user
    Given Admin is logged in
    And Admin selected delete a user option 
    And Users list is displayed to the admin
    And Admin selects a specific user
    Then Delete selected user from the system
    And Selected user deletion is successful
