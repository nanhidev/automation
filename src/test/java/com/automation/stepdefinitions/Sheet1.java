package com.stepdefinitions;

import com.1.utils.ElementUtils;
import org.junit.Assert;
import com.1.driverfactory.DriverFactory;
import com.1.pages.Sheet1Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Sheet1 extends DriverFactory {
Sheet1Page sheet1Page = new Sheet1Page(driver);
@Given("the user is on the Job Opening screen")
public void the_user_is_on_the_job_opening_screen() {
sheet1Page.navigateToJobOpeningScreen();
}
@When("the user locates the Add Job Opening button")
public void the_user_locates_the_add_job_opening_button() {
sheet1Page.locateAddJobOpeningButton();
}
@When("the user clicks on the Add Job Opening button")
public void the_user_clicks_on_the_add_job_opening_button() {
sheet1Page.clicksAddJobOpeningButton();
}
@Then("the Create New Job Opening form is displayed")
public void the_create_new_job_opening_form_is_displayed() {
"Create New Job Opening form should be displayed", sheet1Page.isCreateNewJobOpeningFormDisplayed();
}
@Then("the form contains fields for job title, description, department, and other relevant information")
public void the_form_contains_fields_for_job_title_description_department_and_other_relevant_information() {
"Form should contain required fields", sheet1Page.areRequiredFieldsPresent();
}
@Then("the form displays Save and Cancel buttons")
public void the_form_displays_save_and_cancel_buttons() {
"Form should display Save and Cancel buttons", sheet1Page.areSaveAndCancelButtonsDisplayed();
}
@When("I fill in the job title field with {string}")
public void i_fill_in_the_job_title_field_with(String jobTitle) {
sheet1Page.fillInJobTitleField(jobTitle);
}
@When("I fill in the job description field with {string}")
public void i_fill_in_the_job_description_field_with(String jobDescription) {
sheet1Page.fillInJobDescriptionField(jobDescription);
}
@When("I select {string} from the department dropdown")
public void i_select_from_the_department_dropdown(String department) {
sheet1Page.selectDepartment(department);
}
@When("I fill in any other required fields")
public void i_fill_in_any_other_required_fields() {
sheet1Page.fillInOtherRequiredFields();
}
@Then("the Save button should be enabled")
public void the_save_button_should_be_enabled() {
"Save button should be enabled", sheet1Page.isSaveButtonEnabled();
}
@Then("the Cancel button should remain enabled")
public void the_cancel_button_should_remain_enabled() {
"Cancel button should remain enabled", sheet1Page.isCancelButtonEnabled();
}
@When("the user clicks on the Cancel button")
public void the_user_clicks_on_the_cancel_button() {
sheet1Page.clicksCancelButton();
}
@Then("the Create New Job Opening form is closed")
public void the_create_new_job_opening_form_is_closed() {
"Create New Job Opening form should be closed", sheet1Page.isCreateNewJobOpeningFormDisplayed();
}
@Then("the user is returned to the Job Opening screen without any data saved")
public void the_user_is_returned_to_the_job_opening_screen_without_any_data_saved() {
"User should be on Job Opening screen", sheet1Page.isOnJobOpeningScreen();
}
@When("I leave all required fields empty")
public void i_leave_all_required_fields_empty() {
sheet1Page.leaveRequiredFieldsEmpty();
}
@When("I click on the Save button")
public void i_click_on_the_save_button() {
sheet1Page.clicksSaveButton();
}
@Then("validation messages should appear next to each required field indicating they must be filled")
public void validation_messages_should_appear_next_to_each_required_field_indicating_they_must_be_filled() {
"Validation messages should be displayed", sheet1Page.areValidationMessagesDisplayed();
}
@Then("the Save button should remain disabled")
public void the_save_button_should_remain_disabled() {
"Save button should remain disabled", sheet1Page.isSaveButtonEnabled();
}
@Given("the user fills in the job title field with {string}")
public void the_user_fills_in_the_job_title_field_with(String jobTitle) {
sheet1Page.fillInJobTitleField(jobTitle);
}
@Given("the user leaves the job description field empty")
public void the_user_leaves_the_job_description_field_empty() {
sheet1Page.leaveJobDescriptionFieldEmpty();
}
@When("the user corrects the job description field by entering {string}")
public void the_user_corrects_the_job_description_field_by_entering(String jobDescription) {
sheet1Page.fillInJobDescriptionField(jobDescription);
}
@Then("the job title field retains the previously entered title")
public void the_job_title_field_retains_the_previously_entered_title() {
Assert.assertEquals("Job title field should retain the previously entered title", "Software Engineer", sheet1Page.getJobTitleFieldValue());
}
@Then("the job description field shows the newly entered description")
public void the_job_description_field_shows_the_newly_entered_description() {
Assert.assertEquals("Job description field should show the newly entered description", "A dynamic role requiring expertise in software development and problem-solving skills.", sheet1Page.getJobDescriptionFieldValue());
}
@Then("the form saves the job opening successfully")
public void the_form_saves_the_job_opening_successfully() {
"Job opening should be saved successfully", sheet1Page.isJobOpeningSavedSuccessfully();
}
@When("the user clicks on the Save button")
public void the_user_clicks_on_the_save_button() {
sheet1Page.clicksSaveButton();
}
@Then("the job opening should be saved successfully")
public void the_job_opening_should_be_saved_successfully() {
"Job opening should be saved successfully", sheet1Page.isJobOpeningSavedSuccessfully();
}
@Then("the user should be redirected to the Job Opening screen")
public void the_user_should_be_redirected_to_the_job_opening_screen() {
"User should be redirected to Job Opening screen", sheet1Page.isOnJobOpeningScreen();
}
@Then("a success message should be displayed confirming the job opening was created")
public void a_success_message_should_be_displayed_confirming_the_job_opening_was_created() {
"Success message should be displayed", sheet1Page.isSuccessMessageDisplayed();
}
@Given("the user locates the created job opening")
public void the_user_locates_the_created_job_opening() {
sheet1Page.locateCreatedJobOpening();
}
@When("the user clicks on the Edit button for the job opening")
public void the_user_clicks_on_the_edit_button_for_the_job_opening() {
sheet1Page.clicksEditButton();
}
@When("the user modifies the job title or description")
public void the_user_modifies_the_job_title_or_description() {
sheet1Page.modifyJobTitleOrDescription();
}
@Then("the job opening is updated successfully")
public void the_job_opening_is_updated_successfully() {
"Job opening should be updated successfully", sheet1Page.isJobOpeningUpdatedSuccessfully();
}
@Then("a success message is displayed confirming the job opening was updated")
public void a_success_message_is_displayed_confirming_the_job_opening_was_updated() {
"Success message should be displayed", sheet1Page.isSuccessMessageDisplayed();
}

@Then("the job opening is saved successfully")
public void the_job_opening_is_saved_successfully() {
"Job opening was not saved successfully", sheet1Page.isJobOpeningSaved();
}
@When("the user browses selects a candidate profile file with a short filename")
public void the_user_browses_selects_a_candidate_profile_file_with_a_short_filename() {
sheet1Page.browseAndSelectCandidateProfileFile("short_filename.txt");
}
@Then("the user is redirected to the job opening screen")
public void the_user_is_redirected_to_the_job_opening_screen() {
"User is not on the job opening screen", sheet1Page.isOnJobOpeningScreen();
}
@Then("both profiles are listed in the profile section")
public void both_profiles_are_listed_in_the_profile_section() {
"Both profiles are not listed in the profile section", sheet1Page.areBothProfilesListed();
}
@When("the user browses selects a candidate profile file with a filename {string}")
public void the_user_browses_selects_a_candidate_profile_file_with_a_filename(String filename) {
sheet1Page.browseAndSelectCandidateProfileFile(filename);
}
@When("the recruiter browses selects a valid candidate profile file in {string} format")
public void the_recruiter_browses_selects_a_valid_candidate_profile_file_in_format(String format) {
sheet1Page.browseAndSelectValidCandidateProfileFile(format);
}
@When("the user fills in the optional field with {string}")
public void the_user_fills_in_the_optional_field_with(String optionalField) {
sheet1Page.fillInOptionalField(optionalField);
}
@When("the user has filled in the job description field with {string}")
public void the_user_has_filled_in_the_job_description_field_with(String jobDescription) {
sheet1Page.fillInJobDescriptionField(jobDescription);
}
@When("the user browses selects a candidate profile file with underscores in the filename")
public void the_user_browses_selects_a_candidate_profile_file_with_underscores_in_the_filename() {
sheet1Page.browseAndSelectCandidateProfileFile("candidate_profile_with_underscores.txt");
}
@When("the user browses selects the candidate profile file {string}")
public void the_user_browses_selects_the_candidate_profile_file(String filename) {
sheet1Page.browseAndSelectCandidateProfileFile(filename);
}
@Then("the {string} with a confirmation message")
public void the_with_a_confirmation_message(String message) {
Assert.assertEquals("Confirmation message does not match", message, sheet1Page.getConfirmationMessage());
}
@When("the recruiter waits for the upload process to complete")
public void the_recruiter_waits_for_the_upload_process_to_complete() {
sheet1Page.waitForUploadProcessToComplete();
}
@When("the user clicks on the upload icon")
public void the_user_clicks_on_the_upload_icon() {
sheet1Page.clickUploadIcon();
}
@When("the user fills in the salary range with {string}")
public void the_user_fills_in_the_salary_range_with(String salaryRange) {
sheet1Page.fillInSalaryRange(salaryRange);
}
@When("the recruiter clicks on the upload button")
public void the_recruiter_clicks_on_the_upload_button() {
sheet1Page.clickUploadButton();
}
@When("the user waits for the upload process to complete")
public void the_user_waits_for_the_upload_process_to_complete() {
sheet1Page.waitForUploadProcessToComplete();
}
@Then("a success confirmation message is displayed to the user")
public void a_success_confirmation_message_is_displayed_to_the_user() {
"Success confirmation message is not displayed", sheet1Page.isSuccessConfirmationMessageDisplayed();
}
@When("the user browses selects a candidate profile file in rtf format")
public void the_user_browses_selects_a_candidate_profile_file_in_rtf_format() {
sheet1Page.browseAndSelectCandidateProfileFile("candidate_profile.rtf");
}
@Then("a success confirmation message should be displayed to the user")
public void a_success_confirmation_message_should_be_displayed_to_the_user() {
"Success confirmation message should be displayed", sheet1Page.isSuccessConfirmationMessageDisplayed();
}
@When("the user has filled in all other required fields")
public void the_user_has_filled_in_all_other_required_fields() {
sheet1Page.fillInAllRequiredFields();
}
@When("the user fills in the job description field with {string}")
public void the_user_fills_in_the_job_description_field_with(String jobDescription) {
sheet1Page.fillInJobDescriptionField(jobDescription);
}
@When("the recruiter clicks on the upload (cloud) icon")
public void the_recruiter_clicks_on_the_upload_cloud_icon() {
sheet1Page.clickUploadCloudIcon();
}
@When("the user has selected {string} from the department dropdown")
public void the_user_has_selected_from_the_department_dropdown(String department) {
sheet1Page.selectDepartmentFromDropdown(department);
}
@When("the user selects {string} as the job type")
public void the_user_selects_as_the_job_type(String jobType) {
sheet1Page.selectJobType(jobType);
}
@When("the user browses selects the {string}")
public void the_user_browses_selects_the(String filename) {
sheet1Page.browseAndSelectCandidateProfileFile(filename);
}
@Then("a success message is displayed confirming the job opening was created")
public void a_success_message_is_displayed_confirming_the_job_opening_was_created() {
"Success message confirming job opening creation is not displayed", sheet1Page.isJobOpeningCreatedSuccessMessageDisplayed();
}
@When("the user clicks on the save button again")
public void the_user_clicks_on_the_save_button_again() {
sheet1Page.clickSaveButton();
}
@When("the user leaves optional fields empty")
public void the_user_leaves_optional_fields_empty() {
sheet1Page.leaveOptionalFieldsEmpty();
}
@When("the recruiter browses selects a valid candidate profile file")
public void the_recruiter_browses_selects_a_valid_candidate_profile_file() {
sheet1Page.browseAndSelectValidCandidateProfileFile("valid_candidate_profile.txt");
}
@When("the user selects {string} from the department dropdown")
public void the_user_selects_from_the_department_dropdown(String department) {
sheet1Page.selectDepartmentFromDropdown(department);
}
}