package patientGrid

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.util.concurrent.ConcurrentHashMap.KeySetView

import javax.servlet.http.WebConnection

import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And

public class SD_PalliativeCare {


	@And("I click on plus form")
	public void I_click_on_plus_form_button() {

		Thread.sleep(3000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_FormsBtn'))
	}

	@And("I click on palliative care")
	public void I_click_on_palliative_care() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_PalliativeCare'))
	}

	@And("I should see (.*) as patient name in form popup")
	public void I_should_see_form_popup_with_relevant_data(String Patient) {


		String actual_Name = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PopupValidation/Obj_Name'))

		WebUI.verifyEqual(actual_Name, Patient)

//		String actual_Gender = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PopupValidation/Obj_Gender'))
//
//		WebUI.verifyEqual(actual_Gender, 'Male')
//
//		String actual_MRN = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PopupValidation/Obj_MRN'))
//
//		WebUI.verifyEqual(actual_MRN, 'MRN :  EntMerging505')
	}
	
	
	@And("I should see palliative care form title")
	public void I_should_see_palliative_Care_Title() {

		String actual_Title = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PopupValidation/Obj_PalliativeCareTitle'))

		WebUI.verifyEqual(actual_Title, 'Palliative Care Form')

	}

	@And("I enter (.*) as date and time")
	public void I_enter_as_date_and_time(String DateTime) {

		//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_DateTime_Click'))
		WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_DateTime_Input'))
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_DateTime_Input'), DateTime)

	}

