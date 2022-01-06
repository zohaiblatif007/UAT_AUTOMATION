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

WebUI.callTestCase(findTestCase('Utility_Functions/UF_OpenApplication'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_Login'), [:], FailureHandling.STOP_ON_FAILURE)

'Click On Enterprise Dropdown'
WebUI.click(findTestObject('OR_HomePage/Obj_AprimaEnterprise'))

'Select MHPN Enterprise'
WebUI.click(findTestObject('OR_HomePage/Obj_SelectMHPN'))

Thread.sleep(2000)

'Click On Alert Cross Button'
WebUI.click(findTestObject('OR_Alert/Obj_Hide'))

WebUI.callTestCase(findTestCase('Utility_Functions/UF_MouseHover'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_SelectPatientGrid'), [:], FailureHandling.STOP_ON_FAILURE)

//'Click On Alert Cross Button'
//WebUI.click(findTestObject('OR_Alert/Obj_Hide'))

'Click On Patient Search Input Field'
WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'))

'Enter Correct Patient Name'
WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'), 
    findTestData("DF_CMRData/TD_Search").getValue(1, 5))

Type_Text = WebUI.getAttribute(findTestObject('Object Repository/OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'), 
    'value')

WebUI.verifyEqual(Type_Text, findTestData("DF_CMRData/TD_Search").getValue(1, 5))

WebUI.delay(3)

WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/Select_Filters/Select_Search'))

Thread.sleep(10000)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_SearchPatientGrid/UF_Validation'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

