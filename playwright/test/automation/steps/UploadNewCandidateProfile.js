const { Given, When, Then } = require('@cucumber/cucumber');
const { expect } = require('@playwright/test');
const UploadNewCandidateProfilePage = require('../pages/UploadNewCandidateProfilePage');

let page;

Given('the user is logged in as a recruiter', async function() {
    // Implementation for logging in as a recruiter
});

Given('the user is on the Profile section', async function() {
    page = new UploadNewCandidateProfilePage(this.context);
    await page.navigateToProfileSection();
});

When('the user clicks on the upload icon', async function() {
    await page.clickUploadIcon();
});

When('the user browses and selects a candidate profile file {string}', async function(candidate_profile_file) {
    await page.selectCandidateProfileFile(candidate_profile_file);
});

When('the user clicks on the Upload button', async function() {
    await page.clickUploadButton();
});

When('the user waits for the upload process to complete', async function() {
    await page.waitForUploadCompletion();
});

Then('a success confirmation message should be displayed to the user', async function() {
    const message = await page.getSuccessMessage();
    expect(message).toContain('Upload successful');
});

Then('the user should see a confirmation message for the {string} upload', async function(upload_number) {
    const message = await page.getConfirmationMessage(upload_number);
    expect(message).toContain(`Upload ${upload_number} successful`);
});

Then('both profiles should be listed in the Profile Section', async function() {
    const profiles = await page.getListedProfiles();
    expect(profiles).toContain('first valid candidate profile file');
    expect(profiles).toContain('second valid candidate profile file');
});

When('the user browses and selects a valid candidate profile file of {string}', async function(file_size) {
    await page.selectCandidateProfileFile(`valid_candidate_profile_${file_size}.pdf`);
});

When('the user browses and selects a candidate profile file with a long filename', async function() {
    await page.selectCandidateProfileFile('This_is_a_very_long_filename_for_a_candidate_profile_document_that_exceeds_normal_length.pdf');
});

When('the user browses and selects a valid candidate profile file in .txt format', async function() {
    await page.selectCandidateProfileFile('valid_candidate_profile.txt');
});

When('the user browses and selects the candidate profile file named {string}', async function(file_name) {
    await page.selectCandidateProfileFile(file_name);
});