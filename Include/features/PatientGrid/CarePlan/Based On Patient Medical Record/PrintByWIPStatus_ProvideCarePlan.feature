Feature: Care Plan - Print On Draft Status-ProvideCarePlan

  Background: 
    Given I navigate to patient grid

  @Smoke_USMM
  Scenario Outline: Verify Print Button Using Provide Care Plan While WIP Status
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    And I click on add new care plan button
    And I click on basedonpatientmedicalrecord
    Then I should see patient <Patient> as patient_name
    And I should see intial status as <New Status> on CP header
    When I enter title <Title>
    And I click on save button
    Then I should see success message <SucessMessage> of CP
    * I should see patient <Patient> as patient_name
    And I should see progress status as <WIP Status> on CP header
    When I click on print button
    Then I should see provide care plan

    Examples: 
      | Patient          | Title      | New Status | WIP Status | SucessMessage                           |
      | ADam, Tom | WIPPatient | New        | WIP        | successCare Plan Saved SuccessfullyHide |
