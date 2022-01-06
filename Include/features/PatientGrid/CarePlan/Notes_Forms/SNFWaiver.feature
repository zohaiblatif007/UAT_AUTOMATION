Feature: Care Plan - Notes - Forms

  Background: 
    Given I navigate to patient grid

  Scenario Outline: Verify SNF Waiver
    When I search <Patient> using global search
    Then I am on PWB
    And I click on notes tab
    * I click on plus form
    * I click on SNF Waiver
    * I should see <Patient> as patient name in form popup
    * I should see SNFWaiver care form title
    * I enter SNF <DateTime> as datetime
    * I enter SNF <AprimaID> as aprima id
    * I select SNF referral source
    * I enter SNF <ReferralSourceDate> as referral source date
    * I select nurse navigator
    * I enter SNF <ReferralName> as referral name
    * I select VPA office location
    * I click patient attribute to ACO
    * I select patient attribute to ACO
    * I select patient status
    * I enter SNF <LastSeenByVPAProvider> as last seen by VPA provider
    * I select patient patient attributeIAH
    * I enter SNF <AdmissionDate> as SNF admission date
    * I enter SNF <Facility> as facility
    * I enter SNF <EstimatedLOS> as estimated LOS days
    * I enter SNF <DischargeDate> as discharge date
    * I enter SNF <ActualLOS> as actual LOS days
    * I enter SNF <Comments> as SNF comments
    * I click on save button to save patient data
    Then I should see record success message

    Examples: 
      | Patient          | DateTime          | AprimaID | ReferralSourceDate | ReferralName | LastSeenByVPAProvider | AdmissionDate | Facility | EstimatedLOS | DischargeDate | ActualLOS | Comments                                                                   |
      | ADam, Tom | 03152021 03:20 AM |      122 |           12022020 | Ali          | 12022020         |      12202021 | MHPN     |           10 |      15092020 |        15 | Lorem Ipsum is simply dummy text of the printing and typesetting industry. |
