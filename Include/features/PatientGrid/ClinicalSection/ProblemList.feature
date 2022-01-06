@ProblemList
Feature: Add Edit and Delete in Problem List
Background: 
  Given I navigate to patient grid

 @AddProblemList
 @Regression
 @Sanity
Scenario Outline: Add in problem with all fields
  Given I search <Patient> using global search
		And I click on Clinical tab
		*   I click on Problem List	tab
	 When I click on problem Add button
		And I enter <Code_Name> in problem name field
		*   I enter <Start_Date> in problem start date field 
	  *   I enter <Severity> in problem severity field
	  *   I enter <Type> in problem type field
	  *   I enter <Status> in problem status field
	  *   I enter <Rank> in problem rank field
	  *   I click on problem Save All button
	 Then I should see success message for added problem
	  And I should see the newly added <Code_Name> and <Start_Date> and <Severity> and <Status> and <Rank> problem on grid
		
 
 Examples:
    |    Patient   |                     Code_Name                            | Start_Date | Severity |   Type  | Status|   Rank   |
    |Aabram, Allyson| Cholera due to Vibrio cholerae 01, biovar cholerae::A00.0| 01072021   | Moderate |Condition| Active| Principal|
    

 @EditProblemList
 @Regression
 @Sanity
Scenario Outline: Edit in problem with all fields
  Given I search <Patient> using global search
		And I click on Clinical tab
		*   I click on Problem List	tab
	 When I click on problem Edit button
		And I enter <Code_Name> in problem name field
		*   I enter <Start_Date> in problem start date field 
	  *   I enter <Severity> in problem severity field
	  *   I enter <Type> in problem type field
	  *   I enter <Status> in problem status field
	  *   I enter <Rank> in problem rank field
	  *   I click on problem Save All button
	 Then I should see success message for edit problem
    And I should see the newly added <Code_Name> and <Start_Date> and <Severity> and <Status> and <Rank> problem on grid
		
 Examples:
    |    Patient   |        Code_Name          | Start_Date |Severity|   Type  | Status|   Rank   |
    |Aabram, Allyson|Cholera, unspecified::A00.9| 03082021   | Severe |Diagnosis| Active| Secondary|
    
    
    
 @DeleteProblemList
 @Regression
 @Sanity
Scenario Outline: Delete the specific record in problem List
  Given I search <Patient> using global search
		And I click on Clinical tab
		*   I click on Problem List	tab
		*   I enter <Problem_Name> to delete record in problem list 
	 Then I should see success message for deleted record
	  And I should see the deleted problem not present on grid
		
 
 Examples:
    |    Patient   |        Problem_Name       |
    |Aabram, Allyson|Cholera, unspecified::A00.9|
    #
    #
    