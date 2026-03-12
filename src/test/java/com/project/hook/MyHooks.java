package com.project.hook;

import com.project.driverfactory.DriverFactory;
import com.project.utils.CommonUtils;
import com.project.utils.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class MyHooks extends DriverFactory {

    private static Logger logger = LogManager.getLogger(MyHooks.class);
    private WebDriver driver;

    @Before
    public void setup(Scenario scenario) {
        ConfigReader config = ConfigReader.getInstance();
        System.out.println("DEBUG: isPlaywrightEnabled = " + config.isPlaywrightEnabled());

        if (config.isPlaywrightEnabled()) {
            logger.info("Initializing Playwright for scenario: " + scenario.getName());
            DriverFactory.initPlaywright();
        } else {
            logger.info("Initializing Selenium for scenario: " + scenario.getName());
            DriverFactory.initializeBrowser(config.getBrowser());
            this.driver = DriverFactory.getDriver();
            this.driver.get(config.getBaseUrl());
            logger.info("URL loaded in browser: " + config.getBaseUrl());
        }
    }

    @After
    public void tearDown(Scenario scenario) {
        ConfigReader config = ConfigReader.getInstance();
        String scenarioName = scenario.getName().replaceAll(" ", "_");

        if (config.isPlaywrightEnabled()) {
            if (scenario.isFailed()) {
                byte[] screenshot = DriverFactory.getPlaywrightPage()
                        .screenshot(new com.microsoft.playwright.Page.ScreenshotOptions()
                                .setFullPage(true));
                scenario.attach(screenshot, "image/png", scenarioName);
            }
            DriverFactory.quitPlaywright();
            logger.info("Playwright quit");
        } else {
            if (scenario.isFailed() && DriverFactory.getDriver() != null) {
                byte[] srcScreenshot = CommonUtils.takeScreenShot(scenario, DriverFactory.getDriver(), scenarioName);
                scenario.attach(srcScreenshot, "image/png", scenarioName);
                logger.info("Scenario failed, screenshot captured");
            }
            if (DriverFactory.getDriver() != null) {
                DriverFactory.getDriver().quit();
                logger.info("Selenium driver quit");
            }
        }
    }
}
