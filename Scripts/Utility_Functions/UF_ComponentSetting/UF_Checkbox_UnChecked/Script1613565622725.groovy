import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'Verify Component Setting'
if(WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Obj_ButtonComponentSetting'), 3)) {

	WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Obj_ButtonComponentSetting'))

}else {
	println("Component Setting Button Is Not Present..!!")
}

'Verify "All" Checkbox is checked'
if(WebUI.verifyElementNotChecked(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_All_Checkbox'), 3)) {

	WebUI.check(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_All_Checkbox'))
	
}else {
	
	println("Sorry, You're not able to check 'ALL' the checkbox..!!")
}

WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Obj_Apply_ComponentSetting'))
