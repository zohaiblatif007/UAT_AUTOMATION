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





'Press the Lab Results Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Lab ResultsTab'))


WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_buttonAddPanel'), 
    GlobalVariable.timeout)

'Press the Add Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_buttonAddPanel'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/span_select'), 
    GlobalVariable.timeout)

'Click on Panel add button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/span_select'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_LipidPanel'), 
    GlobalVariable.timeout)

'Add Lipd Panel'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_LipidPanel'))

'Press OK Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_button_OK'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Add Analyte'), 
    GlobalVariable.timeout)

//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_redate'))
//
//WebUI.delay(1)
//WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_inputPanelDate'), '01/25/2021 12:00:00')
//
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_button_Save All'))
//
//WebUI.delay(4)
'Click on Add Analyte Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Add Analyte'))

'Enter the text a to select the Analyte'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_inputAnalyte_code'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_LabResults').getValue(1, 1))

Thread.sleep(1000)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Date'))

'Enter the Date'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Date'), findTestData('DF_CMRData/DF_ClinicalSection/TD_LabResults').getValue(
        2, 1))

'Click on time button\r\n'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_time'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_Time'), 
    GlobalVariable.timeout)

'Select the desired time'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_Time'))

'Click on button to select result type'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_result'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_CD LOINC'), 
    GlobalVariable.timeout)

'Select te desired result type'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_CD LOINC'))

'enter text a\r\n'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_inputourceValue'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_LabResults').getValue(3, 1))

Thread.sleep(1000)

'Click on Flag Dropdown'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_flag'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_Abnormal alert'), 
    GlobalVariable.timeout)

'Select the Flag Alert type'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_Abnormal alert'))

'Enter the Range'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_inputrange'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_LabResults').getValue(4, 1))




WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_fa fa-view-notes'), 
    GlobalVariable.timeout)




WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_status'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_aborted'), 
    GlobalVariable.timeout)

//
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_aborted'))

//
//WebUI.delay(1)
'Click on Cooment button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_fa fa-view-notes'))

'Enter the comments\r\n'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_ab-notes txtstuff'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_LabResults').getValue(5, 1))

'Press the Save Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_button_Save All'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Alertsaved'))

'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Alertsaved'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_LabResults').getValue(6, 1))

'Wait until Alert Disapear'
WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Alertsaved'), 
    GlobalVariable.timeout)

'Verify the Entered Data'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_panel'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_LabResults').getValue(7, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_ptext1'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_LabResults').getValue(8, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_ptext2'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_LabResults').getValue(9, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_ptext3'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_LabResults').getValue(10, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_ptext4'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_LabResults').getValue(11, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_result'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_LabResults').getValue(12, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_value'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_LabResults').getValue(13, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_flag'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_LabResults').getValue(14, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_range'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_LabResults').getValue(15, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_status'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_LabResults').getValue(16, 1))

