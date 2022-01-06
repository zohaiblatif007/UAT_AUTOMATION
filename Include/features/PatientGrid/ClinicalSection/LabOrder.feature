@LabOrders
Feature: Add Edit and Delete in Lab Order

Background: 
  Given I navigate to patient grid
   
  @AddLabOrder
  @Regression
  @Sanity
  Scenario Outline: Add in lab orders with all fields 
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Lab Orders	tab
	 When I click on lab orders Add button
    And I enter <Laboratary> in lab order laboratory field
    *   I enter <Order_Provider> in lab order order provider field
    *   I enter <Date> in lab orders date field
    *   I add <Panel> in lab order
	  *   I enter <STAT> in lab orders stat field
	  *   I enter <Diagnosis> in lab order diagnosis field
	  *   I click on lab order specimen drop down 
	  *   I enter <Collection_Date> in lab order collection date field
	  *   I enter <Type> in lab order type field
	  *   I enter <Specimen_No> in lab order specimen no. field
	  *   I enter <Notes> in lab order notes field
	  *   I click on lab order Save All button
	 Then I should see success message for added lab order
		And I should see the newly added <Laboratary> and <Panel> lab order on grid
		
    Examples:    
   |    Patient      |    Laboratary   |Order_Provider|      Date      |   Panel   |STAT|Diagnosis|Collection_Date |Type |Specimen_No|      Notes    |
   |  Aabram, Allyson|Quest Diagnostics| Patel, Paryus|01/28/2021 13:57|Lipid Panel|Yes |  A00.0  |01/28/2021 13:57|Serum|     10    |Lab order added|
   


   @EditLabOrder
   @Regression
   @Sanity
  Scenario Outline: Edit in lab orders with all fields
    
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Lab Orders	tab
	 When I click on lab orders Edit button
    And I enter <Laboratary> in lab order laboratory field
    *   I enter <Date> in lab orders date field
    *   I add <Panel> in lab order
	  *   I enter <STAT> in lab orders stat field
	  *   I enter <Diagnosis> in lab order diagnosis field
	  *   I click on lab order specimen drop down 
	  *   I enter <Collection_Date> in lab order collection date field
	  *   I enter <Type> in lab order type field
	  *   I enter <Specimen_No> in lab order specimen no. field
	  *   I enter <Notes> in lab order notes field
	  *   I click on lab order Save All button
	 Then I should see success message for edit lab order
		And I should see the newly added <Laboratary> and <Panel> lab order on grid
	
    Examples:    
   |    Patient    |         Laboratary      |      Date      |      Panel      |STAT|Diagnosis|Collection_Date | Type |Specimen_No|      Notes    |
   |Aabram, Allyson|Whitehouse Analytical Lab|01/28/2021 13:57|Electrolyte Panel|Yes |  A00.9  |01/28/2021 13:57|Plasma|     10    |Lab order edit |
   
   
   
   @DeleteLabOrder
   @Regression
   @Sanity
  Scenario Outline: Delete the specific record in lab orders 
    
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Lab Orders	tab
		*   I enter <Laboratary> to delete record in lab order
	 Then I should see success message for deleted lab order
	  And I should see the deleted lab order not present on grid
	
    Examples:    
   |    Patient    |         Laboratary      | 
   |Aabram, Allyson|Whitehouse Analytical Lab|
   #
   #
   