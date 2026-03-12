package com.project.driverfactory;

import com.microsoft.playwright.Page;
import com.project.utils.PlaywrightFactory;
import com.project.utils.ConfigReader;
import com.project.utils.CommonUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.time.Duration;

public class DriverFactory {

    public static WebDriver driver;
    private static Page playwrightPage;
    private static Logger logger = LogManager.getLogger(DriverFactory.class);

    public static void initializeBrowser(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            // options.addArguments("--headless=new");
            driver = new ChromeDriver(options);
            logger.info("chrome driver initialized");
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            logger.info("firefox driver initialized");
        } else if (browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            logger.info("Edge driver initialized");
        } else if (browserName.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
            logger.info("safari driver initialized");
        }

        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.manage().window().setPosition(new Point(0, 0));
            driver.manage().window().setSize(new Dimension(1920, 1080));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(CommonUtils.PAGE_LOAD_TIME));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(CommonUtils.IMPLICIT_WAIT_TIME));
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static Page getPlaywrightPage() {
        return playwrightPage;
    }

    public static void initPlaywright() {
        String browser = ConfigReader.getInstance().getBrowser();
        playwrightPage = PlaywrightFactory.initBrowser(browser);
        logger.info("Playwright page initialized");
    }

    public static void quitPlaywright() {
        PlaywrightFactory.closeBrowser();
        logger.info("Playwright browser closed");
    }
}
