@BOPMR
Feature: Care Plan - Reject Status Using SaveClose Button

  Background: 
    Given I navigate to patient grid

  @Smoke_USMM
  Scenario Outline: Verify reject status function using save & close button
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
    And I should see status as <Draft Status> on CP header
    When I click on reject button
    Then I should see rejected alert popup
    And I click on proceed button
    And I should see rejected success message
    When I click on title from care plan grid
    Then I should see patient <Patient> as patient_name
    And I should see patient data as read only
    And I should see reject status as <Rejected Status> on CP header

    Examples: 
      | Patient          | Title           | New Status | Draft Status | Rejected Status | SucessMessage                           |
      | ADam, Tom | RejectedPatient | New        | Draft        | Rejected        | successCare Plan Saved SuccessfullyHide |
