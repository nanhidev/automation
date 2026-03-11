
@feature_home_screen
Feature: HomeScreen

  Background: 
    Given the user is on the Login Page

  @successful-login
  Scenario Outline: Verify that the user is redirected to the Home screen after a successful login
    When I enter <username>
    And I enter <password>
    And the user clicks the Login button
    Then the user should be redirected to the Home screen
    And the URL of the Home screen is displayed correctly
    And no error messages are shown
    And the Home screen loads within an acceptable time frame

    Examples:
      | username         | password            |
      | validUser123     | SecurePassword!2023 |

  @verify_greeting_text
  Scenario Outline: Verify that the Home screen displays the correct greeting text with the username after successful login
    When the system retrieves the username of the logged-in user
    And the system constructs the greeting message
    And the system displays the greeting message on the Home screen
    Then the greeting text is displayed as "Hello <username>, what would you like to do today?"
    And the username is correctly displayed in the greeting
    And the greeting text is prominently visible

    Examples:
      | username  |
      | John Doe  |

  @verify_home_screen_modules
  Scenario Outline: Verify that all specified modules are displayed on the Home screen for user access
    When the user visually inspects the Home screen
    Then the "<module>" module is visible
    And all modules are clickable and lead to the respective pages

  Examples:
    | module                          |
    | Operations Management           |
    | BI Reporting                    |
    | Telephone Booking Service       |
    | Customer Support Portal         |

  @verify_profile_information
  Scenario Outline: Verify that the user's profile information is visible on the Home screen
    When the system retrieves user profile information
    Then the user's name is displayed correctly
    And the user's email address is displayed correctly
    And the user's profile picture is displayed
    And the user's role or designation is displayed

  Examples:
    | username | email            | profile_picture | role          |
    | JohnDoe  | john@example.com | picture.jpg     | Software Engineer |

  @navigate_operations_management
  Scenario Outline: Verify that clicking on the Operations Management module navigates to the correct page
    When the user clicks on "<module>" module
    Then the user is navigated to the "<module>" page

    Examples:
      | module                        |
      | Operations Management         |
      | BI Reporting                  |
      | Telephone Booking Service      |
      | Customer Support Portal       |

  @update_profile
  Scenario Outline: Home Screen | Verify Profile Updates Reflect After Refresh
    Given the user updates their profile information with name <name> and email <email>
    When the user saves the changes
    And the user refreshes the Home screen
    Then the updated profile information should be displayed on the Home screen
    And no old information should be visible

    Examples:
      | name    | email               |
      | krishna | krishna@gmail.com   |

  @successful-logout
  Scenario Outline: Verify that the user can log out successfully from the Home screen
    When the user clicks on the "Logout" button
    Then the user should be redirected to the login page
    And the user should no longer be able to access the Home screen
    And a confirmation message should be displayed indicating successful logout

  Examples:
    | action                |
    | Logout                |

  @verify_date_time_display
  Scenario Outline: Home Screen
    When the system retrieves the current date and time
    Then the current date is displayed correctly
    And the current time is displayed correctly
    And the date and time format is consistent with user locale settings

    Examples:
      | current_date | current_time | locale_format |
      | <current_date> | <current_time> | <locale_format> |

  @verify_notifications_display
  Scenario Outline: Home Screen displays relevant user notifications
    When the system retrieves user notifications
    Then notifications are displayed prominently on the Home screen
    And notifications are relevant to the user
    And notifications are clickable and lead to the relevant pages

  Examples:
    | notifications |
    | relevant      |

  @customization-flow
  Scenario Outline: Home Screen | Verify customization of Home screen layout
    When the user selects customization options for rearranging modules
    And the user saves the changes
    And the user refreshes the Home screen
    Then the Home screen reflects the customized layout
    And the user's preferences are saved correctly

  Examples:
    | username | password |
    | user1    | pass1    |
