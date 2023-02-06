package cucumberIntegrationTests.screens.windows;

import UITestFramework.GenericMethods;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.PasswordAuthentication;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * contains all the locators present on the login screen of iOS app.
 */
public class WindowsLoginScreen extends GenericMethods {

	public WindowsLoginScreen(WebDriver driver) throws IOException {
		super(driver);
		
//		   Properties prop = new Properties();
//		   FileInputStream file = new FileInputStream("C:\\Users\\HemantAttri\\Documents\\automation-framework\\automation-framework\\src\\main\\java\\testData\\en_US_windows.properties");
//		   password= prop.load(file);
//		// TODO Auto-generated constructor stub
	}
    Properties configFileObject;
    public By masterpassword = By.name("Master Password");
	public By unlock = By.name("Unlock");

    public void hi() {

}
    	    
    public void userEntersCredential(String args){
    	waitForVisibility(masterpassword);
        findElement(masterpassword).sendKeys(args);
        System.out.println("q");
        
    }
    
    public void unlockButtonVisible(String button) throws InterruptedException {
    	isElementPresent(unlock);
    }

    
    public void unlockButton(String arg0){
       waitForVisibility(unlock);
       findElement(unlock).click();
       
    }

    



}


