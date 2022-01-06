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


class Insurancesteps {
	WebDriver driver = DriverFactory.getWebDriver()


	public static int s1,s2
	public static int e=0

	@When("I click on Insurance tab to land on insurance section")
	def buttoneninsurancetab() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_InsuranceTab'),GlobalVariable.timeout)
		Thread.sleep(3000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_InsuranceTab'))

		Thread.sleep(3000)
	}


	@When("I click on add insurance button")
	def buttonedit_insurance() {
		e=1
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_Addinsurance'),GlobalVariable.timeout)

		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_Addinsurance'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_groupid'), GlobalVariable.timeout)
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_groupid'), GlobalVariable.timeout)
	}
	
	
	@When("I click on edit insurance button")
	def buttonadd_insurance() {
		e=1
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_editbutton'),GlobalVariable.timeout)

		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_editbutton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_groupid'), GlobalVariable.timeout)
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_groupid'), GlobalVariable.timeout)
	}




	@When("I delete insurance record with (.*) of the insurance")
	def deleteinsurance(String insurance) {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_editbutton'),GlobalVariable.timeout)
		Thread.sleep(2000)
		WebUI.click(findTestObject('OR_Telehealth/Obj_Telehealth'))
		
		WebUI.dragAndDropByOffset(findTestObject('OR_Telehealth/Obj_Telehealth'), -300, 0)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		List<WebElement> Table1= driver.findElements(By.xpath("(//span[@class='input-source persivia']//parent::td//parent::tr)//td[3]"))
		int i=1
		String text1
		s1=Table1.size()
		TestObject td1 = new TestObject('Mild')

		for( ;i<=s1;i++) {
			String xpathd1 = " (//span[@class='input-source persivia']//parent::td//parent::tr)[" +i +"]//td[3]"

			td1.addProperty('xpath', ConditionType.EQUALS, xpathd1)

			text1= WebUI.getText(td1)

			if(text1==insurance) {
				break
			}
		}

		TestObject td2 = new TestObject('delete')

		String xpathd2 = "(//span[@class='input-source persivia']//parent::td//parent::tr)[" +i +"]//td[12]//button"
		
		System.out.println(xpathd2)

		td2.addProperty('xpath', ConditionType.EQUALS, xpathd2)

		WebUI.click(td2)


		WebUI.switchToDefaultContent()
	}



	@And("I enter (.*) in insurance payer field")
	def payerfield(String payer) {
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_playerdropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4

		xpath4 = ('(//li[text()="' + payer) +'"])[3]'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()
	}


	@And("I enter (.*) in insurance street address field")
	def streetaddressfield(String streetaddress) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_addressstreet'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_addressstreet'), streetaddress)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_addressstreet'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in insurance city address field")
	def cityaddressfield(String cityaddress) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_addresscity'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_addresscity'), cityaddress)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_addresscity'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in insurance state address field")
	def stateaddressfield(String stateaddress) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_addresstate'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_addresstate'), stateaddress)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_addresstate'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in insurance zip address field")
	def zipaddressfield(String zipaddress) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_addresszip'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_addresszip'), zipaddress)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_addresszip'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in insurance country address field")
	def countryaddressfield(String countryaddress) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_addresscountry'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_addresscountry'), countryaddress)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_addresscountry'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in insurance phone field")
	def phonefield(String phone) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_phone'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_phone'), phone)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_phone'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in insurance policy type field")
	def policytypefield(String policytype) {
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_policytypedropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4

		xpath4 = ('(//li[text()="' + policytype) +'"])[2]'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()
	}


	@And("I enter (.*) in insurance insurance rank field")
	def insurancerankfield(String insurancerank) {
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_insurancerankdropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4

		xpath4 = ('(//li[text()="' + insurancerank) +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()
	}


	@And("I enter (.*) in insurance copay field")
	def copayfield(String copay) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_copayclick'))
		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_copaytext'))
		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_copayclick'), copay)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_copaytext'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in insurance subscriber id field")
	def subidfield(String subid) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_subscriberid'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_subscriberid'), subid)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_subscriberid'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in insurance relationship field")
	def relationshipfield(String relationship) {
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_relationshipdropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4

		xpath4 = ('(//li[text()="' + relationship) +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()
	}

	@And("I enter (.*) in insurance group id field")
	def groupidfield(String groupid) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_groupid'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_groupid'), groupid)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_groupid'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in insurance financial res party field")
	def financialresfield(String financialres) {
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_financialreasonablepartydropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4

		xpath4 = ('(//li[text()="' + financialres) +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()
	}

	@And("I enter (.*) in insurance effective from field")
	def effectivefromdatefield(String effectivefromdate) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_dateeffective_from'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_dateeffective_from'), effectivefromdate)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_dateeffective_from'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in insurance effective to field")
	def effectivetodatefield(String effectivetodate) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_dateeffective_to'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_dateeffective_to'), effectivetodate)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_dateeffective_to'),
				Keys.chord(Keys.TAB))
	}


	@Then("I should see success message for created insurance record")
	def insurance_updated_alert_should_popup() {
		Thread.sleep(1000)
		// WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertupdatedemo'), GlobalVariable.timeout)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_Alertsaved'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_Alertsaved'),
				"successRecord saved successfully.Hide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_Alertsaved'),
				GlobalVariable.timeout)
	}



	@Then("I should see success message for deleted insurance record")
	def insurance_deleted_alert_should_popup() {
		Thread.sleep(1000)
		// WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertupdatedemo'), GlobalVariable.timeout)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_Alertdeleted'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_Alertdeleted'),
				"successRecord deleted successfully.Hide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_Alertdeleted'),
				GlobalVariable.timeout)
	}


	@And("I click on save button to save insurance data")
	def savedbtn_for_insurance() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Insurance/Obj_savebutton'))
	}


	@And("I should see deleted insurance record not present on grid")
	def very_deleted_insurance(){
		'Verify the record gone from UI'

		Thread.sleep(3000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Refresh button/Obj_refreshbutton'))


		Thread.sleep(9000)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		List<WebElement> Table2= driver.findElements(By.xpath("(//span[@class='input-source persivia']//parent::td//parent::tr)//td[3]"))

		s2=Table2.size()
		s1=s1-1
		WebUI.verifyEqual(s1, s2)
		WebUI.switchToDefaultContent()
	}
}