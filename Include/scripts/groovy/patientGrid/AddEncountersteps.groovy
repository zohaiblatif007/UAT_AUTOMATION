package patientGrid
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable


class AddEncountersteps {
	WebDriver driver = DriverFactory.getWebDriver()


	public static int s1,s2
	public static int e=0

	@When("I click on encounter tab button to land on enconter section")
	def buttonencountertab() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_EncounterTab'),GlobalVariable.timeout)
		Thread.sleep(3000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_EncounterTab'))

		Thread.sleep(2000)
	}




	@When("I click on add encounter button of a patient")
	def button_to_add_patientrecord() {
		e=1
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Addencounter'),GlobalVariable.timeout)
		Thread.sleep(3000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Addencounter'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_servingfacilitydropdown'), GlobalVariable.timeout)
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_servingfacilitydropdown'), GlobalVariable.timeout)
		Thread.sleep(2000)
	}

	@When("I click on edit encounter button of a patient")
	def button_to_edit_patientrecord() {
		e=1
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Editencounter'),GlobalVariable.timeout)
		Thread.sleep(3000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Editencounter'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_servingfacilitydropdown'), GlobalVariable.timeout)
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_servingfacilitydropdown'), GlobalVariable.timeout)
		Thread.sleep(2000)
	}

	@When("I delete encounter with (.*) of a patient")
	def deleteencounter(String Encounter) {
		
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Editencounter'),GlobalVariable.timeout)
		
		Thread.sleep(2000)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		List<WebElement> Table1= driver.findElements(By.xpath("(//span[@class='input-source persivia']//parent::td//parent::tr)//td[4]"))
		int i=1
		String text1
		s1=Table1.size()
		TestObject td1 = new TestObject('Mild')

		for( ;i<=s1;i++) {
			String xpathd1 = " (//span[@class='input-source persivia']//parent::td//parent::tr)[" +i +"]//td[4]"

			td1.addProperty('xpath', ConditionType.EQUALS, xpathd1)

			text1= WebUI.getText(td1)

			if(text1==Encounter) {
				break
			}
		}

		TestObject td2 = new TestObject('delete')

		String xpathd2 = "(//span[@class='input-source persivia']//parent::td//parent::tr)[" +i +"]//td[21]//button[@class='k-button k-button-icontext k-grid-delete']"

		td2.addProperty('xpath', ConditionType.EQUALS, xpathd2)

		WebUI.click(td2)


		WebUI.switchToDefaultContent()
	}


	@When("I click on encounter delete confirm button")
	def button_deleteconfirm() {
		e=1
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Encounterdelteconfirm button'),GlobalVariable.timeout)

		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Encounterdelteconfirm button'))
	}


	@And("I enter (.*) in patient encounter source field")
	def source_for_encouter(String source) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_sourcedropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4

		xpath4 = ('(//li[text()="' + source) +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}



	@And("I enter (.*) in patient encounter billable chckbox")
	def patienbillablet(String bilable) {
		if(bilable=='Yes') {
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Billablecheckbox'))
		}
	}

	@And("I enter (.*) in patient encounter encounter field")
	def work_Phone_for_patient(String encouter) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Encounterfield'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Encounterfield'), encouter)
		Thread.sleep(3000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Encounterfield'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient encounter start date field")
	def startdatefield(String startdate) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_startdate'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_startdate'), startdate)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_startdate'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient encounter end date field")
	def enddatefield(String enddate) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Enddate'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Enddate'), enddate)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Enddate'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient encounter serving facility field")
	def servingfacility_for_encouter(String servingfacility) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_servingfacilitydropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4

		xpath4 = ('(//li[text()="' + servingfacility) +'"])[2]'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}

	@And("I enter (.*) in patient encounter disposition field")
	def disposition_for_encouter(String disposition) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Dispposition'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4

		xpath4 = ('(//li[text()="' + disposition) +'"])[2]'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}

	@And("I enter (.*) in patient encounter dis facility field")
	def disfacility_for_encouter(String disfacility) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Disfacility'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4

		xpath4 = ('(//li[text()="' + disfacility) +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}

	@And("I enter (.*) in patient encounter location field")
	def locationfield(String location) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Location'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Location'), location)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Location'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in patient encounter pos field")
	def pos_for_encouter(String pos) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_POS'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4

		xpath4 = ('(//li[text()="' + pos) +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in patient encounter visit type field")
	def visitype_for_encouter(String visitype) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Visittype'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4

		xpath4 = ('(//li[text()="' + visitype) +'"])[3]'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}

	@And("I enter (.*) in patient encounter note type field")
	def notetype_for_encouter(String notetype) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Notetype'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4

		xpath4 = ('(//li[text()="' + notetype) +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in patient encounter appt provider field")
	def apptprovider_for_encouter(String apptprovider) {
		//'Click on status'

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_apptprovider'),
				Keys.chord(Keys.BACK_SPACE))

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_apptprovider'))
		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4

		xpath4 = ('(//li[text()="' + apptprovider) +'"])[2]'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in patient encounter rendring provider field")
	def renderingprovider_for_encouter(String rendprovider) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_RenderingProvider'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4

		xpath4 = ('(//li[text()="' + rendprovider) +'"])[2]'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in patient encounter reference provider field")
	def refrenceproviderfield(String refprovider) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_RefProvder'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_RefProvder'), refprovider)
		Thread.sleep(4000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_RefProvder'),
				Keys.chord(Keys.TAB))
		
	}



	@And("I click on patient save button to save encounter")
	def savedbtn_for_patient() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Savebutton'))
	}

	@Then("I should see success message for created encounter")
	def patientcreated_successfully_alert_should_popup() {
		Thread.sleep(1000)
		// WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertupdatedemo'), GlobalVariable.timeout)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Alertssavedenconter'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Alertssavedenconter'),
				"successEncounter saved successfully and patient has been discharged.Hide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Alertssavedenconter'),
				GlobalVariable.timeout)
	}


	@Then("I should see success message for edit encounter")
	def edit_successfully_alert_should_popup() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Alertssavedenconter'),
			GlobalVariable.timeout)
		Thread.sleep(1000)
		// WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertupdatedemo'), GlobalVariable.timeout)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Alertssavedenconter'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Alertssavedenconter'),
				"successEncounter saved successfully Hide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Alertssavedenconter'),
				GlobalVariable.timeout)
	}

	@Then("I should see success message for deleted encounter")
	def deleted_successfully_alert_should_popup() {
		Thread.sleep(1000)
		// WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertupdatedemo'), GlobalVariable.timeout)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Alertdeletedenconter'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Alertdeletedenconter'),
				"successEncounter Deleted SuccessfullyHide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Encounter/Addencounter/Obj_Alertdeletedenconter'),
				GlobalVariable.timeout)
	}


	@And("I should see deleted encounter not present on grid")
	def very_deleted_encounter_UI(){
		'Verify the record gone from UI'

		Thread.sleep(3000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Refresh button/Obj_refreshbutton'))


		Thread.sleep(9000)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		List<WebElement> Table2= driver.findElements(By.xpath("(//span[@class='input-source persivia']//parent::td//parent::tr)//td[4]"))

		s2=Table2.size()
		s1=s1-1
		WebUI.verifyEqual(s1, s2)
		WebUI.switchToDefaultContent()
	}
}