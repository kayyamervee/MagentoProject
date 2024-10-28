Feature: Product Search Functionality

  Background:
    Given The user navigates to the Magento website
    When  The user clicks on the Sign in Link
    And   The user types the email and password with valid credentials
          | emailValid | passwordValid |

  Scenario:
    When The user enters a valid SKU "MJ08"
    And  The user clicks the "Search" button
    Then "Lando Gym Jacket" should be in the search results for the user
    And  The user verifies the SKU is "MJ08"
    When The user enters invalid SKU
    And  The user clicks "Search"
    And  The user views a "Your search returned no result." message

