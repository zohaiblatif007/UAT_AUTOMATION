@ImagingOrder
Feature: Add Edit and Delete in Imaging Order

Background: 
  Given I navigate to patient grid

   @AddImagingOrder
   @Regression
   @Sanity
    Scenario Outline: Add in imaging order with all fields
    
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Imaging Order	tab
	 When I click on imaging order Add button
		*   I enter <Imaging_Center> in imaging order imaging center field
    *   I enter <Order_Provider> in imaging order order provider field
    *   I enter <Date> in imaging order date field
    *   I enter <Bill_Type> in imaging order bill type field
    *   I enter <Imaging_Test_Type> in imaging order imaging test type field
    *   I enter <Imaging_Test> in imaging order imaging test field
    *   I enter <Effective_Date> in imaging order effective date field
    *   I enter <Diagnoses> in imaging order diagnoses field
    *   I enter <Body_Site> in imaging order body site field
    *   I enter <Comments> in imaging order comments field
    *   I click on imaging order Update button
	 Then I should see success message for added imaging order
		And I should see the newly added imaging order record <Imaging_Center> and <Date> on grid
    
    Examples:
    |    Patient   |       Imaging_Center      |Order_Provider|      Date    |Bill_Type|Imaging_Test_Type|            Imaging_Test           |Effective_Date|                      Diagnoses                     |             Body_Site            |   Comments  |
    |Aabram, Allyson|Radiology Center New Jersey|Patel, Paryus|02012021 21:38| Patient |       HPC       |Outside state ambulance serv::A0021|02012021 21:38|(Cholera due to Vibrio cholerae 01, biovar cholerae)|Abnormal hematopoietic cell (cell)|Imaging Order|
      
      
      
   @EditImagingOrder
   @Regression
   @Sanity
    Scenario Outline: Edit in imaging order with all fields
    
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Imaging Order	tab
	 When I click on imaging order Edit button
		And I click on imaging order panel remove button
		*   I enter <Imaging_Center> in imaging order imaging center field
    *   I enter <Order_Provider> in imaging order order provider field
    *   I enter <Date> in imaging order date field
    *   I enter <Bill_Type> in imaging order bill type field
    *   I enter <Imaging_Test_Type> in imaging order imaging test type field
    *   I enter <Imaging_Test> in imaging order imaging test field
    *   I enter <Effective_Date> in imaging order effective date field
    *   I enter <Diagnoses> in imaging order diagnoses field
    *   I enter <Body_Site> in imaging order body site field
    *   I enter <Comments> in imaging order comments field
    *   I click on imaging order Update button
	 Then I should see success message for edit imaging order
		And I should see the newly added imaging order record <Imaging_Center> and <Date> on grid
    
    Examples:
    |    Patient   |      Imaging_Center     |Order_Provider|      Date    |Bill_Type|Imaging_Test_Type|        Imaging_Test           |Effective_Date|      Diagnoses       |                  Body_Site              |      Comments    |
    |Aabram, Allyson|Fairfax Radiology Centers|Patel, Paryus|02012021 21:38| Patient |      LOINC      |Amdinocillin Islt KB::1-Sep    |02012021 21:38|(Cholera, unspecified)|Bone structure of tarsus (body structure)|Edit Imaging Order|
    
    
   @DeleteImagingOrder
   @Regression
   @Sanity
    Scenario Outline: Delete the specific record in imaging order 
    
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Imaging Order	tab
 	  *   I enter <Imaging_Center> to delete record in imaging order 
	 Then I should see success message for deleted imaging order
	  And I should see the deleted imaging order not present on grid
		
    
    Examples:
    |    Patient   |      Imaging_Center     |
    |Aabram, Allyson|Fairfax Radiology Centers|
    #
    