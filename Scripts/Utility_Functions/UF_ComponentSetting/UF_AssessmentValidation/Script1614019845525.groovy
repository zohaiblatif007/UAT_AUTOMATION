import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.sql.RowSet

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



WebUI.scrollToElement(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Assessment_Validation/Obj_Decline'), 1)

String MostOfTheTime = WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Assessment_Validation/Obj_MostOfTheTime'))
WebUI.verifyEqual(MostOfTheTime, 'Most of the time')


String PublicTransport = WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Assessment_Validation/Obj_PublicTransport'))
WebUI.verifyEqual(PublicTransport, 'Public transport')


String OwnHouse = WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Assessment_Validation/Obj_OwnHouse'))
WebUI.verifyEqual(OwnHouse, 'Own house')


String BedBugs = WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Assessment_Validation/Obj_Decline'))
WebUI.verifyEqual(BedBugs, 'Bed bugs')

ActualComment = WebUI.getAttribute(findTestObject('OR_PatientGrid/Assessment/OR_Assessment/Obj_textarea_select_notes'), 'value')

WebUI.verifyEqual(ActualComment, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.')
	
//WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Assessment_Validation/Obj_MostOfTheTime'), 3)
//
//WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Assessment_Validation/Obj_PublicTransport'), 3)
//
//WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Assessment_Validation/Obj_OwnHouse'), 3)
//
//WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/AssessmentSelection/Assessment_Validation/Obj_Decline'), 3)
//
