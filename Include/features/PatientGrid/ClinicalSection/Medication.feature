@Medication
Feature: Add Edit and Delete in Medication

Background: 
	Given I navigate to patient grid
	 
  @Add
  @AddMedication
  @Regression
  @Sanity
Scenario Outline: Add in medication with all fields

  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Medication	tab
	 When I click on medication Add button
    And I enter <Source_Type> in medication source type field
    *   I enter <Name> in medication name field
    *   I enter <Frequency> in medication frequency field
    *   I enter <Route> in medication route field
		*   I enter <Start_Date> in medication start date field 
	  *   I enter <Prescribed_By> in medication prescribed by type field
	  *   I enter <CPOE> in medication cpoe field
	  *   I enter <eSent> in medication esent field
	  *   I enter <Drug_Formulacy> in medication drug formulacy status field
	  *   I enter <Directions> in medication directions field
	  *   I click on medication Save All button
	 Then I should see success message for added medication
		And I should see the newly added <Source_Type> and <Name> and <Frequency> and <Route> and <Start_Date> and <CPOE> and <eSent> and <Drug_Formulacy> and <Directions> medication on grid
		

 Examples:
     |    Patient   |Source_Type|                               Name                              |  Frequency  |      Route     |Start_Date|    Prescribed_By  |CPOE|eSent|Drug_Formulacy|        Directions         |
     |Aabram, Allyson|    MMSL   |Humulin R U-500 KwikPen 500unit/ml Solution for Injection::100034|3 times a day|Auricular (otic)| 12102020 |Dat Nguyen        | Yes| Yes |     Yes      |As per the doctor recommend|
  
  
  @Edit  
  @EditMedication
  @Regression
  @Sanity
Scenario Outline: Edit in medication with all fields

  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Medication	tab
	 When I click on medication Edit button
    And I enter <Source_Type> in medication source type field
    *   I enter <Name> in medication name field
    *   I enter <Frequency> in medication frequency field
    *   I enter <Route> in medication route field
		*   I enter <Start_Date> in medication start date field 
	  *   I enter <Prescribed_By> in medication prescribed by type field
	  *   I enter <CPOE> in medication cpoe field
	  *   I enter <eSent> in medication esent field
	  *   I enter <Drug_Formulacy> in medication drug formulacy status field
	  *   I enter <Directions> in medication directions field
	  *   I click on medication Save All button
	 Then I should see success message for edit medication
		And I should see the newly added <Source_Type> and <Name> and <Frequency> and <Route> and <Start_Date> and <CPOE> and <eSent> and <Drug_Formulacy> and <Directions> medication on grid
		
		

 Examples:
     |    Patient    |Source_Type|              Name                 |  Frequency  |Route |Start_Date|Prescribed_By|CPOE|eSent|Drug_Formulacy|              Directions             |
     |Aabram, Allyson|    HPC    |Advanced life support mileag::A0390|Every 8 hours|Dental| 03172021 |Dat Nguyen  | Yes|  No |      No      |Edit directions in case of medication|
    
    
  @DeleteMedication
  @Delete
  @Regression
  @Sanity
Scenario Outline: Delete the specific record in medication

  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Medication	tab
		*   I enter <Source_Type> to delete record in medication 
	 Then I should see success message for deleted record
	  And I should see the deleted medication not present on grid
		

 Examples:
     |    Patient   |Source_Type|         
     |Aabram, Allyson|    HPC    |
    #
