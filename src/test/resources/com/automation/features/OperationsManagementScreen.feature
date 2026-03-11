
@feature_operations_management
Feature: OperationsManagementScreen

Background: 
  Given the user is on the Home screen

@navigate_operations_management
Scenario Outline: Verify that a logged-in user can successfully navigate to the Operations Management module
  Given the "Operations Management" link/button is visible
  When the user clicks on the "Operations Management" link/button
  And waits for the page to load
  Then the user should observe a URL change
  And the page title should display "Operations Management / CityLink Shuttle"
  And the page content should be fully loaded without errors

Examples:
  |  |
  |  |

@verify_vehicle_counts
Scenario Outline: Verify that the Operations Management screen displays the correct counts of active and inactive vehicles
  When I observe the service status section on the Operations Management screen
  And I identify the counts of active vehicles
  And I identify the counts of inactive vehicles
  And I compare the displayed counts with the expected values from the database
  And I refresh the page to check for real-time updates
  Then the active vehicle count is displayed correctly
  And the inactive vehicle count is displayed correctly
  And the counts match the expected values from the database
  And counts update correctly upon page refresh

Examples:
  | active_vehicle_count | inactive_vehicle_count | expected_active_count | expected_inactive_count |
  | <active_vehicle_count> | <inactive_vehicle_count> | <expected_active_count> | <expected_inactive_count> |

  @zoom-map
  Scenario Outline: Verify that the map on the Operations Management screen allows users to zoom in and out effectively
    Given the user locates the map on the Operations Management screen
    When the user uses the zoom in control on the map
    Then the map zooms in smoothly without errors
    When the user uses the zoom out control on the map
    Then the map zooms out smoothly without errors
    Then the map retains clarity and detail after zooming
    Then the map functionality remains intact after multiple zoom actions

  Examples:
    | action          |
    | zoom in        |
    | zoom out       |

@verify_dropdown_sections
Scenario Outline: Verify that all dropdown sections are displayed on the Operations Management screen
  When I locate the dropdown sections on the Operations Management screen
  Then the "<section>" section is displayed

Examples:
  | section                          |
  | Alerts                           |
  | On Break                         |
  | Doing Well                       |
  | Planned for Current Operations    |
  | Inactive vehicles                |

  @validate_alerts_dropdown
  Scenario Outline: Verify that the Alerts dropdown displays relevant alerts
    When the user locates the "Alerts" dropdown section
    And the user clicks on the "Alerts" dropdown to expand it
    And the user observes the alerts displayed in the dropdown
    Then the alerts displayed match the expected alerts
    And the number of alerts matches the expected count
    And the user clicks on an alert to view its details
    Then the alert details are displayed correctly

  Examples:
    | expected alerts | expected count |
    | Alert 1        | 3              |
    | Alert 2        | 3              |
    | Alert 3        | 3              |

  @view_driver_activity
  Scenario Outline: Verify Driver Activity Details
    Given the user locates the dropdown for driver activity
    When the user selects a driver from the dropdown
    And the user clicks on the "View Details" button
    Then the driver activity details are displayed correctly
    And the details match the expected data from the database
    And additional actions are available for the user to perform
    And the user can navigate back to the main Operations Management screen

  Examples:
    | driver_name |
    | Driver A    |
    | Driver B    |
    | Driver C    |

  @filter_inactive_vehicles
  Scenario Outline: Verify that a user can filter and view inactive vehicles from the dropdown section
    Given the user locates the "Inactive vehicles" dropdown section
    When the user clicks on the dropdown to expand it
    And the user selects the filter option for inactive vehicles
    Then the list of inactive vehicles should be displayed correctly
    And the displayed vehicles should match the expected inactive vehicles from the database
    And additional actions should be available for the user to perform on inactive vehicles

  Examples:
    | inactive_vehicles |
    | Vehicle A        |
    | Vehicle B        |
    | Vehicle C        |

  @successful_logout
  Scenario Outline: Verify that a user can log out successfully from the Operations Management screen
    Given the "Logout" button is visible and clickable
    When the user clicks on the "Logout" button
    And the user confirms the logout action if prompted
    Then the user should be logged out successfully
    And the system redirects to the login page after logout
    And the user cannot access the Operations Management screen without logging in again

  Examples:
    | Logout Button Visibility | Logout Confirmation |
    | visible and clickable    | confirmed           |
