import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.support.ui.Select as Select
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

//'Click On Enterprise Dropdown'
//WebUI.click(findTestObject('OR_HomePage/Obj_AprimaEnterprise'))



if (WebUI.verifyElementVisible(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_CarePlanTab/span_Care Plan'))) {
    WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_CarePlanTab/span_Care Plan'))
} else {
    println('Care Plan Button Is Not Available')

    WebUI.takeFullPageScreenshot()
}

if (WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_AddNewCarePlan/button_NewCarePlan'), 
    5)) {
    WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPButtons/OR_AddNewCarePlan/button_NewCarePlan'))
} else {
    println('Add New Care Plan Button Is Not Available')

    WebUI.takeFullPageScreenshot()
}

