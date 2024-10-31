Feature: Product Search Functionality

  Background:
    Given The user navigates to the Magento website
    When  The user clicks on the Sign in Link
    Then  The user types username and password with valid credentials
    And   The user clicks on the Sign in button
    Then  The user verifies logged in successfully

  Scenario: Product Search by Product Number
    When The user enters a product number in the search bar
    And  The user clicks the search button
         | searchButton |
    Then The user verifies that the product appears in the search results
    When The user navigates to Jackets from the tab menu
    Then The user verifies the product number on the product page
    When The user enters an invalid product number
    And  The user clicks the search button
         | searchButton |
    Then The user receives a message indicating that no products were found