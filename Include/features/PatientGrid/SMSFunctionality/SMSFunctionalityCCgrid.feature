Feature: Verify SMS notification is working fine

  Background: 
  Given I navigate to Care Coordination
   
  @VerifySMSfromCCGridAppointment @Regression @Sanity
  Scenario Outline: SMS sent from CC grid to PWB and verify sms on Communication Center
 Given I search <Patient> using global search from CC
   And I click on searched patient from CC 
     * I click on appointment tab
     * I click on edit button to edit appointment
     * I set visit type as telehealth in PWB
     * I verify that copy button and send sms button available and functional 
     * I set start date for appointment
     * I set end date for appointment 
     * I click the Send SMS button from schedual appointment
     * I should see the Invite Via Text Message window
     * I select the <Language> in which the invitation is to be sent from language dropdown
     * I enter <Phone> to send message   
     * I click the Send SMS button
     * I should see the Message sent successfully notification   
  When I click the save button to save Appointments
     * I click cross icon to close expanded patient page
   And I select SMS log from communication center dropdwon
     * I apply left filter to refresh the sms sent record
     * I verify message status for <Patient> is changed into delivered
     * I click on view button to view sent meassage
     * I click the cancel button to cancel view screen

    Examples: 
      | Filter   | Patient                          |Language|    Phone   |Message_Text|
      | Contains | Shelly, Shelly | Spanish|+19294154089|Edit message|
      
  
   
  @CreatAppointmentfromCCGrid @Regression @Sanity
  Scenario Outline: Create appointment from CC grid to PWB
 Given I search <Patient> using global search from CC
   And I click on searched patient from CC 
     * I click on appointment tab
     * I click on Add button to add appointment
     * I set visit type as telehealth in PWB
     * I verify that copy button and send sms button available and functional 
     * I set <Reason> to schedual the appointment
     * I set start date for appointment
     * I set end date for appointment
     * I set status <Status> for appointment
     * I enter <Comment> in text area of appointment    
  When I click the save button to save Appointments
  Then I should see message of success for <module> record
     * I verify that appointment created successfully with <Reason> and <Status> and <Comment> and with telehealth type 
     * I should see Edit appointment, Show log and Delete buttons are available and functional

    Examples: 
      | Filter   | Patient                          |Language|    Phone   |Message_Text| Status  |             Comment               |module|    Reason     |
      | Contains | Shelly, Shelly | Spanish|+19294154089|Edit message|Scheduled|Appointment created through CC grid|adding|Abnormal menses|
      #
  