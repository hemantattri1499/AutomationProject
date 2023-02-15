package cucumberIntegrationTests.stepDefinitions.common;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberIntegrationTests.CreateSessionCucumber;
import cucumberIntegrationTests.screens.windows.WindowsAddVaultScreen;
import cucumberIntegrationTests.screens.windows.WindowsImportScreen;

public class Import {
	WebDriver driver;
	BaseSteps baseSteps;
	WindowsImportScreen importScreen;
	WindowsAddVaultScreen addVault;
	Properties configFileObject;
	String path;
	public Import(BaseSteps baseSteps) throws Exception
	{
		this.baseSteps = baseSteps;
	 	baseSteps.Enpass("Windows");
        driver = baseSteps.driver;
        configFileObject = CreateSessionCucumber.localeConfigProp;
        path = configFileObject.getProperty("path");
        importScreen = new WindowsImportScreen(driver);
        addVault = new WindowsAddVaultScreen(driver);
	}
	@Given("^I am on the Enpass main screen$")
	public void i_am_on_the_Enpass_main_screen() throws Throwable {
		System.out.println("User is on the Main Screen");
	    
	}

	@When("^click on the Hamburger Menu$")
	public void click_on_the_Hamburger_Menu() throws Throwable {
		importScreen.hamburgerMenuMethod();
	    
	}

	@When("^select the File option$")
	public void select_the_File_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		importScreen.fileButtonMethod();
	}

	@When("^click on the Import button$")
	public void click_on_the_Import_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		importScreen.importbuttonMethod();
	}

	

	@When("^choose the (\\d+)Password Manager$")
	public void choose_the_Password_Manager(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		importScreen._1PasswordMethod();
	    
	}


	@When("^select the File format as (\\d+)PUX$")
	public void select_the_File_format_as_PUX(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		importScreen.dropDownMethod();
		importScreen.selectPuxMethod();
		importScreen.selectFileMethod();
	 
	}

	@When("^select the File location from the select File window\\.$")
	public void select_the_File_location_from_the_select_File_window() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		importScreen.chooseFileMethod(path);
		importScreen.openMethod();
		
	   
	}

	@When("^click on the Continue button$")
	public void click_on_the_Continue_button() throws Throwable {
	   addVault.continueButtonMethod();
	   addVault.continueButtonMethod();
	   
	}

	@Then("^succcess message should appear$")
	public void succcess_message_should_appear() throws Throwable {
	    addVault.doneMethod();
	    
	}

	@Then("^clicking on the Done button the item should be added$")
	public void clicking_on_the_Done_button_the_item_should_be_added() throws Throwable {
	    System.out.println("Items added successfully");
	    
	}

}
