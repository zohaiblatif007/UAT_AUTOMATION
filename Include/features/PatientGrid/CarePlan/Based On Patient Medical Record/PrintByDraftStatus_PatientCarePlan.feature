Feature: Care Plan - Print On Draft Status-PatientCarePlan

  Background: 
    Given I navigate to patient grid

  @Smoke_USMM
  Scenario Outline: Verify Print Button Using Patient Care Plan While Draft Status
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    And I click on add new care plan button
    And I click on basedonpatientmedicalrecord
    Then I should see patient <Patient> as patient_name
    And I should see intial status as <New Status> on CP header
    When I enter title <Title>
    And I select work in progress as no
    And I click on save button
    Then I should see success message <SucessMessage> of CP
    * I should see patient <Patient> as patient_name
    And I should see patient data of draft status
    And I should see status as <Draft Status> on CP header
    When I click on print button
    Then I should see patient care plan

    Examples: 
      | Patient          | Title        | New Status | Draft Status | SucessMessage                           |
      | ADam, Tom | DraftPatient | New        | Draft        | successCare Plan Saved SuccessfullyHide |
