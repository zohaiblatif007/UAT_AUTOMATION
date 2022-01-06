@Allergies
Feature: Add Edit and Delete in Allergies

Background: 
  Given I navigate to patient grid
    
   @Add
   @AddAllergies
   @Regression
   @Sanity
    Scenario Outline: Add in allergies with all fields
    
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Allergies tab
	 When I click on allergies Add button
		And I enter <Type> in allergies type field
		*   I enter <Source> in allergies source field
		*   I enter <Allergy> in allergies allergy field
		*   I enter <Reaction> in allergies reaction field
		*   I enter <Severity> in allergies severity field
		*   I enter <Status> in allergies status field
		*   I enter <Start_Date> in allergies start date field
		*   I enter <End_Date> in allergies end date field
		*   I enter <Comments> in allergies comments field
    *   I click on allergies Update button
	 Then I should see success message for added allergies
		And I should see the newly added allergy record <Type>, <Source>, <Allergy>, <Reaction>, <Severity>, <Status>, <Start_Date>, <End_Date> and <Comments> on grid
		
    Examples:
    |   Patient    |       Type         |Source|                       Allergy                    |                   Reaction                  |Severity|Status|Start_Date|End_Date|        Comments         |
    |Aabram, Allyson  |Allergy to substance|SNOMED|Allergy to insect venom (finding)|Edema of lower extremity (finding)::102572006|Moderate|Active| 01042021 |01232021|For a long time suffering|
    
    
   @Edit
   @EditAllergies
   @Regression
   @Sanity
    Scenario Outline: Edit in allergies with all fields
    
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Allergies tab
	 When I click on allergies Edit button
		And I enter <Type> in allergies type field
		*   I enter <Source> in allergies source field
		*   I enter <Allergy> in allergies allergy field
		*   I enter <Reaction> in allergies reaction field
		*   I enter <Severity> in allergies severity field
		*   I enter <Status> in allergies status field
		*   I enter <Start_Date> in allergies start date field
		*   I enter <End_Date> in allergies end date field
		*   I enter <Comments> in allergies comments field
    *   I click on allergies Update button
	 Then I should see success message for edit allergies
		And I should see the newly added allergy record <Type>, <Source>, <Allergy>, <Reaction>, <Severity>, <Status>, <Start_Date>, <End_Date> and <Comments> on grid
		
    Examples:
    |   Patient    |    Type    |Source|      Allergy        |        Reaction        |Severity|Status|Start_Date|End_Date|         Comments         |
    |Aabram, Allyson |Food allergy|Custom|Allergy Set by custom|Apnea (finding)::1023001| Severe |Active| 03142021 |03172021|suffering due to allergies|
    
   @Delete
   @DeleteAllergies
   @Regression
   @Sanity
    Scenario Outline: Delete the specific record in allergies
    
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Allergies tab
		*   I enter <Type> to delete record in allergies 
	 Then I should see success message for deleted record
	  And I should see the deleted allergy not present on grid
		
    Examples:
    |   Patient  |    Type    |      
    |Aabram, Allyson|Food allergy|
    
    