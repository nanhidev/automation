package com.project.stepdefinitions;

import com.1.utils.ElementUtils;
import org.junit.Assert;
import com.1.driverfactory.DriverFactory;
import com.project.pages.HomeScreenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class HomeScreen extends DriverFactory {
HomeScreenPage homeScreenPage = new HomeScreenPage(driver);
@Given("the user is on the Login Page")
public void the_user_is_on_the_login_page() {
homeScreenPage.navigateToLoginPage();
}
@When("I enter {string}")
public void i_enter_username(String username) {
homeScreenPage.enterUsername(username);
}
// DUPLICATE: @When("I enter {string}")
public void i_enter_password(String password) {
homeScreenPage.enterPassword(password);
}
@When("the user clicks the Login button")
public void the_user_clicks_the_login_button() {
homeScreenPage.clickLoginButton();
}
@Then("the user should be redirected to the Home screen")
public void the_user_should_be_redirected_to_the_home_screen() {
"Home screen is not displayed", homeScreenPage.isHomeScreenDisplayed();
}
@Then("the URL of the Home screen is displayed correctly")
public void the_url_of_the_home_screen_is_displayed_correctly() {
Assert.assertEquals("Expected URL does not match", "Expected URL", homeScreenPage.getCurrentUrl());
}
@Then("no error messages are shown")
public void no_error_messages_are_shown() {
"Error message is displayed", homeScreenPage.isErrorMessageDisplayed();
}
@Then("the Home screen loads within an acceptable time frame")
public void the_home_screen_loads_within_an_acceptable_time_frame() {
"Home screen did not load within the acceptable time frame", homeScreenPage.isHomeScreenLoadedWithinTime();
}
@When("the system retrieves the username of the logged-in user")
public void the_system_retrieves_the_username_of_the_logged_in_user() {
homeScreenPage.retrieveLoggedInUsername();
}
@When("the system constructs the greeting message")
public void the_system_constructs_the_greeting_message() {
homeScreenPage.constructGreetingMessage();
}
@When("the system displays the greeting message on the Home screen")
public void the_system_displays_the_greeting_message_on_the_home_screen() {
homeScreenPage.displayGreetingMessage();
}
@Then("the greeting text is displayed as {string}")
public void the_greeting_text_is_displayed_as(String expectedGreeting) {
Assert.assertEquals("Greeting text does not match", expectedGreeting, homeScreenPage.getGreetingText());
}
@Then("the username is correctly displayed in the greeting")
public void the_username_is_correctly_displayed_in_the_greeting() {
"Username is not displayed correctly", homeScreenPage.isUsernameDisplayedCorrectly();
}
@Then("the greeting text is prominently visible")
public void the_greeting_text_is_prominently_visible() {
"Greeting text is not prominently visible", homeScreenPage.isGreetingTextVisible();
}
@When("the user visually inspects the Home screen")
public void the_user_visually_inspects_the_home_screen() {
homeScreenPage.inspectHomeScreen();
}
@Then("the {string} module is visible")
public void the_module_is_visible(String module) {
module + " module is not visible", homeScreenPage.isModuleVisible(module);
}
@Then("all modules are clickable and lead to the respective pages")
public void all_modules_are_clickable_and_lead_to_the_respective_pages() {
"Not all modules are clickable", homeScreenPage.areModulesClickable();
}
@When("the system retrieves user profile information")
public void the_system_retrieves_user_profile_information() {
homeScreenPage.retrieveUserProfileInformation();
}
@Then("the user's name is displayed correctly")
public void the_users_name_is_displayed_correctly() {
"User's name is not displayed correctly", homeScreenPage.isUserNameDisplayedCorrectly();
}
@Then("the user's email address is displayed correctly")
public void the_users_email_address_is_displayed_correctly() {
"User's email address is not displayed correctly", homeScreenPage.isUserEmailDisplayedCorrectly();
}
@Then("the user's profile picture is displayed")
public void the_users_profile_picture_is_displayed() {
"User's profile picture is not displayed", homeScreenPage.isUserProfilePictureDisplayed();
}
@Then("the user's role or designation is displayed")
public void the_users_role_or_designation_is_displayed() {
"User's role or designation is not displayed", homeScreenPage.isUserRoleDisplayed();
}
@When("the user clicks on {string} module")
public void the_user_clicks_on_module(String module) {
homeScreenPage.clickModule(module);
}
@Then("the user is navigated to the {string} page")
public void the_user_is_navigated_to_the_page(String module) {
"User is not navigated to " + module + " page", homeScreenPage.isNavigatedToModulePage(module);
}
@Given("the user updates their profile information with name {string} and email {string}")
public void the_user_updates_their_profile_information_with_name_and_email(String name, String email) {
homeScreenPage.updateProfileInformation(name, email);
}
@When("the user refreshes the Home screen")
public void the_user_refreshes_the_home_screen() {
homeScreenPage.refreshHomeScreen();
}
@Then("the updated profile information should be displayed on the Home screen")
public void the_updated_profile_information_should_be_displayed_on_the_home_screen() {
"Updated profile information is not displayed", homeScreenPage.isUpdatedProfileInformationDisplayed();
}
@Then("no old information should be visible")
public void no_old_information_should_be_visible() {
"Old information is still visible", homeScreenPage.isOldInformationVisible();
}
@When("the user clicks on the {string} button")
public void the_user_clicks_on_the_button(String action) {
homeScreenPage.clickLogoutButton();
}
@Then("the user should be redirected to the login page")
public void the_user_should_be_redirected_to_the_login_page() {
"User is not redirected to the login page", homeScreenPage.isRedirectedToLoginPage();
}
@Then("the user should no longer be able to access the Home screen")
public void the_user_should_no_longer_be_able_to_access_the_home_screen() {
"User can still access the Home screen", homeScreenPage.isHomeScreenAccessible();
}
@Then("a confirmation message should be displayed indicating successful logout")
public void a_confirmation_message_should_be_displayed_indicating_successful_logout() {
"Logout confirmation message is not displayed", homeScreenPage.isLogoutConfirmationDisplayed();
}
@When("the system retrieves the current date and time")
public void the_system_retrieves_the_current_date_and_time() {
homeScreenPage.retrieveCurrentDateTime();
}
@Then("the current date is displayed correctly")
public void the_current_date_is_displayed_correctly() {
"Current date is not displayed correctly", homeScreenPage.isCurrentDateDisplayedCorrectly();
}
@Then("the current time is displayed correctly")
public void the_current_time_is_displayed_correctly() {
"Current time is not displayed correctly", homeScreenPage.isCurrentTimeDisplayedCorrectly();
}
@Then("the date and time format is consistent with user locale settings")
public void the_date_and_time_format_is_consistent_with_user_locale_settings() {
"Date and time format is not consistent with user locale settings", homeScreenPage.isDateTimeFormatConsistent();
}
@When("the system retrieves user notifications")
public void the_system_retrieves_user_notifications() {
homeScreenPage.retrieveUserNotifications();
}
@Then("notifications are displayed prominently on the Home screen")
public void notifications_are_displayed_prominently_on_the_home_screen() {
"Notifications are not displayed prominently", homeScreenPage.areNotificationsDisplayedProminently();
}
@Then("notifications are relevant to the user")
public void notifications_are_relevant_to_the_user() {
"Notifications are not relevant to the user", homeScreenPage.areNotificationsRelevant();
}
@Then("notifications are clickable and lead to the relevant pages")
public void notifications_are_clickable_and_lead_to_the_relevant_pages() {
"Notifications are not clickable", homeScreenPage.areNotificationsClickable();
}
@When("the user selects customization options for rearranging modules")
public void the_user_selects_customization_options_for_rearranging_modules() {
homeScreenPage.selectCustomizationOptions();
}
@Then("the Home screen reflects the customized layout")
public void the_home_screen_reflects_the_customized_layout() {
"Home screen does not reflect the customized layout", homeScreenPage.isCustomizedLayoutReflected();
}
@Then("the user's preferences are saved correctly")
public void the_users_preferences_are_saved_correctly() {
"User's preferences are not saved correctly", homeScreenPage.isUserPreferencesSaved();
}

@When("the user saves the changes")
public void the_user_saves_the_changes() {
homeScreenPage.saveChanges();
}
@Then("the greeting text is displayed as hello {string}, what would you like to do today?")
public void the_greeting_text_is_displayed_as_hello(String userName) {
String expectedGreeting = "hello " + userName + ", what would you like to do today?";
String actualGreeting = homeScreenPage.getGreetingText();
Assert.assertEquals(expectedGreeting, actualGreeting);
}
@And("the user clicks on the logout button")
public void the_user_clicks_on_the_logout_button() {
homeScreenPage.clicksLogoutButton();
}
}