package com.project.pages;

import com.utils.ElementUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class OperationsScheduledScreenPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    public OperationsScheduledScreenPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "weekStartDate")
    private WebElement weekStartDate;

    @FindBy(id = "weekEndDate")
    private WebElement weekEndDate;

    @FindBy(id = "futureDateSelector")
    private WebElement futureDateSelector;

    @FindBy(id = "operatingPeriodStartTime")
    private WebElement operatingPeriodStartTime;

    @FindBy(id = "operatingPeriodEndTime")
    private WebElement operatingPeriodEndTime;

    @FindBy(id = "createOperatingPeriodButton")
    private WebElement createOperatingPeriodButton;

    @FindBy(id = "deleteOperatingPeriodButton")
    private WebElement deleteOperatingPeriodButton;

    @FindBy(id = "exportButton")
    private WebElement exportButton;

    @FindBy(id = "csvFormatOption")
    private WebElement csvFormatOption;

    @FindBy(id = "saveButton")
    private WebElement saveButton;

    @FindBy(id = "downloadedCSVFile")
    private WebElement downloadedCSVFile;

    public void navigateToOperationsScheduledPage() {
        driver.get("localhost");
    }

    public String getDisplayedWeekStartDate() {
        return elementUtils.getElementText(weekStartDate);
    }

    public String getDisplayedWeekEndDate() {
        return elementUtils.getElementText(weekEndDate);
    }

    public void selectFutureDate() {
        elementUtils.clickElement(futureDateSelector);
    }

    public void enterOperatingPeriodTimes(String startTime, String endTime) {
        elementUtils.clearAndSendKeys(operatingPeriodStartTime, startTime);
        elementUtils.clearAndSendKeys(operatingPeriodEndTime, endTime);
    }

    public void clickSaveButton() {
        elementUtils.clickElement(saveButton);
    }

    public void clickCreateOperatingPeriodButton() {
        elementUtils.clickElement(createOperatingPeriodButton);
    }

    public void clickDeleteButton() {
        elementUtils.clickElement(deleteOperatingPeriodButton);
    }

    public void clickExportButton() {
        elementUtils.clickElement(exportButton);
    }

    public void selectCSVFormatOption() {
        elementUtils.clickElement(csvFormatOption);
    }

    public boolean isCSVFileDownloaded() {
        return elementUtils.isElementDisplayed(downloadedCSVFile);
    }

    ublic void validateDisplayedWeekStartDate(String expectedDate) {
        String actualDate = getDisplayedWeekStartDate();
        Assert.assertEquals(actualDate, expectedDate, "Displayed week start date does not match!");
    }

    ublic void validateDisplayedWeekEndDate(String expectedDate) {
        String actualDate = getDisplayedWeekEndDate();
        Assert.assertEquals(actualDate, expectedDate, "Displayed week end date does not match!");
    }

    public void isOverlapPresent() {
        // Logic to verify overlap presence
    }

    public void changeOperatingPeriodTimes(String startTime, String endTime) {
        enterOperatingPeriodTimes(startTime, endTime);
    }

    public void selectSourceWeekForCopy() {
        // Logic to select source week for copy
    }

    public void clickOnOperatingPeriodToDelete() {
        // Logic to click on the operating period to delete
    }

    public void isCSVFileContentsCorrect() {
        // Logic to verify if CSV file contents are correct
    }

    public void confirmExportAction() {
        // Logic to confirm export action
    }

    public void areAllPeriodsDisplayed() {
        // Logic to check if all periods are displayed
    }

    public void createOperatingPeriod(String startTime, String endTime) {
        enterOperatingPeriodTimes(startTime, endTime);
        clickCreateOperatingPeriodButton();
    }

    public void openCSVFile() {
        // Logic to open CSV file
    }

    public void selectDateWithExistingPeriod() {
        // Logic to select a date with an existing period
    }

    public void selectWeekFromCalendar() {
        // Logic to select week from calendar
    }

    public void clickCopyToAnotherWeekButton() {
        // Logic to click on copy to another week button
    }

    public void selectTargetWeekForCopy() {
        // Logic to select target week for copy
    }

    public void confirmCopyAction() {
        // Logic to confirm copy action
    }

    public void areOperatingPeriodsDisplayedCorrectly() {
        // Logic to verify operating periods displayed correctly
    }

    public void areOperatingPeriodTimesCorrect() {
        // Logic to check if operating period times are correct
    }

    public void areOperatingPeriodDetailsCorrect() {
        // Logic to check if operating period details are correct
    }

    public boolean isOperatingPeriodDisplayed() {
        // Logic to verify if operating period is displayed
        return true; // Placeholder return
    }

    public boolean isScheduleUpdated() {
        // Logic to check if schedule is updated
        return true; // Placeholder return
    }

    public void confirmDeletionAction() {
        // Logic to confirm deletion action
    }

    public void isWeekEndDateCorrect() {
        // Logic to check if week end date is correct
    }

    public void isWeekStartDateCorrect() {
        // Logic to check if week start date is correct
    }

    public void clickExistingOperatingPeriodToEdit() {
        // Logic to click on existing operating period to edit
    }

    public boolean isOperationsDataCopied() {
        // Logic to check if operations data is copied
        return true; // Placeholder return
    }

    public void selectAnotherFutureDate() {
        // Logic to select another future date
    }

    public boolean areChangesReflected() {
        // Logic to verify if changes are reflected
        return true; // Placeholder return
    }

    public boolean isOperatingPeriodActive() {
        // Logic to check if operating period is active
        return true; // Placeholder return
    }

    public boolean isEditedOperatingPeriodDisplayed() {
        // Logic to verify if edited operating period is displayed
        return true; // Placeholder return
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }
}