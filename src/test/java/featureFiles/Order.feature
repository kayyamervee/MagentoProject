Feature: Order Functionality

  Background:
    Given The user navigates to the Magento website
    When The user clicks on the Sign in Link
    Then The user types username and password with valid credentials
    And The user clicks on the Sign in button
    Then The user verifies logged in successfully

  Scenario: Successful order
    When The user goes to the products and adds the items to cart icon and clicks on the cart icon
      | addToCart    |
      | shoppingCart |

    Then The user displays the product in the cart icon and updates the quantity it wants
    And  The user clicks on the Proceed to Checkout
      | proceedToCheckout |

    Then The user displays the Shipping Address
    And The user clicks on the random Shipping methods and Next button
      | nextButton |

    Then The user verifies the Shipping address and clicks on the Checkbox
      | checkbox |

    And The user clicks on the Place Order button
      | placeOrder |

    Then The user displays successfully message
