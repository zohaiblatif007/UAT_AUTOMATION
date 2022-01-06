Feature: From Previous Care Plan - Based On patient Medical Record

  Background: 
    Given I navigate to patient grid

@SmokeUSMM_PreviousCP_BOPMR
  Scenario Outline: Verify Previous Care Plan - BOPMR
    When I search <Patient> using global search
    Then I am on PWB
    * I click on care plan tab
    * I click on add new care plan button
    * I click on basedonpatientmedicalrecord
    * I should see patient <Patient> as patient_name
    When I enter title <Title>
    * I click on save and close button
    Then I should see success message <SucessMessage> of CP
    When I click on add new care plan button
    * I click on FromPreviousCarePlan
    * I select care plan from popup
    Then I should see patient <Patient> as patient_name
    
    
    Examples: 
      | Patient          | Title           |SucessMessage                           |
      | ADam, Tom | PreviousPatient |successCare Plan Saved SuccessfullyHide |

@SmokeUSMM_PreviousCP_Blank
  Scenario Outline: Verify Previous Care Plan - Blank
    When I search <Patient> using global search
    Then I am on PWB
    * I click on care plan tab
    * I click on add new care plan button
    * I click on blank
    * I should see patient <Patient> as patient_name
    When I enter title <Title>
    * I click on save and close button
    Then I should see success message <SucessMessage> of CP
    When I click on add new care plan button
    * I click on FromPreviousCarePlan
    * I select care plan from popup
    Then I should see patient <Patient> as patient_name

    Examples: 
      | Patient          | Title           |SucessMessage                           |
      | ADam, Tom | PreviousPatient |successCare Plan Saved SuccessfullyHide |