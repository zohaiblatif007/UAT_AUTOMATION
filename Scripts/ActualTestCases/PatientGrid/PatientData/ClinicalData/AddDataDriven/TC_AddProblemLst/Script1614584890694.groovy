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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('Utility_Functions/UF_OpenApplication'), [:], FailureHandling.STOP_ON_FAILURE)


//String Status0 = 'Active'
//
//String xpath0 = ('(//li[text()="' + Status0) + ' "])[5]'
//System.out.println(xpath0)



WebUI.callTestCase(findTestCase('Utility_Functions/UF_Login'), [('Email') : '', ('Password') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_MouseHover'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_SelectPatientGrid'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_NavigateToClinicalSection'), [:], FailureHandling.STOP_ON_FAILURE)

String a=WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_td_Cholera'))
if(a=='Cholera, unspecified::A00.9')
{
	System.out.println("if executed")
}
else {
	System.out.println("else executed")
}
//
//'Click on Add Button'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_button_Add'))
//
//WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_inputcode'), 
//    GlobalVariable.timeout)
//
//'Set the text cho in problem filed to select Problem'
//WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_inputcode'), findTestData(
//        'DF_CMRData/DF_ClinicalSection/TD_ADDProblemList').getValue(1, 1))
//
//Thread.sleep(2000)
//
//WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_inputcode'), Keys.chord(
//        Keys.TAB))
//
////'Selecet the Problem'
////WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_li_Cholera'))
//'Set the Date'
//WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_Date'), findTestData(
//        'DF_CMRData/DF_ClinicalSection/TD_ADDProblemList').getValue(2, 1))
//
//'Click on Severity button'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_SeverityType'))
//
//
//
//
//WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
//
//String Severity = 'Moderate'
//
//String xpath = ('//li[text()="' + Severity) + '"]'
//
//TestObject t1 = new TestObject('Mild')
//
//t1.addProperty('xpath', ConditionType.EQUALS, xpath)
//
//WebUI.click(t1)
//
//WebUI.switchToDefaultContent()
//
//
//
//
//
////WebUI.selectOptionByLabel(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_li_Mild - Copy'), 
////    'Mild', false)
////
////WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_li_Mild'), 
////    GlobalVariable.timeout)
////
////'Select the Severity to moderate'
////WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_li_Mild'))
//'Click on Type'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_Type'))
//
////WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_li_Finding'), 
////    GlobalVariable.timeout)
//
//
//
//WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
//
//String type = 'Condition'
//
//String xpath2 = ('//li[text()="' + type) + '"]'
//
//TestObject t2 = new TestObject('Mild')
//
//t2.addProperty('xpath', ConditionType.EQUALS, xpath2)
//
//WebUI.click(t2)
//
//WebUI.switchToDefaultContent()
//
//
//
//
//
////'Set the type'
////WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_li_Finding'))
//
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_Status'))
//
//
//
//
//
////(//li[text()='Active'])[5]
//
//	WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
//	
//	String Status = 'Active'
//	
//	String xpath3 = ('(//li[text()="' + Status) + '"])[5]'
//	
//	TestObject t3 = new TestObject('Mild')
//	
//	t3.addProperty('xpath', ConditionType.EQUALS, xpath3)
//	
//	WebUI.click(t3)
//	
//	WebUI.switchToDefaultContent()
//	
//
//
////
////WebUI.delay(2)
////
////
////WebUI.mouseOver(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_li_Inactive'))
////
////WebUI.delay(2)
////
//
////WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_li_Inactive'),
////	GlobalVariable.timeout)
////
////WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_li_Inactive'))
//
//
//'Click on the rank Dropdown'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_Rank'))
//
//
//
//WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
//
//String Rank = 'Principal'
//
//String xpath4 = ('//li[text()="' + Rank) + '"]'
//
//TestObject t4 = new TestObject('Mild')
//
//t4.addProperty('xpath', ConditionType.EQUALS, xpath4)
//
//WebUI.click(t4)
//
//WebUI.switchToDefaultContent()
//
//
//
//
//
////WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_li_Principal'), 
////    GlobalVariable.timeout)
////
////'Select the Rank Principal'
////WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_li_Principal'))
//
//'Press the Save Button to save the things'
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_button_Save All'))
//
//WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'))
//
//'Verify that Alert Comes After Save Button Clicked'
//WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'), 
//    findTestData('DF_CMRData/DF_ClinicalSection/TD_ADDProblemList').getValue(3, 1))
//
//'Wait until Alert Disapear'
//WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'), 
//    GlobalVariable.timeout)
//
//'Verify the Entered Data'
//WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_td_Cholera'), 
//    findTestData('DF_CMRData/DF_ClinicalSection/TD_ADDProblemList').getValue(4, 1))
//
//WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_td_date'), 
//    findTestData('DF_CMRData/DF_ClinicalSection/TD_ADDProblemList').getValue(5, 1))
//
//WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_td_Moderate'), 
//    findTestData('DF_CMRData/DF_ClinicalSection/TD_ADDProblemList').getValue(6, 1))
//
//WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_td_type'), 
//    findTestData('DF_CMRData/DF_ClinicalSection/TD_ADDProblemList').getValue(7, 1))
//
//WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_td_status'), 
//    findTestData('DF_CMRData/DF_ClinicalSection/TD_ADDProblemList').getValue(8, 1))
//
//WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_td_rank'), 
//    findTestData('DF_CMRData/DF_ClinicalSection/TD_ADDProblemList').getValue(9, 1))
//
