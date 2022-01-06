package patientGrid
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import org.openqa.selenium.Keys

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class SD_Schedule {




	@And("I hover over the created appointment")
	public void I_hover_over_on_Appointment() {

		WebUI.mouseOver(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/SoapNotes/Obj_DoubleClick_ScheduleAppointment'))
		Thread.sleep(2000)
	}

	@Then("I should see (.*) as VisitType")
	public void I_should_see_appointment_Data(String VisitType) {


		WebUI.getAttribute(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Tooltip_VisitTypeVerify'), VisitType)


		//		String actual_VisitTypeName = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Tooltip_VisitTypeVerify'))
		//		WebUI.verifyEqual(actual_VisitTypeName, VisitType.contains("Telehealth"))


		//		String actual_ReasonName = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Tooltip_ReasonVerify'))
		//		WebUI.verifyEqual(actual_ReasonName, "Reason: Back pain")
		//
		//		String actual_PatientName = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Tooltip_PatientVerify'))
		//		WebUI.verifyEqual(actual_PatientName, "Patient: Dermo505, Mac505")
		//
		//		String actual_ProviderName = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Tooltip_ApptProviderVerify'))
		//		WebUI.verifyEqual(actual_ProviderName, "Appt. Provider: Amir, Hafiz")

		//		String actual_VisitTypeName = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Tooltip_VisitTypeVerify'))
		//		WebUI.verifyEqual(actual_VisitTypeName, "Visit Type: Telehealth")




	}



	@Then("I should see (.*) as Provider")
	public void I_should_see_appointmentProvider_Data(String ApptProvider) {




		WebUI.getAttribute(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Tooltip_ApptProviderVerify'), ApptProvider)
	}




	@When("I click on schedule left filters reset button")
	public void I_click_on_reset_Button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_ResetBTN'))
		Thread.sleep(2000)
	}

	@When("I click on edit appointment button")
	public void I_click_on_EditAppointment_Button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_EditAppointment'))
		Thread.sleep(2000)
	}


	@When("I Search (.*) as schedule visit type")
	public void I_Search_VisitType_Schedule(String VisitType) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Click_VisitTypeLeftFilters'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Input_VisitTypeLeftFilters'), VisitType)
		Thread.sleep(1000)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Input_VisitTypeLeftFilters'), Keys.chord(Keys.ENTER))
	}

	@When("I Search (.*) as schedule appt provider")
	public void I_Search_Provider_Schedule(String ApptProvider) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Click_ProviderLeftFilters'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Input_ProviderLeftFilters'), ApptProvider)
		Thread.sleep(1000)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_Input_ProviderLeftFilters'), Keys.chord(Keys.ENTER))

		Thread.sleep(1000)
	}


	@When("I click on schedule apply button")
	public void I_click_on_schedule_apply_button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_ApplyBTN'))
	}


	@Then("I should see patient data same as excel")
	public void I_should_see_patient_ExcelData() {


		String actual_PatientName = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_VerifyPatientName'))
		WebUI.verifyEqual(actual_PatientName, findTestData('DF_CMRData/TD_SUI').getValue(1, 1))


		String actual_MRN = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_VerifyMRN'))
		WebUI.verifyEqual(actual_MRN, findTestData('DF_CMRData/TD_SUI').getValue(2, 1))


		String actual_Reason = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_VerifyReason'))
		WebUI.verifyEqual(actual_Reason, findTestData('DF_CMRData/TD_SUI').getValue(3, 1))

		String actual_VisitTypeName = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_VerifyVisitType'))
		WebUI.verifyEqual(actual_VisitTypeName, findTestData('DF_CMRData/TD_SUI').getValue(4, 1))


		String actual_Status = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_VerifyStatus'))
		WebUI.verifyEqual(actual_Status, findTestData('DF_CMRData/TD_SUI').getValue(5, 1))

		String actual_ApptProvider = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_VerifyProvider'))
		WebUI.verifyEqual(actual_ApptProvider, findTestData('DF_CMRData/TD_SUI').getValue(6, 1))

		String actual_Gender = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/Schedule/Obj_VerifyGender'))
		WebUI.verifyEqual(actual_Gender, findTestData('DF_CMRData/TD_SUI').getValue(7, 1))
	}
}