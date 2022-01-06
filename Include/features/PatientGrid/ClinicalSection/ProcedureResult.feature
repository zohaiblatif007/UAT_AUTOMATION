@ProcedureResults
Feature: Add Edit and Delete in Procedure Result

Background: 
  Given I navigate to patient grid
    
    @Add
    @AddProcedureResults
    @Regression
    @Sanity
    Scenario Outline: Add in procedure result with all fields
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Procedure Results	tab
	 When I click on procedure results Add button
    And I enter <Source> in procedure results source field
    *   I enter <Procedure> in procedure results procedure field
    *   I enter <Date> in procedure results date field
    *   I enter <Target_Site> in procedure results target site field
    *   I enter <Status> in procedure results status field
    *   I enter <Reason> in procedure results reason field
    *   I enter <Service_Delivery_Location> in procedure results service delivery location field
    *   I click on procedure result Update button
	 Then I should see success message for added procedure result
		And I should see the newly added <Source> and <Procedure> and <Date> and <Target_Site> and <Status> and <Reason> and <Service_Delivery_Location> procedure result on grid
    
     Examples:
    |   Patient    |Source|          Procedure            |  Date  |                     Target_Site                      |Status|                          Reason                        |Service_Delivery_Location|
    |Aabram, Allyson| ICD9 |THER ULT HEAD & NECK VES::00.01|03112021|Bone structure of tarsus (body structure) :: 108371006|Active|Accidental needle stick injury (disorder)::1.0850741e+16|Procedure Results Edited |
    
    @Edit   
    @EditProcedureResults
    @Regression
    @Sanity
    Scenario Outline: Edit in procedure result with all fields
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Procedure Results	tab
	 When I click on procedure results Edit button
    And I enter <Source> in procedure results source field
    *   I enter <Procedure> in procedure results procedure field
    *   I enter <Date> in procedure results date field
    *   I enter <Target_Site> in procedure results target site field
    *   I enter <Status> in procedure results status field
    *   I enter <Reason> in procedure results reason field
    *   I enter <Service_Delivery_Location> in procedure results service delivery location field
    *   I click on procedure result Update button
	  Then I should see success message for edit procedure result
		 And I should see the newly added <Source> and <Procedure> and <Date> and <Target_Site> and <Status> and <Reason> and <Service_Delivery_Location> procedure result on grid
    
     Examples:
    |   Patient     |Source|            Procedure              |  Date  |                 Target_Site                   |  Status |                          Reason                           |Service_Delivery_Location|
    |Aabram, Allyson|  HPC |Noninterest escort in non er::A0080|01012021|Abnormal hematopoietic cell (cell) :: 107677004| Active  |Breast cancer screening declined (situation)::1.2275351e+16| Procedure Results Added |
     
     
    @Delete
    @DeleteProcedureResults
    @Regression
    @Sanity
    Scenario Outline: Delete the specific record in procedure result
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Procedure Results	tab
	 	*   I enter <Source> to delete record in procedure results
	 Then I should see success message for deleted record
	  And I should see the deleted procedure result not present on grid
		
    
    Examples:
    |   Patient    |Source|     
    |Aabram, Allyson| HPC |
    #
    