Feature: Add Healthconcern

Background: 
    Given I am logged in
    And I am on patient grid page
    When I search patient using Asalah, Asalah
    
    @Add
    Scenario: Add in healthconcern with all fields
    
    Given I am on PWB CLinical section