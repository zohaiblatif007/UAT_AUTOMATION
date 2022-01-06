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


class Contactsteps {
	WebDriver driver = DriverFactory.getWebDriver()


	public static int s1,s2
	public static int e=0

	@When("I click on Contacts tab to land on contacts section")
	def buttonencountertab() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_ContactTab'),GlobalVariable.timeout)
		Thread.sleep(3000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_ContactTab'))

		Thread.sleep(1000)
	}




	@When("I click on support persons button")
	def button_to_supprtperson() {
		e=1
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Spportperson'),GlobalVariable.timeout)
		Thread.sleep(3000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Spportperson'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Addsportperson'), GlobalVariable.timeout)
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Addsportperson'), GlobalVariable.timeout)
	}



	@When("I click on add support persons button")
	def buttonadd_supprtperson() {
		e=1
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Addsportperson'),GlobalVariable.timeout)

		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Addsportperson'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Enddate'), GlobalVariable.timeout)
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Enddate'), GlobalVariable.timeout)
	}


	@When("I click on edit support persons button")
	def buttonedit_supprtperson() {
		e=1
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Editspportperson'),GlobalVariable.timeout)

		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Editspportperson'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Enddate'), GlobalVariable.timeout)
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Enddate'), GlobalVariable.timeout)
	}



	@When("I delete support person record with (.*) of a patient")
	def deletecontact(String lastname) {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Editspportperson'),GlobalVariable.timeout)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		List<WebElement> Table1= driver.findElements(By.xpath("(//span[@class='input-source persivia']//parent::td//parent::tr)//td[2]"))
		int i=1
		String text1
		s1=Table1.size()
		TestObject td1 = new TestObject('Mild')

		for( ;i<=s1;i++) {
			String xpathd1 = " (//span[@class='input-source persivia']//parent::td//parent::tr)[" +i +"]//td[2]"

			td1.addProperty('xpath', ConditionType.EQUALS, xpathd1)

			text1= WebUI.getText(td1)

			if(text1==lastname) {
				break
			}
		}

		TestObject td2 = new TestObject('delete')

		String xpathd2 = "(//span[@class='input-source persivia']//parent::td//parent::tr)[" +i +"]//td[9]//button"

		td2.addProperty('xpath', ConditionType.EQUALS, xpathd2)

		WebUI.click(td2)


		WebUI.switchToDefaultContent()
	}



	@And("I enter (.*) in support persons lastname field")
	def lastnamefield(String lastname) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Lastname'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Lastname'), lastname)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Lastname'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in support persons firstname field")
	def firstnamefield(String firstname) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Firstname'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Firstname'), firstname)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Firstname'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in support persons relationship field")
	def relationshipfield(String relationship) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Relationshipdropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4

		xpath4 = ('(//li[text()="' + relationship) +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in support persons startdate field")
	def startdateefield(String startdate) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Startdate'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Startdate'), startdate)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Startdate'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in support persons enddate field")
	def enddateefield(String enddate) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Enddate'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Enddate'), enddate)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Enddate'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in support persons home phone field")
	def homephonefield(String homephone) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Homephone'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Homephone'), homephone)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Homephone'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in support persons mobile phone field")
	def mobilefield(String mobile) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Mobilephone'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Mobilephone'), mobile)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Mobilephone'),
				Keys.chord(Keys.TAB))
	}

	@And("I click on update button to save support persons data")
	def savedbtn_for_contact() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Updatebutton'))
	}

	@Then("I should see success message for created support persons record")
	def contact_successfully_alert_should_popup() {
		Thread.sleep(1000)
		// WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertupdatedemo'), GlobalVariable.timeout)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Alertsaved'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Alertsaved'),
				"successRecord saved successfully.Hide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Alertsaved'),
				GlobalVariable.timeout)
	}


	@Then("I should see success message for deleted support person record")
	def deleted_successfully_alert_should_popup() {
		Thread.sleep(1000)
		// WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertupdatedemo'), GlobalVariable.timeout)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Alertdeleted'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Alertdeleted'),
				"successRecord deleted successfully.Hide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Alertdeleted'),
				GlobalVariable.timeout)
	}


	@And("I should see deleted support person record not present on grid")
	def very_deleted_contac_UI(){
		'Verify the record gone from UI'

		Thread.sleep(3000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Refresh button/Obj_refreshbutton'))


		Thread.sleep(9000)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		List<WebElement> Table2= driver.findElements(By.xpath("(//span[@class='input-source persivia']//parent::td//parent::tr)//td[2]"))

		s2=Table2.size()
		s1=s1-1
		WebUI.verifyEqual(s1, s2)
		WebUI.switchToDefaultContent()
	}


























	@When("I click on guardian button")
	def button_to_guardian() {
		e=1
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_guardian'),GlobalVariable.timeout)
		Thread.sleep(3000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_guardian'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Addguardian'), GlobalVariable.timeout)
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Addguardian'), GlobalVariable.timeout)
	}



	@When("I click on add guardian button")
	def buttonadd_guardian() {
		e=1
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Addguardian'),GlobalVariable.timeout)

		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Addguardian'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Enddate'), GlobalVariable.timeout)
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Enddate'), GlobalVariable.timeout)
	}


	@When("I click on edit guardian button")
	def buttonedit_guardian() {
		e=1
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Editgardian'),GlobalVariable.timeout)

		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Editgardian'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Enddate'), GlobalVariable.timeout)
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Enddate'), GlobalVariable.timeout)
	}



	@When("I delete guardian record with (.*) of a patient")
	def deleteguardian(String lastname) {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Editgardian'),GlobalVariable.timeout)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		List<WebElement> Table1= driver.findElements(By.xpath("(//span[@class='input-source persivia']//parent::td//parent::tr)//td[2]"))
		int i=1
		String text1
		s1=Table1.size()
		TestObject td1 = new TestObject('Mild')

		for( ;i<=s1;i++) {
			String xpathd1 = " (//span[@class='input-source persivia']//parent::td//parent::tr)[" +i +"]//td[2]"

			td1.addProperty('xpath', ConditionType.EQUALS, xpathd1)

			text1= WebUI.getText(td1)

			if(text1==lastname) {
				break
			}
		}

		TestObject td2 = new TestObject('delete')

		String xpathd2 = "(//span[@class='input-source persivia']//parent::td//parent::tr)[" +i +"]//td[9]//button"

		td2.addProperty('xpath', ConditionType.EQUALS, xpathd2)

		WebUI.click(td2)


		WebUI.switchToDefaultContent()
	}



	@And("I enter (.*) in guardian lastname field")
	def lastnamefieldguardian(String lastname) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Lastname'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Lastname'), lastname)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Lastname'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in guardian firstname field")
	def firstnamefieldguardian(String firstname) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Firstname'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Firstname'), firstname)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Firstname'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in guardian relationship field")
	def relationshipfieldguardian(String relationship) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Relationshipdropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4

		xpath4 = ('(//li[text()="' + relationship) +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in guardian startdate field")
	def startdateefieldguardian(String startdate) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Startdate'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Startdate'), startdate)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Startdate'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in guardian enddate field")
	def enddateefieldguardian(String enddate) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Enddate'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Enddate'), enddate)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Enddate'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in guardian home phone field")
	def homephonefieldguardian(String homephone) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Homephone'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Homephone'), homephone)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Homephone'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in guardian mobile phone field")
	def mobilefieldguardian(String mobile) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Mobilephone'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Mobilephone'), mobile)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Mobilephone'),
				Keys.chord(Keys.TAB))
	}

	@And("I click on update button to save guardian data")
	def savedbtn_for_guardian() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Updatebutton'))
	}

	@Then("I should see success message for created guardian record")
	def guardian_successfully_alert_should_popup() {
		Thread.sleep(1000)
		// WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertupdatedemo'), GlobalVariable.timeout)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Alertsaved'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Alertsaved'),
				"successRecord saved successfully.Hide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Alertsaved'),
				GlobalVariable.timeout)
	}


	@Then("I should see success message for deleted guardian record")
	def deleted_successfully_alert_should_popupguardian() {
		Thread.sleep(1000)
		// WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertupdatedemo'), GlobalVariable.timeout)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Alertdeleted'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Alertdeleted'),
				"successRecord deleted successfully.Hide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Alertdeleted'),
				GlobalVariable.timeout)
	}


	@And("I should see deleted guardian record not present on grid")
	def very_deleted_contac_UIguardian(){
		'Verify the record gone from UI'

		Thread.sleep(3000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Refresh button/Obj_refreshbutton'))


		Thread.sleep(9000)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		List<WebElement> Table2= driver.findElements(By.xpath("(//span[@class='input-source persivia']//parent::td//parent::tr)//td[2]"))

		s2=Table2.size()
		s1=s1-1
		WebUI.verifyEqual(s1, s2)
		WebUI.switchToDefaultContent()
	}
}