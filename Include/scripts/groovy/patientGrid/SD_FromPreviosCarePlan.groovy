package patientGrid

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And

public class SD_FromPreviosCarePlan {

	@And("I click on FromPreviousCarePlan")
	public void I_click_on_FromPreviousCarePlan() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_FromPreviousCarePlan/Obj_FromPreviousCarePlan'))

	}


	@And("I select care plan from popup")
	public void I_click_on_CreatedPatient() {



		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_CreatedPatient'))
	}
}
