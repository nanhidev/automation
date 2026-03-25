
@feature_upload_new_candidate_profile
Feature: UploadNewCandidateProfile

  Background: 
    Given the user is logged in as a recruiter

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    Given the user is on the Profile section
    When the user clicks on the upload icon
    And the user browses and selects a valid candidate profile file
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message should be displayed to the user

  Examples:
    | valid_candidate_profile_file |
    | valid_candidate_profile.pdf   |
    | valid_candidate_profile.docx  |

@valid-profile-upload
Scenario Outline: Upload New Candidate Profile
  When the user clicks on the upload (cloud) icon
  And the user browses and selects the <candidate_profile_file>
  And the user clicks on the Upload button
  Then the user should see a confirmation message for the <upload_number> upload
  And the user waits for the upload to complete
  Examples:
    | candidate_profile_file               | upload_number |
    | first valid candidate profile file    | first         |
    | second valid candidate profile file   | second        |

Then both profiles should be listed in the Profile Section

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a valid candidate profile file of <file_size>
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message is displayed to the user

    Examples:
      | file_size |
      | 2MB       |

  @long-filename-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a candidate profile file with a long filename
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message is displayed to the user

    Examples:
      | long_filename                                                        |
      | This_is_a_very_long_filename_for_a_candidate_profile_document_that_exceeds_normal_length.pdf |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a valid candidate profile file in .txt format
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message is displayed to the user

  Examples:
    | candidate_profile_file |
    | valid_candidate_profile.txt |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload icon
    And the user browses and selects the candidate profile file named "<file_name>"
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then the user should see a success confirmation message

    Examples:
      | file_name                       |
      | Valid_Candidate_Profile.pdf     |

  @valid-upload
  Scenario Outline: Upload New Candidate Profile
    When the user clicks on the upload (cloud) icon
    And the user browses and selects a candidate profile file named "<candidate_profile_file>"
    And the user clicks on the Upload button
    And the user waits for the upload process to complete
    Then a success confirmation message is displayed to the user

    Examples:
      | candidate_profile_file       |
      | CandidateProfile             |
