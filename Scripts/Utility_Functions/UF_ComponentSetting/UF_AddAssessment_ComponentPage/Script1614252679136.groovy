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

if (WebUI.verifyElementVisible(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_CarePlanTab/span_Care Plan'))) {
    WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_CarePlanTab/span_Care Plan'))
} else {
    println('Care Plan Button Is Not Available')

    WebUI.takeFullPageScreenshot()
}

if (WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_AddNewCarePlan/button_NewCarePlan'), 
    5)) {
    WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_AddNewCarePlan/button_NewCarePlan'))
} else {
    println('Add New Care Plan Button Is Not Available')

    WebUI.takeFullPageScreenshot()
}

if (WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_BasedOnPatientMedicalRecord/Obj_BasedOnPatientMedicalRecord'), 
    3)) {
    WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_BasedOnPatientMedicalRecord/Obj_BasedOnPatientMedicalRecord'))
} else {
    WebUI.takeFullPageScreenshot()
}

Thread.sleep(1000)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_ComponentSetting/UF_Checkbox_Checked'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(3000)


WebUI.scrollToElement(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_Assessment'), 2)

'Mouse Hover Assessment'
WebUI.mouseOver(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Obj_SelectAssessmentIcon'))

'Click Assessment'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Obj_SelectAssessmentIcon'))

Thread.sleep(2000)

'Check assessment from Grid'
WebUI.check(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Obj_AssessmentGrid_Checkbox1'))

WebUI.check(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Assessment_Validation/Obj_AssessmentGrid_Checkbox2'))

'Click OK Button'
WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Obj_AssessmentOK'))

WebUI.callTestCase(findTestCase('Utility_Functions/UF_ComponentSetting/UF_AssessmentValidation'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(3000)


WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Assessment_Validation/Obj_AssessmentInput'), 'Testing')
Thread.sleep(1000)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonSaveClose'))


Thread.sleep(1000)

//WebUI.callTestCase(findTestCase('Utility_Functions/UF_Validation Message/UF_SuccessMessage'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(2000)

WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_Title/Obj_Title'))

Thread.sleep(3000)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_ComponentSetting/UF_AssessmentValidation'), [:], FailureHandling.STOP_ON_FAILURE)



Thread.sleep(3000)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_ComponentSetting/UF_Checkbox_UnChecked'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(3000)

