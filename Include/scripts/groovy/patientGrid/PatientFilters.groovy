package patientGrid
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.When
import groovypackage.Methods
import internal.GlobalVariable



class PatientFilters {

	@When("I click on MRN coloumn dropdown")
	def MRNDropdown() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_MRNDropdown'),GlobalVariable.timeout)
		Thread.sleep(3000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_MRNDropdown'))

		Thread.sleep(1000)
	}


	@When("I click on MRN coloumn dropdown in care coordination")
	def MRNDropdowncc() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_MRNDropdowncc'),GlobalVariable.timeout)
		Thread.sleep(3000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_MRNDropdowncc'))

		Thread.sleep(1000)
	}


	@When("I click on filter option for mrn")
	def MRNfiltertab() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_filtertabMRN'),GlobalVariable.timeout)
		Thread.sleep(1000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_filtertabMRN'))

		Thread.sleep(1000)
	}


	@When("I click on dropdown to set (.*)")
	def filterdrop(String filter) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_filterdown'),GlobalVariable.timeout)
		Thread.sleep(1000)
		'Click on Add button'

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_filterdown'))

		Thread.sleep(1000)
		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath
		xpath = '(//li[text()="'+ filter +'"])[1]'

		TestObject filterobject = new TestObject('filter')

		filterobject.addProperty('xpath', ConditionType.EQUALS, xpath)

		WebUI.click(filterobject)
		WebUI.switchToDefaultContent()
	}

	@When("I enter (.*) in text filed1")
	def textfield(String text) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_text1'),GlobalVariable.timeout)
		Thread.sleep(1000)
		'Click on Add button'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_text1'), text)

		Thread.sleep(1000)
	}


	@When("I click on filter button to filter record")
	def textfield() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_filterbutton'),GlobalVariable.timeout)
		Thread.sleep(1000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_filterbutton'))

		Thread.sleep(1000)
	}


	@When("I click on filter clear button")
	def clearbuton() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_clearbutton'),GlobalVariable.timeout)
		Thread.sleep(1000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_clearbutton'))

		Thread.sleep(1000)
	}




	@When("I click on Name coloumn dropdown")
	def NameDropdown() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_NameDropdown'),GlobalVariable.timeout)
		Thread.sleep(3000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_NameDropdown'))

		Thread.sleep(1000)
	}


	@When("I click on filter option for name")
	def Namefiltertab() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_filtertabNAme'),GlobalVariable.timeout)
		Thread.sleep(1000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_filtertabNAme'))

		Thread.sleep(1000)
	}


	@When("I click on Export dropdown")
	def Exportdropdownb() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_exportdropdown'),GlobalVariable.timeout)
		Thread.sleep(3000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_exportdropdown'))

		Thread.sleep(1000)
	}


	@When("I mouse hover on the Export Excel dropdown")
	def ExportExceldropdownb() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_exportexceldropdown'),GlobalVariable.timeout)
		Thread.sleep(1000)
		'Click on Add button'
		WebUI.mouseOver(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_exportexceldropdown'))

		Thread.sleep(1000)
	}
	@When("I click on export all coloumns tab to download file")
	def Exportallcoloumns() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_exportallcoloums'),GlobalVariable.timeout)

		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_exportallcoloums'))

		Thread.sleep(1000)
	}


	@When("I click on export selected coloumns tab to download file")
	def Exportselectedcoloumns() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_exportselectedcoloumn'),GlobalVariable.timeout)

		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_exportselectedcoloumn'))

		Thread.sleep(1000)
	}

	@When("I scroll to name filter")
	def scroltomrn() {


		Thread.sleep(1000)
		'Click on Add button'
		WebUI.scrollToElement(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_NameDropdown'), 4)

		Thread.sleep(1000)
	}





	@When("I should see file is downloaded successfully")
	def verifydownloadedfiles() {
		Thread.sleep(2000)
		Methods.verifyDownloadedfile('C:\\Users\\muhammad.zohaib\\Downloads', '.zip')
	}



	@When("I should see the filtered patient for (.*) on basis of mrn")
	def verifymrn(String mrn) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_td_mrn'),GlobalVariable.timeout)
		Thread.sleep(2000)
		'Click on Add button'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_td_mrn'), mrn)

		Thread.sleep(1000)
	}


	@When("I should see the filtered patient for (.*) on basis of name")
	def verifyname(String name) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_td_name'),GlobalVariable.timeout)
		Thread.sleep(2000)
		'Click on Add button'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/PatientFilter/Obj_td_name'), name)

		Thread.sleep(1000)
	}
}