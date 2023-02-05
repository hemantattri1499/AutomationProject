package cucumberIntegrationTests.screens.windows;

import UITestFramework.GenericMethods;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * contains all the locators present on the login screen of iOS app.
 */
public class WindowsLoginScreen extends GenericMethods {

	public WindowsLoginScreen(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    Properties configFileObject;
    String password;


	public By masterpassword = By.name("Master Password");
	public By unlock = By.name("Unlock");

    public void hi() {
	   System.out.println("Enter the master password");
}
    	    
    public void userEntersCredential(){
    	waitForVisibility(masterpassword);
        findElement(masterpassword).sendKeys(password);
        
    }
    
    public void unlockButtonVisible(String button) throws InterruptedException {
    	isElementPresent(unlock);
    }

    
    public void unlockButton(String arg0){
       waitForVisibility(unlock);
       findElement(unlock).click();
       
    }

    



}


