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

//WebUI.openBrowser('')
//
//WebUI.maximizeWindow()
//
//WebUI.navigateToUrl('https://slt-int.solitontechnologies.com/PersiviaPortal/newLogin')
//
//WebUI.waitForElementClickable(findTestObject('null'), GlobalVariable.timeout)
//
//WebUI.setText(findTestObject('null'), 'zl@slt.com')
//
//WebUI.setText(findTestObject('null'), 'Soliton@2334')
//
//WebUI.click(findTestObject('null'))
//
//WebUI.callTestCase(findTestCase('ActualTestCases/PatientGrid/PatientData/ClinicalData/Edit/Zohaib/TC_AddNavigateToPWB'), [:], FailureHandling.STOP_ON_FAILURE)
//
//WebUI.click(findTestObject('OR_Telehealth/Obj_Telehealth'))
//
//WebUI.dragAndDropByOffset(findTestObject('OR_Telehealth/Obj_Telehealth'), -300, 0)
//
//WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Image Order'), GlobalVariable.timeout)
WebUI.callTestCase(findTestCase('Utility_Functions/UF_OpenApplication'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_Login'), [('Email') : '', ('Password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_MouseHover'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_SelectPatientGrid'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_NavigateToClinicalSection'), [:], FailureHandling.STOP_ON_FAILURE)


WebUI.click(findTestObject('OR_Telehealth/Obj_Telehealth'))

WebUI.dragAndDropByOffset(findTestObject('OR_Telehealth/Obj_Telehealth'), -300, 0)

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Image Order'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Image Order'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_button_Add'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_button_Add'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Imagecenter'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Imagecenter'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_li_Radiology'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_li_Radiology'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_OrderProvider'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_OrderProvider'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_liCare Manager'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_liCare Manager'))

WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_inputOrderDate'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ImagingOrder').getValue(1, 1))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Biiltype'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_li_patient'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_li_patient'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_imagetest'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_li_HPC'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_li_HPC'))

WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_inputlabobservations'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_ImagingOrder').getValue(2, 1))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_li_Outsidestate'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_li_Outsidestate'))

WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_inputEffectiveDate'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_ImagingOrder').getValue(3, 1))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Diagnosisfloatwrap'))

WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_liObj_Cholera'), 
    GlobalVariable.timeout)

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_liObj_Cholera'))

WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_bodySite0'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ImagingOrder').getValue(4, 1))

Thread.sleep(1000)

WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Comments'), findTestData(
        'DF_CMRData/DF_ClinicalSection/TD_ImagingOrder').getValue(5, 1))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_button_Save'))

WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Alertsaved'))

'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Alertsaved'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_ImagingOrder').getValue(6, 1))

'Wait until Alert Disapear'
WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Alertsaved'), 
    GlobalVariable.timeout)

'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/td_oprovider'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_ImagingOrder').getValue(7, 1))

'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_td_date'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_ImagingOrder').getValue(8, 1))

'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/td_date - Copy'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_ImagingOrder').getValue(9, 1))

'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/td_date - Copy (1)'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_ImagingOrder').getValue(10, 1))

'Verify that Alert Comes After Save Button Clicked'
WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/td_date - Copy (2)'), 
    findTestData('DF_CMRData/DF_ClinicalSection/TD_ImagingOrder').getValue(11, 1))

