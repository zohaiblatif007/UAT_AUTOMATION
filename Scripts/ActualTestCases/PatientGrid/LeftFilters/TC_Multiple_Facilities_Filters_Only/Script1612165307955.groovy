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

WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('OR_HomePage/Obj_AprimaEnterprise'), 1, FailureHandling.STOP_ON_FAILURE)) {
    WebUI.click(findTestObject('OR_HomePage/Obj_AprimaEnterprise'))

    WebUI.delay(2)
}

if (WebUI.verifyElementPresent(findTestObject('OR_HomePage/Obj_SelectMHPN'), 1, FailureHandling.STOP_ON_FAILURE)) {
    WebUI.click(findTestObject('OR_HomePage/Obj_SelectMHPN'))

    Thread.sleep(2000)

    WebUI.click(findTestObject('OR_Alert/Obj_Hide'))

    WebUI.getUrl()

    WebUI.getText(findTestObject('OR_HomePage/Obj_SelectMHPN'))

    WebUI.callTestCase(findTestCase('Utility_Functions/UF_MouseHover'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Utility_Functions/UF_SelectPatientGrid'), [:], FailureHandling.STOP_ON_FAILURE)
}

//WebUI.click(findTestObject('OR_Alert/Obj_Hide'))

WebUI.delay(2)

WebUI.click(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/Obj_buttonReset'))

Thread.sleep(3000)

WebUI.click(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/OR_Facility/Obj_Facility'))

WebUI.setText(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/OR_Facility/Obj_InputFacility'), findTestData(
        'DF_CMRData/TD_LeftFilters').getValue(1, 1))

WebUI.click(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/OR_Facility/Obj_SelectFacility'))

WebUI.setText(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/OR_Facility/Obj_InputFacility'), findTestData("DF_CMRData/TD_LeftFilters").getValue(1, 2))

WebUI.click(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/OR_Facility/Obj_SelectFacility'))

WebUI.click(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/Obj_buttonApply'))

String Actual_Text = WebUI.getText(findTestObject('OR_PatientGrid/OR_LeftFilters/GridObjects/Obj_MHPN'))

WebUI.verifyEqual(Actual_Text, 'MHPN2')

String Actual = WebUI.getText(findTestObject('OR_PatientGrid/OR_LeftFilters/GridObjects/Obj_McLaren'))

WebUI.verifyEqual(Actual, 'McLaren Greater Lansing - Holt Family Medicine')

WebUI.callTestCase(findTestCase('Utility_Functions/UF_Logout'), [:], FailureHandling.STOP_ON_FAILURE)
