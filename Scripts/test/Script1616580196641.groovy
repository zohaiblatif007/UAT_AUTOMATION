import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable



















WebUI.openBrowser('')
WebUI.maximizeWindow()

 


WebUI.navigateToUrl("https://slt-int.solitontechnologies.com/PersiviaPortal/newLogin")

WebUI.setText(findTestObject('Object Repository/OR_LoginPage/Obj_Username'), "zl@slt.com")

WebUI.setText(findTestObject('Object Repository/OR_LoginPage/Obj_Password'), "Soliton@2233")
WebUI.click(findTestObject('Object Repository/OR_LoginPage/Obj_Signin'))
WebUI.verifyElementPresent(findTestObject('Object Repository/OR_HomePage/Obj_Logo'), 3)


WebUI.mouseOver(findTestObject('OR_LandingPage/OR_CMR/Obj_CMR'))

		WebUI.click(findTestObject('Object Repository/OR_LandingPage/OR_CMR/Obj_Patients'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_HomePage/Obj_Logo'), 3)

		Thread.sleep(3000)

WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'))


WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'))

WebUI.setText(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'), 'Asalah, Asalah')

Thread.sleep(3000)

WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/Select_Filters/Select_Search'))
Thread.sleep(1000)


WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientToClinicalTab/Obj_ClinicalTab'), GlobalVariable.timeout)
//Thread.sleep(1000)
// 'Click on Clinical tab'
WebUI.click(findTestObject('OR_PatientGrid/OR_PatientToClinicalTab/Obj_ClinicalTab'))

WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientToClinicalTab/Obj_button_Add'), GlobalVariable.timeout)
System.out.println("user is on clinical tab")

Thread.sleep(3000)


//WebUI.getText(findTestObject)
//String a=WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_td_Cholera'))
//if(a=='Cholera, unspecified::A00.9')
//{
//	System.out.println("if executed")
//}
//else {
//	System.out.println("else executed")
//}




List pending = WebUI.findWebElements(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_td_Cholera'),30)

		for(int i = 0; i < pending.size(); i++) {
	if(pending.get(i) > 0) {
		pending.get(i).click()
	}
}  
    
  
	
	
	