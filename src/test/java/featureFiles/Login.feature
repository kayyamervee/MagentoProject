Feature: Login Functionality

  Background:
    Given The user navigates to the Magento website

  Scenario: Login Functionality with Valid Credentials
    When The user clicks on the Sign in button
    And  The user types the email and password with valid credentials
      | emailValid | passwordValid |

    Then The user verifies logged in successfully

  Scenario: Login Functionality with Invalid Credentials
    When The user clicks on the Sign in button
    And  The user types the email and password with invalid credentials
      | emailInvalid | passwordInvalid |

    Then The user verifies the warning message
    And  The user clicks on the Forgot Password button


