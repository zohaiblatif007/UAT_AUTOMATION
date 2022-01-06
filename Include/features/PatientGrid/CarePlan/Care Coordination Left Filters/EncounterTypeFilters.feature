Feature: Care Cordination Left Filters

  Background: 
    Given I navigate to patient grid

  

  Scenario Outline: Applying Encounter Type Filter
    When I click on care cordination
    * I clear before and after dates
    And I click on care cordination reset button
    * I clear before and after dates
    And I enter <EncounterType> as encounter type
    And I click on care cordination apply button
    Then I should see care cordination Encounter <EncounterType> filters

    Examples: 
      | EncounterType |
      | Inpatient      |