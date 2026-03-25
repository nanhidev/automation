package com.project.stepdefinitions;

import com.1.utils.ElementUtils;
import org.junit.Assert;
import com.1.driverfactory.DriverFactory;
import com.project.pages.UploadNewCandidateProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class UploadNewCandidateProfile extends DriverFactory {
UploadNewCandidateProfilePage uploadNewCandidateProfilePage = new UploadNewCandidateProfilePage(driver);
@Given("the user is logged in as a recruiter")
public void the_user_is_logged_in_as_a_recruiter() {
uploadNewCandidateProfilePage.loginAsRecruiter();
}
@Given("the user is on the Profile section")
public void the_user_is_on_the_profile_section() {
uploadNewCandidateProfilePage.navigateToProfileSection();
}
@When("the user clicks on the upload icon")
public void the_user_clicks_on_the_upload_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@When("the user browses and selects a valid candidate profile file {string}")
public void the_user_browses_and_selects_a_valid_candidate_profile_file(String validCandidateProfileFile) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(validCandidateProfileFile);
}
@When("the user clicks on the Upload button")
public void the_user_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@When("the user waits for the upload process to complete")
public void the_user_waits_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.waitForUploadToComplete();
}
@Then("a success confirmation message should be displayed to the user")
public void a_success_confirmation_message_should_be_displayed_to_the_user() {
"Success message not displayed", uploadNewCandidateProfilePage.isSuccessMessageDisplayed();
}
@Then("the user should see a confirmation message for the {string} upload")
public void the_user_should_see_a_confirmation_message_for_the_upload(String uploadNumber) {
Assert.assertTrue("Confirmation message for " + uploadNumber + " upload not displayed",
uploadNewCandidateProfilePage.isConfirmationMessageDisplayed(uploadNumber));
}
@Then("both profiles should be listed in the Profile Section")
public void both_profiles_should_be_listed_in_the_profile_section() {
Assert.assertTrue("Both profiles are not listed in the Profile Section",
uploadNewCandidateProfilePage.areBothProfilesListed());
}
@When("the user browses and selects a candidate profile file with a long filename {string}")
public void the_user_browses_and_selects_a_candidate_profile_file_with_a_long_filename(String longFilename) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(longFilename);
}
@When("the user browses and selects a valid candidate profile file in .txt format {string}")
public void the_user_browses_and_selects_a_valid_candidate_profile_file_in_txt_format(String candidateProfileFile) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(candidateProfileFile);
}
@When("the user browses and selects the candidate profile file named {string}")
public void the_user_browses_and_selects_the_candidate_profile_file_named(String fileName) {
uploadNewCandidateProfilePage.selectCandidateProfileFile(fileName);
}

@Given("the user browses selects a candidate profile file with a long filename")
public void the_user_browses_selects_a_candidate_profile_file_with_a_long_filename() {
uploadNewCandidateProfilePage.selectCandidateProfileFileWithLongFilename();
}
@Given("the user browses selects a valid candidate profile file")
public void the_user_browses_selects_a_valid_candidate_profile_file() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFile();
}
@Given("the user browses selects a candidate profile file named {string}")
public void the_user_browses_selects_a_candidate_profile_file_named(String fileName) {
uploadNewCandidateProfilePage.selectCandidateProfileFileNamed(fileName);
}
@Given("the user browses selects the {string}")
public void the_user_browses_selects_the(String fileName) {
uploadNewCandidateProfilePage.selectTheFile(fileName);
}
@When("the user clicks on the upload (cloud) icon")
public void the_user_clicks_on_the_upload_cloud_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@When("the user waits for the upload to complete")
public void the_user_waits_for_the_upload_to_complete() {
uploadNewCandidateProfilePage.waitForUploadToComplete();
}
@Given("the user browses selects a valid candidate profile file of {string}")
public void the_user_browses_selects_a_valid_candidate_profile_file_of(String fileType) {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileOfType(fileType);
}
@Then("the user should see a success confirmation message")
public void the_user_should_see_a_success_confirmation_message() {
uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayed();
}
@Given("the user browses selects a valid candidate profile file in .txt format")
public void the_user_browses_selects_a_valid_candidate_profile_file_in_txt_format() {
uploadNewCandidateProfilePage.selectValidCandidateProfileFileInTxtFormat();
}
}