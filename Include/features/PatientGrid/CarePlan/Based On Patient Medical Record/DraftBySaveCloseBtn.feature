Feature: Care Plan - Draft Status Using SaveClose Button

  Background: 
    Given I navigate to patient grid

  @Smoke_USMM
  Scenario Outline: Verify draft status function using save & close button
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    And I click on add new care plan button
    And I click on basedonpatientmedicalrecord
    Then I should see patient <Patient> as patient_name
    And I should see intial status as <New Status> on CP header
    When I enter title <Title>
    And I select work in progress as no
    And I click on save and close button
    Then I should see success message <SucessMessage> of CP
    When I click on title from care plan grid
    Then I should see patient data of draft status
    Then I should see patient <Patient> as patient_name
    And I should see status as <Draft Status> on CP header

    Examples: 
      | Patient          | Title        | New Status | Draft Status | SucessMessage                           |
      | ADam, Tom | DraftPatient | New        | Draft        | successCare Plan Saved SuccessfullyHide |
