Feature: Address Addition

  Background:
    Given The user navigates to the Magento website
    When The user clicks on the Sign in Link
    Then The user types username and password with valid credentials
    And The user clicks on the Sign in button
    Then The user verifies logged in successfully

    Scenario: Address Addition
      When The user clicks on drop-down menu and My Account button
      And The user clicks on the Address Book button
      And The user types Home location information
      Then The user clicks on Save button and displays verifies message
      When The user clicks on My Account button in the Left Nav and clicks on Edit Address button
      And The user types Company location information
      And The user displays two options and clicks on Save button
      Then The user displays verifies message
      Then The user clicks on Delete button and displays verifies message
