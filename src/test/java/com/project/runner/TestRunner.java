package com.project.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/resources/com/automation/features", glue = { "com.project.hook",
        "com.project.stepdefinitions" }, plugin = {
                "pretty",
                "summary",
                "html:target/CucumberReports/CucumberReport-TestNG.html",
                "json:target/cucumber-testng.json",
                "junit:target/cucumber-testng.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }, monochrome = true, dryRun = false, publish = false)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}