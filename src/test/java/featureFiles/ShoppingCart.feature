@Smoke @Regression
Feature: Shopping Cart Functionality

  Background:
    Given The user navigates to the Magento website
    When The user clicks on the Sign in Link
    Then The user types username and password with valid credentials
    And The user clicks on the Sign in button
    Then The user verifies logged in successfully

  Scenario: Shopping Card Adding and Removing Items
    Given The user starts browsing the main page
    When The user selects first product by selecting the size and color of the product
      | addToCartBtn |

    Then The user verifies that the product has been successfully added
    When The user selects second product by selecting the size and color of the product
      | addToCartBtn |

    Then The user verifies that the product has been successfully added
    And  The user clicks on the Shopping Cart
      | shoppingCartLink |

    And The user removes a product from the Shopping Cart
      | deleteBtn |

    And The user edits the product from the Shopping Cart
      | editBtn |

    Then The user clicks on the Update Shopping Cart
      | updateShoppingCartBtn |