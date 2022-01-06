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

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


import cucumber.api.java.After
import cucumber.api.java.Before
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


public class SD_SaveNotes {


	@Then("I click on notes tab")
	public void i_click_on_notes_tab() {
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/span_Notes'))
	}

	@Then("I click on plus notes button")
	public void i_click_on_plus_notes_button() {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/button_Notes'), 10)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/button_Notes'))
	}

	@Then("I should see notes popup")
	public void i_should_see_notes_popup() {
		String Actual_Title = WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/Obj_AddNoteTitle'))

		WebUI.verifyEqual(Actual_Title, 'Add Note')
	}

	@When("I select privacy")
	public void i_select_Private() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/Obj_Privacy'))

		//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/li_Private'))
	}

	@When("I select priority")
	public void i_select_Medium() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/Obj_Priority'))

		//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/li_Medium'))
	}

	@When("I select type")
	public void i_select_CCM() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/Obj_Type'))

		//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/li_CCM'))
	}

	@When("I (.*) notes")
	public void i_enter_notes(String Enter_Notes) {

		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/Obj_textarea_Notes_noteText'),Enter_Notes)
	}


	@When("I click on save btn")
	public void i_click_on_save_btn() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/OR_Save/button_Save'))
		Thread.sleep(5000)
	}

	@When("I should see record save success message")
	public void I_should_see_record_save_success_message() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_ValidationMessage/Obj_recordSaveSuccessfully'), 3)
	}


	@Then("I should see newly added note")
	public void i_should_see_newly_added() {
		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Grid/Obj_Date'), 3)

		String ActualName = WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Grid/Obj_Name'))

		WebUI.verifyEqual(ActualName, "Amir, Hafiz")

		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Grid/Obj_Priority'), 3)

		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Grid/Obj_Privacy'), 3)

		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/Notes/Grid/Obj_Type'), 3)
	}
}


