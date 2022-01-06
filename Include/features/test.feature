@CareGap
Feature: Functionality of Care Gap section of a patient

  Background:
    Given I navigate to patient grid
  
    @Add
    @AddSocialHistory
    @Regression
    @Sanity
    Scenario Outline: Add in social history with all fields
    
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Social History tab
	 When I click on social history Add button
    And I enter <Type> in social history type field
    *   I enter <Observation> in social history observation field
    *   I enter <Start_Date> in social history start date field
    *   I enter <End_Date> in social history end date field
    *   I click on social history Update button
	 Then I should see success message for added social history
  	And I should see the newly added <Type> and <Observation> and <Start_Date> and <End_Date> social history on grid
   
   Examples:
   |   Patient    |        Type            |   Observation   |Start_Date|End_Date|
   |Aabram, Allyson|Tobacco use and exposure|under observation| 01012021 |01122021|