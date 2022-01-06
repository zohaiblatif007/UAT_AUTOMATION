Feature: Care Cordination Left Filters

  Background: 
    Given I navigate to patient grid

  
  Scenario Outline: Applying LOB Filter
    When I click on care cordination
    * I clear before and after dates
    And I click on care cordination reset button
    * I clear before and after dates
    And I select <LOB> as LOB
    And I click on care cordination apply button
    Then I should see <LOB> as care cordination LOB
    
    

 Examples:
 |LOB|
 |Non-Attributed|