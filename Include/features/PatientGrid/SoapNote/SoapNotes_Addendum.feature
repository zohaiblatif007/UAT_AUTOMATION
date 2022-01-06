Feature: Soap Note Creation from Schedule flow

  Background: 
    Given I navigate to patient grid

  Scenario Outline: Verify Creating Schedule Appointment Using Soap Notes
    When I click on schedule tab
    And I double click on screen to add appointment
    Then I should see schedule appointment popup
    When I enter <Patient> as appointment patient
    And I enter <Reason> as appointment reason
    * I should see patient information
    * I drag chat list
    * I click create button to save appointment
    * I click on yes button
    * I click on proceed button to appointment
    Then I should see appointment success message
    
    When I click on three dots
    * I hover over on create soapnotes
    * I click on based on patient medical record
    * I select Rendering Provider
    When I click on Sign button to sign soapnotes
    Then I should see sign saved message
    When I click on Addendum button
    * I click 
    
    


    Examples: 
      | Patient          | Reason    | ThePatientUnderstands                                                             |                       
      | Dermo505, Mac505 | Back pain | I am not assuming any responsibility for their care of providing direct treatment |
  
  
  Scenario: Verify deleting Scheduled Appointment
    When I click on schedule tab
    Then I should see already scheduled appointment
    When I click on three dots
    And I click on delete appointment
    And I should see delete appointment message
