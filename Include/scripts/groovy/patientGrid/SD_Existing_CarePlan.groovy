package patientGrid

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import cucumber.api.java.en.And
import internal.GlobalVariable

public class SD_Existing_CarePlan {

	@And("I shoule see approved care plan as (.*)")
	public void I_shoule_see_approved_existing_care_plan(String ExistingCarePlan) {

		String actual_Name = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_Title/Obj_Existing_Approved'))

		WebUI.verifyEqual(actual_Name, ExistingCarePlan)
	}

	@And("I shoule see draft care plan as (.*)")
	public void I_shoule_see_draft_existing_care_plans(String ExistingCarePlan) {

		String actual_Name = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_Title/Obj_Existing_Draft'))

		WebUI.verifyEqual(actual_Name, ExistingCarePlan)
	}

	@And("I shoule see rejected care plan as (.*)")
	public void I_shoule_see_rejected_existing_care_plans(String ExistingCarePlan) {

		String actual_Name = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_Title/Obj_Existing_Rejected'))

		WebUI.verifyEqual(actual_Name, ExistingCarePlan)
	}

	@And("I shoule see wip care plan as (.*)")
	public void I_shoule_see_wip_existing_care_plans(String ExistingCarePlan) {

		String actual_Name = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_Title/Obj_Existing_WIP'))

		WebUI.verifyEqual(actual_Name, ExistingCarePlan)
	}
}
