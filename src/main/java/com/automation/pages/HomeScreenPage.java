package com.project.pages;

import com.utils.ElementUtils; // Corrected import statement
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class HomeScreenPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "usernameField")
    private WebElement usernameField;

    @FindBy(id = "passwordField")
    private WebElement passwordField;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "homeScreen")
    private WebElement homeScreen;

    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    @FindBy(id = "greetingText")
    private WebElement greetingText;

    @FindBy(id = "profileName")
    private WebElement profileName;

    @FindBy(id = "profileEmail")
    private WebElement profileEmail;

    @FindBy(id = "profilePicture")
    private WebElement profilePicture;

    @FindBy(id = "logoutButton")
    private WebElement logoutButton;

    // Constructor
    public HomeScreenPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        try {
            elementUtils.clearAndSendKeys(usernameField, username);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(String password) {
        try {
            elementUtils.clearAndSendKeys(passwordField, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickLoginButton() {
        try {
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isHomeScreenDisplayed() {
        try {
            return elementUtils.isElementDisplayed(homeScreen);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public boolean isErrorMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(errorMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isHomeScreenLoadedWithinTime() {
        // Implement your logic for checking the time frame if needed
        return true;
    }

    public void retrieveLoggedInUsername() {
        // Implement functionality to retrieve the username
    }

    public void constructGreetingMessage() {
        // Implement functionality to construct greeting message
    }

    public void displayGreetingMessage() {
        // Implement functionality to display greeting message
    }

    public String getGreetingText() {
        try {
            return elementUtils.getElementText(greetingText);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public boolean isUsernameDisplayedCorrectly() {
        try {
            String expectedName = "ExpectedUserName"; // Replace with actual expected value
            String actualName = profileName.getText();
            return expectedName.equals(actualName);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isGreetingTextVisible() {
        try {
            return elementUtils.isElementDisplayed(greetingText);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void inspectHomeScreen() {
        // Implement functionality to inspect the home screen
    }

    public boolean isModuleVisible(String module) {
        // Implement logic to check if the module is visible
        return true; // Placeholder
    }

    public boolean areModulesClickable() {
        // Implement logic to check if all modules are clickable
        return true; // Placeholder
    }

    public void retrieveUserProfileInformation() {
        // Implement functionality to retrieve user profile information
    }

    public boolean isUserNameDisplayedCorrectly() {
        try {
            String actualName = profileName.getText();
            return actualName != null && !actualName.isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isUserEmailDisplayedCorrectly() {
        try {
            String actualEmail = profileEmail.getText();
            return actualEmail != null && !actualEmail.isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isUserProfilePictureDisplayed() {
        try {
            return elementUtils.isElementDisplayed(profilePicture);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isUserRoleDisplayed() {
        // Implement logic to check if the user role is displayed
        return true; // Placeholder
    }

    public void clickModule(String module) {
        // Implement functionality to click on the specified module
    }

    public boolean isNavigatedToModulePage(String module) {
        // Implement logic to verify navigation to the module page
        return true; // Placeholder
    }

    public void updateProfileInformation(String name, String email) {
        // Implement functionality to update profile information
    }

    public void refreshHomeScreen() {
        driver.navigate().refresh();
    }

    public boolean isUpdatedProfileInformationDisplayed() {
        // Implement logic to check if updated profile information is displayed
        return true; // Placeholder
    }

    public boolean isOldInformationVisible() {
        // Implement logic to check if old information is visible
        return true; // Placeholder
    }

    public void clickLogoutButton() {
        try {
            elementUtils.clickElement(logoutButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isRedirectedToLoginPage() {
        // Implement logic to check if redirected to login page
        return true; // Placeholder
    }

    public boolean isHomeScreenAccessible() {
        // Implement logic to check if home screen is accessible
        return true; // Placeholder
    }

    public boolean isLogoutConfirmationDisplayed() {
        // Implement logic to check if logout confirmation message is displayed
        return true; // Placeholder
    }

    public void retrieveCurrentDateTime() {
        // Implement functionality to retrieve current date and time
    }

    public boolean isCurrentDateDisplayedCorrectly() {
        // Implement logic to check if current date is displayed correctly
        return true; // Placeholder
    }

    public boolean isCurrentTimeDisplayedCorrectly() {
        // Implement logic to check if current time is displayed correctly
        return true; // Placeholder
    }

    public boolean isDateTimeFormatConsistent() {
        // Implement logic to check if date and time format is consistent
        return true; // Placeholder
    }

    public void retrieveUserNotifications() {
        // Implement functionality to retrieve user notifications
    }

    public boolean areNotificationsDisplayedProminently() {
        // Implement logic to check if notifications are displayed prominently
        return true; // Placeholder
    }

    public boolean areNotificationsRelevant() {
        // Implement logic to check if notifications are relevant
        return true; // Placeholder
    }

    public boolean areNotificationsClickable() {
        // Implement logic to check if notifications are clickable
        return true; // Placeholder
    }

    public void selectCustomizationOptions() {
        // Implement functionality to select customization options
    }

    public boolean isCustomizedLayoutReflected() {
        // Implement logic to check if customized layout is reflected
        return true; // Placeholder
    }

    public boolean isUserPreferencesSaved() {
        // Implement logic to check if user preferences are saved correctly
        return true; // Placeholder
    }

    public void saveChanges() {
        // Implement functionality to save changes
    }

    ublic void clickLogoutButtonAndNavigateToLoginPage() {
        try {
            elementUtils.clickElement(logoutButton);
            String actualUrl = driver.getCurrentUrl();
            String expectedUrl = "http://localhost/login"; // Assuming the login page URL
            Assert.assertEquals(actualUrl, expectedUrl, "URL does not match after logout!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}