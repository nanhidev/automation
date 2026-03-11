
@feature_user_login
Feature: LoginScreen

  Background: 
    Given the user is on the Login Screen

  @valid-login
  Scenario Outline: Verify that a user can successfully log in using valid Organization, Email, and Password
    When the user enters <organization> in the Organization field
    And the user enters <email> in the Email field
    And the user enters <password> in the Password field
    And the user clicks the Login button
    Then the user should be redirected to the home screen
    And a welcome message should be displayed on the home screen

    Examples:
      | organization      | email              | password            |
      | MyOrganization     | user@example.com   | SecurePassword123   |

@valid_login
Scenario Outline: Verify that the Login button is enabled when all required fields are filled with valid data
  When I enter "<organization>" in the Organization field
  And I enter "<email>" in the Email field
  And I enter "<password>" in the Password field
  Then the Login button should be enabled

Examples:
  | organization     | email              | password            |
  | MyOrganization    | user@example.com   | SecurePassword123   |

@navigate_forgot_password
Scenario Outline: Verify User Can Navigate to Forgot Password Screen
  When the user clicks the Forgot Password link
  Then the user should be redirected to the Forgot Password screen
  And the Forgot Password screen displays Organization and Email fields

Examples:
  | action                       |
  | Launch the application URL.  |

@valid-password-reset
Scenario Outline: Verify that the user can successfully send a password reset email
  Given the user enters a valid Organization name in the Organization field
  And the user enters a valid Email address in the Email field
  When the user clicks the Send button
  Then the system processes the request and displays a confirmation message
  And the user receives a password reset email in their inbox

Examples:
  | Organization         | Email                   |
  | ValidOrganizationName | valid.email@example.com |

@disabled-login-button
Scenario Outline: Verify that the Login button remains disabled when Password is empty
  When I enter "<organization>" in the Organization field
  And I enter "<email>" in the Email field
  And I leave the Password field empty
  Then the Login button remains disabled

Examples:
  | organization            | email                   |
  | valid_organization_name  | valid_email@example.com |

  @login-disabled
  Scenario Outline: Verify that the Login button remains disabled
    When I enter a valid Organization name in the Organization field
    And I leave the Email field empty
    And I enter a valid Password in the Password field
    Then the Login button should remain disabled

    Examples:
      | Organization      | Email | Password       |
      | validOrgName     |       | validPassword   |

  @login_button_disabled
  Scenario Outline: Verify that the Login button remains disabled when only Email and Password are filled, but Organization is empty
    When the user leaves the Organization field empty
    And the user enters <email> in the Email field
    And the user enters <password> in the Password field
    Then the Login button remains disabled

    Examples:
      | email               | password          |
      | krishna@gmail.com   | ValidPassword123  |

  @ui-elements-verification
  Scenario Outline: Verify all required UI elements are present on the login screen
    Then the Organization field is displayed
    And the Email field is displayed
    And the Password field is displayed
    And the Forgot Password link is displayed
    And the Login button is displayed

  Examples:
    | organization_field | email_field | password_field | forgot_password_link | login_button |
    | displayed          | displayed    | displayed      | displayed           | displayed     |

  @ui-elements-check
  Scenario Outline: Verify required UI elements on Forgot Password screen
    When the user clicks the Forgot Password link
    Then the Organization field should be displayed
    And the Email field should be displayed
    And the Send button should be displayed

  Examples:
    |   |
    |   |

  @invalid-organization
  Scenario Outline: Verify that the Login button remains disabled after entering an invalid Organization
    When I enter <organization> in the Organization field
    And I enter <email> in the Email field
    And I enter <password> in the Password field
    Then the Login button should remain disabled

    Examples:
      | organization            | email                   | password       |
      | invalid_organization_name | valid_email@example.com | valid_password  |
