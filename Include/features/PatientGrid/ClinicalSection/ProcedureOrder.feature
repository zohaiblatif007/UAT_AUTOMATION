@ProcedureOrder
Feature: Add Edit and Delete in Procedure Order

Background: 
  Given I navigate to patient grid
    
  @Add
  @AddProcedureOrder
  @Regression
  @Sanity
    Scenario Outline: Add in procedure order with all fields
     
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Procedure Order	tab
	 When I click on Procedure order Add button
    And I enter <Order_Provider> in procedure order order provider field
    *   I enter <Date> in procedure order date field
    *   I enter <Procedure_Test_Type> in procedure order procedure test type field
    *   I enter <Procedure_Test> in procedure order procedure test field
    *   I enter <Effective_Date> in procedure order effective date field
    *   I enter <Diagnoses> in procedure order diagnoses field
    *   I enter <Body_Site> in procedure order body site field
    *   I enter <Comments> in procedure order comments field
    *   I click on procedure order Save button
	 Then I should see success message for added procedure order
		And I should see the newly added <Order_Provider> and <Date> and <Prcedurevaidation1validation> and <Prcedurevaidation2validation> and <Prcedurevaidation3validation> procedure order on grid
		
    Examples:
    |    Patient   |Order_Provider|    Date      |Procedure_Test_Type|          Procedure_Test           |Effective_Date|                      Diagnoses                     |            Body_Site             |    Comments   |         Prcedurevaidation1validation         |           Prcedurevaidation2validation           |             Prcedurevaidation3validation    |     
    |Aabram, Allyson|Patel, Paryus|02012021 21:38|        HPC        |Outside state ambulance serv::A0021|02012021 21:38|(Cholera due to Vibrio cholerae 01, biovar cholerae)|Abnormal hematopoietic cell (cell)|Procedure Order|Outside state ambulance serv: 02/01/2021 21:38|Cholera due to Vibrio cholerae 01, biovar cholerae|Body Site: Abnormal hematopoietic cell (cell)|
     
  @Edit
  @EditProcedureOrder
  @Regression
  @Sanity
     Scenario Outline: Edit in imaging order with all fields
     
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Procedure Order	tab
	 When I click on Procedure order Edit button
		And I click on procedure order panel remove button
    *   I enter <Order_Provider> in procedure order order provider field
    *   I enter <Date> in procedure order date field
    *   I enter <Procedure_Test_Type> in procedure order procedure test type field
    *   I enter <Procedure_Test> in procedure order procedure test field
    *   I enter <Effective_Date> in procedure order effective date field
    *   I enter <Diagnoses> in procedure order diagnoses field
    *   I enter <Body_Site> in procedure order body site field
    *   I enter <Comments> in procedure order comments field
    *   I click on procedure order Save button
	 Then I should see success message for edit procedure order
		And I should see the newly added <Order_Provider> and <Date> and <Prcedurevaidation1validation> and <Prcedurevaidation2validation> and <Prcedurevaidation3validation> procedure order on grid
		
		
    Examples:
    |    Patient   |Order_Provider|    Date      |Procedure_Test_Type|         Procedure_Test      |Effective_Date|          Diagnoses           |                Body_Site                |       Comments     |       Prcedurevaidation1validation   |Prcedurevaidation2validation|                    Prcedurevaidation3validation    |
    |Aabram, Allyson|Patel, Paryus|02012021 21:38|       LOINC       |Amdinocillin Islt KB::1-Sep  |03112021 21:38| (Cholera, unspecified)       |Bone structure of tarsus (body structure)|Edit Procedure Order|Amdinocillin Islt KB: 03/11/2021 21:38|   Cholera, unspecified     |Body Site: Bone structure of tarsus (body structure)|
    
    @Delete
    @DeleteProcedureOrder
    @Regression
    @Sanity
    Scenario Outline: Delete the specific record in procedure orders
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Procedure Order	tab
	 	*   I enter <Order_Provider> to delete record in procedure order
	 Then I should see success message for deleted procedure order
	  And I should see the deleted procedure order not present on grid
		
    Examples:
    |    Patient   |Order_Provider|   
    |Aabram, Allyson|Patel, Paryus|
    #
    