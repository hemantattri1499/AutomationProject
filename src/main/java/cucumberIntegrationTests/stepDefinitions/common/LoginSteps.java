package cucumberIntegrationTests.stepDefinitions.common;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberIntegrationTests.CreateSessionCucumber;
import cucumberIntegrationTests.screens.android.AndroidLoginScreen;
import cucumberIntegrationTests.screens.iOS.IOSLoginScreen;
import cucumberIntegrationTests.screens.windows.WindowsLoginScreen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Properties;

public class LoginSteps {
    AndroidLoginScreen androidLoginScreen;
    IOSLoginScreen iosLoginScreen;
    WindowsLoginScreen iwindowsLoginScreen;
    WebDriver driver;
    Properties configFileObject;
    BaseSteps baseSteps;



    public LoginSteps(BaseSteps baseSteps) {
        this.baseSteps = baseSteps;
        driver = baseSteps.driver;
    	iwindowsLoginScreen = new WindowsLoginScreen(driver);
        configFileObject = CreateSessionCucumber.localeConfigProp;
    }
    
    @And("^user has valid masterpassword$")
    public void usernameAndPasswordIs() {
    	iwindowsLoginScreen.hi();
    }

    @When("^user enters masterpassword$")
    public void userEntersCredentials()  {
    	iwindowsLoginScreen.userEntersCredential();
    	
    	
    	
    }
    
    @And("\"([^\"]*)\" button should be visible")
    public void unlockVisible(String button) throws InterruptedException {
    	iwindowsLoginScreen.unlockButtonVisible(button);
       
    }

    @Then("^user able to click on \"([^\"]*)\" button$")
    public void unlock(String arg0){
    	iwindowsLoginScreen.unlockButton(arg0);
      
       
    }
   

 
}

  




