package com.project.pages;

import com.utils.ElementUtils; // Corrected import statement
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScreenPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    public LoginScreenPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "organizationField")
    private WebElement organizationField;

    @FindBy(id = "emailField")
    private WebElement emailField;

    @FindBy(id = "passwordField")
    private WebElement passwordField;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "forgotPasswordLink")
    private WebElement forgotPasswordLink;

    @FindBy(id = "sendButton")
    private WebElement sendButton;

    @FindBy(id = "confirmationMessage")
    private WebElement confirmationMessage;

    @FindBy(id = "homeScreen")
    private WebElement homeScreen;

    @FindBy(id = "welcomeMessage")
    private WebElement welcomeMessage;

    public void navigateToLoginScreen() {
        driver.get("http://localhost"); // Replace with actual URL if needed
    }

    public void enterOrganization(String organization) {
        try {
            elementUtils.clearAndSendKeys(organizationField, organization);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterEmail(String email) {
        try {
            elementUtils.clearAndSendKeys(emailField, email);
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

    public boolean isWelcomeMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(welcomeMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isLoginButtonEnabled() {
        try {
            return elementUtils.isElementDisplayed(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickForgotPasswordLink() {
        try {
            elementUtils.clickElement(forgotPasswordLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isForgotPasswordScreenDisplayed() {
        // Implement the actual check for the Forgot Password screen
        return false; // Placeholder return statement
    }

    public boolean isOrganizationFieldDisplayed() {
        try {
            return elementUtils.isElementDisplayed(organizationField);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isEmailFieldDisplayed() {
        try {
            return elementUtils.isElementDisplayed(emailField);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isPasswordFieldDisplayed() {
        try {
            return elementUtils.isElementDisplayed(passwordField);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isForgotPasswordLinkDisplayed() {
        try {
            return elementUtils.isElementDisplayed(forgotPasswordLink);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isSendButtonDisplayed() {
        try {
            return elementUtils.isElementDisplayed(sendButton);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isConfirmationMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(confirmationMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void leavePasswordFieldEmpty() {
        try {
            elementUtils.clearElement(passwordField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveEmailFieldEmpty() {
        try {
            elementUtils.clearElement(emailField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveOrganizationFieldEmpty() {
        try {
            elementUtils.clearElement(organizationField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterOrganizationName(String organizationName) {
        enterOrganization(organizationName);
    }

    public void enterValidPassword() {
        enterPassword("validPassword"); // Replace with actual logic to enter a valid password
    }

    public void enterValidEmailAddress() {
        enterEmail("validEmail@example.com"); // Replace with actual logic to enter a valid email address
    }

    public void enterValidOrganizationName() {
        enterOrganization("validOrganization"); // Replace with actual logic to enter a valid organization name
    }

    public boolean isLoginButtonDisplayed() {
        try {
            return elementUtils.isElementDisplayed(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isPasswordResetEmailReceived() {
        try {
            // Logic to check for the password reset email
            boolean emailReceived = checkEmailForPasswordReset(); // Placeholder for the actual method to check email
            Assert.assertTrue(emailReceived, "Password reset email has not been received!");
            return emailReceived;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickSendButton() {
        try {
            elementUtils.clickElement(sendButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean checkEmailForPasswordReset() {
        // Implement the actual logic to check for the password reset email
        return false; // Placeholder return statement
    }
}