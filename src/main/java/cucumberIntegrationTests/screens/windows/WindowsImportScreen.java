package cucumberIntegrationTests.screens.windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import UITestFramework.GenericMethods;

public class WindowsImportScreen extends GenericMethods {
	WindowsAddVaultScreen addVault;
	public WindowsImportScreen(WebDriver driver)
	{
		super(driver);
	}
		
	By hamburgerMenuButton = By.xpath("//Button[starts-with(@ClassName,'ToolItem_QMLTYPE')][@Name='Menu']");
	By fileButton = By.xpath("//MenuItem[starts-with(@ClassName,'MenuItem_QMLTYPE')][@Name='File']");
	By Import = By.xpath("//MenuItem[starts-with(@ClassName,'QmlMenuItem_QMLTYPE')][@Name='Import']");
	By _1Password = By.xpath("//ListItem[starts-with(@ClassName,'PrefsItemDelegate_QMLTYPE')][@Name='1Password']");
    By dropdown = By.xpath("//Edit[@ClassName='QQuickTextField']");
    By pux = By.xpath("//ListItem[starts-with(@ClassName,'ItemDelegate_QMLTYPE')][@Name='1PUX Package/File']");
    By selectFile = By.xpath("//Button[starts-with(@ClassName,'FontButton_QMLTYPE')][@Name='Choose File']");
    By choosefile = By.xpath("//Edit[@ClassName='Edit'][@Name='File name:']");
//    choosefile.sendKeys("C:\\Users\\HemantAttri\\Downloads\\normal data 18 items (1).1pux");
    By open = By.xpath("//Button[@ClassName='Button'][@Name='Open']");
//    By Continue = By.xpath("//Button[starts-with(@ClassName,'SimpleButton_QMLTYPE')][@Name='Continue']");
//    By Continue1 = By.xpath("//Button[starts-with(@ClassName,'SimpleButton_QMLTYPE')][@Name='Continue']");
//    By Done = By.xpath("//Button[starts-with(@ClassName,'SimpleButton_QMLTYPE')][@Name='Done']");
    
	
	public void hamburgerMenuMethod()
	{
		waitForVisibility(hamburgerMenuButton);
		click(hamburgerMenuButton);
	}
	
	public void fileButtonMethod()
	{
		waitForVisibility(fileButton);
		click(fileButton);
	}
	public void importbuttonMethod()
	{
		waitForVisibility(Import);
		click(Import);
	}
	public void _1PasswordMethod()
	{
		waitForVisibility(_1Password);
		click(_1Password);
	}
	
	public void dropDownMethod()
	{
		waitForVisibility(dropdown);
		click(dropdown);
	}
	public void selectPuxMethod()
	{
		waitForVisibility(pux);
		click(pux);
	}
	public void selectFileMethod()
	{
		waitForVisibility(selectFile);
		click(selectFile);
	}
	public void chooseFileMethod(String args)
	{
		waitForVisibility(choosefile);
		sendKeys(choosefile, args);
	}
	public void openMethod()
	{
		waitForVisibility(open);
		click(open);
	}
	
	public void continueMethod()
	{
		addVault.continueButtonMethod();
		addVault.continueButtonMethod();
		
		
	}
	
	
	
	
}
