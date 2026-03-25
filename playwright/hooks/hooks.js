const {
  Before,
  After,
  BeforeAll,
  AfterAll,
  setDefaultTimeout,
  Status
} = require('@cucumber/cucumber');

const { chromium } = require('playwright');

setDefaultTimeout(60 * 1000); // 60 seconds timeout

let browser;

// 🔹 Launch browser once
BeforeAll(async function () {
  browser = await chromium.launch({
    headless: false, // true for CI/CD
    slowMo: 50       // optional: slow down execution
  });
});

// 🔹 Before each scenario
Before(async function () {
  this.context = await browser.newContext({
    viewport: { width: 1280, height: 720 },
    ignoreHTTPSErrors: true
  });

  this.page = await this.context.newPage();

  // 👉 Optional: maximize window (Chromium only workaround)
  await this.page.setViewportSize({ width: 1920, height: 1080 });
});

// 🔹 After each scenario
After(async function (scenario) {
  try {
    // 📸 Screenshot on failure
    if (scenario.result.status === Status.FAILED) {
      const screenshot = await this.page.screenshot({
        path: `reports/screenshots/${Date.now()}.png`,
        fullPage: true
      });

      await this.attach(screenshot, 'image/png');
    }
  } catch (error) {
    console.error("Error in After hook:", error);
  } finally {
    // 🧹 हमेशा cleanup करो
    if (this.page) await this.page.close();
    if (this.context) await this.context.close();
  }
});

// 🔹 Close browser after all tests
AfterAll(async function () {
  if (browser) {
    await browser.close();
  }
});