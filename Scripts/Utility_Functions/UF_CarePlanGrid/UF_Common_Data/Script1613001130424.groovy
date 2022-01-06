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

'Verify Save Button'
WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonSave'), 
    3)

'Verify Save & Close Button'

WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonSaveClose'), 
    3)

'Verify Cancel Button'

WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/Obj_buttonCancel'), 
    3)

'Verify Print Button'

WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/OR_Print/Obj_ButtonPrint'), 
    3)

'Verify Component Setting Button'

WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Obj_ButtonComponentSetting'), 
    3)

'Verify Care Plan Name'

//String Popup_Name = WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_Name'))
//
//WebUI.verifyEqual(Popup_Name, 'Dermo505, Mac505')

WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_Name'), 3)

'Verify Care Plan MRN'

//String Popup_MRN = WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_MRN'))
//
//WebUI.verifyEqual(Popup_MRN, 'MRN  EntMerging505')

WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_MRN'),3)

'Verify Care Plan DOB'

//String Popup_DOB = WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_DOB'))
//
//WebUI.verifyEqual(Popup_DOB, 'DOB  09/07/1905')

WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_DOB'),3)

//String Actual_Gender = WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_Male'))
//
//WebUI.verifyEqual(Actual_Gender, '115 Years, 163 Days  Male')

'Verify Care Plan Gender'

WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_Male'), 3)

'Verify Enterprise'

//String Actual_Enterprise = WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_Enterprise'))
//
//WebUI.verifyEqual(Actual_Enterprise, 'MHPN')

WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid/Obj_Enterprise'),3)
