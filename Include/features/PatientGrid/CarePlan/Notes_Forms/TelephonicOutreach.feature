Feature: Care Plan - Notes - Forms

  Background: 
    Given I navigate to patient grid

  Scenario Outline: Verify Telephonic Outreach
    When I search <Patient> using global search
    Then I am on PWB
    And I click on notes tab
    * I click on plus form
    * I click on telephonic outreach
    * I should see <Patient> as patient name in form popup
    * I should see TelephonicOutreach care form title
    * I enter telephonic outreach <DateTime> as datetime
    * I enter telephonic outreach <Provider> as provider
    * I select outreach office location
    * I select outreach spoke with
    * I enter telephonic outreach <Duration> as duration
    * I select outreach call type
    * I select outreach status
    * I enter telephonic outreach <Follow_Up_Plan> as follow up plan
    * I select Has patient gone to ER since placed on TOR within last thirty days?
    * I select Was patient admittedreadmitted to acute care since placed on TOR in last thirty days?
    * I select Was ER visit or Acute Admission preventable?
    * I enter <Comments> as outreach comments
    * I click on save button to save patient data
    Then I should see record success message

    Examples: 
      | Patient   | DateTime          | Provider      | Duration | Follow_Up_Plan | Comments                                                                   |
      | ADam, Tom | 03152021 03:20 AM | McClain, | 10:15:20 | Education      | Lorem Ipsum is simply dummy text of the printing and typesetting industry. |
