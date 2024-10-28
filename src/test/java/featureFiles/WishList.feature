Feature: Wish List Functionality

  Background:
    Given The user navigates to the Magento website
    When The user clicks on the Sign in Link
    Then The user types username and password with valid credentials
    And The user clicks on the Sign in button
    Then The user verifies logged in successfully

  Scenario: Creating a Favorites List
    When The user goes to the product they want to add to their favorites
    And The user clicks on the Add to Favorites button
    And The user confirms they added the product to favorites
    And The user clicks on the Dropdown Menu and My Account button
      | dropDownMenu    |
      | myAccountButton |

    When The user clicks on the My Wish List button
      | wishListButton |

    Then The user verifies the product in their favorites list
    When The user hovers over the product they view the remove from favorites icon
    Then The user clicks the Remove from Favorites button
      | removeFavoritesButton |

    And The user confirms the product is removed from favorites