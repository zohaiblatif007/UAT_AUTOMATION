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


WebUI.getUrl()

WebUI.callTestCase(findTestCase('Utility_Functions/UF_Login'), [:], FailureHandling.STOP_ON_FAILURE)


WebUI.delay(2)

if (WebUI.verifyElementPresent(findTestObject('OR_HomePage/Obj_AprimaEnterprise'), 
    1, FailureHandling.STOP_ON_FAILURE)) {
    WebUI.click(findTestObject('OR_HomePage/Obj_AprimaEnterprise'))

    WebUI.delay(2)
}

if (WebUI.verifyElementPresent(findTestObject('OR_HomePage/Obj_SelectMHPN'), 1, FailureHandling.STOP_ON_FAILURE)) {
    WebUI.click(findTestObject('OR_HomePage/Obj_SelectMHPN'))

    WebUI.click(findTestObject('OR_Alert/Obj_Hide'))

    WebUI.getUrl()

    WebUI.getText(findTestObject('OR_HomePage/Obj_SelectMHPN'))
}
WebUI.verifyElementText(findTestObject('Object Repository/OR_LandingPage/OR_CMR/Obj_CMR'), 'CMR')

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OR_LandingPage/OR_CMR/Obj_CareCoordination'), 'Care Coordination')

WebUI.callTestCase(findTestCase('Utility_Functions/UF_Logout'), [:], FailureHandling.STOP_ON_FAILURE)
