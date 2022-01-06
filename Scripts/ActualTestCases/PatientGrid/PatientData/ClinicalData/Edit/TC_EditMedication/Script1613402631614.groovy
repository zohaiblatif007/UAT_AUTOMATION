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

WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_MouseHover'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_SelectPatientGrid'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_NavigateToClinicalSection'), [:], FailureHandling.STOP_ON_FAILURE)

'Press the Medication Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_MedicationsTab'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/button_Edit'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/button_Edit'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_CodeSystem'), 
    GlobalVariable.timeout)

'Click on the source field'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_CodeSystem'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_li_MMSLEdit'), 
    GlobalVariable.timeout)

'Select the source value'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_li_MMSLEdit'))

'enter medication name'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_cmtake_code'), 'Advanced life support mileag::A0390')

//WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_cmtake_frequency'), '7')
//
//WebUI.delay(1)
'Click on Frequency field'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_frquency'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_li_frquencyEdit'), 
    GlobalVariable.timeout)

'Select frequency'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_li_frquencyEdit'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_RouteSelect'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_AricularEdit'), 
    GlobalVariable.timeout)

'Select the Route'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_AricularEdit'))

'Set the Date'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_Date'), '09022021')

'Click on Prescribed by filed'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_li_yet, another'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_li_MasonEdit'), 
    GlobalVariable.timeout)

'Select who Prescribed the Medication'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_li_MasonEdit'))

'Select CPOAE'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_CPOAE'))

//'Select eSent'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_CmtakeEsent'))
'Select DrugFormulacy'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_CmtakeFormulary'))

'Entered  the Dierctions'
WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_cmtake_comments'), 'After Eddit the Medication')

'Click on Saved Button'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_button_Save All'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_AlertSavedchanges'))

'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_AlertSavedchanges'), 
    'successChanges saved successfully.Hide')

'Wait until Alert Disapear'
WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'), 
    GlobalVariable.timeout)

'Verify the Entered Data'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_source'), 
    'HPC')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_name'), 'Advanced life support mileag::A0390')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_frequency'), 
    'Every 12 hours')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_route'), 
    'Cutaneous')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_startdate'), 
    '09/02/2021')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_prescribedby'), 
    'Oliver Jacob')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_spoea'), 
    'No')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_esent'), 
    'Yes')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_drug'), 'No')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_direction'), 
    'After Eddit the Medication')

