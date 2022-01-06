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

'Click the button on family history'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_Family HistoryTab'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_button_Add'), 
    GlobalVariable.timeout)

'Click on add button '
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_button_Add'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_CodeSystem'), 
    GlobalVariable.timeout)

'Click on Source code'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_CodeSystem'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_li_ICD-9'), 
    GlobalVariable.timeout)

'Select LCD Source'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_li_ICD-9'))

'Enter text in code field \'a\''
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_inputcode'), findTestData(
        'DF_CMRData/TD_ADDFamilyHisotry').getValue(1, 1))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_li_Spirometry'), 
    GlobalVariable.timeout)

'Select THER ULT HEAD & NEC text'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_li_Spirometry'))

'Click on Relationship Field'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_Relationship'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_li_Fosterchild'), 
    GlobalVariable.timeout)

'Select Foster Child'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_li_Fosterchild'))

'Click on Gender Field'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_genderselect'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_li_Male'), 
    GlobalVariable.timeout)

'Select Male'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_li_Male'))

'Set the Start Date'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_StartDateField'), findTestData(
        'DF_CMRData/TD_ADDFamilyHisotry').getValue(2, 1))

'Set End Date'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_EndDateField'), findTestData(
        'DF_CMRData/TD_ADDFamilyHisotry').getValue(3, 1))

'Select Negation'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_inputnegation'))

'Select Deceased'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_inputdeceased'))

'Enter the Comments in Comment field'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_inputtextNote'), findTestData(
        'DF_CMRData/TD_ADDFamilyHisotry').getValue(4, 1))
'Click on Update Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_update'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'))

'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'), findTestData(
        'DF_CMRData/TD_ADDFamilyHisotry').getValue(5, 1))

'Wait until Alert Disapear'
WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'), 
    GlobalVariable.timeout)

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_td_source'), findTestData(
        'DF_CMRData/TD_ADDFamilyHisotry').getValue(6, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_td_code'), findTestData(
        'DF_CMRData/TD_ADDFamilyHisotry').getValue(7, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_td_relation'), findTestData(
        'DF_CMRData/TD_ADDFamilyHisotry').getValue(8, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_td_gender'), findTestData(
        'DF_CMRData/TD_ADDFamilyHisotry').getValue(9, 1))
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_td_startdate'), findTestData(
        'DF_CMRData/TD_ADDFamilyHisotry').getValue(10, 1))
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_td_endate'), findTestData(
        'DF_CMRData/TD_ADDFamilyHisotry').getValue(11, 1))
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_td_negation'), findTestData(
        'DF_CMRData/TD_ADDFamilyHisotry').getValue(12, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_td_deceased'),findTestData(
        'DF_CMRData/TD_ADDFamilyHisotry').getValue(13, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_td_comment'), findTestData(
        'DF_CMRData/TD_ADDFamilyHisotry').getValue(14, 1))
