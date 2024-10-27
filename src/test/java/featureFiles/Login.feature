Feature: Login Functionality

  Background:
    Given The user navigates to the Magento website
    When The user clicks on the Sign in Link

  Scenario: Login Functionality with Valid Credentials
    Then The user types username and password with valid credentials
    And The user clicks on the Sign in button
    Then The user verifies logged in successfully

  Scenario: Login Functionality with Invalid Credentials
    Then  The user types the email and password with invalid credentials
    And The user clicks on Sign in button
    Then The user verifies the warning message
    And  The user clicks on the Forgot Password button


