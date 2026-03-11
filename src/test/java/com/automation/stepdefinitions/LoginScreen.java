package com.project.stepdefinitions;

import com.1.utils.ElementUtils;
import org.junit.Assert;
import com.1.driverfactory.DriverFactory;
import com.project.pages.LoginScreenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginScreen extends DriverFactory {
LoginScreenPage loginScreenPage = new LoginScreenPage(driver);
@Given("the user is on the Login Screen")
public void the_user_is_on_the_login_screen() {
driver = DriverFactory.getDriver();
loginScreenPage.navigateToLoginScreen();
}
@When("the user enters {string} in the Organization field")
public void the_user_enters_organization_in_the_organization_field(String organization) {
loginScreenPage.enterOrganization(organization);
}
@When("the user enters {string} in the Email field")
public void the_user_enters_email_in_the_email_field(String email) {
loginScreenPage.enterEmail(email);
}
@When("the user enters {string} in the Password field")
public void the_user_enters_password_in_the_password_field(String password) {
loginScreenPage.enterPassword(password);
}
// DUPLICATE: @When("the user clicks the Login button")
public void the_user_clicks_the_login_button() {
loginScreenPage.clickLoginButton();
}
@Then("the user should be redirected to the home screen")
public void the_user_should_be_redirected_to_the_home_screen() {
loginScreenPage.isHomeScreenDisplayed();
}
@Then("a welcome message should be displayed on the home screen")
public void a_welcome_message_should_be_displayed_on_the_home_screen() {
loginScreenPage.isWelcomeMessageDisplayed();
}
@Then("the Login button should be enabled")
public void the_login_button_should_be_enabled() {
loginScreenPage.isLoginButtonEnabled();
}
@Then("the Login button remains disabled")
public void the_login_button_remains_disabled() {
loginScreenPage.isLoginButtonEnabled();
}
@When("the user clicks the Forgot Password link")
public void the_user_clicks_the_forgot_password_link() {
loginScreenPage.clickForgotPasswordLink();
}
@Then("the user should be redirected to the Forgot Password screen")
public void the_user_should_be_redirected_to_the_forgot_password_screen() {
loginScreenPage.isForgotPasswordScreenDisplayed();
}
@Then("the Forgot Password screen displays Organization and Email fields")
public void the_forgot_password_screen_displays_organization_and_email_fields() {
loginScreenPage.isOrganizationFieldDisplayed();
loginScreenPage.isEmailFieldDisplayed();
}
@When("the user clicks the Send button")
public void the_user_clicks_the_send_button() {
loginScreenPage.clickSendButton();
}
@Then("the system processes the request and displays a confirmation message")
public void the_system_processes_the_request_and_displays_a_confirmation_message() {
loginScreenPage.isConfirmationMessageDisplayed();
}
@Then("the user receives a password reset email in their inbox")
public void the_user_receives_a_password_reset_email_in_their_inbox() {
loginScreenPage.isPasswordResetEmailReceived();
}
@Then("the Organization field is displayed")
public void the_organization_field_is_displayed() {
loginScreenPage.isOrganizationFieldDisplayed();
}
@Then("the Email field is displayed")
public void the_email_field_is_displayed() {
loginScreenPage.isEmailFieldDisplayed();
}
@Then("the Password field is displayed")
public void the_password_field_is_displayed() {
loginScreenPage.isPasswordFieldDisplayed();
}
@Then("the Forgot Password link is displayed")
public void the_forgot_password_link_is_displayed() {
loginScreenPage.isForgotPasswordLinkDisplayed();
}
@Then("the Login button is displayed")
public void the_login_button_is_displayed() {
loginScreenPage.isLoginButtonDisplayed();
}
@When("I leave the Password field empty")
public void i_leave_the_password_field_empty() {
loginScreenPage.leavePasswordFieldEmpty();
}
@When("I leave the Email field empty")
public void i_leave_the_email_field_empty() {
loginScreenPage.leaveEmailFieldEmpty();
}
@When("the user leaves the Organization field empty")
public void the_user_leaves_the_organization_field_empty() {
loginScreenPage.leaveOrganizationFieldEmpty();
}
@Then("the Login button should remain disabled")
public void the_login_button_should_remain_disabled() {
loginScreenPage.isLoginButtonEnabled();
}
@Then("the Login button should remain disabled after entering an invalid Organization")
public void the_login_button_should_remain_disabled_after_entering_an_invalid_organization() {
loginScreenPage.isLoginButtonEnabled();
}

@Then("the send button should be displayed")
public void the_send_button_should_be_displayed() {
loginScreenPage.isSendButtonDisplayed();
}
@When("i enter {string} in the organization field")
public void i_enter_in_the_organization_field(String organizationName) {
loginScreenPage.enterOrganizationName(organizationName);
}
@When("i enter a valid password in the password field")
public void i_enter_a_valid_password_in_the_password_field() {
loginScreenPage.enterValidPassword();
}
@Then("the organization field should be displayed")
public void the_organization_field_should_be_displayed() {
loginScreenPage.isOrganizationFieldDisplayed();
}
@When("the user enters a valid email address in the email field")
public void the_user_enters_a_valid_email_address_in_the_email_field() {
loginScreenPage.enterValidEmailAddress();
}
@When("i enter {string} in the password field")
public void i_enter_in_the_password_field(String password) {
loginScreenPage.enterPassword(password);
}
@When("i enter {string} in the email field")
public void i_enter_in_the_email_field(String email) {
loginScreenPage.enterEmail(email);
}
@When("i enter a valid organization name in the organization field")
public void i_enter_a_valid_organization_name_in_the_organization_field() {
loginScreenPage.enterValidOrganizationName();
}
@Then("the email field should be displayed")
public void the_email_field_should_be_displayed() {
loginScreenPage.isEmailFieldDisplayed();
}
}