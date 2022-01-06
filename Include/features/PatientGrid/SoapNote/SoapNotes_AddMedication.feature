Feature: Soap Note Creation from Schedule flow

  Background: 
    Given I navigate to patient grid

  Scenario Outline: Verify Creating Schedule Appointment Using Soap Notes
    When I click on schedule tab
    And I double click on screen to add appointment
    Then I should see schedule appointment popup
    When I enter <Patient> as appointment patient
    And I enter <Reason> as appointment reason
    * I should see <Patient> as actual patient name
    * I drag chat list
    * I click create button to save appointment
    * I click on yes button
    * I click on proceed button to appointment
    Then I should see appointment success message

    Examples: 
      | Patient   | Reason    |
      | ADam, Tom | Back pain |

  @Smoke_USMM_CreateMedications
  Scenario Outline: Verify Creating Medication - Based On Patient's Medical Record
    When I click on schedule tab
    Then I should see already scheduled appointment
    When I click on three dots
    #* I hover over on create soapnotes
    #* I click on based on patient medical record
    * I click on edit soapnotes
    Then I should see <Patient> as patient
    When I click on add Medication plus button
    And I enter <MedicationCode> as the medication code
    * I enter <Medication_Route> as medication route
    * I enter <Medication_Start_Date> as start date
    * I enter <Medication_Reason> as medication reason
    * I enter <Medication_DispensedQuantity> as medication despensed quantity
    * I click on saveclose button to save medications
    Then I should see medications data in soap note popup

    Examples: 
      | MedicationCode | Medication_Route | Medication_Start_Date | Medication_Reason       | Medication_DispensedQuantity  | Patient   |
      | Lipitor Oral   | buccal           |              04162021 | burns of multiple sites |                            2   | ADam, Tom |

  Scenario: Verify deleting Scheduled Appointment
    When I click on schedule tab
    Then I should see already scheduled appointment
    When I click on three dots
    And I click on delete appointment
    And I should see delete appointment message
