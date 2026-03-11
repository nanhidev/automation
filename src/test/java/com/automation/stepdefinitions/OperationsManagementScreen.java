package com.project.stepdefinitions;

import com.1.utils.ElementUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.1.driverfactory.DriverFactory;
import com.project.pages.OperationsManagementScreenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class OperationsManagementScreen extends DriverFactory {
OperationsManagementScreenPage operationsManagementScreenPage = new OperationsManagementScreenPage(driver);
@Given("the user is on the Home screen")
public void the_user_is_on_the_home_screen() {
driver = DriverFactory.getDriver();
}
@Given("the {string} link/button is visible")
public void the_link_button_is_visible(String linkName) {
linkName + " link/button should be visible", operationsManagementScreenPage.isElementVisible(linkName);
}
@When("the user clicks on the {string} link/button")
public void the_user_clicks_on_the_link_button(String linkName) {
operationsManagementScreenPage.clickOnLink(linkName);
}
@When("waits for the page to load")
public void waits_for_the_page_to_load() {
operationsManagementScreenPage.waitForPageToLoad();
}
@Then("the user should observe a URL change")
public void the_user_should_observe_a_url_change() {
Assert.assertNotEquals("Expected URL", driver.getCurrentUrl());
}
@Then("the page title should display {string}")
public void the_page_title_should_display(String expectedTitle) {
Assert.assertEquals("Page title should match", expectedTitle, driver.getTitle());
}
@Then("the page content should be fully loaded without errors")
public void the_page_content_should_be_fully_loaded_without_errors() {
"Page content should be fully loaded", operationsManagementScreenPage.isPageContentLoaded();
}
@When("I observe the service status section on the Operations Management screen")
public void i_observe_the_service_status_section_on_the_operations_management_screen() {
operationsManagementScreenPage.observeServiceStatusSection();
}
@When("I identify the counts of active vehicles")
public void i_identify_the_counts_of_active_vehicles() {
operationsManagementScreenPage.getActiveVehicleCount();
}
@When("I identify the counts of inactive vehicles")
public void i_identify_the_counts_of_inactive_vehicles() {
operationsManagementScreenPage.getInactiveVehicleCount();
}
@When("I compare the displayed counts with the expected values from the database")
public void i_compare_the_displayed_counts_with_the_expected_values_from_the_database() {
operationsManagementScreenPage.compareCountsWithDatabase();
}
@When("I refresh the page to check for real-time updates")
public void i_refresh_the_page_to_check_for_real_time_updates() {
driver.navigate().refresh();
}
@Then("the active vehicle count is displayed correctly")
public void the_active_vehicle_count_is_displayed_correctly() {
"Active vehicle count should be correct", operationsManagementScreenPage.isActiveVehicleCountCorrect();
}
@Then("the inactive vehicle count is displayed correctly")
public void the_inactive_vehicle_count_is_displayed_correctly() {
"Inactive vehicle count should be correct", operationsManagementScreenPage.isInactiveVehicleCountCorrect();
}
@Then("the counts match the expected values from the database")
public void the_counts_match_the_expected_values_from_the_database() {
"Counts should match expected values", operationsManagementScreenPage.doCountsMatchExpected();
}
@Then("counts update correctly upon page refresh")
public void counts_update_correctly_upon_page_refresh() {
"Counts should update on refresh", operationsManagementScreenPage.doCountsUpdateOnRefresh();
}
@Given("the user locates the map on the Operations Management screen")
public void the_user_locates_the_map_on_the_operations_management_screen() {
operationsManagementScreenPage.locateMap();
}
@When("the user uses the zoom in control on the map")
public void the_user_uses_the_zoom_in_control_on_the_map() {
operationsManagementScreenPage.zoomInOnMap();
}
@Then("the map zooms in smoothly without errors")
public void the_map_zooms_in_smoothly_without_errors() {
"Map should zoom in smoothly", operationsManagementScreenPage.isMapZoomedIn();
}
@When("the user uses the zoom out control on the map")
public void the_user_uses_the_zoom_out_control_on_the_map() {
operationsManagementScreenPage.zoomOutOnMap();
}
@Then("the map zooms out smoothly without errors")
public void the_map_zooms_out_smoothly_without_errors() {
"Map should zoom out smoothly", operationsManagementScreenPage.isMapZoomedOut();
}
@Then("the map retains clarity and detail after zooming")
public void the_map_retains_clarity_and_detail_after_zooming() {
"Map should retain clarity after zooming", operationsManagementScreenPage.isMapClearAfterZoom();
}
@Then("the map functionality remains intact after multiple zoom actions")
public void the_map_functionality_remains_intact_after_multiple_zoom_actions() {
"Map functionality should remain intact", operationsManagementScreenPage.isMapFunctionalityIntact();
}
@When("I locate the dropdown sections on the Operations Management screen")
public void i_locate_the_dropdown_sections_on_the_operations_management_screen() {
operationsManagementScreenPage.locateDropdownSections();
}
@Then("the {string} section is displayed")
public void the_section_is_displayed(String section) {
section + " section should be displayed", operationsManagementScreenPage.isSectionDisplayed(section);
}
@When("the user locates the {string} dropdown section")
public void the_user_locates_the_dropdown_section(String dropdownName) {
operationsManagementScreenPage.locateDropdown(dropdownName);
}
@When("the user clicks on the {string} dropdown to expand it")
public void the_user_clicks_on_the_dropdown_to_expand_it(String dropdownName) {
operationsManagementScreenPage.clickOnDropdown(dropdownName);
}
@When("the user observes the alerts displayed in the dropdown")
public void the_user_observes_the_alerts_displayed_in_the_dropdown() {
operationsManagementScreenPage.observeAlertsInDropdown();
}
@Then("the alerts displayed match the expected alerts")
public void the_alerts_displayed_match_the_expected_alerts() {
"Alerts should match expected alerts", operationsManagementScreenPage.doAlertsMatchExpected();
}
@Then("the number of alerts matches the expected count")
public void the_number_of_alerts_matches_the_expected_count() {
"Alert count should match expected count", operationsManagementScreenPage.isAlertCountCorrect();
}
@When("the user clicks on an alert to view its details")
public void the_user_clicks_on_an_alert_to_view_its_details() {
operationsManagementScreenPage.clickOnAlert();
}
@Then("the alert details are displayed correctly")
public void the_alert_details_are_displayed_correctly() {
"Alert details should be displayed correctly", operationsManagementScreenPage.areAlertDetailsCorrect();
}
@Given("the user locates the dropdown for driver activity")
public void the_user_locates_the_dropdown_for_driver_activity() {
operationsManagementScreenPage.locateDriverActivityDropdown();
}
@When("the user selects a driver from the dropdown")
public void the_user_selects_a_driver_from_the_dropdown() {
operationsManagementScreenPage.selectDriverFromDropdown();
}
// DUPLICATE: @When("the user clicks on the {string} button")
public void the_user_clicks_on_the_button(String buttonName) {
operationsManagementScreenPage.clickOnButton(buttonName);
}
@Then("the driver activity details are displayed correctly")
public void the_driver_activity_details_are_displayed_correctly() {
"Driver activity details should be displayed correctly", operationsManagementScreenPage.areDriverActivityDetailsCorrect();
}
@Then("the details match the expected data from the database")
public void the_details_match_the_expected_data_from_the_database() {
"Details should match expected data", operationsManagementScreenPage.doDetailsMatchExpected();
}
@Then("additional actions are available for the user to perform")
public void additional_actions_are_available_for_the_user_to_perform() {
"Additional actions should be available", operationsManagementScreenPage.areAdditionalActionsAvailable();
}
@Then("the user can navigate back to the main Operations Management screen")
public void the_user_can_navigate_back_to_the_main_operations_management_screen() {
operationsManagementScreenPage.navigateBackToMainScreen();
}
//    @Given("the user locates the {string} dropdown section")
@When("the user clicks on the dropdown to expand it")
public void the_user_clicks_on_the_dropdown_to_expand_it() {
operationsManagementScreenPage.expandDropdown();
}
@When("the user selects the filter option for inactive vehicles")
public void the_user_selects_the_filter_option_for_inactive_vehicles() {
operationsManagementScreenPage.selectInactiveVehiclesFilter();
}
@Then("the list of inactive vehicles should be displayed correctly")
public void the_list_of_inactive_vehicles_should_be_displayed_correctly() {
"List of inactive vehicles should be displayed", operationsManagementScreenPage.isInactiveVehiclesListDisplayed();
}
@Then("the displayed vehicles should match the expected inactive vehicles from the database")
public void the_displayed_vehicles_should_match_the_expected_inactive_vehicles_from_the_database() {
"Displayed vehicles should match expected inactive vehicles", operationsManagementScreenPage.doDisplayedVehiclesMatchExpected();
}
@Then("additional actions should be available for the user to perform on inactive vehicles")
public void additional_actions_should_be_available_for_the_user_to_perform_on_inactive_vehicles() {
"Additional actions should be available for inactive vehicles", operationsManagementScreenPage.areActionsAvailableForInactiveVehicles();
}
@Given("the {string} button is visible and clickable")
public void the_button_is_visible_and_clickable(String buttonName) {
buttonName + " button should be visible and clickable", operationsManagementScreenPage.isButtonVisibleAndClickable(buttonName);
}
//    @When("the user clicks on the {string} button")
@When("the user confirms the logout action if prompted")
public void the_user_confirms_the_logout_action_if_prompted() {
operationsManagementScreenPage.confirmLogoutIfPrompted();
}
@Then("the user should be logged out successfully")
public void the_user_should_be_logged_out_successfully() {
"User should be logged out successfully", operationsManagementScreenPage.isUserLoggedOut();
}
@Then("the system redirects to the login page after logout")
public void the_system_redirects_to_the_login_page_after_logout() {
Assert.assertEquals("Expected Login URL", driver.getCurrentUrl());
}
@Then("the user cannot access the Operations Management screen without logging in again")
public void the_user_cannot_access_the_operations_management_screen_without_logging_in_again() {
"User should not access Operations Management screen without logging in", operationsManagementScreenPage.isAccessToOperationsManagementScreenAllowed();
}

@When("the user clicks on the alerts dropdown to expit")
public void the_user_clicks_on_the_alerts_dropdown_to_expit() {
operationsManagementScreenPage.clicksOnAlertsDropdown();
}
@When("the user clicks on the logout button")
public void the_user_clicks_on_the_logout_button() {
operationsManagementScreenPage.clicksOnLogoutButton();
}
@Given("the user locates the alerts dropdown section")
public void the_user_locates_the_alerts_dropdown_section() {
operationsManagementScreenPage.locatesAlertsDropdownSection();
}
@When("the user clicks on the operations management link/button")
public void the_user_clicks_on_the_operations_management_link_button() {
operationsManagementScreenPage.clicksOnOperationsManagementLink();
}
@Then("the page title should display operations management / citylink shuttle")
public void the_page_title_should_display_operations_management_citylink_shuttle() {
String expectedTitle = "operations management / citylink shuttle";
String actualTitle = driver.getTitle();
Assert.assertEquals(expectedTitle, actualTitle);
}
@When("the user clicks on the view details button")
public void the_user_clicks_on_the_view_details_button() {
operationsManagementScreenPage.clicksOnViewDetailsButton();
}
}