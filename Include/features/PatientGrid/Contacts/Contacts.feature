@Contacts
Feature: Contacts a patient

Background: 
  Given I navigate to patient grid
  
   @AddSupportperson
   @Regression
   @Sanity
    Scenario Outline: Add new row in support persons section of patient with all fields
    
	  Given I search <Patient> using global search 
   When I click on Contacts tab to land on contacts section
    And I click on support persons button
	  And I click on add support persons button
	  *   I enter <Lastname> in support persons lastname field
	  *   I enter <Firstname> in support persons firstname field
	  *   I enter <Relatiosip> in support persons relationship field
	  *   I enter <Startdate> in support persons startdate field
	  *   I enter <Enddate> in support persons enddate field
	  *   I enter <Homephone> in support persons home phone field
	  *   I enter <Mobilephone> in support persons mobile phone field
    *   I click on update button to save support persons data
	 Then I should see success message for created support persons record
#		And I should see the newly created support persons record on grid
    
    Examples:
    |    Patient     |Lastname|Firstname| Relatiosip|Startdate|Enddate | Homephone | Mobilephone|  
    |AZMAAT, Jackson|  Ali   |  Usman  |next of kin|12192020 |12072021|01233445554|015846377277|     
   
   
   @EditSupportperson
   @Regression
   @Sanity
    Scenario Outline: Edit existing row in support persons section of patient
    
	  Given I search <Patient> using global search 
   When I click on Contacts tab to land on contacts section
    And I click on support persons button
	  And I click on edit support persons button
	  *   I enter <Lastname> in support persons lastname field
	  *   I enter <Firstname> in support persons firstname field
	  *   I enter <Relatiosip> in support persons relationship field
	  *   I enter <Startdate> in support persons startdate field
	  *   I enter <Enddate> in support persons enddate field
	  *   I enter <Homephone> in support persons home phone field
	  *   I enter <Mobilephone> in support persons mobile phone field
    *   I click on update button to save support persons data
	 Then I should see success message for created support persons record
#		And I should see the newly created support persons record on grid
    
    Examples:
    |    Patient     |Lastname|Firstname| Relatiosip|Startdate|Enddate | Homephone | Mobilephone|  
    |AZMAAT, Jackson|  Ali   |  Usman  |next of kin|12192020 |12072021|01233445554|015846377277|     
   
   
   @DeleteSupportperson
   @Regression
   @Sanity
    Scenario Outline: Delete the row in support persons section of patient
    
	  Given I search <Patient> using global search 
   When I click on Contacts tab to land on contacts section
    And I click on support persons button
	  *   I delete support person record with <Lastname> of a patient
	 Then I should see success message for deleted support person record
		And I should see deleted support person record not present on grid
    
    Examples:
    |    Patient     |Lastname|
    |AZMAAT, Jackson|  Ali   |   
   
   
   
   @AddGuardian
   @Regression
   @Sanity
    Scenario Outline: Add new row in guardian section of patient with all fields
    
	  Given I search <Patient> using global search 
   When I click on Contacts tab to land on contacts section
    And I click on guardian button
	  And I click on add guardian button
	  *   I enter <Lastname> in guardian lastname field
	  *   I enter <Firstname> in guardian firstname field
	  *   I enter <Relatiosip> in guardian relationship field
	  *   I enter <Startdate> in guardian startdate field
	  *   I enter <Enddate> in guardian enddate field
	  *   I enter <Homephone> in guardian home phone field
	  *   I enter <Mobilephone> in guardian mobile phone field
    *   I click on update button to save guardian data
	 Then I should see success message for created guardian record
#		And I should see the newly created guardian record on grid
    
    Examples:
    |    Patient     |Lastname|Firstname| Relatiosip|Startdate|Enddate | Homephone | Mobilephone|  
    |AZMAAT, Jackson|  Ali   |  Usman  |   cousin  |12192020 |12072021|01233445554|015846377277|     
   
   
   @EditGuardian
   @Regression
   @Sanity
    Scenario Outline: Edit existing row in guardian section of patient
    
	  Given I search <Patient> using global search 
   When I click on Contacts tab to land on contacts section
    And I click on guardian button
	  And I click on edit guardian button
	  *   I enter <Lastname> in guardian lastname field
	  *   I enter <Firstname> in guardian firstname field
	  *   I enter <Relatiosip> in guardian relationship field
	  *   I enter <Startdate> in guardian startdate field
	  *   I enter <Enddate> in guardian enddate field
	  *   I enter <Homephone> in guardian home phone field
	  *   I enter <Mobilephone> in guardian mobile phone field
    *   I click on update button to save guardian data
	 Then I should see success message for created guardian record
#		And I should see the newly created guardian record on grid
    
    Examples:
    |    Patient     |Lastname|Firstname| Relatiosip|Startdate|Enddate | Homephone | Mobilephone|  
    |AZMAAT, Jackson|  Ali   |  Usman  |   cousin  |12192020 |12072021|01233445554|015846377277|     
   
   
   @DeleteGuardian
   @Regression
   @Sanity
    Scenario Outline: Delete the row in guardian section of patient
    
	  Given I search <Patient> using global search 
   When I click on Contacts tab to land on contacts section
    And I click on guardian button
	  *   I delete guardian record with <Lastname> of a patient
	 Then I should see success message for deleted guardian record
		And I should see deleted guardian record not present on grid
    
    Examples:
    |    Patient     |Lastname|
    |AZMAAT, Jackson |  Ali   |   

    