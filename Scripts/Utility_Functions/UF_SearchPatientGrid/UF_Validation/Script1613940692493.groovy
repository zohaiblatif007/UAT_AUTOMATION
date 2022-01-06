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

//String Actual_Name = WebUI.getText(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_Name/Obj_First_LastName'))
//WebUI.verifyEqual(Actual_Name, 'jhon, adam')2
'Verify Patient Name'
String Name = WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_Name/Obj_First_LastName'),
	3)
println(Name)

//String Actual_MRN = WebUI.getText(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_MRN/Obj_MRN'))
//WebUI.verifyEqual(Actual_MRN, 'PE464405F7937E44AFB6996691E47674E1')
'Verify Patinet MRN'
String MRN = WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_MRN/Obj_MRN'), 3)
println(MRN)

//String Actual_DOB = WebUI.getText(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_DOB/Obj_DOB'))
//WebUI.verifyEqual(Actual_DOB, '07/13/1980')
'Verify Patient DOB'
String DOB = WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_DOB/Obj_DOB'), 3)
println(DOB)

'Veryf Status'
String Status = WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_SearchPatient/SearchPatientGrid/OR_Status/Obj_PatientStatus'), 3)
println(Status)