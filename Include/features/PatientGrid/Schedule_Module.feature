Feature: Scheduled Left Filters flow

  Background: 
    Given I navigate to patient grid With Schedule

@SmokeUSMM_ScheduleAppointment
  Scenario Outline: Verify Creating Appointment
    When I double click on screen to add appointment
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
      | Patient          | Reason    |
      | ADam, Tom | Back pain |

@SmokeUSMM_VerifyVisitTypeFilter
  Scenario Outline: Verify Visit Type Filters
    When I click on schedule left filters reset button
    * I Search <VisitType> as schedule visit type
    * I click on schedule apply button
    * I hover over the created appointment
    Then I should see <VisitType> as VisitType

    Examples: 
      | VisitType  |
      | Office Visit |

@SmokeUSMM_VerifyProviderFilter
  Scenario Outline: Verify Appoitnment Provider Filters
    When I click on schedule left filters reset button
    * I Search <ApptProvider> as schedule appt provider
    * I click on schedule apply button
    * I hover over the created appointment
    Then I should see <ApptProvider> as Provider

    Examples: 
      | ApptProvider |
      | Amir, Hafiz  |

@SmokeUSMM_PrepopulatedDataOnEdit
  Scenario Outline: Verify That Patient data are pre-populated on Edit appointment
    Then I should see already scheduled appointment
    When I click on three dots
    * I click on edit appointment button
    Then I should see <Patient> as actual patient name
    
    Examples: 
      | Patient          | 
      | ADam, Tom |

@SmokeUSMM_VerifyDataFromExcel
  Scenario: Verify That Patient From Excel
    Then I should see already scheduled appointment
    When I click on three dots
    * I click on edit appointment button
    Then I should see patient data same as excel

@SmokeUSMM_DeleteScheduleAppointment_ScheduleModule
  Scenario: Verify deleting Scheduled Appointment
    And I should see already scheduled appointment
    When I click on three dots
    And I click on delete appointment
    And I should see delete appointment message
