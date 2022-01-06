package clinicalPackage
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import groovypackage.Stringtext



class MentalStatussteps {

	WebDriver driver = DriverFactory.getWebDriver()

	public static int s1,s2

	@And("I click on Mental Status tab")
	public void mentalStatustab() {

		//		'Click on the Slider button to show the mental status'
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_MentalStatus/Obj_Slidebutton'))

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_MentalStatus/Obj_Mental StatusTab'),
				GlobalVariable.timeout)
		Thread.sleep(2000)
		'Press the Mental Status Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_MentalStatus/Obj_Mental StatusTab'))
		Thread.sleep(2000)
	}


	@When("I click on Mental status Add button")
	public void mentalstatus_Addbutton() {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_MentalStatus/Obj_button_Add'),
				GlobalVariable.timeout)

		Thread.sleep(2000)
		'Press the Add button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_MentalStatus/Obj_button_Add'))
		Thread.sleep(2000)
	}


	@When("I click on Mental status Edit button")
	public void mentalstatus_Editbutton() {



		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_MentalStatus/button_Edit'),
				GlobalVariable.timeout)

		Thread.sleep(2000)
		'Press the Edit button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_MentalStatus/button_Edit'))
		Thread.sleep(2000)
	}



	@When("I enter (.*) to delete record in mental status")
	def I_click_on_delete_button(String Problem_Name) {
		Thread.sleep(5000)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.mentalStatus']//table)[2]//tbody"))
		List<WebElement> Table1=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.mentalStatus']//table)[2]//tbody//tr//td[2])"))

		//	List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		//	int rows_count = rows_table.size()
		//	System.out.println(rows_table.get(1).getText())
		//	System.out.println("rows are= " + rows_count)
		//System.out.println(Table1.size())
		//System.out.println(Table1.get(1).getText())
		'Click on Delete Button'

		TestObject td1 = new TestObject('Mild')

		int i=1, size, size2
		String text1
		s1=Table1.size()
		System.out.println(size)
		for( ;i<=size;i++) {
			String xpathd1 = "(//div[@data-mz-key='clinical.mentalStatus']//table)[2]//tr[" +i +"]//td[2]"

			td1.addProperty('xpath', ConditionType.EQUALS, xpathd1)

			text1= WebUI.getText(td1)

			if(text1==Problem_Name) {
				break
			}
		}
		TestObject td2 = new TestObject('delete')

		String xpathd2 = "(//div[@data-mz-key='clinical.mentalStatus']//table)[2]//tr[" +i +"]//td[4]//button"

		td2.addProperty('xpath', ConditionType.EQUALS, xpathd2)

		WebUI.click(td2)


		WebUI.switchToDefaultContent()

	}

	@And("I enter (.*) in mental status condition field")
	public void mentalstatus_conditionfield(String Condition) {


		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_MentalStatus/Obj_input__code'))


		'Enter the text a in condition Field'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_MentalStatus/Obj_input__code'), Condition)

		Thread.sleep(2000)

		WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_MentalStatus/Obj_input__code'), Keys.chord(
				Keys.TAB))
	}

	@And("I enter (.*) in mental status date field")
	public void mentalstatus_datefield(String Date) {


		'Set the Date'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_MentalStatus/Obj_Date'), Date)
	}

	@And("I click on mental status Update button")
	public void mentalstatus_Updatebutton() {

		'Press the Update Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_MentalStatus/Obj_Update'))
	}

	@And("I should see success message for added mental status")
	public void successmessage_added_mentalstatus() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'), 'successRecord saved successfully.Hide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'),
				GlobalVariable.timeout)
	}

	@And("I should see success message for edit mental status")
	public void successmessage_edit_mentalstatus() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_MentalStatus/Obj_AlertUpdate'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_MentalStatus/Obj_AlertUpdate'),
				'successRecord updated successfully.Hide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_MentalStatus/Obj_AlertUpdate'),
				GlobalVariable.timeout)
	}



	@And("I should see the newly added (.*) and (.*) of mental status on grid")
	public void newlyadded_mentalstatus_on_grid(String Condition, String Date) {


		'Verify the Entered Data'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_MentalStatus/Obj_td_condition'), Condition)

		String dat = Stringtext.planetext(Date)
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_MentalStatus/Obj_td_date'), dat)
	}


	@And("I should see the deleted mental status not present on grid")
	def very_deleted_data_should_benot_visible_on_the_UI(){
		'Verify the record gone from UI'

		Thread.sleep(3000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Refresh button/Obj_refreshbutton'))

		//		WebElement refresh=driver.findElement(By.xpath("//span[@class='k-icon k-i-refresh']"))
		//		refresh.click()
		Thread.sleep(11000)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.problem']//table)[2]//tbody"))
		List<WebElement> Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.mentalStatus']//table)[2]//tbody//tr//td[2])"))
		Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.mentalStatus']//table)[2]//tbody//tr//td[2])"))
		s2=Table2.size()
		s1=s1-1
		WebUI.verifyEqual(s1, s2)
		WebUI.switchToDefaultContent()
	}
}