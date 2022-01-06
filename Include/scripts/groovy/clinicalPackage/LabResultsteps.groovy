package clinicalPackage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
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

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

import cucumber.api.java.en.But

public class LabResultsteps {
	WebDriver driver = DriverFactory.getWebDriver()

	public static int s1,s2

	@When("I click on Lab Results	tab")
	public void I_click_on_lab_results_button() {

		'Press the Lab Results Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Lab ResultsTab'))
		Thread.sleep(2000)
		}

	@And("I enter lab results (.*)")
	public void addpanel_for_lab_results(String panel) {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_buttonAddPanel'),
				GlobalVariable.timeout)
		Thread.sleep(2000)
		'Press the Add Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_buttonAddPanel'))

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/span_select'),
				GlobalVariable.timeout)

		Thread.sleep(3000)
		'Click on Panel add button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/span_select'))

		Thread.sleep(1000)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath1 = ('//li[text()="' + panel) + '"]'

		TestObject t1 = new TestObject('Mild')

		t1.addProperty('xpath', ConditionType.EQUALS, xpath1)

		WebUI.click(t1)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_LipidPanel'),
		//				GlobalVariable.timeout)
		//
		//		'Add Lipd Panel'
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_LipidPanel'))

		'Press OK Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_button_OK'))
		Thread.sleep(2000)
		}

	@And("I click on lab results Add Analyte button")
	public void I_add_analyte_for_labresults() {
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Add Analyte'),
				GlobalVariable.timeout)

		Thread.sleep(2000)
		'Click on Add Analyte Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Add Analyte'))
		Thread.sleep(2000)
		}


	@And("I click on lab result panel first row Edit button")
	public void I_edit_panelrow_for_labresults() {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/button_EditPanel'),
				GlobalVariable.timeout)
		Thread.sleep(1000)
		'Press the Add Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/button_EditPanel'))
	}

	@When("I enter (.*) to delete panel in lab results")
	def I_click_on_delete_button(String Problem_Name) {
		Thread.sleep(5000)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.lab']//table)[2]//tbody"))
		List<WebElement> Table1=	driver.findElements(By.xpath("(//div[@data-mz-key='clinical.lab']//table)[2]//tr//span[@title='Source: Persivia']//parent::td"))

		//	List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		//	int rows_count = rows_table.size()
		//	System.out.println(Table1.get(1).getText())
		//	System.out.println("rows are= " + rows_count)
		//System.out.println(Table1.size())
		//System.out.println(Table1.get(1).getText())
		'Click on Delete Button'

		TestObject td1 = new TestObject('Mild')

		int i=1, size, size2
		String text1
		s1=Table1.size()
		//System.out.println(size)
		for( ;i<=1;i++) {
			System.out.println("inside loop=")
			String xpathd1 = "((//div[@data-mz-key='clinical.lab']//table)[2]//tr//span[@title='Source: Persivia']//parent::td)[" +i +"]"

			System.out.println("xpathd1 before loop exit= " +xpathd1)
			System.out.println("i in the loop before exit= " +i)

			td1.addProperty('xpath', ConditionType.EQUALS, xpathd1)

			text1= WebUI.getText(td1)
			WebUI.verifyElementText(td1, Problem_Name)

			System.out.println("text= " +text1)

			if(text1==Problem_Name) {
				break
			}
		}
		TestObject td2 = new TestObject('delete')

		String xpathd2 = "((//div[@data-mz-key='clinical.lab']//table)[2]//tr//td[4]//span[@title='Delete Panel'])[" +i+"]"

		System.out.println("xpathd2 delete button after loop exit= " +xpathd2)
		System.out.println(" i after loop exit= " +i)
		td2.addProperty('xpath', ConditionType.EQUALS, xpathd2)

		WebUI.click(td2)


		WebUI.switchToDefaultContent()

	}

	@And("I enter (.*) in lab results analyte field")
	public void lab_test_analyte_lab_results(String analyte) {
		'Enter the text a to select the Analyte'
		Thread.sleep(1000)
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_inputAnalyte_code'), analyte)

		Thread.sleep(2000)
	}

	@And("I enter (.*) in lab results date field")
	public void I_enter_date_for_lab_results(String date) {
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Date'))

		'Enter the Date'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Date'), date)
	}

	@And("I enter (.*) in lab results time field")
	public void I_set_the_the_time_for_labresults(String time) {
		'Click on time button\r\n'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_time'))


		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath2 = ('//li[text()="' + time) + '"]'

		TestObject t2 = new TestObject('Mild')

		t2.addProperty('xpath', ConditionType.EQUALS, xpath2)

		WebUI.click(t2)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_Time'),
		//				GlobalVariable.timeout)
		//
		//		'Select the desired time'
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_Time'))
	}

	@And("I enter (.*) in lab results result_type field")
	public void I_set_the_result_type_for_labresults(String resulttype) {
		Thread.sleep(1000)
		'Click on button to select result type'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_result'))

		Thread.sleep(1000)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath3 = ('//li[text()="' + resulttype) + '"]'

		TestObject t3 = new TestObject('Mild')

		t3.addProperty('xpath', ConditionType.EQUALS, xpath3)

		WebUI.click(t3)

		WebUI.switchToDefaultContent()


		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_CD LOINC'),
		//				GlobalVariable.timeout)
		//
		//		'Select te desired result type'
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_CD LOINC'))
	}

	@And("I enter (.*) in lab results value field")
	public void I_enter_Value_for_labresults(String value) {
		'enter text a\r\n'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_inputourceValue'),value)

		Thread.sleep(2000)
	}

	@And("I enter (.*) in lab results flag field")
	public void I_set_the_flag_for_lab_results(String flag) {

		'Click on Flag Dropdown'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_flag'))


		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath4 = ('//li[text()="' + flag) + '"]'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()



		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_Abnormal alert'),
		//				GlobalVariable.timeout)
		//
		//		'Select the Flag Alert type'
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_Abnormal alert'))
	}

	@And("I enter (.*) in lab results normal range field")
	public void I_enter_the_range_for_lab_results(String range) {
		'Enter the Range'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_inputrange'),range)

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_fa fa-view-notes'),
				GlobalVariable.timeout)
	}

	@And("I enter (.*) in lab results status field")
	public void I_set_the_status_for_labresults(String status) {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_status'))


		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath5 = ('//li[text()="' + status) + '"]'

		TestObject t5 = new TestObject('Mild')

		t5.addProperty('xpath', ConditionType.EQUALS, xpath5)

		WebUI.click(t5)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_aborted'),
		//				GlobalVariable.timeout)
		//
		//		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_li_aborted'))
	}

	@And("I enter (.*) in lab results notes field")
	public void I_enter_the_notes_for_labresults(String notes) {
		'Click on Comment button'
		Thread.sleep(1000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_fa fa-view-notes'))

		'Enter the comments\r\n'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_ab-notes txtstuff'), notes)
		Thread.sleep(1000)
	}

	@And("I click on lab results Save All button")
	public void saveall_button_save_lab_results_record() {
		'Press the Save Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_button_Save All'))
	}

	@Then("I should see success message for added lab results")
	public void record_saved_successfully_alert_should_popup_for_labresults() {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Alertsaved'), GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Alertsaved'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Alertsaved'),'successRecord saved successfully.Hide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Alertsaved'),
				GlobalVariable.timeout)
	}

	@Then("I should see success message for deleted lab result panel")
	public void panel_deleted_successfully_alert_should_popup_for_labresults() {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Alertdeletepanel'), GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Alertdeletepanel'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Alertdeletepanel'),
				'successLab panel deleted successfullyHide')


		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_Alertdeletepanel'),
				GlobalVariable.timeout)
	}



	@And("I should see the newly added (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) lab results on grid")
	public void addeddata_visible_on_the_UI_for_lab_results(String panel, String test1, String test2, String test3, String test4, String result, String value, String flag, String range, String status) {
		'Verify the Entered Data'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_panel'), panel)

		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_ptext1'), test1)
		//
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_ptext2'), test2)
		//
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_ptext3'), test3)
		//
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_ptext4'), test4)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_result'), result)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_value'), value)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_flag'), flag)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_range'),range)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_LabResults/Obj_td_status'),status)
	}


	@And("I should see the deleted lab results not present on grid")
	def very_deleted_data_should_benot_visible_on_the_UI(){
		'Verify the record gone from UI'

		Thread.sleep(3000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Refresh button/Obj_refreshbutton'))

		//		WebElement refresh=driver.findElement(By.xpath("//span[@class='k-icon k-i-refresh']"))
		//		refresh.click()
		Thread.sleep(9000)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.problem']//table)[2]//tbody"))
		List<WebElement> Table2=	driver.findElements(By.xpath("(//div[@data-mz-key='clinical.lab']//table)[2]//tr//span[@title='Source: Persivia']//parent::td"))
		Table2=	driver.findElements(By.xpath("(//div[@data-mz-key='clinical.lab']//table)[2]//tr//span[@title='Source: Persivia']//parent::td"))
		s2=Table2.size()
		System.out.println("s1 before minus= " +s1)

		s1=s1-1

		System.out.println("s1 after minus= " +s1)
		System.out.println("s2 after delete= " +s2)

		WebUI.verifyEqual(s1, s2)
		WebUI.switchToDefaultContent()
	}
}
