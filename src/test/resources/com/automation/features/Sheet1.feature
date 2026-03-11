
Feature: Sheet1
  @feature_user_login
  Background: 
    Given the user is on the Job Opening screen

  @open-create-job-form
  Scenario Outline: Open Create New Job Opening Form
    When the user locates the Add Job Opening button
    And the user clicks on the Add Job Opening button
    Then the Create New Job Opening form is displayed
    And the form contains fields for job title, description, department, and other relevant information
    And the form displays Save and Cancel buttons

  Examples:
    | action                       |
    | Navigate to the Job Opening screen |
    | Locate the Add Job Opening button   |
    | Click on the Add Job Opening button  |

  @feature_create_new_job_opening
  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    When I fill in the job title field with <job_title>
    And I fill in the job description field with <job_description>
    And I select <department> from the department dropdown
    And I fill in any other required fields
    Then the Save button should be enabled
    And the Cancel button should remain enabled

    Examples:
      | job_title          | job_description                                | department   |
      | Software Engineer   | Develop and maintain software applications.    | Engineering   |

  @feature_user_login
  @cancel_button_functionality
  Scenario Outline: Open Create New Job Opening Form
    When the user clicks on the Cancel button
    Then the Create New Job Opening form is closed
    And the user is returned to the Job Opening screen without any data saved

  Examples:
    | action                     |
    | Click on the Cancel button |

  @feature_create_new_job_opening
  @validation-required-fields
  Scenario Outline: Open Create New Job Opening Form
    When I leave all required fields empty
    And I click on the Save button
    Then validation messages should appear next to each required field indicating they must be filled
    And the Save button should remain disabled

  Examples:
    | <required_field> |
    | field1          |
    | field2          |
    | field3          |

  @feature_create_new_job_opening
  @validation-error
  Scenario Outline: Open Create New Job Opening Form
    Given the user fills in the job title field with <job_title>
    And the user leaves the job description field empty
    When the user clicks on the Save button
    And the user corrects the job description field by entering <job_description>
    When the user clicks on the Save button again
    Then the job title field retains the previously entered title
    And the job description field shows the newly entered description
    And the form saves the job opening successfully

    Examples:
      | job_title              | job_description                                                                                     |
      | Software Engineer      | A dynamic role requiring expertise in software development and problem-solving skills.             |

  @feature_create_new_job_opening
  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    Given the user has filled in the job title field with <job_title>
    And the user has filled in the job description field with <job_description>
    And the user has selected <department> from the department dropdown
    And the user has filled in all other required fields
    When the user clicks on the Save button
    Then the job opening should be saved successfully
    And the user should be redirected to the Job Opening screen
    And a success message should be displayed confirming the job opening was created

    Examples:
      | job_title         | job_description                                                                                     | department   |
      | Software Engineer  | Develop and maintain software applications that meet user needs and business requirements. | Engineering   |

  @feature_edit_job_opening
  @edit-job-opening
  Scenario Outline: Open Create New Job Opening Form
    Given the user locates the created job opening
    When the user clicks on the Edit button for the job opening
    And the user modifies the job title or description
    And the user clicks on the Save button
    Then the job opening is updated successfully
    And the user is redirected to the Job Opening screen
    And a success message is displayed confirming the job opening was updated

  Examples:
    | job_title          | job_description       |
    | <job_title>       | <job_description>     |

  @feature_create_new_job_opening
  @save_job_opening
  Scenario Outline: Open Create New Job Opening Form
    Given the user fills in the job title field with <job_title>
    And the user fills in the job description field with <job_description>
    And the user leaves optional fields empty
    When the user clicks on the Save button
    Then the job opening is saved successfully
    And the user is redirected to the Job Opening screen
    And a success message is displayed confirming the job opening was created

    Examples:
      | job_title          | job_description                                                                                     |
      | Software Engineer   | Develop and maintain software applications, ensuring high performance and responsiveness.          |

  @feature_create_new_job_opening
  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    Given the user fills in the job title field with <job_title>
    And the user fills in the job description field with <job_description>
    And the user selects <department> from the department dropdown
    And the user fills in the salary range with <salary_range>
    And the user selects <job_type> as the job type
    When the user clicks on the Save button
    Then the job opening is saved successfully
    And the user is redirected to the Job Opening screen
    And a success message is displayed confirming the job opening was created

    Examples:
      | job_title          | job_description                                   | department  | salary_range | job_type  |
      | Software Engineer  | Develop and maintain software applications.      | Engineering  | 60000-80000  | Full-time |

  @feature_create_job_opening
  @valid-job-opening
  Scenario Outline: Open Create New Job Opening Form
    Given the user fills in the job title field with <job_title>
    And the user fills in the job description field with <job_description>
    And the user selects <department> from the department dropdown
    And the user fills in the optional field with <optional_field_1>
    And the user fills in the optional field with <optional_field_2>
    When the user clicks on the Save button
    Then the job opening is saved successfully
    And the user is redirected to the Job Opening screen
    And a success message is displayed confirming the job opening was created

  Examples:
    | job_title          | job_description                                   | department  | optional_field_1 | optional_field_2 |
    | Software Engineer   | Develop and maintain software applications.      | Engineering  | Remote           | Full-time        |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the recruiter clicks on the upload (cloud) icon
    And the recruiter browses and selects a valid candidate profile file
    And the recruiter clicks on the Upload button
    And the recruiter waits for the upload process to complete
    Then a success confirmation message is displayed to the user

  Examples:
    | candidate_profile_file |
    | valid_candidate_profile.pdf |
    | valid_candidate_profile.docx |

  @feature_user_login
  @valid-profile-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects the <candidate_profile_file>
    And the user clicks on the Upload button
    Then the <upload_result> with a confirmation message
    And both profiles are listed in the Profile section

  Examples:
    | candidate_profile_file                     | upload_result                                      |
    | the first valid candidate profile file     | the first profile uploads successfully            |
    | the second valid candidate profile file    | the second profile upload process initiates without errors |

  @feature_upload_candidate_profile
  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the recruiter clicks on the upload (cloud) icon
    And the recruiter browses and selects a valid candidate profile file in <file_format> format
    And the recruiter clicks on the Upload button
    And the recruiter waits for the upload process to complete
    Then a success confirmation message is displayed to the user

    Examples:
      | file_format |
      | TXT         |

  @upload_long_filename
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects the candidate profile file "<filename>"
    And the user clicks the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message should be displayed to the user

    Examples:
      | filename                                                        |
      | This_is_a_very_long_filename_for_a_candidate_profile_document.pdf |

  @feature_upload_candidate_profile
  @upload-valid-file
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a candidate profile file in RTF format
    And the user clicks on the Upload button
    Then a success confirmation message is displayed to the user

  Examples:
    | file_format |
    | RTF         |

  @successful-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects a candidate profile file with a short filename
    And the user clicks the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message is displayed to the user

    Examples:
      | filename       |
      | Resume.pdf     |

  @valid-profile-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a candidate profile file with a filename "<filename>"
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message is displayed to the user

    Examples:
      | filename            |
      | 候选人简历.pdf      |

  @upload-profile
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a candidate profile file with underscores in the filename
    And the user clicks the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message is displayed to the user

    Examples:
      | filename                     |
      | John_Doe_Resume.pdf         |
