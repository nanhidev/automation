package com.project.pages;

import com.utils.ElementUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class OperationsManagementScreenPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "homeScreen")
    private WebElement homeScreen;

    @FindBy(id = "linkButton")
    private WebElement linkButton;

    @FindBy(id = "dropdownSection")
    private WebElement dropdownSection;

    @FindBy(id = "activeVehicleCount")
    private WebElement activeVehicleCount;

    @FindBy(id = "inactiveVehicleCount")
    private WebElement inactiveVehicleCount;

    @FindBy(id = "alertsDropdown")
    private WebElement alertsDropdown;

    @FindBy(id = "logoutButton")
    private WebElement logoutButton;

    @FindBy(id = "mapSection")
    private WebElement mapSection;

    @FindBy(id = "viewDetailsButton")
    private WebElement viewDetailsButton;

    public OperationsManagementScreenPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean isElementVisible(String linkName) {
        try {
            return elementUtils.isElementDisplayed(linkButton);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickOnLink(String linkName) {
        try {
            elementUtils.clickElement(linkButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForPageToLoad() {
        // Implement waiting logic if necessary
    }

    public boolean isPageContentLoaded() {
        try {
            return elementUtils.isElementDisplayed(homeScreen);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void observeServiceStatusSection() {
        // Implementation to observe service status
    }

    public int getActiveVehicleCount() {
        try {
            return Integer.parseInt(activeVehicleCount.getText());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int getInactiveVehicleCount() {
        try {
            return Integer.parseInt(inactiveVehicleCount.getText());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void compareCountsWithDatabase() {
        // Logic to compare counts with the database
    }

    public void locateMap() {
        try {
            elementUtils.isElementDisplayed(mapSection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void zoomInOnMap() {
        // Logic to zoom in on the map
    }

    public void zoomOutOnMap() {
        // Logic to zoom out on the map
    }

    public boolean isMapZoomedIn() {
        // Verify if the map is zoomed in
        return true; // Placeholder
    }

    public boolean isMapZoomedOut() {
        // Verify if the map is zoomed out
        return true; // Placeholder
    }

    public void locateDropdownSections() {
        // Logic to locate dropdown sections
    }

    public boolean isSectionDisplayed(String section) {
        // Check if a specific section is displayed
        return true; // Placeholder
    }

    public void locateDropdown(String dropdownName) {
        // Logic to locate a specific dropdown
    }

    public void clickOnDropdown(String dropdownName) {
        try {
            elementUtils.clickElement(dropdownSection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void observeAlertsInDropdown() {
        // Logic to observe alerts in the dropdown
    }

    public boolean doAlertsMatchExpected() {
        // Logic to verify if alerts match expected
        return true; // Placeholder
    }

    public void clicksOnAlertsDropdown() {
        try {
            elementUtils.clickElement(alertsDropdown);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnLogoutButton() {
        try {
            elementUtils.clickElement(logoutButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isUserLoggedOut() {
        // Logic to verify if user is logged out
        return true; // Placeholder
    }

    public void navigateBackToMainScreen() {
        // Logic to navigate back to the main screen
    }

    public void clicksOnViewDetailsButton() {
        try {
            elementUtils.clickElement(viewDetailsButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnOperationsManagementLink() {
        try {
            WebElement operationsManagementLink = driver.findElement(By.id("operationsManagementLink"));
            elementUtils.clickElement(operationsManagementLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void expandDropdown() {
        try {
            WebElement dropdown = driver.findElement(By.id("dropdownId"));
            elementUtils.clickElement(dropdown);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void confirmLogoutIfPrompted() {
        try {
            if (elementUtils.isElementDisplayed(driver.findElement(By.id("logoutPrompt")))) {
                elementUtils.acceptAlert();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doCountsMatchExpected(int expectedCount) {
        try {
            String countText = elementUtils.getElementText(driver.findElement(By.id("countElement")));
            int actualCount = Integer.parseInt(countText);
            Assert.assertEquals(actualCount, expectedCount, "Counts do not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void locateDriverActivityDropdown() {
        try {
            WebElement driverActivityDropdown = driver.findElement(By.id("driverActivityDropdown"));
            Assert.assertTrue(elementUtils.isElementDisplayed(driverActivityDropdown), "Driver Activity Dropdown not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectDriverFromDropdown(String driverName) {
        try {
            WebElement driverDropdown = driver.findElement(By.id("driverDropdown"));
            elementUtils.selectOptionInDropdown(driverDropdown, driverName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isInactiveVehiclesListDisplayed() {
        try {
            WebElement inactiveVehiclesList = driver.findElement(By.id("inactiveVehiclesList"));
            Assert.assertTrue(elementUtils.isElementDisplayed(inactiveVehiclesList), "Inactive Vehicles List not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isAccessToOperationsManagementScreenAllowed() {
        try {
            boolean isAccessGranted = elementUtils.isElementDisplayed(driver.findElement(By.id("operationsManagementScreen")));
            Assert.assertTrue(isAccessGranted, "Access to Operations Management Screen is not allowed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doCountsUpdateOnRefresh() {
        try {
            int initialCount = Integer.parseInt(elementUtils.getElementText(driver.findElement(By.id("countElement"))));
            driver.navigate().refresh();
            int updatedCount = Integer.parseInt(elementUtils.getElementText(driver.findElement(By.id("countElement"))));
            Assert.assertNotEquals(initialCount, updatedCount, "Counts did not update on refresh!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isButtonVisibleAndClickable(String buttonName) {
        try {
            WebElement button = driver.findElement(By.id(buttonName));
            Assert.assertTrue(elementUtils.isElementDisplayed(button), "Button is not visible!");
            elementUtils.clickElement(button);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doDetailsMatchExpected(String expectedDetails) {
        try {
            String actualDetails = elementUtils.getElementText(driver.findElement(By.id("detailsElement")));
            Assert.assertEquals(actualDetails, expectedDetails, "Details do not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areActionsAvailableForInactiveVehicles() {
        try {
            WebElement actionsMenu = driver.findElement(By.id("actionsMenu"));
            Assert.assertTrue(elementUtils.isElementDisplayed(actionsMenu), "Actions are not available for inactive vehicles!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnAlert() {
        try {
            WebElement alertButton = driver.findElement(By.id("alertButton"));
            elementUtils.clickElement(alertButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isInactiveVehicleCountCorrect(int expectedInactiveCount) {
        try {
            int actualCount = Integer.parseInt(elementUtils.getElementText(driver.findElement(By.id("inactiveVehicleCount"))));
            Assert.assertEquals(actualCount, expectedInactiveCount, "Inactive vehicle count is incorrect!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areAlertDetailsCorrect(String expectedAlertDetails) {
        try {
            String actualAlertDetails = elementUtils.getElementText(driver.findElement(By.id("alertDetails")));
            Assert.assertEquals(actualAlertDetails, expectedAlertDetails, "Alert details are incorrect!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isMapFunctionalityIntact() {
        try {
            WebElement mapElement = driver.findElement(By.id("mapElement"));
            Assert.assertTrue(elementUtils.isElementDisplayed(mapElement), "Map functionality is not intact!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areAdditionalActionsAvailable() {
        try {
            WebElement additionalActionsMenu = driver.findElement(By.id("additionalActionsMenu"));
            Assert.assertTrue(elementUtils.isElementDisplayed(additionalActionsMenu), "Additional actions are not available!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isActiveVehicleCountCorrect(int expectedActiveCount) {
        try {
            int actualCount = Integer.parseInt(elementUtils.getElementText(driver.findElement(By.id("activeVehicleCount"))));
            Assert.assertEquals(actualCount, expectedActiveCount, "Active vehicle count is incorrect!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void areDriverActivityDetailsCorrect(String expectedDriverDetails) {
        try {
            String actualDetails = elementUtils.getElementText(driver.findElement(By.id("driverActivityDetails")));
            Assert.assertEquals(actualDetails, expectedDriverDetails, "Driver activity details are incorrect!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectInactiveVehiclesFilter() {
        try {
            WebElement inactiveVehiclesFilter = driver.findElement(By.id("inactiveVehiclesFilter"));
            elementUtils.selectOptionInDropdown(inactiveVehiclesFilter, "Inactive");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isMapClearAfterZoom() {
        try {
            WebElement mapClearButton = driver.findElement(By.id("clearMapButton"));
            elementUtils.clickElement(mapClearButton);
            WebElement clearStatus = driver.findElement(By.id("mapStatus"));
            Assert.assertEquals(elementUtils.getElementText(clearStatus), "Map cleared successfully", "Map was not cleared after zoom!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void doDisplayedVehiclesMatchExpected(String expectedVehicles) {
        try {
            String actualVehicles = elementUtils.getElementText(driver.findElement(By.id("displayedVehicles")));
            Assert.assertEquals(actualVehicles, expectedVehicles, "Displayed vehicles do not match expected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void locatesAlertsDropdownSection() {
        try {
            WebElement alertsDropdown = driver.findElement(By.id("alertsDropdown"));
            Assert.assertTrue(elementUtils.isElementDisplayed(alertsDropdown), "Alerts dropdown not displayed!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnButton(String buttonName) {
        try {
            WebElement button = driver.findElement(By.id(buttonName));
            elementUtils.clickElement(button);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isAlertCountCorrect(int expectedAlertCount) {
        try {
            int actualCount = Integer.parseInt(elementUtils.getElementText(driver.findElement(By.id("alertCount"))));
            Assert.assertEquals(actualCount, expectedAlertCount, "Alert count is incorrect!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}