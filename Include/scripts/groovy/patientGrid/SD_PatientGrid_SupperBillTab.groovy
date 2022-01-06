package patientGrid

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.After
import cucumber.api.java.Before
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


public class SD_PatientGrid_SupperBillTab {



	@Given("I navigate to patient grid With Supper Bill")
	public void I_navigate_to_patient_grid_SupperBill() {



		WebUI.waitForElementClickable(findTestObject('OR_HomePage/Obj_QAmhpn'), 2)

		'Select Support Test Ent Enterprise'
		WebUI.click(findTestObject('Object Repository/OR_HomePage/Obj_SelectSupportTestEnt'))


		//		WebUI.click(findTestObject('OR_HomePage/Obj_AprimaEnterprise'))
		//		WebUI.click(findTestObject('OR_HomePage/Obj_SelectMHPN'))


		Thread.sleep(3000)
		WebUI.click(findTestObject('OR_Alert/Obj_Hide'))
		WebUI.getUrl()

		String ActualText = WebUI.getText(findTestObject('OR_LandingPage/OR_CMR/Obj_CMR'))
		WebUI.verifyEqual(ActualText, 'CMR')


		WebUI.mouseOver(findTestObject('OR_LandingPage/OR_CMR/Obj_CMR'))

		WebUI.enableSmartWait()
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SupperBill/Obj_SupperBillMenu'))

		//		WebUI.click(findTestObject('OR_Alert/Obj_Hide'))

		WebUI.enableSmartWait()



	}
}
