@feature_home_screen
Feature: HomeScreen

  Background: 
    Given the user is on the Login Page

  @successful-login
  Scenario Outline: Verify that the user is redirected to the Home screen after a successful login
    When I enter username "<username>"
    And I enter password "<password>"
    And the user clicks the Login button
    Then the user should be redirected to the Home screen

    Examples:
      | username     | password            |
      | validUser123 | SecurePassword!2023 |

  @logout
  Scenario: Verify that the user can logout successfully
    When I enter username "validUser123"
    And I enter password "SecurePassword!2023"
    And the user clicks the Login button
    And the user clicks on the logout button
    Then the user should be redirected to the login page
