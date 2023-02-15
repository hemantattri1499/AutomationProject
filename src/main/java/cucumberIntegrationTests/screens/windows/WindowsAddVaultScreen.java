package cucumberIntegrationTests.screens.windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.By;
import org.springframework.context.support.GenericApplicationContext;

import UITestFramework.GenericMethods;

public class WindowsAddVaultScreen extends GenericMethods {
	
	public WindowsAddVaultScreen(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public By settings = By.xpath("//Button[starts-with(@ClassName,'ToolItem_QMLTYPE')][@Name='Settings']");
    public By vaultSettings = By.xpath("//TabItem[starts-with(@ClassName,'PrefsTabButton_QMLTYPE')][@Name='Vaults']");
	public By addVault = By.xpath("//Text[starts-with(@ClassName,'Label_QMLTYPE')][@Name='Add new vault']");
	public By thisPC = By.xpath("//Text[starts-with(@ClassName,'Label_QMLTYPE')][@Name='This PC']");
	public By createNewLocalVault = By.xpath("//Text[starts-with(@ClassName,'Label_QMLTYPE')][@Name='Create a new vault']");
	public By enterVaultName = By.xpath("//Edit[starts-with(@ClassName,'BaseTextField_QMLTYPE')]");
    public By continueButton = By.xpath("//Button[starts-with(@ClassName,'SimpleButton_QMLTYPE')][@Name='Continue']");
	public By enterVaultPassword = By.xpath("//Edit[starts-with(@ClassName,'SecureField_QMLTYPE')]");
	public By Done = By.xpath("//Button[starts-with(@ClassName,'SimpleButton_QMLTYPE')][@Name='Done']");
	
	
	public void SettingButtonMethod()
	{
		waitForVisibility(settings);
		click(settings);
	}
	
   public void vaultSettingMethod()
   {
	   waitForVisibility(vaultSettings);
		click(vaultSettings);
   }
   
   public void addVaultMethod() {
	   waitForVisibility(addVault);
		click(addVault);
	
}
   public void thisPCMethod() {
	   waitForVisibility(thisPC);
		click(thisPC);
	
}
   public void createNewVaultMethod() {
	   waitForVisibility(createNewLocalVault);
		click(createNewLocalVault);
	
}
   public void enterVaultNameMethod(String args) {
	   waitForVisibility(enterVaultName);
	   sendKeys(enterVaultName, args);
	
}
   public void continueButtonMethod() {
	   waitForVisibility(continueButton);
		click(continueButton);
}
   public void enterVaultPasswordMethod(String args) {
	   waitForVisibility(enterVaultPassword);
		sendKeys(enterVaultPassword, args);
	
}
   public void doneMethod() {
	   waitForVisibility(Done);
	   click(Done);
   
}
}
