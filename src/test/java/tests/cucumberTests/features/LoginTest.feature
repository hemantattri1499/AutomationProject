@login
Feature: Verify login functionality on Enpass app
Background: Create an instance of android or ios driver before each scenario
Given User has Enpass "windows" app
Scenario: User should be able to login on app with correct credentials and initial set up should be shown
Given user has valid masterpassword
When user enters masterpassword
Then "Unlock" button should be visible
And user able to click on "Unlock" button