package com.1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.1.utils.ElementUtils;
import org.junit.Assert;

public class Sheet1Page {
    private WebDriver driver;
    private ElementUtils elementUtils;

    public Sheet1Page(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "addJobOpeningButton")
    private WebElement addJobOpeningButton;
    @FindBy(id = "createNewJobOpeningForm")
    private WebElement createNewJobOpeningForm;
    @FindBy(id = "jobTitleField")
    private WebElement jobTitleField;
    @FindBy(id = "jobDescriptionField")
    private WebElement jobDescriptionField;
    @FindBy(id = "departmentDropdown")
    private WebElement departmentDropdown;
    @FindBy(id = "saveButton")
    private WebElement saveButton;
    @FindBy(id = "cancelButton")
    private WebElement cancelButton;
    @FindBy(id = "validationMessages")
    private WebElement validationMessages;
    @FindBy(id = "successMessage")
    private WebElement successMessage;
    @FindBy(id = "uploadIcon")
    private WebElement uploadIcon;
    @FindBy(id = "confirmationMessage")
    private WebElement confirmationMessage;
    @FindBy(id = "editButton")
    private WebElement editButton;
    @FindBy(id = "requiredField1")
    private WebElement requiredField1;
    @FindBy(id = "requiredField2")
    private WebElement requiredField2;
    @FindBy(id = "successConfirmationMessage")
    private WebElement successConfirmationMessage;
    @FindBy(id = "jobTitleOrDescription")
    private WebElement titleOrDescriptionField;
    @FindBy(id = "uploadButton")
    private WebElement uploadButton;
    @FindBy(id = "savedMessage")
    private WebElement savedMessage;
    @FindBy(id = "createdMessage")
    private WebElement createdMessage;
    @FindBy(id = "profile1")
    private WebElement profile1;
    @FindBy(id = "profile2")
    private WebElement profile2;
    @FindBy(id = "uploadSpinner")
    private WebElement uploadSpinner;
    @FindBy(id = "jobTypeDropdown")
    private WebElement jobTypeDropdown;
    @FindBy(id = "profileFileInput")
    private WebElement fileInput;
    @FindBy(id = "otherRequiredField")
    private WebElement otherRequiredField;
    @FindBy(id = "salaryRangeField")
    private WebElement salaryRangeField;
    @FindBy(id = "cloudUploadIcon")
    private WebElement cloudUploadIcon;

    public void navigateToJobOpeningScreen() {
        driver.get("http://localhost/job_opening");
    }

    public void clicksAddJobOpeningButton() {
        elementUtils.clickElement(addJobOpeningButton);
    }

    public boolean isCreateNewJobOpeningFormDisplayed() {
        return elementUtils.isElementDisplayed(createNewJobOpeningForm);
    }

    public void fillInJobTitleField(String jobTitle) {
        elementUtils.clearAndSendKeys(jobTitleField, jobTitle);
    }

    public void fillInJobDescriptionField(String jobDescription) {
        elementUtils.clearAndSendKeys(jobDescriptionField, jobDescription);
    }

    public void selectDepartment(String department) {
        elementUtils.clickElement(departmentDropdown);
        elementUtils.selectOptionInDropdown(departmentDropdown, department);
    }

    public void clicksSaveButton() {
        elementUtils.clickElement(saveButton);
    }

    public void clicksCancelButton() {
        elementUtils.clickElement(cancelButton);
    }

    public boolean isSaveButtonEnabled() {
        return saveButton.isEnabled();
    }

    public boolean isCancelButtonEnabled() {
        return cancelButton.isEnabled();
    }

    public boolean areValidationMessagesDisplayed() {
        return elementUtils.isElementDisplayed(validationMessages);
    }

    public boolean isSuccessMessageDisplayed() {
        return elementUtils.isElementDisplayed(successMessage);
    }

    public String getJobTitleFieldValue() {
        return elementUtils.getElementText(jobTitleField);
    }

    public String getJobDescriptionFieldValue() {
        return elementUtils.getElementText(jobDescriptionField);
    }

    public boolean isJobOpeningSavedSuccessfully() {
        String actualMessage = elementUtils.getElementText(savedMessage);
        return actualMessage.equals("Job opening has been saved.");
    }

    public boolean isOnJobOpeningScreen() {
        // Implement logic to verify if user is on Job Opening screen
        return true; // Placeholder return statement
    }

    public void leaveRequiredFieldsEmpty() {
        // Implement logic to leave required fields empty
    }

    public void browseAndSelectCandidateProfileFile(String filename) {
        elementUtils.clearAndSendKeys(fileInput, filename);
    }

    public void fillInAllRequiredFields() {
        // Implement logic to fill in all required fields
    }

    public void isJobOpeningUpdatedSuccessfully() {
        String actualMessage = elementUtils.getElementText(successMessage);
        Assert.assertEquals("Job opening updated successfully.", actualMessage);
    }

    public void clickUploadIcon() {
        elementUtils.clickElement(uploadIcon);
    }

    public String getConfirmationMessage() {
        return elementUtils.getElementText(confirmationMessage);
    }

    public void clicksEditButton() {
        elementUtils.clickElement(editButton);
    }

    public void fillInOptionalField(String fieldValue) {
        elementUtils.clearAndSendKeys(titleOrDescriptionField, fieldValue);
    }

    public boolean areRequiredFieldsPresent() {
        return elementUtils.isElementDisplayed(requiredField1) && elementUtils.isElementDisplayed(requiredField2);
    }

    public boolean isSuccessConfirmationMessageDisplayed() {
        return elementUtils.isElementDisplayed(successConfirmationMessage);
    }

    public void modifyJobTitleOrDescription(String newTitleOrDescription) {
        elementUtils.clearAndSendKeys(titleOrDescriptionField, newTitleOrDescription);
    }

    public void clickUploadButton() {
        elementUtils.clickElement(uploadButton);
    }

    public boolean areSaveAndCancelButtonsDisplayed() {
        return elementUtils.isElementDisplayed(saveButton) && elementUtils.isElementDisplayed(cancelButton);
    }

    public boolean areBothProfilesListed() {
        return elementUtils.isElementDisplayed(profile1) && elementUtils.isElementDisplayed(profile2);
    }

    public void waitForUploadProcessToComplete() {
        // Implement logic to wait until upload spinner is not displayed
    }

    public void selectJobType(String jobType) {
        elementUtils.selectOptionInDropdown(jobTypeDropdown, jobType);
    }

    public void browseAndSelectValidCandidateProfileFile(String filepath) {
        elementUtils.clearAndSendKeys(fileInput, filepath);
    }

    public void fillInOtherRequiredFields(String fieldValue) {
        elementUtils.clearAndSendKeys(otherRequiredField, fieldValue);
    }

    public void leaveJobDescriptionFieldEmpty() {
        // No implementation needed as this method is to ensure the field is left empty.
    }

    public void fillInSalaryRange(String salaryRange) {
        elementUtils.clearAndSendKeys(salaryRangeField, salaryRange);
    }

    public void locateAddJobOpeningButton() {
        elementUtils.clickElement(addJobOpeningButton);
    }

    public void clickUploadCloudIcon() {
        elementUtils.clickElement(cloudUploadIcon);
    }
}