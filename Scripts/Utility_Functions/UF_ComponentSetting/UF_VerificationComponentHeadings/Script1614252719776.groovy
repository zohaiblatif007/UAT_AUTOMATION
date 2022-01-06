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


//'Scroll'

//WebUI.scrollToElement(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_CareProviders'), 2)

'Verify Care Provider From Grid'

WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_CareProviders'),
	3)

//'Scroll'
//
//WebUI.scrollToElement(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_ProlemList'), 3)

'Verify Problem List From Grid'
WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_ProlemList'),
	3)

//'Scroll'
//
//WebUI.scrollToElement(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_EmergencyContact'), 3)

'Verify Emergency Contacts From Grid'
WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_EmergencyContact'),
	3)

//'Scroll'
//
//WebUI.scrollToElement(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_Assessment'), 3)

'Verify Assessment From Grid'
WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_Assessment'),
	3)

//'Scroll'
//
//WebUI.scrollToElement(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_EvidenceBasedProtocols'), 3)

//'Verify Evidence Based Protocol From Grid'
//WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_EvidenceBasedProtocols'),
//	3)
//
////'Scroll'
////
////WebUI.scrollToElement(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_FutureAppointment'), 3)
//
//'Verify Future Appointment From Grid'
//WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_FutureAppointment'),
//	3)
//
////'Scroll'
////
////WebUI.scrollToElement(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_Goals'), 3)
//
//'Verify Goals From Grid'
//WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_Goals'),
//	3)
//
////'Scroll'
////
////WebUI.scrollToElement(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_KnownAllergies'), 3)
//
//'Verify Known Allergies From Grid'
//WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_KnownAllergies'),
//	3)
//
////'Scroll'
////
////WebUI.scrollToElement(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_MedicationsAsPerEHR'), 3)
//
//'Verify Medications As Per EHR From Grid'
//WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_MedicationsAsPerEHR'),
//	3)
////
////'Scroll'
////
////WebUI.scrollToElement(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_MedicationsAsPerPatient'), 3)
//
//'Verify Medications As Per Patient From Grid'
//WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_MedicationsAsPerPatient'),
//	3)
//
////'Scroll'
////
////WebUI.scrollToElement(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_Comments'), 3)
//
//'Verify Comments From Grid'
//WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/VerifyComponentHeadings/Obj_Comments'),
//	3)