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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Utility_Functions/UF_OpenApplication'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_Login'), [('Email') : '', ('Password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_MouseHover'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_SelectPatientGrid'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_NavigateToClinicalSection'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_Vital SignsTab'), 
    GlobalVariable.timeout)

'Click on Vital Sign Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_Vital SignsTab'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/button_Edit'), 
    GlobalVariable.timeout)

'Click on Add Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/button_Edit'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_date'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_date'))

'Set the Date'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_date'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        1, 2))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_ObservationDate'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_time'), 
    GlobalVariable.timeout)

'Set the Time'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_time'))

'Set the Time'

//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputemperaturearrow'))
'Set the Time'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputemperatureEdit1'))

WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputemperatureEdit2'))

WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputemperatureEdit1'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(2, 2))

//
//WebUI.delay(5)
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inpupulseArrow'))
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inpupulse'))

WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inpupulseINputEdit'))

WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inpupulse'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(3, 2))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_input_Respiratory'))

WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_input_RespiratoryEdit'))

WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_input_Respiratory'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(4, 2))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputDecrease'))

WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputDecreaseEdit'))

WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputDecrease'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(5, 2))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_input_diastolic'))

WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_input_diastolicEdit'))

WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_input_diastolic'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(6, 2))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputweight'))

WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputweightEdit'))

WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputweight'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(7, 2))

//for (int i = 0; i < 10; i++) {
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_input_RespiratoryArrow'))
//}
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputDecreaseArrow'))
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputweightArrow'))
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputHeight'))

WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputHeightEdit'))

WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputHeight'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(8, 2))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputBMI'))

WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputBMIEdit'))

WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputBMI'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(9, 2))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputBSA'))

WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputBSAEdit'))

WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputBSA'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(10, 2))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputo2Saturation'))

WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputo2SaturationEdit'))

WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputo2Saturation'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(11, 2))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputinhaledOxygen'))

WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputinhaledOxygenEdit'))

WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputinhaledOxygen'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(12, 2))

//WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputbloodSugar'), '30')
//
//WebUI.delay(2)
'Click on Saved Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_button_Save All'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_AlertUpdate'))

'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_AlertUpdate'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(13, 2))

'Wait until Alert Disapear'
WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_AlertUpdate'), 
    GlobalVariable.timeout)

def now = new Date().format('MM/dd/yyyy')

temp = (now + ' 01:30:00 AM')

'Verification of the given Data Whether its Correct or Not'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_ODate'), 
    temp)

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_temp'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(15, 2))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_pulse'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(16, 2))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_RRate'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(17, 2))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_blodPre'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(18, 2))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_weight'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(19, 2))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_height'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(20, 2))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_BMI'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(21, 2))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_BSA'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(22, 2))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_wO2sat'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(23, 2))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_inhaledO2'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(24, 2))

WebUI.callTestCase(findTestCase('Utility_Functions/UF_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