	@And("I enter (.*) as date of discharge")
	public void I_enter_as_DateOfDischarge(String DateOfDischarge) {

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_DateOfDischarge'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_DateOfDischarge'), DateOfDischarge)
	}

	@And("I select payer")
	public void I_select_payer() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_payer'))
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_selectPayer'))
	}

	@And("I enter (.*) as Payer Referral Date")
	public void I_enter_as_as_Payer_Referral_Date(String PayerReferralDate) {

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_PayerReferalDate'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_PayerReferalDate'), PayerReferralDate)
	}

	@And("I enter (.*) as Medicare ID")
	public void I_enter_as_as_Medicare_ID(String MedicareID) {

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_MedicareID'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_MedicareID'), MedicareID)
	}

	@And("I enter (.*) as Medicaid ID")
	public void I_enter_as_as_Medicaid_ID(String MedicaidID) {

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_MediID'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_MediID'), MedicaidID)
	}

	@And("I enter (.*) as Marketplace ID")
	public void I_enter_as_as_Marketplace_ID(String MarketplaceID) {

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_MarketPlaceID'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_MarketPlaceID'), MarketplaceID)
	}

	@And("I enter (.*) as Insurance ID")
	public void I_enter_as_Insurance_ID(String InsuranceID) {

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_InsuranceID'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_InsuranceID'), InsuranceID)
	}

	@And("I select patient type")
	public void I_select_patient_type() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_PatientType'))

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_SelectPatientType'))
	}

	@And("I select contracted patient")
	public void I_select_contractedpatient() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_ContaractedPatient'))

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_SelectContaractedPatient'))
	}

	@And("I select vpa office location")
	public void I_select_vpaOfficeLocation() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_VPALocation'))

		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_SelectVPALocation'))
	}

	@And("I enter (.*) as health plan care manager")
	public void I_enter_as_health_plan_care_manager(String HealthPlanCareManager) {


		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_HealthCarePlanManager'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_HealthCarePlanManager'), HealthPlanCareManager)
	}

	@And("I enter (.*) as palliative care nurse practitioner")
	public void I_enter_Palliative_Care_Nurse_Practitioner(String PalliativeCareNursePractitioner) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_PalliativeCareNurseClick'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_PalliativeCareNurseinput'), PalliativeCareNursePractitioner)




		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_PalliativeCareNurseinput'),Keys.chord(Keys.ENTER))
	}

	@And("I enter (.*) as diagnoses")
	public void I_enter_as_diagnoses(String Diagnoses) {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_DiagnosesInput'))

		Thread.sleep(1000)
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_DiagnosesInput'), Diagnoses)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_SelectDiagnoses'))
	}


	@And("I select referral source")
	public void I_select_referral_source() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_ReferralSource'))

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_SelectReferralSource'))
	}

	@And("I select status")
	public void I_select_status() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_Status'))

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_SelectStatus'))
	}



	@And("I enter (.*) as NP palliative care assessment date")
	public void I_enter_as_NPpalliativecareassessmentdate(String NPPalliativeCareAssessmentDate) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_NPPalliativeCareAssessmentDate'), NPPalliativeCareAssessmentDate)
	}

	@And("I enter (.*) as palliative care start date")
	public void I_enter_as_palliativecarestartdate(String PalliativeCareStartDate) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_PalliativeCareStartDate'), PalliativeCareStartDate)
	}

	@And("I enter (.*) as NP third visit date")
	public void I_enter_as_NPthirdvisitdate(String NP3rdVisitDate) {


		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_np3rdVisitDate'), NP3rdVisitDate)
	}

	@And("I enter (.*) as most recent NP palliative care visit date")
	public void I_enter_as_MostrecentNPPalliativeCareVisitDate(String MostrecentNPPalliativeCareVisitDate) {



		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_MostrecentNPPalliativeCareVisitDate'), MostrecentNPPalliativeCareVisitDate)
	}

	@And("I enter (.*) as advance care planning date")
	public void I_enter_as_AdvanceCarePlanningDate(String AdvanceCarePlanningDate) {



		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_AdvanceCarePlanningDate'), AdvanceCarePlanningDate)
	}

	@And("I enter (.*) as IDG date")
	public void I_enter_as_IDGDate(String IDGDate) {



		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_IDGDate'), IDGDate)
	}


	@And("I select Inpatient admit or ER visit while on Palliative Care Services in the last thirty days")
	public void I_select_inpatientadmitorervisti() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_InpatientadmitorERvisitwhileonPalliativeCareServicesinthelast30days'))

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_SelectInpatientadmitorERvisitwhileonPalliativeCareServicesinthelast30days'))
	}

	@And("I enter (.*) as Date of Inpatient admit or ER visit while on Palliative Care services within the last thirty days")
	public void I_enter_as_dateofinpatientadmit(String Date_of_Inpatient_admit_or_ER_visit_while_on_PalliativeCareservices_within_the_last30days) {



		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_DateofInpatientadmitorERvisitwhileonPalliativeCareserviceswithinthelast30days'), Date_of_Inpatient_admit_or_ER_visit_while_on_PalliativeCareservices_within_the_last30days)
	}


	@And("I enter (.*) as chaplin referral date")
	public void I_enter_as_ChaplinReferralDate(String ChaplinReferralDate) {



		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_ChaplinReferralDate'), ChaplinReferralDate)
	}


	@And("I enter (.*) as chaplin assessment date")
	public void I_enter_as_ChaplinAssessmentDate(String ChaplinAssessmentDate) {



		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_ChaplinAssessmentDate'), ChaplinAssessmentDate)
	}


	@And("I enter (.*) as Most recent Chaplin Visit Date")
	public void I_enter_as_MostrecentChaplinVisitDate(String MostrecentChaplinVisitDate) {



		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_MostrecentChaplinVisitDate'), MostrecentChaplinVisitDate)
	}


	@And("I enter (.*) as social work referral date")
	public void I_enter_as_SocialWorkReferralDate(String SocialWorkReferralDate) {



		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_SocialWorkReferralDate'), SocialWorkReferralDate)
	}


	@And("I enter (.*) as social work assessment date")
	public void I_enter_as_SocialWorkAssessmentDate(String SocialWorkAssessmentDate) {



		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_SocialWorkAssessmentDate'), SocialWorkAssessmentDate)
	}


	@And("I enter (.*) as most recent social work visit date")
	public void I_enter_as_MostRecentSocialWorkVisitDate(String MostRecentSocialWorkVisitDate) {



		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_MostRecentSocialWorkVisitDate'), MostRecentSocialWorkVisitDate)
	}


	@And("I enter (.*) as hospice referral date")
	public void I_enter_as_HospiceReferralDate(String HospiceReferralDate) {



		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_HospiceReferralDate'), HospiceReferralDate)
	}


	@And("I enter (.*) as hospice admit date")
	public void I_enter_as_HospiceAdmitDate(String HospiceAdmitDate) {



		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_HospiceAdmitDate'), HospiceAdmitDate)
	}


	@And("I enter (.*) as hospice company")
	public void I_enter_as_HospiceCompany(String HospiceCompany) {


		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_HospiceCompany'), HospiceCompany)
	}

	@And("I enter (.*) as call outreach Placed by")
	public void I_enter_as_Call1OutreachPlacedby(String Call1OutreachPlacedby) {


		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_Call1OutreachPlacedby'), Call1OutreachPlacedby)
	}

	@And("I enter (.*) as call date")
	public void I_enter_as_Call1Date(String Call1Date) {


		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_Call1Date'), Call1Date)
	}

	@And("I enter (.*) as palliative comments")
	public void I_enter_as_Comment(String Comments) {



		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_Comment'), Comments)
	}

	@And("I click on save button to save patient data")
	public void I_click_on_save_button_to_save_patient_data() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_SaveBtn'))
	}

	@And("I should see record success message")
	public void I_should_see_record_success_message() {


		Thread.sleep(1000)
		String ActualText = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_ValidationMessage/Obj_recordSaveSuccessfully'))

		WebUI.verifyEqual(ActualText, 'successRecord saved successfully.Hide')

		WebUI.click(findTestObject('Object Repository/OR_Alert/Obj_Hide'))
	}
}
