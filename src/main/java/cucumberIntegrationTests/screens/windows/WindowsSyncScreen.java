package cucumberIntegrationTests.screens.windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import UITestFramework.GenericMethods;

public class WindowsSyncScreen extends GenericMethods{
	WindowsAddVaultScreen addVault;

	public WindowsSyncScreen(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
	}
	
	By primaryVault = By.xpath("//Text[starts-with(@ClassName,'Label_QMLTYPE')][@Name='Primary']");
	By connectButton = By.xpath("//Button[starts-with(@ClassName,'PrefsButton_QMLTYPE')][@Name='Connect']");
	By box = By.xpath("//ListItem[starts-with(@ClassName,'PrefsItemDelegate_QMLTYPE')][@Name='Box']");
	
	
	public void primaryVaultMethod()
	{
		addVault.SettingButtonMethod();
		addVault.vaultSettingMethod();				
	}	
	
	
	
	public void selectPrimaryVaultMethod()
	{
		waitForVisibility(primaryVault);
		click(primaryVault);
	}
	public void connectMethod()
	{
		waitForVisibility(connectButton);
		click(connectButton);
	}
	public void boxMethod()
	{
		waitForVisibility(box);
		click(box);
	}
	
	
}
