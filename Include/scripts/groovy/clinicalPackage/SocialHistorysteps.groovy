package clinicalPackage
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.When
import groovypackage.Stringtext
import internal.GlobalVariable



class SocialHistorysteps {
	WebDriver driver = DriverFactory.getWebDriver()

	public static int s1,s2

	@When("I click on Social History tab")
	public void click_socialhistory_button() {

		'Click on Social History Tab'
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/Obj_Social HistoryTab'),
				GlobalVariable.timeout)
		Thread.sleep(2000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/Obj_Social HistoryTab'))
		Thread.sleep(2000)
			}

	@And("I click on social history Add button")
	public void addbutton_socialhistory() {

		'Click on Social History Button'
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/Obj_button_Add'),
				GlobalVariable.timeout)
		Thread.sleep(2000)
		'Click on Add Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/Obj_button_Add'))
		Thread.sleep(2000)
		}


	@And("I click on social history Edit button")
	public void editbutton_socialhistory() {
		'Click on Social History Button'
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/button_Edit'),
				GlobalVariable.timeout)
		Thread.sleep(2000)
		'Click on Edit Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/button_Edit'))
		Thread.sleep(2000)
		}

	@When("I enter (.*) to delete record in social history")
	def I_click_on_delete_button(String Problem_Name) {
		Thread.sleep(5000)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.socialHistory']//table)[2]//tbody"))
		List<WebElement> Table1=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.socialHistory']//table)[2]//tbody//tr//td[2])"))

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
			String xpathd1 = "(//div[@data-mz-key='clinical.socialHistory']//table)[2]//tr[" +i +"]//td[2]"

			td1.addProperty('xpath', ConditionType.EQUALS, xpathd1)

			text1= WebUI.getText(td1)

			if(text1==Problem_Name) {
				break
			}
		}
		TestObject td2 = new TestObject('delete')

		String xpathd2 = "(//div[@data-mz-key='clinical.socialHistory']//table)[2]//tr[" +i +"]//td[6]//button"

		td2.addProperty('xpath', ConditionType.EQUALS, xpathd2)

		WebUI.click(td2)


		WebUI.switchToDefaultContent()

	}

	@And("I enter (.*) in social history type field")
	public void type_socialhistory(String Type) {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/Obj_HistoryType'),
				GlobalVariable.timeout)

		'Click on Type Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/Obj_HistoryType'))

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)


		String xpath1 = ('(//li[text()="' + Type) +'"])[1]'

		TestObject t1 = new TestObject('Mild')

		t1.addProperty('xpath', ConditionType.EQUALS, xpath1)

		WebUI.click(t1)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/Obj_li_Tobacco'),
		//				GlobalVariable.timeout)
		//
		//		'Select the the value from the Drop Down'
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/Obj_li_Tobacco'))
	}

	@And("I enter (.*) in social history observation field")
	public void observation_socialhistory(String Observation) {

		'Set the text under observation in Observation Field'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/Obj_InputObservation'),Observation)
	}

	@And("I enter (.*) in social history start date field")
	public void startdate_socialhistory(String Start_Date) {
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/Obj_Startdate'))

		'Enter Start Date'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/Obj_Startdate'),Start_Date)
	}

	@And("I enter (.*) in social history end date field")
	public void enddate_socialhistory(String End_Date) {

		'Enter End Date'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/Obj_EndDate'),End_Date)
	}

	@And("I click on social history Update button")
	public void updatebutton_socialhistory_record() {
		'Click on Save Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/Obj_Update'))
	}

	@And("I should see success message for added social history")
	public void record_savedsuccessfully_alertpopup_socialhistory() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'), 'successRecord saved successfully.Hide')


		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'),
				GlobalVariable.timeout)
	}

	@And("I should see success message for edit social history")
	public void record_editsuccessfully_alertpopup_socialhistory() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/Obj_AlertUpdate'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/Obj_AlertUpdate'),
				'successRecord updated successfully.Hide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/Obj_AlertUpdate'),
				GlobalVariable.timeout)
	}




	@And("I should see the newly added (.*) and (.*) and (.*) and (.*) social history on grid")
	public void addeddata_visible_socialhistory(String Type, String Observation, String Start_Date, String End_Date) {

		'Verification of the given Data Whether its Correct or Not'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/Obj_td_type'), Type)


		'Verify the Entered Data'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/Obj_td_observation'), Observation)

		String sdate= Stringtext.planetext(Start_Date)
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/Obj_td_startdate'), sdate)

		String edate= Stringtext.planetext(End_Date)
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_SocialHistory/Obj_td_endate'), edate)
	}


	@And("I should see the deleted social history not present on grid")
	def very_deleted_data_should_benot_visible_on_the_UI(){
		'Verify the record gone from UI'

		Thread.sleep(3000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Refresh button/Obj_refreshbutton'))

		//		WebElement refresh=driver.findElement(By.xpath("//span[@class='k-icon k-i-refresh']"))
		//		refresh.click()
		Thread.sleep(9000)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.socialHistory']//table)[2]//tbody"))
		List<WebElement> Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.socialHistory']//table)[2]//tbody//tr//td[2])"))
		Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.socialHistory']//table)[2]//tbody//tr//td[2])"))
		s2=Table2.size()
		s1=s1-1
		WebUI.verifyEqual(s1, s2)
		WebUI.switchToDefaultContent()
	}
}