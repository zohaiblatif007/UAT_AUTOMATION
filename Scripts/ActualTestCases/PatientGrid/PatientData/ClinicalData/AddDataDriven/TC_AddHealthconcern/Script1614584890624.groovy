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

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_MentalStatus/Obj_Slidebutton'))

WebUI.waitForElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_HealthConcernTab'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_HealthConcernTab'))

WebUI.waitForElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_button_Add'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_button_Add'))

WebUI.waitForElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_concern'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_concern'))

WebUI.waitForElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_sourcefield'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_sourcefield'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_Temp'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_inputPulse'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_inputRespiratory'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_inputBloodPresure'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_inputHeight'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_inputBMI'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_inputBSA'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_inpuO2Sat'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_SocialHistory'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_button_Proceed'))

WebUI.waitForElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_ConcernStatus'), 
    GlobalVariable.timeout)

//
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_ConcernStatus'))

WebUI.waitForElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_li_Aborted'), 
    GlobalVariable.timeout)

//
//WebUI.delay(2)
//
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_li_Aborted'))

//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_date'))
//WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_date'), '02062021')
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_Update'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_Alertsaved'))

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_Alertsaved'), 
    'successRecord saved successfully.Hide')

'Wait until Alert Disapear'
WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_Alertsaved'), 
    GlobalVariable.timeout)

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_td_Problem'), 
    'Cholera due to Vibrio cholerae 01, biovar cholerae::A00.0')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_td_Problemdate'), 
    '01/07/2021')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_td_Temp'), 
    'Temp: 98 °F')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_td_Tempdate'), 
    '02/05/2021 01:30:00')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_td_Pulse'), 
    'Pulse: 6 bpm')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_td_Pulsedate'), 
    '02/05/2021 01:30:00')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_td_Res'), 
    'Resp Rate: 30 bpm')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_td_ResDate'), 
    '02/05/2021 01:30:00')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_td_BP'), 
    'BP: 60/77 mm Hg')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_td_BPdate'), 
    '02/05/2021 01:30:00')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_td_Height'), 
    'Height: 7 in')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_td_Heightdate'), 
    '02/05/2021 01:30:00')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_td_BMI'), 
    'BMI: 0.5 kg/m2')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_td_BMIDate'), 
    '02/05/2021 01:30:00')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_td_BSA'), 
    'BSA: 6 m2')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_td_BSADate'), 
    '02/05/2021 01:30:00')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_td_O2Sat'), 
    'O2 Sats: 78 %')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_td_O2SatDate'), 
    '02/05/2021 01:30:00')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_td_Social1'), 
    'Tobacco use and exposure')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_td_Social1Date'), 
    '01/01/2021')

WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Healthconcern/Obj_td_Social2'), 
    'under observation::-1')

