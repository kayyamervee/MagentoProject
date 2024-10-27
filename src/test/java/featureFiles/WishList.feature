Feature: Wish List Functionality

  Background:
    Given The user navigates to the Magento website
    When The user clicks on the Sign in button
    And  The user types the email and password with valid credentials
      | emailValid | passwordValid |

    Then The user verifies logged in successfully

  Scenario: Creating a Favorites List
    When The user goes to the product they want to add to their favorites
    And The user clicks on the Add to Favorites button
      | addFavoritesButton |

    And The user confirms they added the product to favorites
    And The user clicks on the My Account button
      | myAccountButton |

    When The user clicks on the My Wish List button
      | addFavoritesButton |

    Then The user verifies the product in their favorites list
    When The user hovers over the product they view the remove from favorites icon
    Then The user clicks the Remove from Favorites button
      | removeFavoritesButton |

    And The user confirms the product is removed from favorites