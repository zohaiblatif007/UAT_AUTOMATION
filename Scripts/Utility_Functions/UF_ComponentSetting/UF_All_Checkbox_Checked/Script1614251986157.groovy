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


'Verify Component Setting'
if(WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Obj_ButtonComponentSetting'), 3)) {

	Thread.sleep(2000)
	WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Obj_ButtonComponentSetting'))

}else {
	println("Component Setting Button Is Not Present..!!")
}

'Verify "All" Checkbox is checked'
if(WebUI.verifyElementChecked(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Obj_All_CheckBox'), 3)) {

	WebUI.uncheck(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Obj_All_CheckBox'))

}else {

	println("Sorry, You're not able to uncheck 'ALL' the checkbox..!!")
}


'Verify "Care Provider" Checkbox is checked'
if(WebUI.verifyElementNotChecked(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_CareProvider_CheckBox'), 3)) {

	WebUI.check(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_CareProvider_CheckBox'))

}else {

	print("Sorry, You're not able to check 'Care Provider' the checkbox..!!")
}

'Verify "Problem List" Checkbox is checked'
if(WebUI.verifyElementNotChecked(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Obj_ProblemList_CheckBox'), 3)) {

	WebUI.check(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Obj_ProblemList_CheckBox'))

}else {
	println("Sorry, You're not able to check 'ProblemList' the checkbox..!!")
}

'Verify "Emergency Contacts" Checkbox is checked'
if(WebUI.verifyElementNotChecked(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_EmergencyContact_CheckBox'), 3)) {

	WebUI.check(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_EmergencyContact_CheckBox'))

}else {
	println("Sorry, You're not able to check 'Emergency Contacts' the checkbox..!!")
}

'Verify "Assessment" Checkbox is checked'
if(WebUI.verifyElementNotChecked(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_Assessment_CheckBox'), 3)) {

	WebUI.check(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_Assessment_CheckBox'))

}else {
	println("Sorry, You're not able to check 'Assessment' the checkbox..!!")
}

'Verify "Comments" Checkbox is checked'
if(WebUI.verifyElementNotChecked(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_Comment_CheckBox'), 3)) {

	WebUI.check(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_Comment_CheckBox'))

}else {
	println("Sorry, You're not able to check 'comments' the checkbox..!!")
}

'Verify "Evidence Based Protocols" Checkbox is checked'
if(WebUI.verifyElementNotChecked(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_EvidenceBasedProtocol_CheckBox'), 3)) {

	WebUI.check(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_EvidenceBasedProtocol_CheckBox'))

}else {
	println("Sorry, You're not able to check 'Evidence Based Protocol' the checkbox..!!")
}

'Verify "Future Appointment" Checkbox is checked'
if(WebUI.verifyElementNotChecked(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_FutureAppointment_CheckBox'), 3)) {

	WebUI.check(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_FutureAppointment_CheckBox'))

}else {
	println("Sorry, You're not able to check 'Future Appointment' the checkbox..!!")
}

'Verify "Goals" Checkbox is checked'
if(WebUI.verifyElementNotChecked(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_Goals_CheckBox'), 3)) {

	WebUI.check(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_Goals_CheckBox'))

}else {
	println("Sorry, You're not able to check 'Goals' the checkbox..!!")
}


'Verify "Known Allergies" Checkbox is checked'
if(WebUI.verifyElementNotChecked(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_KnownAllergies_CheckBox'), 3)) {

	WebUI.check(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_KnownAllergies_CheckBox'))

}else {
	println("Sorry, You're not able to check 'Known Allergies' the checkbox..!!")
}

'Verify "Medications As Per EHR" Checkbox is checked'
if(WebUI.verifyElementNotChecked(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_MedicationsAsPerEHR_CheckBox'), 3)) {

	WebUI.check(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_MedicationsAsPerEHR_CheckBox'))

}else {
	println("Sorry, You're not able to check 'Medications as per EHR' the checkbox..!!")
}


'Verify "Medication As Per Patient" Checkbox is checked'
if(WebUI.verifyElementNotChecked(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_MedicationsAsPerPatient_CheckBox'), 3)) {

	WebUI.check(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_MedicationsAsPerPatient_CheckBox'))

}else {
	println("Sorry, You're not able to check 'Medication as per patient' the checkbox..!!")
}

//'Verify "Tasks" Checkbox is checked'
//if(WebUI.verifyElementNotChecked(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_Tasks_CheckBox'), 3)) {
//
//	WebUI.check(findTestObject('OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Component_Validation/ComponentCheckboxes/Obj_Tasks_CheckBox'))
//
//}else {
//	println("Sorry, You're not able to check 'tasks' the checkbox..!!")
//}

WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_NonClinicalSection/OR_CarePlan/OR_CPGrid_Buttons/ComponentSetting/Obj_Apply_ComponentSetting'))
