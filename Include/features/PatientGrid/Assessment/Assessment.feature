@Assessment
Feature: Add All types of Assessments

  Background: 
    Given I navigate to patient grid

  @AddRecommendedAssessment 
  @Regression 
  @Sanity
  Scenario Outline: Add Recommended Billable Assessment with all fields
  Given I search <Patient> using global search
      * I verify patient is selected
    And I click on Assessment tab
   When I click on Assessment Add button
      * I click on Recommended Assessment tab to add assessment
      * I should see Cancel, Save & Close and Save buttons available and functional
      * I should see the Questionaire is loaded against relevant assessment
      * I should see question removing cross sign available and functional
      * I enter <Title> in assessment title field
      * I enter <CPTCode> in assessment CPTCode field
      * I enter <Comment> in assessment comment field
      * I enter answer <Ans1> to question 1 in RecommendedAssessment
      #* I enter answer <Ans2> to question 2 in RecommendedAssessment
      #* I enter answer <Ans3> to question 3 in RecommendedAssessment
      #* I enter answer <Ans4> to question 4 in RecommendedAssessment
      #* I enter answer <Ans5> to question 5 in RecommendedAssessment 
      * I click on Save button to save assessment
   Then I should see success message for added assessment   
      * I click on Save and Close button to save assessment
   Then I should see success message for added assessment
    And I should see Edit button available and functional
    And I should see the newly added <Title> and <BillableType> and <CPTCode> for assessment on grid
      #* I should see <Title> and current system Date and No of Q Ans and <Ans1> and <Ans2> and <Ans3> and <Ans4> and <Ans5> and <Comment> for assessment in the right pan

    Examples: 
      |  Patient  | Title | BillableType | CPTCode  |     Comment      |Ans1|     Ans2       |     Ans3       |Ans4|Ans5|
      |36CJRFifth7| HTN-1 |     Yes      |      893 | chronic disease  |Yes |Most of the time|All of the time | No |Yes |

      
  @CancelbuttonofAssessment 
  @Regression 
  @Sanity
  Scenario Outline: Test Cancel button feature in Recommended Assessment
  Given I search <Patient> using global search
      * I verify patient is selected
    And I click on Assessment tab
   When I click on Assessment Add button
      * I click on Recommended Assessment tab to add assessment
      * I should see Cancel, Save & Close and Save buttons available and functional
      * I should see the Questionaire is loaded against relevant assessment
      * I should see question removing cross sign available and functional
      * I enter <Title> in assessment title field
      * I enter <CPTCode> in assessment CPTCode field
      * I enter <Comment> in assessment comment field
      * I click on Cancel button to cancel the saved assessment
      * I should not see the canceled assessment present on the grid
      
    Examples: 
      |   Patient | Title | BillableType | CPTCode  |     Comment      |
      |36CJRFifth7| HTN-1 |     Yes      |      893 | chronic desease  |
      
      

  @AddOtherAssessmentBillable
  @Regression 
  @Sanity
  Scenario Outline: Add Billable Assessment with Other Assessment Templates
  Given I search <Patient> using global search
      * I verify patient is selected
    And I click on Assessment tab
   When I click on Assessment Add button
      * I click on Other Assessment Templates tab to add Assessment  
      * I select check box of <B_Assessment> Billable Assessment 
      * I click on Proceed button to save assessment template
      * I should see Cancel, Save & Close and Save buttons available and functional
      * I should see the Questionaire is loaded against relevant assessment
      * I should see question removing cross sign available and functional
      * I enter <Title> in assessment title field
      * I enter <CPTCode> in assessment CPTCode field
      * I enter <Comment> in assessment comment field
      * I enter answer <Ans1> to question 1
      #* I enter answer <Ans2> to question 2
      #* I enter answer <Ans3> to question 3
      #* I enter answer <Ans4> to question 4
      #* I enter answer <Ans5> to question 5 
      * I click on Save button to save assessment
   Then I should see success message for added assessment   
      * I click on Save and Close button to save assessment
   Then I should see success message for added assessment
    And I should see Edit button available and functional
    And I should see the newly added <Title> and <BillableType> and <CPTCode> for assessment on grid
      #* I should see <Title> and current system Date and No of Q Ans and <Ans1> and <Ans2> and <Ans3> and <Ans4> and <Ans5> and <Comment> for assessment in the right pan

    Examples: 
      |   Patient | B_Assessment |    Title          |CPTCode|     Comment     |      Ans1        |      Ans2      |   Ans3  |      Ans4        |       Ans5      | BillableType|
      |36CJRFifth7|   Asthma     |Asthma Assessment-2|  689  |Asthma assessment|  All of the time | All of the time| Moderate| Most of the time | Most of the time|     Yes     | 
      
      
   @AddOtherAssessmentNonBillable
  @Regression 
  @Sanity
  Scenario Outline: Add Non Billable Assessment with Other Assessment Templates
  Given I search <Patient> using global search
      * I verify patient is selected
    And I click on Assessment tab
   When I click on Assessment Add button
      * I click on Other Assessment Templates tab to add Assessment  
      * I select check box of <B_Assessment> Billable Assessment 
      * I click on Proceed button to save assessment template
      * I should see Cancel, Save & Close and Save buttons available and functional
      * I should see the Questionaire is loaded against relevant assessment
      * I should see question removing cross sign available and functional
      * I enter type of assessment as non billable
      * I enter <Title> in assessment title field
      * I enter <Comment> in assessment comment field
      * I enter answer <Ans1> to question 1
      #* I enter answer <Ans2> to question 2
      #* I enter answer <Ans3> to question 3
      #* I enter answer <Ans4> to question 4
      #* I enter answer <Ans5> to question 5 
      * I click on Save button to save assessment
   Then I should see success message for added assessment   
      * I click on Save and Close button to save assessment
   Then I should see success message for added assessment
    And I should see Edit button available and functional
    And I should see the newly added <Title> and <BillableType> and <CPTCode> for assessment on grid
      #* I should see <Title> and current system Date and No of Q Ans and <Ans1> and <Ans2> and <Ans3> and <Ans4> and <Ans5> and <Comment> for assessment in the right pan

    Examples: 
      |  Patient  | B_Assessment|             Title            |CPTCode|     Comment     |      Ans1        |      Ans2      |   Ans3  |      Ans4        |       Ans5      | BillableType|
      |36CJRFifth7|   Asthma    |Asthma Assessment-nonbillable |       |Asthma assessment|  All of the time | All of the time| Moderate| Most of the time | Most of the time|     No      | 
      
      
      
      
      
      
      
  @AddCustomAssessment 
  @Regression 
  @Sanity
  Scenario Outline: Add in Custom Assessment with all fields
  Given I search <Patient> using global search
    And I click on Assessment tab
   When I click on Assessment Add button
      * I click on Custom Assessment tab to add Assessment
      * I should see Cancel, Save & Close and Save buttons available and functional
      * I enter <Title> in assessment title field
      * I enter <BillableType> in assessment billable type field
      * I enter <CPTCode> in assessment CPTCode field
      * I enter <Comment> in assessment comment field
      * I click on Save button to save assessment
   Then I should see success message for added assessment   
      * I click on Save and Close button to save assessment
   Then I should see success message for added assessment
    And I should see Edit button available and functional
    And I should see the newly added <Title> and <BillableType> and <CPTCode> for assessment on grid
      

    Examples: 
      |  Patient  | Title            | BillableType | CPTCode  | Comment   |
      |36CJRFifth7| Covid Assessment |     Yes      | 789      | DO KIDS NEED A COVID-19 VACCINE? Yes CAN ANTIBODY TESTS SHOW IF A COVID-19 VACCINE IS WORKING? Yes IF I’VE HAD COVID-19, DO I REALLY NEED THE VACCINE? No DO WE NEED BOOSTER DOSES? Yes DO COVID-19 VACCINES AFFECT FERTILITY OR PERIODS? Yes|
      
          
      
 @AddBasedonPreviousmAssessment 
  @Regression 
  @Sanity
  Scenario Outline: Add Custom Assessment with all fields
  Given I search <Patient> using global search
      * I verify patient is selected
    And I click on Assessment tab
   When I click on Assessment Add button
      * I click on Based on Previous Assessment tab to add Assessment
      * I should see Cancel, Save & Close and Save buttons available and functional
      * I enter <Title> in assessment title field
      * I enter <CPTCode> in assessment CPTCode field
      * I enter <Comment> in assessment comment field
      * I click on Save button to save assessment
   Then I should see success message for added assessment   
      * I click on Save and Close button to save assessment
   Then I should see success message for added assessment
    And I should see Edit button available and functional
    And I should see the newly added <Title> and <BillableType> and <CPTCode> for assessment on grid

    Examples: 
      |Patient    | Title            | BillableType | CPTCode  | Comment   |
      |36CJRFifth7| Covid Assessment-3 |     Yes      | 758    | Take Steam dailly|
      

  @CompareAssessment 
  @Regression 
  @Sanity
  Scenario Outline: Compare two Assessments
  Given I search <Patient> using global search
      * I verify patient is selected
    And I click on Assessment tab
   When I click on Assessment Compare button
      * I click on assessment to compare with other assessment
      * I should see the name of assessment1
      * I should see the date at which assessment1 is created
      * I should see the name of assessment2
      * I should see the date at which assessment2 is created
      * I should see stop compare button of assessment
      * I click on stop compare button of assessment
      
    Examples: 
      |  Patient  |
      |36CJRFifth7|
      