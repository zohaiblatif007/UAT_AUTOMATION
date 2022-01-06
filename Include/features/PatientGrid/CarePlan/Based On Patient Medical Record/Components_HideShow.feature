Feature: Care Plan - Components Hide Show

  Background: 
    Given I navigate to patient grid

  @Smoke_USMM
  Scenario Outline: Based On Patient Medical Report
    When I search <Patient> using global search
    Then I am on PWB
    * I click on care plan tab
    * I click on add new care plan button
    * I click on basedonpatientmedicalrecord
    * I unchecked all checkboxes
    * I checked multiple checkboxes
    * I click apply button
    Then I should see patient <Patient> as patient_name
    * I unchecked all checkboxes
    * I checked multiple checkboxes
    * I click apply button
    #Then I should see patient data <Patient_Name> and <MRN> and <DOB> and <LOB> and <Enterprise> on care plan
    Then I should see patient <Patient> as patient_name
    
    
    Examples:
    
    |Patient|
    |ADam, Tom|
    
    #Examples: 
      #| Patient          | Patient_Name     | MRN                | DOB             | LOB                 | Enterprise | SucessMessage                           |
      #| Dermo505, Mac505 | Dermo505, Mac505 | MRN  EntMerging505 | DOB  09/07/1905 | LOB  Non-Attributed | MHPN       | successCare Plan Saved SuccessfullyHide |
    #
  
    
  