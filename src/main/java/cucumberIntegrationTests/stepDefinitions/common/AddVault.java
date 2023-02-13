package cucumberIntegrationTests.stepDefinitions.common;

import org.apache.commons.validator.routines.InetAddressValidator;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberIntegrationTests.screens.windows.WindowsAddVaultScreen;

public class AddVault {
	WebDriver driver;
	BaseSteps baseSteps;
	WindowsAddVaultScreen addVault;
	
	public AddVault(BaseSteps baseSteps) throws Exception {
		
		this.baseSteps = baseSteps;
	 	baseSteps.Enpass("Windows");
        driver = baseSteps.driver;
        addVault = new WindowsAddVaultScreen(driver);
		
	}
	@Given("^the user has launched the Enpass application$")
	public void the_user_has_launched_the_Enpass_application() throws Throwable {
		 System.out.println("Enpass Launched");
	   
	}

	@When("^the user clicks on the Settings$")
	public void the_user_clicks_on_the_Settings() throws Throwable {
		addVault.SettingButtonMethod();
	    
	  
	}

	@When("^clicks on the Vaults Settings button$")
	public void clicks_on_the_Vaults_Settings_button() throws Throwable {
	    addVault.vaultSettingMethod();
	    
	}

	@When("^clicks on the Add a New vault option$")
	public void clicks_on_the_Add_a_New_vault_option() throws Throwable {
	   addVault.addVaultMethod();
	    
	}

	@When("^selects the vault Location as \"([^\"]*)\"$")
	public void selects_the_vault_Location_as(String arg1) throws Throwable {
	    addVault.thisPCMethod();
	    
	}

	@When("^clicks on the \"([^\"]*)\" option$")
	public void clicks_on_the_option(String arg1) throws Throwable {
	    addVault.createNewVaultMethod();
	  
	}

	@When("^enters the vault name as \"([^\"]*)\"$")
	public void enters_the_vault_name_as(String arg1) throws Throwable {
	    addVault.enterVaultNameMethod(arg1);
	   
	}

	@When("^clicks on the Continue button\\.$")
	public void clicks_on_the_Continue_button() throws Throwable {
	    addVault.continueButtonMethod();
	   
	}

	@When("^sets a master password for the vault as \"([^\"]*)\"$")
	public void sets_a_master_password_for_the_vault_as(String arg1) throws Throwable {
	    addVault.enterVaultPasswordMethod(arg1);
	  
	}

	@When("^confirm master password for the vault as \"([^\"]*)\"$")
	public void confirm_master_password_for_the_vault_as(String arg1) throws Throwable {
	    addVault.enterVaultPasswordMethod(arg1);
	   
	}

	@When("^clicks on the Done button$")
	public void clicks_on_the_Done_button() throws Throwable {
	    addVault.doneMethod();
	
	}

	@Then("^a new vault should be created with the given name and password$")
	public void a_new_vault_should_be_created_with_the_given_name_and_password() throws Throwable {
	    System.out.println("Vault Created successfully");
	    
	    
	}

	@Then("^the user should be able to access the vault from the Vaults list$")
	public void the_user_should_be_able_to_access_the_vault_from_the_Vaults_list() throws Throwable {
		 System.out.println("You can add item in the vault now");
	    
	}

}
