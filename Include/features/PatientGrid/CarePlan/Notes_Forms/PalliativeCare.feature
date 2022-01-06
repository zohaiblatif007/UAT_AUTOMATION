Feature: Care Plan - Notes - Forms

  Background: 
    Given I navigate to patient grid

  Scenario Outline: Verify PalliativeCare
    When I search <Patient> using global search
    Then I am on PWB
    And I click on notes tab
    * I click on plus form
    * I click on palliative care
    * I should see <Patient> as patient name in form popup
    * I should see palliative care form title
    * I enter <DateTime> as date and time
    * I enter <DateOfDischarge> as date of discharge
    * I select payer
    * I enter <PayerReferralDate> as Payer Referral Date
    * I enter <MedicareID> as Medicare ID
    * I enter <MedicaidID> as Medicaid ID
    * I enter <MarketplaceID> as Marketplace ID
    * I enter <InsuranceID> as Insurance ID
    * I select patient type
    * I select contracted patient
#    * I select vpa office location
    * I enter <HealthPlanCareManager> as health plan care manager
#    * I enter <PalliativeCareNursePractitioner> as palliative care nurse practitioner
    * I enter <Diagnoses> as diagnoses
    * I select referral source
    * I select status
    * I enter <NPPalliativeCareAssessmentDate> as NP palliative care assessment date
    * I enter <PalliativeCareStartDate> as palliative care start date
    * I enter <NP3rdVisitDate> as NP third visit date
    * I enter <MostrecentNPPalliativeCareVisitDate> as most recent NP palliative care visit date
    * I enter <AdvanceCarePlanningDate> as advance care planning date
    * I enter <IDGDate> as IDG date
    * I enter <Date_of_Inpatient_admit_or_ER_visit_while_on_PalliativeCareservices_within_the_last30days> as Date of Inpatient admit or ER visit while on Palliative Care services within the last thirty days
    * I enter <ChaplinReferralDate> as chaplin referral date
    * I enter <ChaplinAssessmentDate> as chaplin assessment date
    * I enter <MostrecentChaplinVisitDate> as Most recent Chaplin Visit Date
    * I enter <SocialWorkReferralDate> as social work referral date
    * I enter <SocialWorkAssessmentDate> as social work assessment date
    * I enter <MostRecentSocialWorkVisitDate> as most recent social work visit date
    * I enter <HospiceReferralDate> as hospice referral date
    * I enter <HospiceAdmitDate> as hospice admit date
    * I enter <HospiceCompany> as hospice company
    * I enter <Call1OutreachPlacedby> as call outreach Placed by
    * I enter <Call1Date> as call date
    * I enter <Comments> as palliative comments
    * I click on save button to save patient data
    Then I should see record success message

    Examples: 
      | Patient          | DateTime          | DateOfDischarge | PayerReferralDate | MedicareID | MedicaidID | MarketplaceID | InsuranceID | HealthPlanCareManager | PalliativeCareNursePractitioner | Diagnoses                                       | NPPalliativeCareAssessmentDate | PalliativeCareStartDate | NP3rdVisitDate | MostrecentNPPalliativeCareVisitDate | AdvanceCarePlanningDate | IDGDate  | Date_of_Inpatient_admit_or_ER_visit_while_on_PalliativeCareservices_within_the_last30days | ChaplinReferralDate | ChaplinAssessmentDate | MostrecentChaplinVisitDate | SocialWorkReferralDate | SocialWorkAssessmentDate | MostRecentSocialWorkVisitDate | HospiceReferralDate | HospiceAdmitDate | HospiceCompany | Call1OutreachPlacedby | Call1Date | Comments                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
      | ADam, Tom | 03152021 03:20 AM |        03152021 |          12032021 |         12 |         15 |            20 |          30 | Mehmood Anjum         | yet, another                   | Cholera due to Vibrio cholerae 01, biovar eltor |                       01032020 |                05032021 |       04032020 |                            05032020 |                06032020 | 07032020 |                                                                                  08032020 |            05022020 |              06022020 |                   07022020 |               08022020 |                 09022020 |                      01022020 |            02022020 |         03022021 | Soliton        | Amir                  |  02092020 | Lorem Ipsum is simply dummy text of the printing and typesetting industry.|
