Feature: Care Cordination Left Filters

  Background: 
    Given I navigate to patient grid

  Scenario Outline: Applying Serving Facility Filter
    When I click on care cordination
    * I clear before and after dates
    * I click on care cordination reset button
    * I clear before and after dates
    * I enter <ServingFacility> as serving facility
    * I click on care cordination apply button
    Then I should see care cordination serving facility <ServingFacility>

    Examples: 
      | ServingFacility |
      | Support Test Fac    |
      