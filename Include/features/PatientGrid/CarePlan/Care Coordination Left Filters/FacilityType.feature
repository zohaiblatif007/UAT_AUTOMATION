Feature: Care Cordination Left Filters

  Background: 
    Given I navigate to patient grid

 
      
  Scenario Outline: Applying Serving Facility Type Filter
    When I click on care cordination
    * I clear before and after dates
    * I click on care cordination reset button
    * I clear before and after dates
    * I enter <Facility> as serving facility type
    * I click on care cordination apply button
    Then I should see care cordination <Facility> as serving facility type
    
    Examples: 
      | Facility |
      | HOS      |
