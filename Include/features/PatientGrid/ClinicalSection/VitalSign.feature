@VitalSign
Feature: Add Edit and Delete in Vital Sign

Background: 
  Given I navigate to patient grid
    
    @Add
    @AddVitalSign
    @Regression
    @Sanity
    Scenario Outline: Add in vital sign with all fields
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Vital Sign	tab
	 When I click on vital sign Add button	
		And I enter <Date> and <Time> in vital sign observation date field
		*   I enter <Temp> in vital sign temp field
		*   I enter <Pulse> in vital sign pulse field
		*   I enter <Resp_Rate> in vital sign resp rate field
		*   I enter <Sys_Bloodpressure> in vital sign sys field
		*   I enter <Dia_Bloodpressure> in vital sign dia field
		*   I enter <Weight> in vital sign weight field
		*   I enter <Height> in vital sign height field
		*   I enter <BMI> in vital sign bmi field
		*   I enter <BSA> in vital sign bsa field
		*   I enter <O2_Sats> in vital sign o2 sats field
		*   I enter <InhaledO2_Concern> in vital sign inhaled o2 concern field
	  *   I click on vital signs Save All button
	 Then I should see success message for added vital signs
		And I should see the newly added <Time> and <Temp> and <Pulse> and <Resp_Rate> and <Sys_Bloodpressure> and <Dia_Bloodpressure> and <Weight> and <Height> and <BMI> and <BSA> and <O2_Sats> and <InhaledO2_Concern> vital signs on grid
		    
    Examples:
    |    Patient     |  Date  |  Time |Temp|Pulse|Resp_Rate|Sys_Bloodpressure |Dia_Bloodpressure |Weight| Height|BMI|BSA|O2_Sats|InhaledO2_Concern|
    |Aabram, Allyson|01012021|1:30 AM| 98 |  80 |   70    |        80        |        125       |  88  |   72  |26 |21 |  98   |       99        | 
 
    @Edit
    @EditVitalSign
    @Regression
    @Sanity
    Scenario Outline: Edit in vital sign with all fields
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Vital Sign	tab
	 When I click on vital sign Edit button	
		And I enter <Date> and <Time> in vital sign observation date field
		*   I enter <Temp> in vital sign temp field
		*   I enter <Pulse> in vital sign pulse field
		*   I enter <Resp_Rate> in vital sign resp rate field
		*   I enter <Sys_Bloodpressure> in vital sign sys field
		*   I enter <Dia_Bloodpressure> in vital sign dia field
		*   I enter <Weight> in vital sign weight field
		*   I enter <Height> in vital sign height field
		*   I enter <BMI> in vital sign bmi field
		*   I enter <BSA> in vital sign bsa field
		*   I enter <O2_Sats> in vital sign o2 sats field
		*   I enter <InhaledO2_Concern> in vital sign inhaled o2 concern field
	  *   I click on vital signs Save All button
	 Then I should see success message for edit vital signs
    And I should see the newly added <Time> and <Temp> and <Pulse> and <Resp_Rate> and <Sys_Bloodpressure> and <Dia_Bloodpressure> and <Weight> and <Height> and <BMI> and <BSA> and <O2_Sats> and <InhaledO2_Concern> vital signs on grid
		    
		    
    Examples:
    |    Patient     |  Date  |  Time |Temp|Pulse|Resp_Rate|Sys_Bloodpressure|Dia_Bloodpressure|Weight| Height|BMI|BSA|O2_Sats|InhaledO2_Concern|
    | Aabram, Allyson|03112021|2:30 AM| 100|  70 |   60    |        90       |        140      |   90 |   68  |24 |22 |  95   |       96        |
     
    @Delete  
    @DeleteVitalSign
    @Regression
    @Sanity
    Scenario Outline: Delete the specific record in vital signs 
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Vital Sign	tab
		*   I enter <Temp> to delete record in vital signs 
	 Then I should see success message for deleted record
    And I should see the deleted vital signs not present on grid
		    
    Examples:
    |    Patient   |Temp|
    |Aabram, Allyson| 100|
     