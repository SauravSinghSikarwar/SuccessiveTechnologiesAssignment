package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pageObjects.BasePage;
import utils.DriverFactory;

public class MasterHooks extends DriverFactory {
	
	@Before
	public void setup() {
		driver = getDriver();
	}
	
	@After
	public void tearDownAndScreenshotOnFailure(Scenario scenario) {
		try {
			if(driver != null && scenario.isFailed()) {

				BasePage.captureScreenshot();
				driver.manage().deleteAllCookies();
				driver.quit();
				driver = null;
			}
			if(driver != null) {
				driver.manage().deleteAllCookies();
				driver.quit();
				driver = null;
			}
		} catch (Exception e) {
			System.out.println("Methods failed: tearDownAndScreenshotOnFailure, Exception: " + e.getMessage());
		}
}
}
