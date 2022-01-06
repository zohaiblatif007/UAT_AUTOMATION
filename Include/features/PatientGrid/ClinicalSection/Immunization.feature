@Immunizations
Feature: Add Edit and Delete in Immunizations

  Background: 
  Given I navigate to patient grid

  @AddImmunizations
  @Regression
  @Sanity
  Scenario Outline: Add in immunizations with all fields
  
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Immunizations	tab
	 When I click on immunizations Add button
		And I enter <Source> in immunizations source field
		*   I enter <Vaccine> in immunizations vaccine field	
    *   I enter <Date> in immunizations date field
    *   I enter <Status> in immunizations status field	
    *   I enter <Lot_Number> in immunizations lot number field	
    *   I enter <Manufacture_Name> in immunizations manufacture name field	
    *   I enter <Comment> in immunizations comment field	
    *   I click on immunnizations Update button
	 Then I should see success message for added immunnizations
		And I should see added record <Source> and <Vaccine> and <Date> and <Status> and <Lot_Number> and <Manufacture_Name> and <Comment> for immunnizations on grid
			
Examples:
     |    Patient   |Source|           Vaccine             |  Date  | Status  |Lot_Number|Manufacture_Name|              Comment             | 
     |Aabram, Allyson| ICD-9|THER ULTRASOUND OF HEART::00.02|01012021|Completed|     1    |  vaccination   |Immunization protects from disease|
     
   @EditImmunizations
   @Regression
   @Sanity
  Scenario Outline: Edit in immunizations with all fields
  
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Immunizations	tab
	 When I click on immunizations Edit button
		And I enter <Source> in immunizations source field
		*   I enter <Vaccine> in immunizations vaccine field	
    *   I enter <Date> in immunizations date field
    *   I enter <Status> in immunizations status field	
    *   I enter <Lot_Number> in immunizations lot number field	
    *   I enter <Manufacture_Name> in immunizations manufacture name field	
    *   I enter <Comment> in immunizations comment field	
    *   I click on immunnizations Update button
	 Then I should see success message for edit immunnizations
	  And I should see added record <Source> and <Vaccine> and <Date> and <Status> and <Lot_Number> and <Manufacture_Name> and <Comment> for immunnizations on grid
			
Examples:
     |    Patient    |Source|            Vaccine             |  Date  |   Status|Lot_Number|Manufacture_Name|    Comment   | 
     |Aabram, Allyson| CVX  |influenza, live, intranasal::111|03172021|Completed|     15   |Medicine company|comments added|
     
     
   @DeleteImmunizations
   @Regression
   @Sanity
  Scenario Outline: Delete the specific record in immunizations 
  
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Immunizations	tab
	  *   I enter <Source> to delete record in immunization 
	 Then I should see success message for deleted record
	  And I should see the deleted immunization not present on grid
		
			
Examples:
     |    Patient   |Source|         
     |Aabram, Allyson| CVX  |
     #
     