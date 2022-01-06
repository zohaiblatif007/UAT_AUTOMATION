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

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/button_EditPanel'), 
    GlobalVariable.timeout)

'Press the Add Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/button_EditPanel'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_PanelTestInput'), 
    GlobalVariable.timeout)

'Add Lipd Panel'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Date'))

'Press OK Button'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Date'), '02122021')

//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_redate'))
//
//WebUI.delay(1)
//WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_inputPanelDate'), '01/25/2021 12:00:00')
//
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_button_Save All'))
//
//WebUI.delay(4)


'Click on Add Analyte Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_TimeEdit'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_TimeEdit'), 
    GlobalVariable.timeout)

'Click on Add Analyte Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_TimeEdit'))

'Click on Add Analyte Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_ResultTypeEdit'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_CD LOINC'), 
    GlobalVariable.timeout)

'Click on Add Analyte Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_CD LOINC'))

'enter text a\r\n'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_inputourceValue'), 'a')

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_AmdinocillinEdit'), 
    GlobalVariable.timeout)

'Click on desired Value'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_AmdinocillinEdit'))

'Click on Flag Dropdown'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_flag'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_Abnormal alert'), 
    GlobalVariable.timeout)

'Select the Flag Alert type'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_Abnormal alert'))

'Enter the Range'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_inputrange'), '20')

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
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_ab-notes txtstuff'), 'Newly Updted')

WebUI.delay(10)

'Press the Save Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_button_Save All'))

WebUI.delay(5)

