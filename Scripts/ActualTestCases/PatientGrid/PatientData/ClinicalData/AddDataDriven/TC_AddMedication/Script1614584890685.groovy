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
import com.kms.katalon.core.testobject.ConditionType as ConditionType


WebUI.callTestCase(findTestCase('Utility_Functions/UF_OpenApplication'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_Login'), [('Email') : '', ('Password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_MouseHover'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_SelectPatientGrid'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_NavigateToClinicalSection'), [:], FailureHandling.STOP_ON_FAILURE)






'Press the Medication Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_MedicationsTab'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_button_Add'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_button_Add'))



WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_CodeSystem'), 
    GlobalVariable.timeout)

'Click on the source field'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_CodeSystem'))




WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

String Source = 'MMSL'

String xpath = ('//li[text()="' + Source) + '"]'

TestObject t1 = new TestObject('Mild')

t1.addProperty('xpath', ConditionType.EQUALS, xpath)

WebUI.click(t1)

WebUI.switchToDefaultContent()


//WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_li_MMSL'), 
//    GlobalVariable.timeout)
//
//'Select the source value'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_li_MMSL'))





'enter medication name'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_cmtake_code'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ADDMedication').getValue(1, 1))

//WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_cmtake_frequency'), '7')
//
//WebUI.delay(1)
'Click on Frequency field'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_frquency'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_li_frquency'), 
    GlobalVariable.timeout)




WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

String Frequency = '3 times a day'

String xpath1 = ('//li[text()="' + Frequency) + '"]'

TestObject t2 = new TestObject('Mild')

t2.addProperty('xpath', ConditionType.EQUALS, xpath1)

WebUI.click(t2)

WebUI.switchToDefaultContent()

//'Select frequency'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_li_frquency'))



WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_RouteSelect'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_Aricular'), 
    GlobalVariable.timeout)

'Select the Route'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_Aricular'))

'Set the Date'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_Date'),findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ADDMedication').getValue(2, 1))

'Click on Prescribed by filed'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_li_yet, another'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_li_Mason'), 
    GlobalVariable.timeout)

'Select who Prescribed the Medication'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_li_Mason'))

'Select CPOAE'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_CPOAE'))

'Select eSent'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_CmtakeEsent'))

'Select DrugFormulacy'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_CmtakeFormulary'))

'Entered  the Dierctions'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_cmtake_comments'),findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ADDMedication').getValue(3, 1))

'Click on Saved Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_button_Save All'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_AlertSavedchanges'))

'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_AlertSavedchanges'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ADDMedication').getValue(4, 1))

'Wait until Alert Disapear'
WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'), 
    GlobalVariable.timeout)

'Verify the Entered Data'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_source'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ADDMedication').getValue(5, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_name'),findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ADDMedication').getValue(6, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_frequency'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ADDMedication').getValue(7, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_route'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ADDMedication').getValue(8, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_startdate'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ADDMedication').getValue(9, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_prescribedby'),findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ADDMedication').getValue(10, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_spoea'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ADDMedication').getValue(11, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_esent'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ADDMedication').getValue(12, 1))
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_drug'),findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ADDMedication').getValue(13, 1))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_direction'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ADDMedication').getValue(14, 1))

