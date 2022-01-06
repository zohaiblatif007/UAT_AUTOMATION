package patientGrid
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.When
import groovypackage.Methods
import internal.GlobalVariable



class Caregaphighalertpopup {

	@When("I should see high care gap alert popup")
	def MRNDropdown() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/HighcaregapAlert/Obj_highAlertcaregap'),GlobalVariable.timeout)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/HighcaregapAlert/Obj_highAlertcaregap'), GlobalVariable.timeout)

		Thread.sleep(1000)
	}

	@When("I click on high care gap alert to land on care gap section")
	def clickonhighalert() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/HighcaregapAlert/Obj_highAlertcaregap'),GlobalVariable.timeout)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/HighcaregapAlert/Obj_highAlertcaregap'))

		Thread.sleep(1000)
	}

	@When("I should see hyperpyrexia care gap present in care gap section")
	def hyperpyrexiavalidate() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/HighcaregapAlert/Obj_hyperpyrexia'),GlobalVariable.timeout)
		Thread.sleep(4000)
		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/HighcaregapAlert/Obj_hyperpyrexia'), GlobalVariable.timeout)

		Thread.sleep(1000)
	}

	@When("I should see hyperpyrexia care gap should not present in care gap section")
	def notpresenthyperpyrexiavalidate() {


		Thread.sleep(4000)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/HighcaregapAlert/Obj_hyperpyrexia'), GlobalVariable.timeout)

		Thread.sleep(1000)
	}
}