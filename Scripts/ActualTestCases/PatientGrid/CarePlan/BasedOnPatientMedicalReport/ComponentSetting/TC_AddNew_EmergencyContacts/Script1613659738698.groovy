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

WebUI.callTestCase(findTestCase('Utility_Functions/UF_OpenApplication'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_NavigateToCarePlan'), [:], FailureHandling.STOP_ON_FAILURE)

if (WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_BasedOnPatientMedicalRecord/Obj_BasedOnPatientMedicalRecord'), 
    3)) {
    WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_BasedOnPatientMedicalRecord/Obj_BasedOnPatientMedicalRecord'))
} else {
    WebUI.takeFullPageScreenshot()
}

Thread.sleep(1000)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_ComponentSetting/UF_Checkbox_Checked'), [:], FailureHandling.STOP_ON_FAILURE)

'Adding New Emergency Contacts From Grid'
Thread.sleep(2000)

'Mouse Hover'
WebUI.mouseOver(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_EmergencyContact'))

'Click "+" Sign'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AddNewEmergencyContact/Fields/Obj_PlusSign'))

'Enter Last Name'
WebUI.callTestCase(findTestCase('Utility_Functions/UF_ComponentSetting/UF_RandomInputFunction/UF_LastName'), [:], FailureHandling.STOP_ON_FAILURE)

'Enter First Name'

WebUI.callTestCase(findTestCase('Utility_Functions/UF_ComponentSetting/UF_RandomInputFunction/UF_FirstName'), [:], FailureHandling.STOP_ON_FAILURE)

'Enter Home PHone'

WebUI.callTestCase(findTestCase('Utility_Functions/UF_ComponentSetting/UF_RandomInputFunction/UF_HomePhone'), [:], FailureHandling.STOP_ON_FAILURE)

'Enter Mobile Phone'

WebUI.callTestCase(findTestCase('Utility_Functions/UF_ComponentSetting/UF_RandomInputFunction/UF_MobilePhone'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(3000)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AddNewEmergencyContact/Fields/Obj_Tick'))

Thread.sleep(3000)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_RandomFuntion/UF_WIP/UF_InputFunction_SaveCloseBtn'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(1000)

WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_Title/Obj_Title'))

Thread.sleep(2000)



WebUI.callTestCase(findTestCase('Utility_Functions/UF_ComponentSetting/UF_Checkbox_UnChecked'), [:], FailureHandling.STOP_ON_FAILURE)


WebUI.callTestCase(findTestCase('Utility_Functions/UF_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

