package StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static Utilities.DriverSetup.closeBrowser;
import static Utilities.DriverSetup.openABrowser;

public class Hooks {
    public static String browserName = System.getProperty("browser", "Chrome");

    @Before
    public void beforeScenario() throws InterruptedException {
        openABrowser(browserName);
    }


    @After
    public void afterScenario() throws InterruptedException {
        closeBrowser();
    }
}
