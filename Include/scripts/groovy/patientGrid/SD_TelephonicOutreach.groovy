package patientGrid

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And

public class SD_TelephonicOutreach {

	@And("I click on telephonic outreach")
	public void I_click_on_telephonicoutreach() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_TelephonicOutreach'))
	}
	//
	//	@And("I should see telephonic outreach form popup with relevant data")
	//	public void I_should_see_telephonicoutreach_form_popup_with_relevant_data() {
	//
	//
	//		String actual_Name = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PopupValidation/Obj_Name'))
	//
	//		WebUI.verifyEqual(actual_Name, 'Dermo505, Mac505')
	//
	//	}

	@And("I should see TelephonicOutreach care form title")
	public void I_should_see_Telephonic_Care_Title() {

		String actual_Title = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PopupValidation/Obj_TelephonicOutreachTitle'))

		WebUI.verifyEqual(actual_Title, 'Telephonic Outreach Form')

	}

	@And("I enter telephonic outreach (.*) as datetime")
	public void I_enter_DateTime_telephonicoutreach(String DateTime) {

		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_telephonicStartDate'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_telephonicStartDate'), DateTime)
	}

	@And("I enter telephonic outreach (.*) as provider")
	public void I_enter_as_provider(String Provider) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_ProviderClick'))

		//WebUI.selectOptionByValue(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_ProviderInput'), Provider, true)

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_ProviderInput'), Provider)

		WebUI.enableSmartWait()
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_ProviderInput'), Keys.chord(Keys.ENTER))
		

	}

	@And("I select outreach office location")
	public void I_select_OfficeLocation() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_OfficeLocation_Click'))
		
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Page_Welcome to Persivia/Obj_OfficeLocationSelecttion'))
		
		
		//WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_OfficeLocation_Select'))
	}


	@And("I select outreach spoke with")
	public void I_select_SpokeWith() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_SpokeWith_Click'))
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Page_Welcome to Persivia/Obj_SpokeWithSelecttion'))
		
		//WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_SpokeWith_Select'))
	}


	@And("I enter telephonic outreach (.*) as duration")
	public void I_enter_as_duration(String Duration) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_Duration_Input'), Duration)
	}


	@And("I select outreach call type")
	public void I_select_CallType() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_CallType_Click'))
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_CallType_Select'))
	}


	@And("I select outreach status")
	public void I_select_Outreach_Status() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_Status_Click'))
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_Status_Select'))
	}


	@And("I enter telephonic outreach (.*) as follow up plan")
	public void I_enter_as_followupPlan(String Follow_Up_Plan) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_FollowUpPlan_Click'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_FollowUpPlan_Input'), Follow_Up_Plan)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_FollowUpPlan_Input'), Keys.chord(Keys.ENTER))
	}


	@And("I select Has patient gone to ER since placed on TOR within last thirty days?")
	public void I_select_HasPatientGoneER() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_HaspatientgonetoERsinceplacedonTOR_Click'))
		
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Page_Welcome to Persivia/Obj_HasPatientSelect'))
		
		//WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_HaspatientgonetoERsinceplacedonTOR_Select'))
	}


	@And("I select Was patient admittedreadmitted to acute care since placed on TOR in last thirty days?")
	public void I_select_WasPatientAdmitted() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_WasPatientAdmitted_Click'))
		
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Page_Welcome to Persivia/Obj_WasPatientSelect'))
		//WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_WasPatientAdmitted_Select'))
	}


	@And("I select Was ER visit or Acute Admission preventable?")
	public void I_select_WasERVisit() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_WasERVisit_Click'))
		
		
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Page_Welcome to Persivia/Obj_WasERSelect'))
		//WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/TelephonicOutreach/Obj_WasERVisit_Select'))
	}


	@And("I enter (.*) as outreach comments")
	public void I_enter_as_outreach_Comment(String Comments) {



		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Forms/PalliativeCareForm/Obj_outreach_Comments'), Comments)
	}
}
