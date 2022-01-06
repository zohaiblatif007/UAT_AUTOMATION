@Labresult
Feature: Add Edit and Delete in Lab Results

Background: 
  Given I navigate to patient grid
    
  @AddLabResult
  @Regression
  @Sanity
    Scenario Outline: Add in lab results with all fields
    
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Lab Results	tab
	 When I enter lab results <Panel>
		And I click on lab results Add Analyte button
		*   I enter <Analyte> in lab results analyte field
    *   I enter <Date> in lab results date field
    *   I enter <Time> in lab results time field
	  *   I enter <Result_Type> in lab results result_type field
	  *   I enter <Value> in lab results value field
	  *   I enter <Flag> in lab results flag field
	  *   I enter <Normal_Range> in lab results normal range field
	  *   I enter <Status> in lab results status field
	  *   I enter <Notes> in lab results notes field
	  *   I click on lab results Save All button
	 Then I should see success message for added lab results
		And I should see the newly added <panelvalidate> and <Test1> and <Test2> and <Test3> and <Test4> and <Result_Type> and <Value> and <flagvaldate> and <Normal_Range> and <statusvalidate> lab results on grid
	
   Examples:    
   |    Patient    |   Panel   |               Analyte         |   Date |   Time |Result_Type|            Value             |     Flag     |Normal_Range |Status |       Notes     |panelvalidate|                 Test1                         |                                          Test2                                   |       Test3        |                                Test4                           |    flagvaldate    |statusvalidate|   
   |Aabram, Allyson|Lipid Panel|Osteoarthritis composite::0005F|01012021|01:30:00| CD [LOINC]| Amdinocillin Islt KB::1-Sep  |Abnormal alert|     10      |active |Lab results added| Lipid Panel |Cholesterol, serum or whole blood, total::82465|Lipoprotein, direct measurement, high density cholesterol (HDL cholesterol)::83718|Triglycerides::84478|Osteoarthritis composite::0005F::Osteoarthritis composite::0005F|AA - Abnormal alert|  Active      |
   
   @EditLabResult
   @Regression
   @Sanity
 Scenario Outline: Add in lab results with all fields
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Lab Results	tab
	 When I click on lab result panel first row Edit button
		And I enter <Analyte> in lab results analyte field
    *   I enter <Date> in lab results date field
    *   I enter <Time> in lab results time field
	  *   I enter <Result_Type> in lab results result_type field
	  *   I enter <Value> in lab results value field
	  *   I enter <Flag> in lab results flag field
	  *   I enter <Normal_Range> in lab results normal range field
	  *   I enter <Status> in lab results status field
	  *   I enter <Notes> in lab results notes field
	  *   I click on lab results Save All button
	 Then I should see success message for added lab results
		
   Examples:    
   |    Patient    |             Analyte         |   Date |   Time |Result_Type|                            Value                              |  Flag  |Normal_Range |  Status |      Notes     |panelvalidate|                   Test1                                    |                    Test2                                   |                            Test3                           |                                Test4                           |    flagvaldate    |statusvalidate|   
   |Aabram, Allyson|Anesth, blepharoplasty::00103|03132021|02:00:00|CD [SNOMED]|Negative reversibility test to salbutamol (finding):: 391111000|Abnormal|     20      |  active |Lab results edit| Lipid Panel |Anesth, blepharoplasty::00103::Anesth, blepharoplasty::00103|Anesth, blepharoplasty::00103::Anesth, blepharoplasty::00103|Anesth, blepharoplasty::00103::Anesth, blepharoplasty::00103|Osteoarthritis composite::0005F::Osteoarthritis composite::0005F|AA - Abnormal alert|  Active      |
   
   
   
   @DeleteLabResult
   @Regression
   @Sanity
 Scenario Outline: Delete the specific record in lab results 
  Given I search <Patient> using global search
		And I click on Clinical tab
 		*   I click on Lab Results	tab
		*   I enter <Panel> to delete panel in lab results
	 Then I should see success message for deleted lab result panel
	  And I should see the deleted lab results not present on grid
	
   Examples:    
     |    Patient    |   Panel   |   
     |Aabram, Allyson|Lipid Panel|
   #
 