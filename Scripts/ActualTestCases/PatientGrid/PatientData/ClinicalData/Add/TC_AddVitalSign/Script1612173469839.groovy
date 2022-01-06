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

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_button_Add'), 
    GlobalVariable.timeout)

'Click on Add Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_button_Add'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_date'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_date'))

'Set the Date'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_date'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        1, 1))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_ObservationDate'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_time'), 
    GlobalVariable.timeout)

'Set the Time'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_time'))

'Enter the Temprature'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputemperature'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        2, 1))

'Enter the pulse'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inpupulse'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        3, 1))

'Enter the Resp Rate'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_input_Respiratory'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        4, 1))

'Enter the Systolic BP'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputDecrease'),findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        5, 1))

'Enter the Diasistolic_BP'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_input_diastolic'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        6, 1))

'Enter the Weight'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputweight'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        7, 1))

'Enter the Height'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputHeight'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        8, 1))

'Enter the BMI Value'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputBMI'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        9, 1))

'Enter the BSA Value'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputBSA'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        10, 1))

'Enter the O2 Saturation Value'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputo2Saturation'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        11, 1))

'Enter the value_inhaledOxygenConcentration'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputinhaledOxygen'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        12, 1))

//WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputbloodSugar'), '30')
//
//WebUI.delay(2)
'Click on Saved Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_button_Save All'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'))

'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        13, 1))

'Wait until Alert Disapear'
WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'), 
    GlobalVariable.timeout)

def now = new Date().format('MM/dd/yyyy')

temp = (now + ' 01:30:00 AM')

'Verification of the given Data Whether its Correct or Not'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_ODate'), 
    temp)

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_temp'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        15, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_pulse'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        16, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_RRate'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        17, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_blodPre'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        18, 1))
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_weight'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        19, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_height'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        20, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_BMI'),findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        21, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_BSA'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        22, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_wO2sat'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        23, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_inhaledO2'), findTestData('DF_CMRData/DF_ClinicalSection/TD_VitalSigns').getValue(
        24, 1))

