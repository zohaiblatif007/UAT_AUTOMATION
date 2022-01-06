package patientGrid
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




class SD_CareCordination_LeftFilters {

	WebDriver driver = DriverFactory.getWebDriver()


	@When("I click on care cordination")
	public void I_click_on_carecordination() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/Obj_CareCoordination'), 10)

		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/Obj_CareCoordination'))
		Thread.sleep(2000)
	}


	@And("I click on care cordination reset button")
	public void click_On_Reset_Button() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/Obj_buttonReset'),10)

		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/Obj_buttonReset'))
		Thread.sleep(2000)
	}

	@And("I clear before and after dates")
	public void ClearDates() {

		WebUI.clearText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_ClearDates/Obj_ClearBeforeDate'))
		WebUI.clearText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_ClearDates/Obj_ClearAfterDate'))
	}

	@When("I enter (.*) as serving facility")
	public void user_Enter_ServingFacility(String ServingFacility) {


		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_Facility/Obj_ServingFacility_Click'))
		Thread.sleep(1000)

		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_Facility/Obj_ServingFacility_Input'), ServingFacility)

		WebUI.sendKeys(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_Facility/Obj_ServingFacility_Input'), Keys.chord(Keys.ENTER))
	}

	@When("I enter (.*) as serving facility type")
	public void user_Enter_ServingFacilityType(String Facility) {


		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_Facility/Obj_ServingFacilityType_Click'))
		Thread.sleep(1000)

		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_Facility/Obj_ServingFacilityType_Input'), Facility)

		WebUI.sendKeys(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_Facility/Obj_ServingFacilityType_Input'), Keys.chord(Keys.ENTER))
	}



	@And("I click on care cordination apply button")
	public void click_On_CareCordination_Apply_Button() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/Obj_buttonApply'), 10)

		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/Obj_buttonApply'))
	}




	@Then("I should see care cordination serving facility (.*)")
	public void I_should_see_care_cordination_ServingFacility_filters(String ServingFacility) {


		String Actual_ServingFacility = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/GridObjects/Obj_ServingFacility_MHPN3'))
		WebUI.verifyEqual(ServingFacility, Actual_ServingFacility)

	}


	@Then("I should see (.*) care cordination Enc program")
	public void I_should_see_care_cordination_patientprogram_filters(String EncProgram) {


		String Actual_PatientProgram = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/GridObjects/Obj_Program_TCM'))
		WebUI.verifyEqual(Actual_PatientProgram, EncProgram)


	}


	@Then("I should see (.*) as care cordination LOB")
	public void I_should_see_care_cordination_LOB_filters(String LOB) {


		String Actual_LOB = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/GridObjects/Obj_LOB'))

		if(!Actual_LOB.is(LOB)) {

			WebUI.verifyEqual(LOB, Actual_LOB)
		}else {

			throw new NoSuchElementException("Can't find " + LOB + " in Grid");
		}
	}


	@Then("I should see care cordination (.*) as serving facility type")
	public void I_should_see_care_cordination_ServingFacilityType_filters(String Facility) {


		String Actual_ServingFacilityType = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/GridObjects/Obj_ServingFacilityType_HOS'))

		WebUI.verifyEqual(Facility, Actual_ServingFacilityType)

	}

	@Then("I should see (.*) care cordination Notifications")
	public void I_should_see_care_cordination_Notifications_filters(String NotificationType) {


		String Actual_NotificatonType = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/GridObjects/Obj_NotificationsType'))

		WebUI.verifyEqual(Actual_NotificatonType, NotificationType)
	}

	@Then("I should see care cordination Encounter (.*) filters")
	public void I_should_see_care_cordination_Encounter_filters(String EncounterType) {


		String Actual_EncounterType = WebUI.getText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/GridObjects/Obj_EncounterType'))

		//WebUI.verifyElementText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/GridObjects/Obj_EncounterType'), Actual_EncounterType)

		WebUI.verifyEqual(EncounterType, Actual_EncounterType)

	}

	@And("I select (.*) patient program")
	public void Select_PatientProgram(String EncProgram) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_Programe/Obj_PatientProgram_Click'), 10)

		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_Programe/Obj_PatientProgram_Click'))

		if(EncProgram==EncProgram) {


			Thread.sleep(2000)
			WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_Programe/Obj_PatientProgram_select'))

		}else {

			throw new NoSuchElementException("Can't find " + EncProgram + " in dropdown");
		}

	}

	@And("I select (.*) as Notification Type")
	public void Select_Notification(String NotificationType) {


		WebUI.waitForElementClickable(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_NotificationType/Obj_NotificationType_Click'), 10)

		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_NotificationType/Obj_NotificationType_Click'))



		if(NotificationType==NotificationType) {

			Thread.sleep(2000)
			WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_NotificationType/Obj_NotificationType_Select'))
		}else {

			throw new NoSuchElementException("Can't find " + NotificationType + " in dropdown");
		}
	}

	@And("I select (.*) as LOB")
	public void Select_LOB(String LOB) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_LOB/Obj_LOBFilterClick'), 10)
		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_LOB/Obj_LOBFilterClick'))

		if(LOB== LOB) {



			WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_LOB/Obj_LOBFilterSelect'))
		}

		else {

			throw new NoSuchElementException("Can't find " + LOB + " in dropdown");
		}




		//		String xpath = '(//ul[@id="toc_filter_lob_listbox"]/li[text()= "'+LOB+'"])'
		//
		//		TestObject to = new TestObject(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_LOB/Obj_LOBFilterSelect'))
		//
		//		to.addProperty("xpath", ConditionType.EQUALS, xpath)
		//		WebUI.click(to)








		//		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_LOB/Obj_LOB_Click'))
		//		Thread.sleep(2000)
		//		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_LOB/Obj_LOB_select'))
	}

	@And("I enter (.*) as encounter type")
	public void Select_Encounter(String EncounterType) {

		WebUI.click(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_EcounterType/Obj_EcounterType_Click'))
		Thread.sleep(1000)

		WebUI.setText(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_EcounterType/Obj_EcounterType_Select'), EncounterType)

		WebUI.sendKeys(findTestObject('Object Repository/CareCordination_LeftFilters/OR_LeftFilters/LeftFiltersObjects/OR_EcounterType/Obj_EcounterType_Select'), Keys.chord(Keys.ENTER))
	}
}

