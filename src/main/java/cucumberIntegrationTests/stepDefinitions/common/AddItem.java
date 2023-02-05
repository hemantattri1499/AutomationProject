package cucumberIntegrationTests.stepDefinitions.common;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberIntegrationTests.CreateSessionCucumber;
import cucumberIntegrationTests.screens.windows.WindowsAddItemScreen;



public class AddItem {
	 WebDriver driver;
	 WindowsAddItemScreen iwindowsAdditemScreen;
	 Properties configFileObject;
	 BaseSteps baseSteps;
	 String userName;
	 String password;
	 public AddItem(BaseSteps baseSteps) throws Exception {
		 	this.baseSteps = baseSteps;
		 	baseSteps.Enpass("Windows");
            driver = baseSteps.driver;
	        iwindowsAdditemScreen = new WindowsAddItemScreen(driver);

	}
	
	 
	    
	    @Given("^I am logged in to Enpass$")
	    public void i_am_logged_in_to_Enpass() throws Exception {
        
	     
	 }
	        
	    @Given("^I am on the main screen of Enpass$")
	    public void i_am_on_the_main_screen_of_Enpass() {
	     System.out.println("Welcone to Enpass App");
	     
	     
	 }

	    @When("I tap on the \"Add Item\" button")
	    public void tap_add_item() {
	    	
    	
    	   iwindowsAdditemScreen.waitForVisibility(iwindowsAdditemScreen.AddItemButton);
	       iwindowsAdditemScreen.findElement(iwindowsAdditemScreen.AddItemButton).click();
	    
	    }

	    @And("I select \"login\" as the category")
	    public void select_login_category() {
	    	iwindowsAdditemScreen.findElement(iwindowsAdditemScreen.loginButton).click();
	    }

	    @And("I \"Search\" the template for the login category")
	    public void search_template_for_login() {
	    	iwindowsAdditemScreen.findElement(iwindowsAdditemScreen.SearchField).sendKeys("Google");
	    }
	    @And("^I select the template from the search results$")
	    public void i_select_the_template_from_the_search_results()  {
	    	iwindowsAdditemScreen.findElement(iwindowsAdditemScreen.Template).click();
	        
	    }

	    @And("I enter \"username\" in the \"Username\" field")
	    public void enter_username() {
	    	iwindowsAdditemScreen.findElement(iwindowsAdditemScreen.UserName).sendKeys("a");
	        
	    }

	    @And("I enter \"password\" in the \"Password\" field")
	    public void enter_password() {
	    	iwindowsAdditemScreen.findElement(iwindowsAdditemScreen.Password).sendKeys("abc");
	    }

	    @And("I tap on the \"Save\" button")
	    public void tap_save() {
	    	iwindowsAdditemScreen.findElement(iwindowsAdditemScreen.SaveButton).click();
	    }

	   
	}       
	    
