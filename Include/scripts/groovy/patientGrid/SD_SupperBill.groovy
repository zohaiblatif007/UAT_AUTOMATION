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
import internal.GlobalVariable

class SD_SupperBill {




	@When("I click on Reset button to reset supper bill filters")
	public void I_Click_RestButton() {

		WebUI.enableSmartWait()
		//WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_ResetBTN'))
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_ResetBTN'), 4)
	}

	@And("I enter (.*) as date of service from date")
	public void I_Search_as_service_Fromdate(String DateOfService_FromDate) {



		Thread.sleep(2000)
		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_FromDate_Input'))


		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_FromDate_Input'), DateOfService_FromDate)
		Thread.sleep(1000)
	}




	@And("I click on Apply button to apply supper bill filters")
	public void I_click_on_supperbill_apply_button() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_ApplyBTN'))
		Thread.sleep(3000)
	}

		@Then("I should see particualar patient data in (.*) as selected date")
		public void I_should_see_supperbill_patient_Data(String DateOfService_FromDate) {
	
			String actual_DateOfServiceDate = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_DateOfService_Verify'))
			//WebUI.verifyEqual(actual_DateOfServiceDate, DateOfService_FromDate)
			WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_DateOfService_Verify'), DateOfService_FromDate)
		}


//	@Then("I should see particualar patient data in selected date")
//	public void I_should_see_supperbill_patient() {
//
//		String actual_DateOfServiceDate = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_DateOfService_Verify'))
//		//WebUI.verifyEqual(actual_DateOfServiceDate, DateOfService_FromDate)
//		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_DateOfService_Verify'), actual_DateOfServiceDate)
//	}

	@And("I enter (.*) as practice")
	public void I_Search_as_practice(String Practice) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_PracticeLeftFilter_Click'), GlobalVariable.timeout)

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_PracticeLeftFilters_Input'), Practice)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_PracticeLeftFilters_Input'), Keys.chord(Keys.ENTER))
	}

	@And("I click on particular patient and expand")
	public void I_click_on_particularpatient_Expand() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_PatientClick_OpenGrid'))
	}

	@Then("I should see particualar patient practice facility")
	public void I_should_see_supperbill_practice_facility() {

		String actual_Practice = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_VerifyPracticeName'))

		WebUI.verifyEqual(actual_Practice, "Support Test Fac")
	}

	@And("I navigate to supper bill tab")
	public void I_NaviagateToSupperBillTab() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_SupperBillTab'))

		Thread.sleep(2000)
	}

	@And("I select Signed status from soap status")
	public void I_SelectSoapNoteStatusFromLeftFilters() {



		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_SoapNoteStatusLeftFilter_Click'))
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_SoapNoteStatusLeftFilters_Select'), "Signed")

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_SoapNoteStatusLeftFilters_Input'))


		//		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_SoapNoteStatusLeftFilters_Select'), Keys.chord(Keys.ENTER))

		Thread.sleep(5000)
	}

	@And("I should see signed as soap status")
	public void I_should_see_signed_as_soap_status() {

		String actual_Status = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_Verify_SoapNote_Status'))

		WebUI.verifyEqual(actual_Status, "Signed")
	}

	@When("I click on close button")
	public void I_click_On_CloseBTN() {


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_CloseBTN_SOAPNote'))
	}


	@When("I select Billing status")
	public void I_SelectBillingStatusLeftFilters() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_BillingStatusLeftFilter_Click'))

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_BillingStatusLeftFilters_Select'), "Incomplete")

		//		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_BillingStatusLeftFilter_Input'))

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_BillingStatusLeftFilters_Select'), Keys.chord(Keys.ENTER))
	}

	@And("I should see patient billing status as incomplete")
	public void I_should_see_Incomplete_status() {

		String actual_Status = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_BillingStatus_Verify'))

		WebUI.verifyEqual(actual_Status, "Incomplete")
	}

	@And("I checked the patient checkbox")
	public void I_CheckedThePatientCheckbox() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_PatientName_Checkbox_Click'))
	}

	@And("I click on Fax button")
	public void I_ClickOnFax() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_FaxBtn'))
	}

	@And("I should see PDF file in Fax popup")
	public void I_Should_See_PDFFile() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_Verify_PDF'), 3)
	}

	@And("I click on PDF file")
	public void I_ClickOnPDF() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_Verify_PDF'))
	}

	@And("I click on close button to close PDF popup")
	public void I_ClickOnCLoseButtonT() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_Close_PDF'))
	}
}