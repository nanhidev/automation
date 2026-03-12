package com.project.stepdefinitions;

import com.project.driverfactory.DriverFactory;
import com.project.pages.HomeScreenPage;
import com.project.playwright.pages.PlaywrightHomeScreenPage;
import com.project.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomeScreen extends DriverFactory {
    HomeScreenPage homeScreenPage;
    PlaywrightHomeScreenPage playwrightHomeScreenPage;
    boolean isPlaywright;

    public HomeScreen() {
        isPlaywright = ConfigReader.getInstance().isPlaywrightEnabled();
        if (isPlaywright) {
            this.playwrightHomeScreenPage = new PlaywrightHomeScreenPage(DriverFactory.getPlaywrightPage());
        } else {
            this.homeScreenPage = new HomeScreenPage(DriverFactory.getDriver());
        }
    }

    @Given("the user is on the Login Page")
    public void the_user_is_on_the_login_page() {
        if (isPlaywright) {
            playwrightHomeScreenPage.navigateToLoginPage();
        } else {
            homeScreenPage.navigateToLoginPage();
        }
    }

    @When("I enter username {string}")
    public void i_enter_username(String username) {
        if (isPlaywright) {
            playwrightHomeScreenPage.enterUsername(username);
        } else {
            homeScreenPage.enterUsername(username);
        }
    }

    @When("I enter password {string}")
    public void i_enter_password(String password) {
        if (isPlaywright) {
            playwrightHomeScreenPage.enterPassword(password);
        } else {
            homeScreenPage.enterPassword(password);
        }
    }

    @When("the user clicks the Login button")
    public void the_user_clicks_the_login_button() {
        if (isPlaywright) {
            playwrightHomeScreenPage.clickLoginButton();
        } else {
            homeScreenPage.clickLoginButton();
        }
    }

    @Then("the user should be redirected to the Home screen")
    public void the_user_should_be_redirected_to_the_home_screen() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.isHomeScreenDisplayed(), "Home screen is not displayed");
        } else {
            Assert.assertTrue(homeScreenPage.isHomeScreenDisplayed(), "Home screen is not displayed");
        }
    }

    @Then("the URL of the Home screen is displayed correctly")
    public void the_url_of_the_home_screen_is_displayed_correctly() {
        if (isPlaywright) {
            Assert.assertEquals(playwrightHomeScreenPage.getCurrentUrl(), "Expected URL",
                    "Expected URL does not match");
        } else {
            Assert.assertEquals(homeScreenPage.getCurrentUrl(), "Expected URL", "Expected URL does not match");
        }
    }

    @Then("no error messages are shown")
    public void no_error_messages_are_shown() {
        if (isPlaywright) {
            Assert.assertFalse(playwrightHomeScreenPage.isErrorMessageDisplayed(), "Error message is displayed");
        } else {
            Assert.assertFalse(homeScreenPage.isErrorMessageDisplayed(), "Error message is displayed");
        }
    }

    @Then("the Home screen loads within an acceptable time frame")
    public void the_home_screen_loads_within_an_acceptable_time_frame() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.isHomeScreenLoadedWithinTime(),
                    "Home screen did not load within the acceptable time frame");
        } else {
            Assert.assertTrue(homeScreenPage.isHomeScreenLoadedWithinTime(),
                    "Home screen did not load within the acceptable time frame");
        }
    }

    @When("the system retrieves the username of the logged-in user")
    public void the_system_retrieves_the_username_of_the_logged_in_user() {
        if (isPlaywright) {
            playwrightHomeScreenPage.retrieveLoggedInUsername();
        } else {
            homeScreenPage.retrieveLoggedInUsername();
        }
    }

    @When("the system constructs the greeting message")
    public void the_system_constructs_the_greeting_message() {
        if (isPlaywright) {
            playwrightHomeScreenPage.constructGreetingMessage();
        } else {
            homeScreenPage.constructGreetingMessage();
        }
    }

    @When("the system displays the greeting message on the Home screen")
    public void the_system_displays_the_greeting_message_on_the_home_screen() {
        if (isPlaywright) {
            playwrightHomeScreenPage.displayGreetingMessage();
        } else {
            homeScreenPage.displayGreetingMessage();
        }
    }

    @Then("the greeting text is displayed as {string}")
    public void the_greeting_text_is_displayed_as(String expectedGreeting) {
        if (isPlaywright) {
            Assert.assertEquals(playwrightHomeScreenPage.getGreetingText(), expectedGreeting,
                    "Greeting text does not match");
        } else {
            Assert.assertEquals(homeScreenPage.getGreetingText(), expectedGreeting, "Greeting text does not match");
        }
    }

    @Then("the username is correctly displayed in the greeting")
    public void the_username_is_correctly_displayed_in_the_greeting() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.isUsernameDisplayedCorrectly(),
                    "Username is not displayed correctly");
        } else {
            Assert.assertTrue(homeScreenPage.isUsernameDisplayedCorrectly(), "Username is not displayed correctly");
        }
    }

    @Then("the greeting text is prominently visible")
    public void the_greeting_text_is_prominently_visible() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.isGreetingTextVisible(),
                    "Greeting text is not prominently visible");
        } else {
            Assert.assertTrue(homeScreenPage.isGreetingTextVisible(), "Greeting text is not prominently visible");
        }
    }

    @When("the user visually inspects the Home screen")
    public void the_user_visually_inspects_the_home_screen() {
        if (isPlaywright) {
            playwrightHomeScreenPage.inspectHomeScreen();
        } else {
            homeScreenPage.inspectHomeScreen();
        }
    }

    @Then("the {string} module is visible")
    public void the_module_is_visible(String module) {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.isModuleVisible(module), module + " module is not visible");
        } else {
            Assert.assertTrue(homeScreenPage.isModuleVisible(module), module + " module is not visible");
        }
    }

    @Then("all modules are clickable and lead to the respective pages")
    public void all_modules_are_clickable_and_lead_to_the_respective_pages() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.areModulesClickable(), "Not all modules are clickable");
        } else {
            Assert.assertTrue(homeScreenPage.areModulesClickable(), "Not all modules are clickable");
        }
    }

    @When("the system retrieves user profile information")
    public void the_system_retrieves_user_profile_information() {
        if (isPlaywright) {
            playwrightHomeScreenPage.retrieveUserProfileInformation();
        } else {
            homeScreenPage.retrieveUserProfileInformation();
        }
    }

    @Then("the user's name is displayed correctly")
    public void the_users_name_is_displayed_correctly() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.isUserNameDisplayedCorrectly(),
                    "User's name is not displayed correctly");
        } else {
            Assert.assertTrue(homeScreenPage.isUserNameDisplayedCorrectly(), "User's name is not displayed correctly");
        }
    }

    @Then("the user's email address is displayed correctly")
    public void the_users_email_address_is_displayed_correctly() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.isUserEmailDisplayedCorrectly(),
                    "User's email address is not displayed correctly");
        } else {
            Assert.assertTrue(homeScreenPage.isUserEmailDisplayedCorrectly(),
                    "User's email address is not displayed correctly");
        }
    }

    @Then("the user's profile picture is displayed")
    public void the_users_profile_picture_is_displayed() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.isUserProfilePictureDisplayed(),
                    "User's profile picture is not displayed");
        } else {
            Assert.assertTrue(homeScreenPage.isUserProfilePictureDisplayed(),
                    "User's profile picture is not displayed");
        }
    }

    @Then("the user's role or designation is displayed")
    public void the_users_role_or_designation_is_displayed() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.isUserRoleDisplayed(),
                    "User's role or designation is not displayed");
        } else {
            Assert.assertTrue(homeScreenPage.isUserRoleDisplayed(), "User's role or designation is not displayed");
        }
    }

    @When("the user clicks on {string} module")
    public void the_user_clicks_on_module(String module) {
        if (isPlaywright) {
            playwrightHomeScreenPage.clickModule(module);
        } else {
            homeScreenPage.clickModule(module);
        }
    }

    @Then("the user is navigated to the {string} page")
    public void the_user_is_navigated_to_the_page(String module) {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.isNavigatedToModulePage(module),
                    "User is not navigated to " + module + " page");
        } else {
            Assert.assertTrue(homeScreenPage.isNavigatedToModulePage(module),
                    "User is not navigated to " + module + " page");
        }
    }

    @Given("the user updates their profile information with name {string} and email {string}")
    public void the_user_updates_their_profile_information_with_name_and_email(String name, String email) {
        if (isPlaywright) {
            playwrightHomeScreenPage.updateProfileInformation(name, email);
        } else {
            homeScreenPage.updateProfileInformation(name, email);
        }
    }

    @When("the user refreshes the Home screen")
    public void the_user_refreshes_the_home_screen() {
        if (isPlaywright) {
            playwrightHomeScreenPage.refreshHomeScreen();
        } else {
            homeScreenPage.refreshHomeScreen();
        }
    }

    @Then("the updated profile information should be displayed on the Home screen")
    public void the_updated_profile_information_should_be_displayed_on_the_home_screen() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.isUpdatedProfileInformationDisplayed(),
                    "Updated profile information is not displayed");
        } else {
            Assert.assertTrue(homeScreenPage.isUpdatedProfileInformationDisplayed(),
                    "Updated profile information is not displayed");
        }
    }

    @Then("no old information should be visible")
    public void no_old_information_should_be_visible() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.isOldInformationVisible(), "Old information is still visible");
        } else {
            Assert.assertTrue(homeScreenPage.isOldInformationVisible(), "Old information is still visible");
        }
    }

    @When("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String action) {
        if (isPlaywright) {
            playwrightHomeScreenPage.clickLogoutButton();
        } else {
            homeScreenPage.clickLogoutButton();
        }
    }

    @Then("the user should be redirected to the login page")
    public void the_user_should_be_redirected_to_the_login_page() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.isRedirectedToLoginPage(),
                    "User is not redirected to the login page");
        } else {
            Assert.assertTrue(homeScreenPage.isRedirectedToLoginPage(), "User is not redirected to the login page");
        }
    }

    @Then("the user should no longer be able to access the Home screen")
    public void the_user_should_no_longer_be_able_to_access_the_home_screen() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.isHomeScreenAccessible(),
                    "User can still access the Home screen");
        } else {
            Assert.assertTrue(homeScreenPage.isHomeScreenAccessible(), "User can still access the Home screen");
        }
    }

    @Then("a confirmation message should be displayed indicating successful logout")
    public void a_confirmation_message_should_be_displayed_indicating_successful_logout() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.isLogoutConfirmationDisplayed(),
                    "Logout confirmation message is not displayed");
        } else {
            Assert.assertTrue(homeScreenPage.isLogoutConfirmationDisplayed(),
                    "Logout confirmation message is not displayed");
        }
    }

    @When("the system retrieves the current date and time")
    public void the_system_retrieves_the_current_date_and_time() {
        if (isPlaywright) {
            playwrightHomeScreenPage.retrieveCurrentDateTime();
        } else {
            homeScreenPage.retrieveCurrentDateTime();
        }
    }

    @Then("the current date is displayed correctly")
    public void the_current_date_is_displayed_correctly() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.isCurrentDateDisplayedCorrectly(),
                    "Current date is not displayed correctly");
        } else {
            Assert.assertTrue(homeScreenPage.isCurrentDateDisplayedCorrectly(),
                    "Current date is not displayed correctly");
        }
    }

    @Then("the current time is displayed correctly")
    public void the_current_time_is_displayed_correctly() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.isCurrentTimeDisplayedCorrectly(),
                    "Current time is not displayed correctly");
        } else {
            Assert.assertTrue(homeScreenPage.isCurrentTimeDisplayedCorrectly(),
                    "Current time is not displayed correctly");
        }
    }

    @Then("the date and time format is consistent with user locale settings")
    public void the_date_and_time_format_is_consistent_with_user_locale_settings() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.isDateTimeFormatConsistent(),
                    "Date and time format is not consistent with user locale settings");
        } else {
            Assert.assertTrue(homeScreenPage.isDateTimeFormatConsistent(),
                    "Date and time format is not consistent with user locale settings");
        }
    }

    @When("the system retrieves user notifications")
    public void the_system_retrieves_user_notifications() {
        if (isPlaywright) {
            playwrightHomeScreenPage.retrieveUserNotifications();
        } else {
            homeScreenPage.retrieveUserNotifications();
        }
    }

    @Then("notifications are displayed prominently on the Home screen")
    public void notifications_are_displayed_prominently_on_the_home_screen() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.areNotificationsDisplayedProminently(),
                    "Notifications are not displayed prominently");
        } else {
            Assert.assertTrue(homeScreenPage.areNotificationsDisplayedProminently(),
                    "Notifications are not displayed prominently");
        }
    }

    @Then("notifications are relevant to the user")
    public void notifications_are_relevant_to_the_user() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.areNotificationsRelevant(),
                    "Notifications are not relevant to the user");
        } else {
            Assert.assertTrue(homeScreenPage.areNotificationsRelevant(), "Notifications are not relevant to the user");
        }
    }

    @Then("notifications are clickable and lead to the relevant pages")
    public void notifications_are_clickable_and_lead_to_the_relevant_pages() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.areNotificationsClickable(), "Notifications are not clickable");
        } else {
            Assert.assertTrue(homeScreenPage.areNotificationsClickable(), "Notifications are not clickable");
        }
    }

    @When("the user selects customization options for rearranging modules")
    public void the_user_selects_customization_options_for_rearranging_modules() {
        if (isPlaywright) {
            playwrightHomeScreenPage.selectCustomizationOptions();
        } else {
            homeScreenPage.selectCustomizationOptions();
        }
    }

    @Then("the Home screen reflects the customized layout")
    public void the_home_screen_reflects_the_customized_layout() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.isCustomizedLayoutReflected(),
                    "Home screen does not reflect the customized layout");
        } else {
            Assert.assertTrue(homeScreenPage.isCustomizedLayoutReflected(),
                    "Home screen does not reflect the customized layout");
        }
    }

    @Then("the user's preferences are saved correctly")
    public void the_users_preferences_are_saved_correctly() {
        if (isPlaywright) {
            Assert.assertTrue(playwrightHomeScreenPage.isUserPreferencesSaved(),
                    "User's preferences are not saved correctly");
        } else {
            Assert.assertTrue(homeScreenPage.isUserPreferencesSaved(), "User's preferences are not saved correctly");
        }
    }

    @When("the user saves the changes")
    public void the_user_saves_the_changes() {
        if (isPlaywright) {
            playwrightHomeScreenPage.saveChanges();
        } else {
            homeScreenPage.saveChanges();
        }
    }

    @Then("the greeting text is displayed as hello {string}, what would you like to do today?")
    public void the_greeting_text_is_displayed_as_hello(String userName) {
        if (isPlaywright) {
            String expectedGreeting = "hello " + userName + ", what would you like to do today?";
            String actualGreeting = playwrightHomeScreenPage.getGreetingText();
            Assert.assertEquals(actualGreeting, expectedGreeting, "Greeting text does not match");
        } else {
            String expectedGreeting = "hello " + userName + ", what would you like to do today?";
            String actualGreeting = homeScreenPage.getGreetingText();
            Assert.assertEquals(actualGreeting, expectedGreeting, "Greeting text does not match");
        }
    }

    @And("the user clicks on the logout button")
    public void the_user_clicks_on_the_logout_button() {
        if (isPlaywright) {
            playwrightHomeScreenPage.clicksLogoutButton();
        } else {
            homeScreenPage.clicksLogoutButton();
        }
    }
}
