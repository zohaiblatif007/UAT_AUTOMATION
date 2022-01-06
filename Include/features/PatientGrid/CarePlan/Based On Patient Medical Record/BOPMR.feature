Feature: Care Plan - BOPMR

  Background: 
    Given I navigate to patient grid

  @Smoke_USMM
  Scenario Outline: Based On Patient Medical Report
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    And I click on add new care plan button
    And I click on basedonpatientmedicalrecord
    Then I should see patient <Patient> as patient_name
    When I enter title <Title>
    And I click on save and close button
    Then I should see success message <SucessMessage> of CP

    Examples: 
      | Patient          | Title          | SucessMessage                           |
      | ADam, Tom | TestingPatient | successCare Plan Saved SuccessfullyHide |
      
    #Examples: 
      #| Patient          | Title          | Patient_Name     | MRN                | DOB             | LOB                 | Enterprise | SucessMessage                           |
      #| Dermo505, Mac505 | TestingPatient | Dermo505, Mac505 | MRN  EntMerging505 | DOB  09/07/1905 | LOB  Non-Attributed | MHPN       | successCare Plan Saved SuccessfullyHide |
