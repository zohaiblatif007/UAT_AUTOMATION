@VitalSign
Feature: Add Edit and Delete in Vital Sign

Background: 
  Given I navigate to patient grid
  
  
   @AddHighAlert @Regression @Sanity @Smoke
   Scenario Outline: Verify high care gap alert in case of add high care gap
   
   Given I click on Name coloumn dropdown
      * I click on filter option for name
      * I click on dropdown to set <Filter>
      * I enter <Patient> in text filed1
      * I click on filter button to filter record
 	    * I validate <Name> and <status> in enrollment section
 	   Then I click on Name coloumn dropdown
      And I click on filter option for name
       * I click on filter clear button
       
   When I search <Patient> using global search
 	  And I click on Clinical tab
 		  * I click on Vital Sign	tab
	 When I click on vital sign Add button	
	  	* I enter <Temp> in vital sign temp field
	    * I click on vital signs Save All button
	    * I click on Immunizations	tab
	    * I click on Vital Sign	tab
	 Then I should see high care gap alert popup
	    * I click on high care gap alert to land on care gap section
	    * I should see hyperpyrexia care gap present in care gap section

    Examples: 
    |    Patient    |Name |status     |program            |condition            |Reason                 |          dynamicid                                                                   |   message                                                                                       |    Filter    |Temp|
    |GVIL, ELISM    | CPIA|Eligible   |Un-Enrolled (MCARE)|Condition1,Condition2|Clinically Not Eligible|Program enrollment status successfully changed to Un-Enrolled for selected patient(s).|successProgram enrollment status successfully changed to Un-Enrolled for selected patient(s).Hide|  Contains    | 104|
    
    
     @DeleteHighAlert @Regression @Sanity @Smoke
   Scenario Outline: Verify high care gap alert in case of delete high care gap
   
   Given I click on Name coloumn dropdown
      * I click on filter option for name
      * I click on dropdown to set <Filter>
      * I enter <Patient> in text filed1
      * I click on filter button to filter record
 	    * I validate <Name> and <status> in enrollment section
 	 Then I click on Name coloumn dropdown
      And I click on filter option for name
       * I click on filter clear button
       
   When I search <Patient> using global search
 	  And I click on Clinical tab
 		  * I click on Vital Sign	tab
	    * I enter <Temp> to delete record in vital signs 
	    * I click on Immunizations	tab
	    * I click on Vital Sign	tab
	 Then I should see high care gap alert popup
	    * I click on high care gap alert to land on care gap section
	    * I should see hyperpyrexia care gap should not present in care gap section

    Examples: 
    |    Patient    |Name |status     |program            |condition            |Reason                 |          dynamicid                                                                   |   message                                                                                       |    Filter    |Temp|
    |GVIL, ELISM    | CPIA|Eligible   |Un-Enrolled (MCARE)|Condition1,Condition2|Clinically Not Eligible|Program enrollment status successfully changed to Un-Enrolled for selected patient(s).|successProgram enrollment status successfully changed to Un-Enrolled for selected patient(s).Hide|  Contains    | 104|
    #
    