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
	    public void i_am_logged_in_to_enpass() throws Throwable {
	    	System.out.println("Welcome To Enpass");
	    
	    }

	    @Given("^I am on the main screen of Enpass$")
	    public void i_am_on_the_main_screen_of_enpass() throws Throwable {
	    	System.out.println("I am on the main screen");
	   
	    }

	    @When("^I tap on the Add Item button$")
	    public void i_tap_on_the_add_item_button() throws Throwable {
           iwindowsAdditemScreen.addItem();
	       
	    }

	    @And("^I select \"([^\"]*)\" as the category$")
	    public void i_select_something_as_the_category(String strArg1) throws Throwable {
	    	iwindowsAdditemScreen.selectCategory();
	   
	    }

	    @And("^I Search the template for the \"([^\"]*)\"$")
	    public void i_search_the_template_for_the_something(String strArg1) throws Throwable {
	    	iwindowsAdditemScreen.searchTemplate(strArg1);
	      
	    }

	    @And("^I select the template from the search results$")
	    public void i_select_the_template_from_the_search_results() throws Throwable {
	    	iwindowsAdditemScreen.SearchResults();
	       
	    }

	    @And("^I enter \"([^\"]*)\" in the Username field$")
	    public void i_enter_something_in_the_username_field(String strArg1) throws Throwable {
	    	iwindowsAdditemScreen.userNameField(strArg1);
	     
	    }

	    @And("^I enter \"([^\"]*)\" in the Password field$")
	    public void i_enter_something_in_the_password_field(String strArg1) throws Throwable {
	    	iwindowsAdditemScreen.passwordField(strArg1);
	     
	    }

	    @And("^I tap on the \"([^\"]*)\" button$")
	    public void i_tap_on_the_something_button(String strArg1) throws Throwable {
	    	iwindowsAdditemScreen.saveButton();
	       
	    }
	    


	   
	}       
	    
