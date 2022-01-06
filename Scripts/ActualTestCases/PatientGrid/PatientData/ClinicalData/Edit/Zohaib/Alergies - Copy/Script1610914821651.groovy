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

WebUI.setText(findTestObject('null'), 'Soliton@2334')

WebUI.click(findTestObject('null'))

WebUI.delay(2)

WebUI.delay(2)

'Mose over on CMR'
WebUI.mouseOver(findTestObject('null'))

WebUI.delay(2)

'Click on Care Coordination'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_PatientsGrid'))

WebUI.delay(10)

String xpathh = "((//div[@class='k-grid-content k-auto-scrollable'])[2]//span[@class='link open-pwb single-line-text'])[5]"
TestObject to = new TestObject(xpathh)
//to.setSelectorValue(SelectorMethod.BASIC, xpath)(SelectorMethod.XPATH, "//div[@id='patient-grid']/div[3]/table/tbody/tr[4]/td[2]/span")
WebUI.click(to)
List<WebElement> listElement = WebUI.findWebElements(findTestObject('null'),2)

WebUI.click(listElement)
'Click on a Patient'
//WebUI.click(find('ProblemLst/Page_Welcome to Persivia/span_Moldova, Moldova'))


//
//WebUI.delay(16)
//
//'Click on Clinical tab'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientToClinicalTab/Obj_ClinicalTab'))
//
//WebUI.delay(10)
//
//'Click on Allergies tab'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_AllergiesTab'))
//
//WebUI.delay(4)
//
//'Click on Add button'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_button_Add'))
//
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
////
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'))
//
//WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'), 
//    'successRecord saved successfully.Hide')

