package patientGrid

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.When

public class SD_Blank {

	@And("I click on blank")
	public void I_click_on_blank() {

		if (WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_Blank/Obj_Blank'), 2)) {
			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_Blank/Obj_Blank'))
		} else {
			WebUI.takeFullPageScreenshot()
		}
	}



	@And("I click on reject button_Blank")
	public void I_click_on_reject_button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonReject'))

		//		Thread.sleep(1000)
		//		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_button_Review'))
		//
		//		Thread.sleep(1000)
		//
		//		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonReject'))


	}

	@When("I click on saveapprove button_Blank")
	public void I_click_on_saveapprove_button() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_button_SaveApprove'))

		//		Thread.sleep(1000)
		//		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_button_Review'))
		//
		//		Thread.sleep(1000)
		//
		//		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_button_SaveApprove'))

	}
}
