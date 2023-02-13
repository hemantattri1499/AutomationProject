Feature: Add a Vault in Enpass

Scenario: User wants to add a new vault

Given the user has launched the Enpass application
When the user clicks on the Settings 
And clicks on the Vaults Settings button
And clicks on the Add a New vault option
And selects the vault Location as "This PC"
And clicks on the "Create a New vault" option
And enters the vault name as "New vault"
And clicks on the Continue button.
And sets a master password for the vault as "abc"
And clicks on the Continue button.
And confirm master password for the vault as "abc"
And clicks on the Done button
Then a new vault should be created with the given name and password
And the user should be able to access the vault from the Vaults list