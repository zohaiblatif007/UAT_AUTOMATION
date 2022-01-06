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


WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Procedure OrderTab'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Procedure OrderTab'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_button_Add'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_button_Add'))





WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_OrderProvider'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_OrderProvider'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_li_Care Manager'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_li_Care Manager'))

WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_orderDate'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ProcedureOrder').getValue(1, 1))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Procedure'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_li_HPC'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_li_HPC'))

WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_lab-observations'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ProcedureOrder').getValue(2, 1))


WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_li_Outside state'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_li_Outside state'))

WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_effectiveDate0'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ProcedureOrder').getValue(3, 1))


WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Diagnosisfloatwrap'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_li_A00.0 Cholera'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_li_A00.0 Cholera'))

WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_input_Body Site'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ProcedureOrder').getValue(4, 1))


Thread.sleep(1000)

WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_input_Body Site'), 
    Keys.chord(Keys.TAB))

WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Comments'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ProcedureOrder').getValue(5, 1))


WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_button_Save'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Alertsavedy'))

'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Alertsavedy'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ProcedureOrder').getValue(6, 1))


'Wait until Alert Disapear'
WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Alertsavedy'), 
    GlobalVariable.timeout)

'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/td_oprovider'),findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ProcedureOrder').getValue(7, 1))


'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/td_date'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ProcedureOrder').getValue(8, 1))


'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/td_proceduretest1'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ProcedureOrder').getValue(9, 1))


'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/td_proceduretest2'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ProcedureOrder').getValue(10, 1))


'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/td_proceduretest3'),findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ProcedureOrder').getValue(11, 1))


