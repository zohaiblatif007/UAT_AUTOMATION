Feature: Care Cordination Left Filters

  Background: 
    Given I navigate to patient grid

  

  Scenario Outline: Applying Patient Program Filter
    When I click on care cordination
    * I clear before and after dates
    
    * I click on care cordination reset button
    * I clear before and after dates
    
    * I select <EncProgram> patient program
    * I click on care cordination apply button
    Then I should see <EncProgram> care cordination Enc program

  Examples:
  |EncProgram|
  |TCM|