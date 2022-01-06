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


WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_ImmunizationsTab'), 
    GlobalVariable.timeout)

'Click on Immunization Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_ImmunizationsTab'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_button_Add'), 
    GlobalVariable.timeout)

'Click on Add Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_button_Add'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/span_select'), 
    GlobalVariable.timeout)

'Click on Source drop down'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/span_select'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/li_ICD-9'), 
    GlobalVariable.timeout)

'Select Source'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/li_ICD-9'))

'Enter the Desired Vaccine'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_inputcode'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_Immunization').getValue(1, 1))

Thread.sleep(1000)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_Date'))

'Enter the Date'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_Date'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_Immunization').getValue(2, 1))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_selectstatus'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/li_Normal'), 
    GlobalVariable.timeout)

//
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/li_Normal'))

'Enter the Lot Number'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_inputlotNumber'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_Immunization').getValue(3, 1))

'Enter the Vaccination\r\n'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_inputmanufacturer'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_Immunization').getValue(4, 1))

'Entered the Comments'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_inputtextNote'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_Immunization').getValue(5, 1))

'Click on Update Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_Update'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'))

'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_Immunization').getValue(6, 1))

'Wait until Alert Disapear'
WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'), 
    GlobalVariable.timeout)

'Verify the Entered data'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_td_source'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_Immunization').getValue(7, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_td_vaccine'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_Immunization').getValue(8, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_td_startdate'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_Immunization').getValue(9, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_td_status'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_Immunization').getValue(10, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_td_lot'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_Immunization').getValue(11, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_td_manofcture'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_Immunization').getValue(12, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_td_comment'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_Immunization').getValue(13, 1))

