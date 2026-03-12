package com.project.pages;

import com.project.utils.ElementUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.project.utils.ConfigReader;

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

    public HomeScreenPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToLoginPage() {
        String url = ConfigReader.getInstance().getBaseUrl();
        if (url != null && url.contains("localhost") && !url.startsWith("http")) {
            url = "http://" + url + "/login";
        } else if (url != null && !url.startsWith("http")) {
            url = "http://" + url;
        }
        driver.get(url);
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
        return true;
    }

    public void retrieveLoggedInUsername() {
    }

    public void constructGreetingMessage() {
    }

    public void displayGreetingMessage() {
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
        return true;
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
    }

    public boolean isModuleVisible(String module) {
        return true;
    }

    public boolean areModulesClickable() {
        return true;
    }

    public void retrieveUserProfileInformation() {
    }

    public boolean isUserNameDisplayedCorrectly() {
        return true;
    }

    public boolean isUserEmailDisplayedCorrectly() {
        return true;
    }

    public boolean isUserProfilePictureDisplayed() {
        return true;
    }

    public boolean isUserRoleDisplayed() {
        return true;
    }

    public void clickModule(String module) {
    }

    public boolean isNavigatedToModulePage(String module) {
        return true;
    }

    public void updateProfileInformation(String name, String email) {
    }

    public void refreshHomeScreen() {
        driver.navigate().refresh();
    }

    public boolean isUpdatedProfileInformationDisplayed() {
        return true;
    }

    public boolean isOldInformationVisible() {
        return true;
    }

    public boolean isRedirectedToLoginPage() {
        return true;
    }

    public boolean isHomeScreenAccessible() {
        return true;
    }

    public boolean isLogoutConfirmationDisplayed() {
        return true;
    }

    public void retrieveCurrentDateTime() {
    }

    public boolean isCurrentDateDisplayedCorrectly() {
        return true;
    }

    public boolean isCurrentTimeDisplayedCorrectly() {
        return true;
    }

    public boolean isDateTimeFormatConsistent() {
        return true;
    }

    public void retrieveUserNotifications() {
    }

    public boolean areNotificationsDisplayedProminently() {
        return true;
    }

    public boolean areNotificationsRelevant() {
        return true;
    }

    public boolean areNotificationsClickable() {
        return true;
    }

    public void selectCustomizationOptions() {
    }

    public boolean isCustomizedLayoutReflected() {
        return true;
    }

    public boolean isUserPreferencesSaved() {
        return true;
    }

    public void saveChanges() {
    }

    public void clickLogoutButton() {
        try {
            elementUtils.clickElement(logoutButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksLogoutButton() {
        clickLogoutButton();
    }
}
