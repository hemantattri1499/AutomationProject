package cucumberIntegrationTests.screens.windows;

import UITestFramework.GenericMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class WindowsAddItemScreen extends GenericMethods {

	public WindowsAddItemScreen(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public By AddItemButton = By.name("Add Item");
	public By loginButton = By.xpath("//ListItem[starts-with(@ClassName,'PrefsItemDelegate_QMLTYPE')][1]");
	public By SearchField = By.xpath("//Edit[starts-with(@ClassName,'BaseTextField_QMLTYPE')]");
	public By Template = By.xpath("//ListItem[starts-with(@ClassName,'PrefsItemDelegate_QMLTYPE')][2]");
	public By UserName = By.xpath("//Edit[starts-with(@ClassName,'BaseTextField_QMLTYPE')][@Name='Username']");
	public By Password = By.xpath("//Edit[starts-with(@ClassName,'BaseTextField_QMLTYPE')][@Name='E-mail']");
	public By SaveButton = By.name("Save");
	
	


    public void addItem() {
    	waitForVisibility(AddItemButton);
    	findElement(AddItemButton).click();
    	
    }


    public void selectCategory() {
    	waitForVisibility(loginButton);
    	findElement(loginButton).click();

    }

    public void searchTemplate(String args) {
    	waitForVisibility(SearchField);
    	findElement(SearchField).sendKeys(args);

    }

    public void SearchResults()  {
    	waitForVisibility(Template);
    	findElement(Template).click();

        
    }

    public void userNameField(String args) {
    	waitForVisibility(UserName);
    	findElement(UserName).sendKeys(args);

        
    }


    public void passwordField(String args) {
    	waitForVisibility(Password);
    	findElement(Password).sendKeys(args);

    }


    public void saveButton() {
    	waitForVisibility(SaveButton);
    	findElement(SaveButton).click();
   
    }
	
	
}


