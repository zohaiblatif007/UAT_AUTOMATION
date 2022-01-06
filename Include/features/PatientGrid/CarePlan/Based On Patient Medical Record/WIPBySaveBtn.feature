@BOPMR
Feature: Care Plan - WIP Status Using Save Button

  Background: 
    Given I navigate to patient grid

  @Smoke_USMM
  Scenario Outline: Verify WIP status function using save button
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
    And I close care plan popup
    When I click on title from care plan grid
    Then I should see patient <Patient> as patient_name
    And I should see patient data of WIP status

    Examples: 
      | Patient          | Title      | New Status | WIP Status | SucessMessage                           |
      | ADam, Tom | WIPPatient | New        | WIP        | successCare Plan Saved SuccessfullyHide |
