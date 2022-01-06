package clinicalPackage
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
import groovypackage.Stringtext
import internal.GlobalVariable
import sun.awt.datatransfer.ClipboardTransferable.DataFactory
import utility_Functions.UtilityFunctions



class ProblemListsteps {
	WebDriver driver = DriverFactory.getWebDriver()
	UtilityFunctions obj = new UtilityFunctions()
	public static int s1,s2

	@And("I click on Clinical tab")
	def I_am_on_PWB_CLinical_section() {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientToClinicalTab/Obj_ClinicalTab'), GlobalVariable.timeout)
		Thread.sleep(4000)
		// 'Click on Clinical tab'
		System.out.println("user is on clinical tab1")
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientToClinicalTab/Obj_ClinicalTab'))

		Thread.sleep(1000)
		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientToClinicalTab/Obj_button_Add'), GlobalVariable.timeout)
		System.out.println("user is on clinical tab2")
		Thread.sleep(4000)
	}


	@And("I click on Problem List	tab")
	public static void click_problemlist_tab() {
		Thread.sleep(2000)
	}

	@When("I click on problem Add button")
	def I_click_on_Add_button() {
		'Click on Add Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_button_Add'))
		Thread.sleep(2000)
	}


	@When("I click on problem Edit button")
	def I_click_on_edit_button() {
		'Click on Edit Button'
		'Click on Add Button'
		WebUI.doubleClick(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/button_Edit'))
		Thread.sleep(2000)
	}


	@When("I enter (.*) to delete record in problem list")
	def I_click_on_delete_button(String Problem_Name) {
		Thread.sleep(5000)
		
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.problem']//table)[2]//tbody"))
		List<WebElement> Table1=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.problem']//table)[2]//tbody//tr//td[3])"))

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
		System.out.println("before delete "+s1)
		for( ;i<=s1;i++) {
			String xpathd1 = "(//div[@data-mz-key='clinical.problem']//table)[2]//tr[" +i +"]//td[3]"

			td1.addProperty('xpath', ConditionType.EQUALS, xpathd1)

			text1= WebUI.getText(td1)

			if(text1==Problem_Name) {
				break
			}
		}
		TestObject td2 = new TestObject('delete')

		String xpathd2 = "(//div[@data-mz-key='clinical.problem']//table)[2]//tr[" +i +"]//td[12]//button"

		td2.addProperty('xpath', ConditionType.EQUALS, xpathd2)

		WebUI.click(td2)


		WebUI.switchToDefaultContent()

	}


	@Then("I enter (.*) in problem name field")
	def  user_enter_problem_in_problem_field(String Code_Name){


		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_inputcode'),
				GlobalVariable.timeout)

		'Set the text cho in problem filed to select Problem'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_inputcode'), Code_Name)

		Thread.sleep(4000)
		//
		WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_inputcode'), Keys.chord(
				Keys.TAB))
	}



	@And ("I enter (.*) in problem start date field")
	def user_enter_start_date(String Start_Date) {
		'Set the Date'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_Date'), Start_Date)
	}
	@And("I enter (.*) in problem severity field")
	def user_set_severity_by_drop_down(String Severity){
		'Click on Severity button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_SeverityType'))




		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)


		String xpath = ('//li[text()="' + Severity) + '"]'

		TestObject t1 = new TestObject('Mild')

		t1.addProperty('xpath', ConditionType.EQUALS, xpath)

		WebUI.click(t1)

		WebUI.switchToDefaultContent()


		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_li_Mild'),
		//				GlobalVariable.timeout)
		//
		//		'Select the Severity to moderate'
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_li_Mild'))
	}


	@And("I enter (.*) in problem type field")
	def  user_set_type_by_drop_down(String type) {
		'Click on Type'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_Type'))


		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath2 = ('//li[text()="' + type) + '"]'

		TestObject t2 = new TestObject('Mild')

		t2.addProperty('xpath', ConditionType.EQUALS, xpath2)

		WebUI.click(t2)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_li_Finding'),
		//				GlobalVariable.timeout)
		//
		//		'Set the type'
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_li_Finding'))
	}

	@And("I enter (.*) in problem status field")
	def user_set_status_by_drop_down(String Status) {
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_Status'))

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath3 = ('(//li[text()="' + Status) + '"])[5]'

		TestObject t3 = new TestObject('Mild')

		t3.addProperty('xpath', ConditionType.EQUALS, xpath3)

		WebUI.click(t3)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_li_Inactive'),
		//				GlobalVariable.timeout)
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_li_Inactive'))
	}

	@And("I enter (.*) in problem rank field")
	def user_set_rank_by_drop_down(String Rank) {
		'Click on the rank Dropdown'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_Rank'))


		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath4 = ('//li[text()="' + Rank) + '"]'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_li_Principal'),
		//				GlobalVariable.timeout)
		//
		//		'Select the Rank Principal'
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_li_Principal'))
	}

	@And("I click on problem Save All button")
	def user_click_on_save_all_button() {
		'Press the Save Button to save the things'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_button_Save All'))
	}


	@Then("I should see message of success for (.*) record")
	def saved_alerts_shoud_be_popup(String module) {
		if(module=='adding')
			obj.verifyNotificationMessage(DataFactory.clinical_xpath_add,DataFactory.clinical_add_notification)
		else if(module=='editing')
			obj.verifyNotificationMessage(DataFactory.clinical_xpath_edit,DataFactory.clinical_edit_notification)
		else if(module=='deleting')
			obj.verifyNotificationMessage(DataFactory.clinical_xpath_del,DataFactory.clinical_del_notification)
	}

	@Then("I should see message of success: (.*) for following (.*)")
	void saved_alerts_shoud_be_popup(String dynamicid,String message) {
		obj.verifyNotificationMessage(dynamicid,message)
	}



	@Then("I should see success message for added problem")
	def saved_alerts_shoud_be_popup() {
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'), 'successRecord saved successfully.Hide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'),
				GlobalVariable.timeout)
	}


	@Then("I should see success message for edit problem")
	def updted_alerts_shoud_be_popup() {
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_AlertUpdate'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_AlertUpdate'),
				'successRecord updated successfully.Hide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_AlertUpdate'),
				GlobalVariable.timeout)
	}


	@Then("I should see success message for deleted record")
	def deleted_alerts_shoud_be_popup() {
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_AlertDelete'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_AlertDelete'),
				'successRecord deleted successfully.Hide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_AlertDelete'),
				GlobalVariable.timeout)
	}



	@And("I should see the newly added (.*) and (.*) and (.*) and (.*) and (.*) problem on grid")
	def very_data_should_be_visible_on_the_UI(String Code_Name, String Start_Date, String Severity, String Status, String Rank){
		'Verify the Entered Data'
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_td_Cholera'), Code_Name)

		String date= Stringtext.planetext(Start_Date)
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_td_date'), date)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_td_Moderate'), Severity)
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_td_type'),
		//				findTestData('DF_CMRData/DF_ClinicalSection/TD_ADDProblemList').getValue(7, 1))

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_td_status'), Status)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_td_rank'), Rank)
	}


	@And("I should see the deleted problem not present on grid")
	def very_deleted_data_should_benot_visible_on_the_UI(){
		'Verify the record gone from UI'

		Thread.sleep(3000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Refresh button/Obj_refreshbutton'))

		//		WebElement refresh=driver.findElement(By.xpath("//span[@class='k-icon k-i-refresh']"))
		//		refresh.click()
		Thread.sleep(9000)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.problem']//table)[2]//tbody"))
		List<WebElement> Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.problem']//table)[2]//tbody//tr//td[3])"))
		Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.problem']//table)[2]//tbody//tr//td[3])"))
		s2=Table2.size()
		s1=s1-1
		System.out.println("After delte s1= "+s1)

		System.out.println("After delte s2= "+s2)
		WebUI.verifyEqual(s1, s2)
		WebUI.switchToDefaultContent()
	}

}