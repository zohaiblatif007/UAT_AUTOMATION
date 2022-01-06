package patientGrid
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class SD_SearchPatient {

	@When("I search (.*) using global search")
	public void search_Patient(String Patient) {

		//		WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'))


		Thread.sleep(28000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'))

		WebUI.setText(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'), Patient)

		Thread.sleep(5000)

		WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/Select_Filters/Select_Search'))
		Thread.sleep(6000)
	
		
		}
		
		
		@When("I verify patient is selected")
		public void search_Patientverification() {
	
			Thread.sleep(1000)
			
		}




	@Then("I should see (.*) as patient with (.*) as MRN and (.*) as DOB and (.*) as Status on patient grid")
	public void Patient_should_be_verified(String Patient_Name, String MRN, String DOB, String Patient_Status) {

		String Actual_FirstLastName = WebUI.getText(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_Name/Obj_First_LastName'))
		WebUI.verifyEqual(Actual_FirstLastName, Patient_Name)



		//		String Actual_MRN = WebUI.getText(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_MRN/Obj_MRN'))
		//		WebUI.verifyEqual(Actual_MRN, MRN)
		//
		//
		//		String Actual_DOB = WebUI.getText(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_DOB/Obj_DOB'))
		//		WebUI.verifyEqual(Actual_DOB, DOB)
		//
		//		String Actual_Status = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_Status/Obj_PatientStatus'))
		//		WebUI.verifyEqual(Actual_Status, Patient_Status)
	}
}

