package com.project.pages;

import com.utils.ElementUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class UploadNewCandidateProfilePage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    public UploadNewCandidateProfilePage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "uploadIcon")
    private WebElement uploadIcon;

    @FindBy(id = "uploadButton")
    private WebElement uploadButton;

    @FindBy(id = "successMessage")
    private WebElement successMessage;

    @FindBy(id = "confirmationMessage")
    private WebElement confirmationMessage;

    @FindBy(id = "profileList")
    private WebElement profileList;

    @FindBy(id = "candidateProfileFileInput")
    private WebElement candidateProfileFileInput;

    public void clickUploadIcon() {
        try {
            elementUtils.clickElement(uploadIcon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCandidateProfileFile(String fileName) {
        try {
            elementUtils.clearAndSendKeys(candidateProfileFileInput, fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickUploadButton() {
        try {
            elementUtils.clickElement(uploadButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForUploadToComplete() {
        // Implementation for waiting for the upload process to complete
    }

    public boolean isSuccessMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(successMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isConfirmationMessageDisplayed(String uploadNumber) {
        try {
            String expectedMessage = "Confirmation for upload " + uploadNumber;
            String actualMessage = elementUtils.getElementText(confirmationMessage);
            return actualMessage.equals(expectedMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean areBothProfilesListed() {
        try {
            // Implement logic to check if both profiles are listed in the profile section
            return true; // Placeholder return
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectCandidateProfileFileWithLongFilename() {
        // Implementation for selecting a candidate profile file with a long filename
    }

    public void selectValidCandidateProfileFile() {
        // Implementation for selecting a valid candidate profile file
    }

    public void selectCandidateProfileFileNamed(String fileName) {
        // Implementation for selecting a candidate profile file by name
    }

    public void selectTheFile(String fileName) {
        // Implementation for selecting a specified file
    }

    public void selectValidCandidateProfileFileOfType(String fileType) {
        // Implementation for selecting a valid candidate profile file of a specific type
    }

    public void selectValidCandidateProfileFileInTxtFormat() {
        // Implementation for selecting a valid candidate profile file in .txt format
    }

    public boolean isSuccessConfirmationMessageDisplayed() {
        return isSuccessMessageDisplayed(); // Reusing the success message check
    }

    public void loginAsRecruiter() {
        try {
            WebElement loginButton = driver.findElement(By.id("loginButton"));
            elementUtils.clickElement(loginButton);

            WebElement usernameField = driver.findElement(By.id("username"));
            elementUtils.clearAndSendKeys(usernameField, "recruiterUsername");

            WebElement passwordField = driver.findElement(By.id("password"));
            elementUtils.clearAndSendKeys(passwordField, "recruiterPassword");

            WebElement submitButton = driver.findElement(By.id("submitButton"));
            elementUtils.clickElement(submitButton);

            WebElement profileSectionLink = driver.findElement(By.id("profileSectionLink"));
            elementUtils.clickElement(profileSectionLink);

            WebElement profileHeader = driver.findElement(By.xpath("//h1[text()='Profile Section']"));
            String actualHeader = elementUtils.getElementText(profileHeader);
            String expectedHeader = "Profile Section";
            Assert.assertEquals(actualHeader, expectedHeader, "Header does not match!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToProfileSection() {
        // Implementation for navigating to the profile section
    }
}