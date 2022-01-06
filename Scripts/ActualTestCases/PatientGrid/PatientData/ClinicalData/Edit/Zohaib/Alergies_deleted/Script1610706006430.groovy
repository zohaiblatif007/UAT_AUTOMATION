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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://slt-int.solitontechnologies.com/PersiviaPortal/newLogin')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'zl@slt.com')

WebUI.setEncryptedText(findTestObject('null'), 
    'em0u++r5ZmDZgjWgSgoa/Q==')

WebUI.click(findTestObject('null'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('ActualTestCases/PatientGrid/PatientData/ClinicalData/Edit/Zohaib/TC_AddNavigateToPWB'), [:], FailureHandling.STOP_ON_FAILURE)

'Click on Allergies tab'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_AllergiesTab'))

WebUI.delay(4)

'Click on Add button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Delete'))

//WebUI.delay(2)
//
//'Click on Allergy type'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Typeselect'))
//
//WebUI.delay(2)
//
//'select  Alergy type'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_li_Allergysubstance'))
//
//'Click on Source'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_codeSystem'))
//
//WebUI.delay(1)
//
//'Select Source'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_li_Snomed'))
//
//WebUI.delay(2)
//
//'Click on Allergy field'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_inputcode'))
//
//'Select Allergy'
//WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_inputcode'), 'a')
//
//WebUI.delay(2)
//
//'Click on Reactions'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_li_Allergy'))
//
//WebUI.delay(1)
//
//WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_ReactionCode'), 
//    'a')
//
//WebUI.delay(1)
//
//'Select Reactions'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_li_Edema'))
//
//'Click on Severity'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_SeverityField'))
//
//WebUI.delay(1)
//
//'Select Severity'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Moderate'))
//
//WebUI.delay(1)
//
////'Click on status'
////WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_statusFiled'))
////
////WebUI.delay(1)
////
////'Select Status'
////WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Inactive'))
//'Click on Sart date'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_StrtDate'))
//
//'Set Start Date'
//WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_StrtDate'), '01042021')
//
//WebUI.delay(1)
//
//'Click on End Date'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_EndDate'))
//
//'Set End Date'
//WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_EndDate'), '01232021')
//
//'Click on Comments field'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_inputNote'))
//
//'Enter comments'
//WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_inputNote'), 'For a long time suffering')
//
//'Click on Update icon'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_update'))
//
////
//////WebUI.sw
////WebUI.delay(1)
//
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertdeleted'))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertdeleted'), 
    'successRecord deleted successfully.Hide')

