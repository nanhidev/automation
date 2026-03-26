
@feature_user_login
Feature: LoginScreen

  Background: 
    Given the user is on the Login Screen

  @valid-login
  Scenario Outline: Verify that a user can successfully log in using valid Organization, Email, and Password
    When I enter "<organization>" in the Organization field
    And I enter "<email>" in the Email field
    And I enter "<password>" in the Password field
    And I click the Login button
    Then the user should be redirected to the home screen
    And a welcome message should be displayed on the home screen

    Examples:
      | organization            | email                   | password          |
      | Valid Organization Name | valid.email@example.com | ValidPassword123  |

  @valid-login-button-enabled
  Scenario Outline: Verify that the Login button is enabled when all required fields are filled with valid data
    When I enter "<organization>" in the Organization field
    And I enter "<email>" in the Email field
    And I enter "<password>" in the Password field
    Then the Login button should be enabled

    Examples:
      | organization     | email              | password           |
      | MyOrganization    | user@example.com   | SecurePassword123   |

  @navigate_forgot_password
  Scenario Outline: Verify navigation to Forgot Password screen
    When the user clicks the Forgot Password link
    Then the user is redirected to the Forgot Password screen
    And the Forgot Password screen displays Organization and Email fields

  Examples:
    | action                       |
    | Launch the application URL.  |
    | Locate and click the Forgot Password link. |

@valid-password-reset
Scenario Outline: Verify Password Reset Email is Sent
  Given the user enters a valid Organization name in the Organization field
  And the user enters a valid Email address in the Email field
  When the user clicks the Send button
  Then the system displays a confirmation message indicating that the password reset email has been sent
  And the user receives a password reset email in their inbox

  Examples:
    | Organization          | Email                     |
    | ValidOrganizationName | valid.email@example.com   |

  @disabled-login-button
  Scenario Outline: Verify that the Login button remains disabled when the required fields are empty
    When I ensure all fields (Organization, Email, Password) are empty
    Then the Login button should be disabled

    Examples:
      | Organization | Email | Password |
      |              |       |          |

  @valid-login
  Scenario Outline: Verify that the user can log in successfully using valid credentials in <browser>
    When I launch the application URL in <browser>
    And I enter valid Organization <organization>
    And I enter valid Email <email>
    And I enter valid Password <password>
    And I click the Login button
    Then the user should be redirected to the home screen in <browser>
    And a welcome message is displayed on the home screen in <browser>

    Examples:
      | browser  | organization    | email               | password            |
      | Chrome   | MyOrganization   | krishna@gmail.com   | SecurePassword123   |
      | Firefox  | MyOrganization   | krishna@gmail.com   | SecurePassword123   |
      | Safari   | MyOrganization   | krishna@gmail.com   | SecurePassword123   |
      | Edge     | MyOrganization   | krishna@gmail.com   | SecurePassword123   |

  @valid-login-role-a
  Scenario Outline: Login with valid credentials for different roles
    When I enter the valid Organization "<organization>"
    And I enter the valid Email "<email>"
    And I enter the valid Password "<password>"
    And I click the Login button
    Then the user should be redirected to the home screen
    And a welcome message should be displayed on the home screen

    Examples:
      | organization  | email              | password     |
      | Organization A| userA@example.com  | Password123  |
      | Organization B| userB@example.com  | Password123  |
      | Organization C| userC@example.com  | Password123  |

  @valid-login-email
  Scenario Outline: Login with Valid Credentials Using Different Email Formats
    When I enter a valid Organization name
    And I enter a valid Email address "<email>"
    And I enter a valid Password
    And I click the Login button
    Then the user should be redirected to the home screen
    And a welcome message is displayed on the home screen

    Examples:
      | email                  |
      | email@example.com      |
      | email+test@example.com |
