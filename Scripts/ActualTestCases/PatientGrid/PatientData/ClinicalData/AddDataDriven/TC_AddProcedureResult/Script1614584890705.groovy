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


WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_Procedure ResultsTab'), 
    GlobalVariable.timeout)

'Click on Procedure Results Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_Procedure ResultsTab'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_button_Add'), 
    GlobalVariable.timeout)

'Click on Add Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_button_Add'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_CodeSystem'), 
    GlobalVariable.timeout)

'Click on Source Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_CodeSystem'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_li_HPC'), 
    GlobalVariable.timeout)

'Select HPC'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_li_HPC'))

'Set text a in the field of Procedure'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_inputcode'), findTestData(
        'DF_CMRData/DF_ClinicalSection/ProcedureResults').getValue(1, 1))

Thread.sleep(1000)

WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_inputcode'), Keys.chord(
        Keys.TAB))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_Date'))

'Set the Date'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_Date'), findTestData(
        'DF_CMRData/DF_ClinicalSection/ProcedureResults').getValue(2, 1))
'Set the text a in Target Site'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_input_Site'),findTestData(
        'DF_CMRData/DF_ClinicalSection/ProcedureResults').getValue(3, 1))
Thread.sleep(1000)

WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_input_Site'), Keys.chord(
        Keys.TAB))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_Status'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_li_Active'), 
    GlobalVariable.timeout)

//
//WebUI.delay(2)
//
//
//WebUI.mouseOver(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_li_Inactive'))
//
//WebUI.delay(2)
//
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_li_Active'))

//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_Status'))
//
//WebUI.delay(1)
//
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_li_Active'))
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_inputreasonCode'), findTestData(
        'DF_CMRData/DF_ClinicalSection/ProcedureResults').getValue(4, 1))

Thread.sleep(1000)

WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_inputreasonCode'), 
    Keys.chord(Keys.TAB))

'Select Service Delivery Location'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_inputserviceDelivery'), findTestData(
        'DF_CMRData/DF_ClinicalSection/ProcedureResults').getValue(5, 1))

'Click on Update Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_Update'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'))

'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'), findTestData(
        'DF_CMRData/DF_ClinicalSection/ProcedureResults').getValue(6, 1))

'Wait until Alert Disapear'
WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'), 
    GlobalVariable.timeout)

'Verify the Entered Data'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_td_source'), findTestData(
        'DF_CMRData/DF_ClinicalSection/ProcedureResults').getValue(7, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_td_procedure'), findTestData(
        'DF_CMRData/DF_ClinicalSection/ProcedureResults').getValue(8, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_td_startdate'), findTestData(
        'DF_CMRData/DF_ClinicalSection/ProcedureResults').getValue(9, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_td_targetsite'), findTestData(
        'DF_CMRData/DF_ClinicalSection/ProcedureResults').getValue(10, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_td_status'), findTestData(
        'DF_CMRData/DF_ClinicalSection/ProcedureResults').getValue(11, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_td_reason'), findTestData(
        'DF_CMRData/DF_ClinicalSection/ProcedureResults').getValue(12, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_td_serviceD_L'), findTestData(
        'DF_CMRData/DF_ClinicalSection/ProcedureResults').getValue(13, 1))

