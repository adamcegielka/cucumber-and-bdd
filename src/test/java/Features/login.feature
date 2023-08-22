Feature: Login to the system

  As a user, I want to be able to log in to access advanced system functions

  Scenario: Correct login
    Given  User is on the login page
    When User enters a valid username
    And User enters correct password
    And User clicks Login button
    Then User has successfully logged in