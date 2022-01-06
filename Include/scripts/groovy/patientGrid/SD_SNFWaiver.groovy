package patientGrid

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And



public class SD_SNFWaiver {

	@And("I click on SNF Waiver")
	public void I_click_on_SNF_Waiver() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_SNFWaiver'))
	}

	//	@And("I should see form SNF Waiver popup with relevant data")
	//	public void I_should_see_SNF_Waiver_form_popup_with_relevant_data() {
	//
	//
	//		String actual_Name = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PopupValidation/Obj_Name'))
	//
	//		WebUI.verifyEqual(actual_Name, 'Dermo505, Mac505')
	//
	//	}

	@And("I should see SNFWaiver care form title")
	public void I_should_see_SNF_Care_Title() {

		String actual_Title = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PopupValidation/Obj_SNFWaiverTitle'))

		WebUI.verifyEqual(actual_Title, 'SNF Waiver Form')

	}

	@And("I enter SNF (.*) as datetime")
	public void i_enter_SNF_AM_as_datetime(String DateTime) {

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_StartDate'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_StartDate'), DateTime)
	}

	@And("I enter SNF (.*) as aprima id")
	public void i_enter_SNF_as_aprima_id(String AprimaID) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_AprimaID'), AprimaID)
	}

	@And("I select SNF referral source")
	public void i_select_referralsource() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_ReferralSourceClick'))
		//WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_SelectReferralSource'))
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Page_Welcome to Persivia/li_Family'))
	}

	@And("I enter SNF (.*) as referral source date")
	public void i_enter_SNF_as_referral_source_date(String ReferralSourceDate) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_SNFReferralDate'), ReferralSourceDate)
	}

	@And("I select nurse navigator")
	public void i_select_nurse_navigator() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_NurseNavigatorClick'))
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_SelectNurseNavigator'))
	}

	@And("I select VPA office location")
	public void i_select_VPA_office_location() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_VPAOfficeLocationClick'))
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_SelectVPALocation'))
	}

	@And("I select patient status")
	public void i_select_patientstatus() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_PatientStatusClick'))
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_SelectPatientStatus'))
	}

	@And("I select patient attribute to ACO")
	public void i_select_patient_attribute_to_ACO() {
				
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Page_Welcome to Persivia/Page_Welcome to Persivia/Obj_ACOSelect'))
		
	//WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_SelectPatientAttributeACO'))
	}

	@And("I click patient attribute to ACO")
	public void i_click_patient_attribute_to_ACO() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_PatientAttributeACOClick'))
	}

	@And("I select patient patient attributeIAH")
	public void i_select_patient_attribute_to_IAH() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_PatientAttributedtoIAH'))
		
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Page_Welcome to Persivia/Page_Welcome to Persivia/Obj_IAHSelect'))
		
		
		//WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_SelectPatientAttributed_IAH'))
	}

	@And("I enter (.*) as last seen by VPA provider")
	public void i_enter_SNF_Mehmood_Anjum_as_last_seen_by_VPA_provider(String LastSeenByVPAProvider) {

		WebUI.setText(	findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_LastSeenByVPA'), LastSeenByVPAProvider)
	}

	@And("I enter (.*) as referral name")
	public void i_enter_referralname(String ReferralName) {

		WebUI.setText(	findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_ReferralName'), ReferralName)
	}

	@And("I enter SNF (.*) as SNF admission date")
	public void i_enter_SNF_as_SNF_admission_date(String AdmissionDate) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_SNFAdmissionDate'), AdmissionDate)
	}

	@And("I enter SNF (.*) as facility")
	public void i_enter_SNF_MHPN_as_facility(String Facility) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_Facility'), Facility)
	}

	@And("I enter SNF (.*) as estimated LOS days")
	public void i_enter_SNF_as_estimated_LOS_days(String EstimatedLOS) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_EstimatedLOSDate'), EstimatedLOS)
	}

	@And("I enter SNF (.*) as discharge date")
	public void i_enter_SNF_as_discharge_date(String DischargeDate) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_DischargeDate'), DischargeDate)
	}

	@And("I enter SNF (.*) as actual LOS days")
	public void i_enter_SNF_as_actual_LOS_days(String ActualLOS) {
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_ActualLOSDate'), ActualLOS)
	}

	@And("I enter SNF (.*) as SNF comments")
	public void i_enter_SNF_Lorem_Ipsum_is_simply_dummy_text_of_the_printing_and_typesetting_industry_as_SNF_comments(String Comments) {

		WebUI.setText(	findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/SNFWaiver/Obj_SNFComment'), Comments)
	}
	//	@And("I click on save button to save SNF data")
	//	public void i_click_on_save_button_to_save_SNF_data() {
	//		// Write code here that turns the phrase above into concrete actions
	//		throw new PendingException();
	//	}
	//
	//	@And("I should see SNF record success message")
	//	public void i_should_see_SNF_record_success_message() {
	//		// Write code here that turns the phrase above into concrete actions
	//		throw new PendingException();
	//	}

}
