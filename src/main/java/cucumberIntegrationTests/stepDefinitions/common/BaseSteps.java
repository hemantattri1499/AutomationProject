package cucumberIntegrationTests.stepDefinitions.common;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumberIntegrationTests.CreateSessionCucumber;
import cucumberIntegrationTests.CucumberRunnerUtil;
import cucumberIntegrationTests.screens.android.AndroidLoginScreen;
import cucumberIntegrationTests.screens.iOS.IOSLoginScreen;
import cucumberIntegrationTests.screens.windows.WindowsAddItemScreen;
import cucumberIntegrationTests.screens.windows.WindowsLoginScreen;

import org.openqa.selenium.WebDriver;

public class BaseSteps {
    CreateSessionCucumber createSessionCucumber;
    WebDriver driver;
    String platform;
    AndroidLoginScreen androidLoginScreen;
    IOSLoginScreen iosLoginScreen;
    WindowsLoginScreen iwindowsLoginScreen;
    WindowsAddItemScreen iwindowsAdditemScreen;
    


    @Given("^User has Enpass \"([^\"]*)\" app$")
    public void Enpass(String invokeDriver) throws Exception {

        platform = invokeDriver;
        createSessionCucumber = new CreateSessionCucumber();
        createSessionCucumber.createDriver(invokeDriver, BaseSteps.class.getDeclaredMethod("Enpass",String.class));
        driver = createSessionCucumber.getWebDriver();

        if (invokeDriver.equalsIgnoreCase("android")) {
            androidLoginScreen = new AndroidLoginScreen(driver);
        } else if (invokeDriver.equalsIgnoreCase("iOS")) {
            iosLoginScreen = new IOSLoginScreen(driver);
        } else if (invokeDriver.equalsIgnoreCase("windows")) {
;
        }
    }

}
