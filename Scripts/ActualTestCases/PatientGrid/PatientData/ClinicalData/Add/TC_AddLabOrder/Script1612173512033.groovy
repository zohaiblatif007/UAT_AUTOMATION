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

//WebUI.openBrowser('')
//
//WebUI.maximizeWindow()
//WebUI.navigateToUrl('https://slt-int.solitontechnologies.com/PersiviaPortal/newLogin')
//
//WebUI.click(findTestObject('null'))
//
//WebUI.setText(findTestObject('null'), 'zl@slt.com')
//
//WebUI.setText(findTestObject('null'), 'Soliton@2334')
//
//WebUI.click(findTestObject('null'))
//
//WebUI.delay(2)
WebUI.callTestCase(findTestCase('Utility_Functions/UF_OpenApplication'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_Login'), [('Email') : '', ('Password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_MouseHover'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_SelectPatientGrid'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_NavigateToClinicalSection'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_Lab OrdersTab'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_Lab OrdersTab'))

WebUI.click(findTestObject('OR_Telehealth/Obj_Telehealth'))

WebUI.dragAndDropByOffset(findTestObject('OR_Telehealth/Obj_Telehealth'), -300, 0)

Date today = new Date()

String nowTime = today.format('HH:mm')

String nowDate = today.format('MM/dd/yyyy')

//def yourText = (((('Lipid Panel: ' + nowDate) + ' ') + nowTime) + ' (STAT)') + '\nCholera due to Vibrio cholerae 01, biovar cholerae'

def yourText = (((((findTestData('DF_CMRData/DF_ClinicalSection/TD_LabOrders').getValue(7, 1)) + nowDate) + ' ') + nowTime) + findTestData('DF_CMRData/DF_ClinicalSection/TD_LabOrders').getValue(8, 1)) + '\n'+ findTestData('DF_CMRData/DF_ClinicalSection/TD_LabOrders').getValue(9, 1)


WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_button_Add'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_button_Add'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_selectLabortry'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_selectLabortry'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/li_Quest Diagnostics'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/li_Quest Diagnostics'))

WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/input_Date_labDate'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_LabOrders').getValue(1, 1))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_button_Add Panel'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_panelSelect'), 
    GlobalVariable.timeout)

//WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/input_Date_lipdDate - Copy'), '01/28/2021 13:57')
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_panelSelect'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/li_LipidPanel'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/li_LipidPanel'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_button_OK'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/input'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_Diagnosisfloatwrap'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/li_A00.0 (Cholera due to Vibrio cholerae 01_3705b3'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/li_A00.0 (Cholera due to Vibrio cholerae 01_3705b3'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_Specimen'))

WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/input_Collection Date_specimenDate0'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_LabOrders').getValue(2, 1))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_Specimentype'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/li_Serum'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/li_Serum'))

WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/input_Specimen No._specimenNo0'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_LabOrders').getValue(3, 1))

WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/input_Notes_specimenNotes0'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_LabOrders').getValue(4, 1))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_button_Save'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/div_successRecord saved successfully.Hide - Copy'))

'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/div_successRecord saved successfully.Hide - Copy'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_LabOrders').getValue(5, 1))

'Wait until Alert Disapear'
WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/div_successRecord saved successfully.Hide - Copy'), 
    GlobalVariable.timeout)

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_td_labortry'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_LabOrders').getValue(6, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_td_labtest'), 
    yourText)

