
Feature: Managing an event for a specific user by the provider
  Description: Provider manages a selected event that exists for a specific user
  Actor: Provider

  @tag1
  Scenario: Managing an event
    Given Provider is logged in
    And 	Provider selects an event
    And Provider selects to manage the event
    Then Provider can change event details
    And Changes are saved for the specific event

