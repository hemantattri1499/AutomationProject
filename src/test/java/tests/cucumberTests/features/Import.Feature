Feature: Import data to Enpass

  Scenario: Import 1Password items
    Given I am on the Enpass main screen
    When click on the Hamburger Menu
    And select the File option
    And click on the Import button
    And choose the 1Password Manager
    And select the File format as 1PUX 
    And select the File location from the select File window.
    And click on the Continue button
    Then succcess message should appear
    And clicking on the Done button the item should be added