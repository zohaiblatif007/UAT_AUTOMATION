package patientGrid
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.After
import cucumber.api.java.Before
import cucumber.api.java.tlh.qaSDI
import internal.GlobalVariable

class SD_Login {


	@Before()
	public void Browser() {

		WebUI.openBrowser('')
		WebUI.maximizeWindow()



		GlobalVariable.url
		GlobalVariable.username
		GlobalVariable.password


		PerformLogin(GlobalVariable.url, GlobalVariable.username, GlobalVariable.password )
	}

	//	@After()
	//	public void Logout() throws Throwable {
	//
	//
	//		Thread.sleep(5000)
	//
	//
	//		WebUI.click(findTestObject('OR_LogoutPage/Obj_Logout'))
	//
	//		WebUI.click(findTestObject('OR_LogoutPage/Obj_Sign Out'))
	//
	//		WebUI.closeBrowser()
	//	}


	public void PerformLogin(String URL, String Email, String Password) {

		WebUI.navigateToUrl(URL)

		WebUI.setText(findTestObject('Object Repository/OR_LoginPage/Obj_Username'), Email)

		WebUI.setText(findTestObject('Object Repository/OR_LoginPage/Obj_Password'), Password)


		WebUI.click(findTestObject('Object Repository/OR_LoginPage/Obj_Signin'))


		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_HomePage/Obj_Logo'), 3)
	}
}