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
	//"PrefsItemDelegate_QMLTYPE_68"
	public By Template = By.xpath("//ListItem[starts-with(@ClassName,'PrefsItemDelegate_QMLTYPE')][2]");
	public By UserName = By.xpath("//Edit[starts-with(@ClassName,'BaseTextField_QMLTYPE')][@Name='Username']");
	public By Password = By.xpath("//Edit[starts-with(@ClassName,'BaseTextField_QMLTYPE')][@Name='E-mail']");
	public By SaveButton = By.name("Save");
	
	
}


