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

'Click on Functional Status Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Funtionalstatus/Obj_FunctionalStatusField'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Funtionalstatus/button_Edit'), 
    GlobalVariable.timeout)

'Press the Add button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Funtionalstatus/button_Edit'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Funtionalstatus/Obj_inputcodeEdit'), 
    GlobalVariable.timeout)

'Enter text a for drop down shown'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Funtionalstatus/Obj_inputcodeEdit'), 
    'a')

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Funtionalstatus/Obj_li_SpirometryEdit'), 
    GlobalVariable.timeout)

'Select the Condition'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Funtionalstatus/Obj_li_SpirometryEdit'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Funtionalstatus/Obj_date'))

'Enter the Date'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Funtionalstatus/Obj_date'), '02132021')

'Press the Updated Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Funtionalstatus/Obj_Update'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Funtionalstatus/Obj_AlertUpdate'))

'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Funtionalstatus/Obj_AlertUpdate'), 
    'successRecord updated successfully.Hide')

'Wait until Alert Disapear'
WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Funtionalstatus/Obj_AlertUpdate'), 
    GlobalVariable.timeout)

'Verify the Entered Data'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Funtionalstatus/Obj_td_condition'), 
    'Negative reversibility test to salbutamol (finding):: 391111000')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Funtionalstatus/Obj_td_startdate'), 
    '02/13/2021')

