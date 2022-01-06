@FamilyHistory
Feature: Add Edit and Delete in Family History

Background: 
  Given I navigate to patient grid
    
    @AddFamilyHistory
    @Regression
    @Sanity
    Scenario Outline: Add in family history with all fields
    
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Family History tab
	 When I click on family history Add button	
		And I enter <Source_Code> in family history source code field
		*   I enter <Code_Name> in family history code or name field
		*   I enter <Relationship> in family history relationship field
		*   I enter <Gender> in family history gender field
		*   I enter <Start_Date> in family history start date field
		*   I enter <End_Date> in family history end date field
		*   I enter <Negation> in family history negation field
		*   I enter <Deceased> in family history deceased field
		*   I enter <Comments> in family history comments field
	  *   I click on family history Update button
	 Then I should see success message for added family history
  	And I should see the newly added family history record <Source_Code>, <Code_Name>, <Relationship>, <Gender>, <Start_Date>, <End_Date>, <Negation>, <Deceased> and <Comments> on grid  
		
		Examples:
		|    Patient    |Source_Code|          Code_Name            |Relationship|Gender|Start_Date|End_Date|Negation|Deceased|         Comments         |
		|Aabram, Allyson|   ICD-9   |THER ULT HEAD & NECK VES::00.01|Foster child| Male | 01012021 |01122021|   Yes  |  Yes   |No disease found in family|
		
		
		@EditFamilyHistory
	  @Regression
    @Sanity
    Scenario Outline: Edit in family history with all fields
    
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Family History tab
	 When I click on family history Edit button	
		And I enter <Source_Code> in family history source code field
		*   I enter <Code_Name> in family history code or name field
		*   I enter <Relationship> in family history relationship field
		*   I enter <Gender> in family history gender field
		*   I enter <Start_Date> in family history start date field
		*   I enter <End_Date> in family history end date field
		*   I enter <Negation> in family history negation field
		*   I enter <Deceased> in family history deceased field
		*   I enter <Comments> in family history comments field
	  *   I click on family history Update button
	 Then I should see success message for edit family history
		And I should see the newly added family history record <Source_Code>, <Code_Name>, <Relationship>, <Gender>, <Start_Date>, <End_Date>, <Negation>, <Deceased> and <Comments> on grid  
		
		Examples:
		|   Patient    |Source_Code|             Code_Name             | Relationship  |Gender|Start_Date|End_Date|Negation|Deceased|         Comments         |
		|Aabram, Allyson|    HPC    |Outside state ambulance serv::A0021|Foster daughter|Female| 03112021 |03182021|   No   |  Yes   |Edit family history record|
		
		
		@DeleteFamilyHistory
	  @Regression
    @Sanity
    Scenario Outline: Delete the specific record in family history
    
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Family History tab
	  *   I enter <Source_Code> to delete record in family history 
	 Then I should see success message for deleted record
	  And I should see the deleted family history not present on grid
		
		Examples:
		|   Patient    |Source_Code| 
		|Aabram, Allyson|    HPC    |
#
#	