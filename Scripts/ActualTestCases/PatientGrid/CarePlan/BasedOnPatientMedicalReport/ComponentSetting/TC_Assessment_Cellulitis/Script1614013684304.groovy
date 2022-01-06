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

'Click On Enterprise Dropdown'
WebUI.click(findTestObject('OR_HomePage/Obj_AprimaEnterprise'))

'Select MHPN Enterprise'
WebUI.click(findTestObject('OR_HomePage/Obj_SelectMHPN'))

Thread.sleep(0100)

//'Click On Alert Cross Button'
//WebUI.click(findTestObject('OR_Alert/Obj_Hide'))

WebUI.callTestCase(findTestCase('Utility_Functions/UF_MouseHover'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_SelectPatientGrid'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(4000)

//'Click On Alert Cross Button'
//WebUI.click(findTestObject('OR_Alert/Obj_Hide'))

'Click On Patient Search Input Field'
WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'))

'Enter Correct Patient Name'
WebUI.setText(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'), 'Dermo505, Mac505')

Type_Text = WebUI.getAttribute(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'), 'value')

WebUI.verifyEqual(Type_Text, 'Dermo505, Mac505')

Thread.sleep(1000)

WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/Select_Filters/Select_Search'))


Thread.sleep(3000)


WebUI.click(findTestObject('OR_PatientGrid/Assessment/OR_Assessment/Obj_AssessmentTab'))

Thread.sleep(1000)

WebUI.click(findTestObject('OR_PatientGrid/Assessment/OR_Assessment/Obj_AddButton'))

WebUI.click(findTestObject('OR_PatientGrid/Assessment/OR_Assessment/Obje_OtherAssessmentTemplates'))

Thread.sleep(1000)

WebUI.click(findTestObject('OR_PatientGrid/Assessment/OR_Assessment/Obj_CellulitisCheckbox'))

Thread.sleep(1000)

WebUI.click(findTestObject('OR_PatientGrid/Assessment/OR_Assessment/Obj_buttonProceed'))

Thread.sleep(1000)

WebUI.clearText(findTestObject('OR_PatientGrid/Assessment/OR_Assessment/Obj_input_title'))

Thread.sleep(1000)

WebUI.setText(findTestObject('OR_PatientGrid/Assessment/OR_Assessment/Obj_input_title'), 
    'Cellulitis Assessment Testing')

WebUI.click(findTestObject('OR_PatientGrid/Assessment/OR_Assessment/Obj_YesNo_Checkbox'))

Thread.sleep(1000)


WebUI.click(findTestObject('OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_FirstClick'))

Thread.sleep(1000)


WebUI.click(findTestObject('OR_PatientGrid/Assessment/OR_Assessment/Obj_MostOfTheTime'))

WebUI.click(findTestObject('OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_ThirdClick'))

WebUI.click(findTestObject('OR_PatientGrid/Assessment/OR_Assessment/Obj_PublicTransport'))

WebUI.click(findTestObject('OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_ForthClick'))

WebUI.click(findTestObject('OR_PatientGrid/Assessment/OR_Assessment/Obj_OwnHouse'))

WebUI.click(findTestObject('OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_FifthClick'))

WebUI.click(findTestObject('OR_PatientGrid/Assessment/OR_Assessment/Obj_BedBugs'))

WebUI.setText(findTestObject('OR_PatientGrid/Assessment/OR_Assessment/Obj_textarea_select_notes'), 
    'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.')

WebUI.click(findTestObject('OR_PatientGrid/Assessment/OR_Assessment/Obj_button_Save'))

Thread.sleep(2000)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_ComponentSetting/UF_AddAssessment_ComponentPage'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(3000)

WebUI.callTestCase(findTestCase('Utility_Functions/UF_Logout'), [:], FailureHandling.STOP_ON_FAILURE)

