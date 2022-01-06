@Blank
Feature: Care Plan - Blank

  Background: 
    Given I navigate to patient grid

  @SmokeUSMM_Blank
  Scenario Outline: Blank
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    And I click on add new care plan button
    And I click on blank
    Then I should see patient <Patient> as patient_name
    When I enter title <Title>
    And I click on save and close button
    Then I should see success message <SucessMessage> of CP

    Examples: 
      | Patient   | Title          | SucessMessage                           |
      | ADam, Tom | TestingPatient | successCare Plan Saved SuccessfullyHide |

  @SmokeUSMM_ApprovedSaveBtn_Blank
  Scenario Outline: Verify Approve Status Function Using Save Button
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    And I click on add new care plan button
    And I click on blank
    Then I should see patient <Patient> as patient_name
    And I should see intial status as <New Status> on CP header
    When I enter title <Title>
    And I select work in progress as no
    And I click on save button
    Then I should see success message <SucessMessage> of CP
    Then I should see patient <Patient> as patient_name
    And I should see status as <Draft Status> on CP header
    When I click on saveapprove button_Blank
    Then I should see alert popup
    And I click on proceed button
    Then I should see success message <SucessMessage> of CP
    When I click on title from care plan grid
    Then I should see patient <Patient> as patient_name
    And I should see patient data as read only
    And I should see approval status as <Approved Status> on CP header

    Examples: 
      | Patient   | Title           | New Status | Draft Status | Approved Status | SucessMessage                           |
      | ADam, Tom | ApprovedPatient | New        | Draft        | Approved        | successCare Plan Saved SuccessfullyHide |

  @SmokeUSMM_ApprovedSaveCloseBtn_Blank
  Scenario Outline: Verify Approve Status Function Using Save & Close Button
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    And I click on add new care plan button
    And I click on blank
    Then I should see patient <Patient> as patient_name
    And I should see intial status as <New Status> on CP header
    When I enter title <Title>
    And I select work in progress as no
    And I click on save and close button
    Then I should see success message <SucessMessage> of CP
    When I click on title from care plan grid
    Then I should see patient data of draft status
    And I should see status as <Draft Status> on CP header
    When I click on saveapprove button_Blank
    Then I should see alert popup
    And I click on proceed button
    Then I should see success message <SucessMessage> of CP
    When I click on title from care plan grid
    Then I should see patient <Patient> as patient_name
    And I should see patient data as read only
    And I should see approval status as <Approved Status> on CP header

    Examples: 
      | Patient   | Title           | New Status | Draft Status | Approved Status | SucessMessage                           |
      | ADam, Tom | ApprovedPatient | New        | Draft        | Approved        | successCare Plan Saved SuccessfullyHide |

   
  @SmokeUSMM_DraftSaveBtn_Blank
  Scenario Outline: Verify Draft status function using save button
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    And I click on add new care plan button
    And I click on blank
    Then I should see patient <Patient> as patient_name
    And I should see intial status as <New Status> on CP header
    When I enter title <Title>
    And I select work in progress as no
    And I click on save button
    Then I should see success message <SucessMessage> of CP
    Then I should see patient <Patient> as patient_name
    And I should see patient data of draft status
    And I should see status as <Draft Status> on CP header

    Examples: 
      | Patient   | Title        | New Status | Draft Status | SucessMessage                           |
      | ADam, Tom | DraftPatient | New        | Draft        | successCare Plan Saved SuccessfullyHide |

  @SmokeUSMM_DraftSaveCloseBtn_Blank
  Scenario Outline: Verify draft status function using save & close button
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    And I click on add new care plan button
    And I click on blank
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
      | Patient   | Title        | New Status | Draft Status | SucessMessage                           |
      | ADam, Tom | DraftPatient | New        | Draft        | successCare Plan Saved SuccessfullyHide |

  @SmokeUSMM_WIPSaveBtn_Blank
  Scenario Outline: Verify WIP status function using save button
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    And I click on add new care plan button
    And I click on blank
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
      | Patient   | Title      | New Status | WIP Status | SucessMessage                           |
      | ADam, Tom | WIPPatient | New        | WIP        | successCare Plan Saved SuccessfullyHide |

  @SmokeUSMM_WIPSaveCloseBtn_Blank
  Scenario Outline: Verify WIP status function using save & close button
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    And I click on add new care plan button
    And I click on blank
    Then I should see patient <Patient> as patient_name
    And I should see intial status as <New Status> on CP header
    When I enter title <Title>
    And I click on save and close button
    Then I should see success message <SucessMessage> of CP
    When I click on title from care plan grid
    Then I should see patient <Patient> as patient_name
    And I should see patient data of WIP status
    And I should see progress status as <WIP Status> on CP header

    Examples: 
      | Patient   | Title      | New Status | WIP Status | SucessMessage                           |
      | ADam, Tom | WIPPatient | New        | WIP        | successCare Plan Saved SuccessfullyHide |

  @SmokeUSMM_RejectedSaveBtn_Blank
  Scenario Outline: Verify reject status function using save button
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    And I click on add new care plan button
    And I click on blank
    Then I should see patient <Patient> as patient_name
    And I should see intial status as <New Status> on CP header
    When I enter title <Title>
    And I select work in progress as no
    And I click on save button
    Then I should see success message <SucessMessage> of CP
    * I should see patient <Patient> as patient_name
    And I should see patient data of draft status
    And I should see status as <Draft Status> on CP header
    When I click on reject button_Blank
    Then I should see rejected alert popup
    And I click on proceed button
    And I should see rejected success message
    When I click on title from care plan grid
    Then I should see patient <Patient> as patient_name
    And I should see patient data as read only
    And I should see reject status as <Rejected Status> on CP header

    Examples: 
      | Patient   | Title           | New Status | Draft Status | Rejected Status | SucessMessage                           |
      | ADam, Tom | RejectedPatient | New        | Draft        | Rejected        | successCare Plan Saved SuccessfullyHide |

  @SmokeUSMM_RejectedSaveCloseBtn_Blank
  Scenario Outline: Verify reject status function using save & close button
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    And I click on add new care plan button
    And I click on blank
    Then I should see patient <Patient> as patient_name
    And I should see intial status as <New Status> on CP header
    When I enter title <Title>
    And I select work in progress as no
    And I click on save and close button
    Then I should see success message <SucessMessage> of CP
    When I click on title from care plan grid
    Then I should see patient data of draft status
    And I should see status as <Draft Status> on CP header
    When I click on reject button_Blank
    Then I should see rejected alert popup
    And I click on proceed button
    And I should see rejected success message
    When I click on title from care plan grid
    Then I should see patient <Patient> as patient_name
    And I should see patient data as read only
    And I should see reject status as <Rejected Status> on CP header

    Examples: 
      | Patient   | Title           | New Status | Draft Status | Rejected Status | SucessMessage                           |
      | ADam, Tom | RejectedPatient | New        | Draft        | Rejected        | successCare Plan Saved SuccessfullyHide |

  @SmokeUSMM_ExportWhileWIP_Blank
  Scenario Outline: Verify Export function while WIP status
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    And I click on add new care plan button
    And I click on blank
    Then I should see patient <Patient> as patient_name
    And I should see intial status as <New Status> on CP header
    When I enter title <Title>
    And I click on save button
    Then I should see success message <SucessMessage> of CP
    * I should see patient <Patient> as patient_name
    And I should see progress status as <WIP Status> on CP header
    And I should see export button

    Examples: 
      | Patient   | Title      | New Status | WIP Status | SucessMessage                           |
      | ADam, Tom | WIPPatient | New        | WIP        | successCare Plan Saved SuccessfullyHide |

  @SmokeUSMM_ExportWhileDraft_Blank
  Scenario Outline: Verify export function while draft status
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    And I click on add new care plan button
    And I click on blank
    Then I should see patient <Patient> as patient_name
    And I should see intial status as <New Status> on CP header
    When I enter title <Title>
    And I select work in progress as no
    And I click on save button
    Then I should see success message <SucessMessage> of CP
    * I should see patient <Patient> as patient_name
    And I should see patient data of draft status
    And I should see status as <Draft Status> on CP header
    And I should see export button

    Examples: 
      | Patient   | Title        | New Status | Draft Status | SucessMessage                           |
      | ADam, Tom | DraftPatient | New        | Draft        | successCare Plan Saved SuccessfullyHide |

  @SmokeUSMM_Print_Patient_WIP_Blank
  Scenario Outline: Verify Print Button Using Patient Care Plan While WIP Status
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    And I click on add new care plan button
    And I click on blank
    Then I should see patient <Patient> as patient_name
    And I should see intial status as <New Status> on CP header
    When I enter title <Title>
    And I click on save button
    Then I should see success message <SucessMessage> of CP
    * I should see patient <Patient> as patient_name
    And I should see progress status as <WIP Status> on CP header
    When I click on print button
    Then I should see patient care plan

    Examples: 
      | Patient   | Title      | New Status | WIP Status | SucessMessage                           |
      | ADam, Tom | WIPPatient | New        | WIP        | successCare Plan Saved SuccessfullyHide |

  @SmokeUSMM_Print_Provide_WIP_Blank
  Scenario Outline: Verify Print Button Using Provide Care Plan While WIP Status
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    And I click on add new care plan button
    And I click on blank
    Then I should see patient <Patient> as patient_name
    And I should see intial status as <New Status> on CP header
    When I enter title <Title>
    And I click on save button
    Then I should see success message <SucessMessage> of CP
    * I should see patient <Patient> as patient_name
    And I should see progress status as <WIP Status> on CP header
    When I click on print button
    Then I should see provide care plan

    Examples: 
      | Patient   | Title      | New Status | WIP Status | SucessMessage                           |
      | ADam, Tom | WIPPatient | New        | WIP        | successCare Plan Saved SuccessfullyHide |

  @SmokeUSMM_Print_Patient_Draft_Blank
  Scenario Outline: Verify Print Button Using Patient Care Plan While Draft Status
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    And I click on add new care plan button
    And I click on blank
    Then I should see patient <Patient> as patient_name
    And I should see intial status as <New Status> on CP header
    When I enter title <Title>
    And I select work in progress as no
    And I click on save button
    Then I should see success message <SucessMessage> of CP
    * I should see patient <Patient> as patient_name
    And I should see patient data of draft status
    And I should see status as <Draft Status> on CP header
    When I click on print button
    Then I should see patient care plan

    Examples: 
      | Patient   | Title        | New Status | Draft Status | SucessMessage                           |
      | ADam, Tom | DraftPatient | New        | Draft        | successCare Plan Saved SuccessfullyHide |

  @SmokeUSMM_Print_Provide_Draft_Blank
  Scenario Outline: Verify Print Button Using Provide Care Plan While Draft Status
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    And I click on add new care plan button
    And I click on blank
    Then I should see patient <Patient> as patient_name
    And I should see intial status as <New Status> on CP header
    When I enter title <Title>
    And I select work in progress as no
    And I click on save button
    Then I should see success message <SucessMessage> of CP
    * I should see patient <Patient> as patient_name
    And I should see patient data of draft status
    And I should see status as <Draft Status> on CP header
    When I click on print button
    Then I should see provide care plan

    Examples: 
      | Patient   | Title        | New Status | Draft Status | SucessMessage                           |
      | ADam, Tom | DraftPatient | New        | Draft        | successCare Plan Saved SuccessfullyHide |

  @SmokeUSMM_EmergencyContact_Blank
  Scenario Outline: Add New Emergency Contact While Show & Hide multiple Components
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    And I click on add new care plan button
    And I click on blank
    And I should see add new emergency contact
    When I hover on add new emergency contact
    Then I click on plussign button
    And I enter last name as <LastName>
    And I enter first name as <FirstName>
    And I enter home phone as <HomePhone>
    And I enter mobile phone as <MobilePhone>
    And I click on tickbox
    When I enter title <Title>
    And I click on save and close button
    Then I should see success message <SucessMessage> of CP
    When I click on title from care plan grid
    Then I should see emergency contact data LastName as <LastName> and FirstName as <FirstName> and HomePhone as <HomePhone> and MobilePhone as <MobilePhone> number

    Examples: 
      | Patient   | Title                 | LastName   | FirstName | HomePhone    | MobilePhone | SucessMessage                           |
      | ADam, Tom | New Emergence Contact | Automation | CMR       | 923019536782 | 30195366523 | successCare Plan Saved SuccessfullyHide |
