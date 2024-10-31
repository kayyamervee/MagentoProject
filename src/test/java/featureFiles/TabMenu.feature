Feature: TAB Menu

  Background:
    Given The user navigates to the Magento website
    When The user clicks on the Sign in Link
    Then The user types username and password with valid credentials
    And The user clicks on the Sign in button
    Then The user verifies logged in successfully

  Scenario: Access to Tab Menu links
    Given The user displays the TAB menu on the home page
    When The user clicks on the TAB Menu button
      | whatsNewButton |

    Then The user confirms that they accessed the What's New page
    When The user clicks on the TAB Menu button
      | womenButton |

    Then The user confirms that they accessed the Women page
    And The user displays and clicks the sub-buttons of the Women button
    When The user clicks on the TAB Menu button
      | menButton |

    Then The user confirms that they accessed the Men page
    And The user displays and clicks the sub-buttons of the Men button
    When The user clicks on the TAB Menu button
      | gearButton |

    Then The user confirms that they accessed the Gear page
    And The user views and clicks on the Bags, Fitness Equipment, and Watches buttons
    When The user clicks on the TAB Menu button
      | trainingButton |

    Then The user confirms that they accessed the Training page
    And The user view and clicks on the Video Download button
    When The user clicks on the TAB Menu button
      | saleButton |

    Then The user confirms that they accessed the Sale page