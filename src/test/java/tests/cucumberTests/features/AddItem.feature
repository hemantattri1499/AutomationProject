Feature: Create an item in Enpass app
    As a user
    I want to be able to create an item in Enpass
    So that I can save my login credentials securely
    
Background:
  Given I am logged in to Enpass

Scenario: Successfully creating an item in Enpass
  Given I am on the main screen of Enpass
   When I tap on the Add Item button
    And I select "login" as the category
    And I Search the template for the "google"
    And I select the template from the search results
    And I enter "hemant" in the Username field
    And I enter "attri" in the Password field
    And I tap on the "Save" button
    
