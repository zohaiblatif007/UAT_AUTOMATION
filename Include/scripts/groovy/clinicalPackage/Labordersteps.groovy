package clinicalPackage
import org.openqa.selenium.By
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

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS




class Labordersteps {
	WebDriver driver = DriverFactory.getWebDriver()

	public static int s1,s2

	public static int edit=0;
	@When("I click on Lab Orders	tab")
	public void I_click_on_laborder_button() {
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_Lab OrdersTab'),
				GlobalVariable.timeout)
		Thread.sleep(2000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_Lab OrdersTab'))
		Thread.sleep(2000)
		WebUI.click(findTestObject('OR_Telehealth/Obj_Telehealth'))

		WebUI.dragAndDropByOffset(findTestObject('OR_Telehealth/Obj_Telehealth'), -300, 0)
	}

	@And("I click on lab orders Add button")
	public void I_click_on_add_button_to_add_lab_order() {
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_button_Add'),
				GlobalVariable.timeout)
		Thread.sleep(2000)

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_button_Add'))
		Thread.sleep(2000)
	}


	@And("I click on lab orders Edit button")
	public void I_click_on_edit_button_to_add_lab_order() {
		edit=1;
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/button_Edit'),
				GlobalVariable.timeout)

		Thread.sleep(2000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/button_Edit'))

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_panelDeleteEdit'),
				GlobalVariable.timeout)

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_panelDeleteEdit'))
		Thread.sleep(2000)
	}


	@When("I enter (.*) to delete record in lab order")
	def I_click_on_delete_button(String Problem_Name) {
		Thread.sleep(5000)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.labOrder']//table)[2]//tbody"))
		List<WebElement> Table1=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.labOrder']//table)[2]//tbody//tr//td[2])"))

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
			String xpathd1 = "(//div[@data-mz-key='clinical.labOrder']//table)[2]//tr[" +i +"]//td[2]"

			td1.addProperty('xpath', ConditionType.EQUALS, xpathd1)

			text1= WebUI.getText(td1)

			if(text1==Problem_Name) {
				break
			}
		}
		TestObject td2 = new TestObject('delete')

		String xpathd2 = "(//div[@data-mz-key='clinical.labOrder']//table)[2]//tr[" +i +"]//td[6]//button"

		td2.addProperty('xpath', ConditionType.EQUALS, xpathd2)

		WebUI.click(td2)


		WebUI.switchToDefaultContent()

	}

	@And("I enter (.*) in lab order laboratory field")
	public void I_select_laboratary_from_dropdown(String Laboratory) {
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_selectLabortry'),
				GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_selectLabortry'))
		Thread.sleep(1000)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)


		String xpath = ('//li[text()="' + Laboratory) + '"]'

		TestObject t1 = new TestObject('Mild')

		t1.addProperty('xpath', ConditionType.EQUALS, xpath)

		WebUI.click(t1)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/li_Quest Diagnostics'),
		//				GlobalVariable.timeout)
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/li_Quest Diagnostics'))
	}


	@And("I enter (.*) in lab order order provider field")
	public void select_orderprovider_from_dropdown(String Order_Provider) {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_OrderProvider'),
				GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_OrderProvider'))
		Thread.sleep(1000)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath2 = ('//li[text()="' + Order_Provider) + ' "]'

		TestObject t2 = new TestObject('Mild')

		t2.addProperty('xpath', ConditionType.EQUALS, xpath2)

		Thread.sleep(1000)
		WebUI.click(t2)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_liCare Manager'),
		//				GlobalVariable.timeout)
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_liCare Manager'))
	}




	@And("I enter (.*) in lab orders date field")
	public void I_enter_date_for_order_in_lab(String date) {
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/input_Date_labDate'), date)
	}

	@And("I add (.*) in lab order")
	public void I_add_panel_from_add_panel_for_laborder(String panel) {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_button_Add Panel'))

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_panelSelect'),
				GlobalVariable.timeout)

		//WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/input_Date_lipdDate - Copy'), '01/28/2021 13:57')
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_panelSelect'))




		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath2 = ('//li[text()="' + panel) + '"]'
		//		String xpath2 = 'li[contains(text(),"' + panel + '")]'

		TestObject t2 = new TestObject('Mild')

		t2.addProperty('xpath', ConditionType.EQUALS, xpath2)

		WebUI.click(t2)

		WebUI.switchToDefaultContent()


		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/li_LipidPanel'),
		//				GlobalVariable.timeout)
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/li_LipidPanel'))

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_button_OK'))
	}

	@And("I enter (.*) in lab orders stat field")
	public void STAT_from_checkbox_for_laborder(String stat) {
		if(stat=='Yes') {
			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/input'))
			Thread.sleep(1000)
		}
	}

	@And("I enter (.*) in lab order diagnosis field")
	public void I_set_the_diagnoses_for_laborder(String diagnosis) {
		String xpath3
		Thread.sleep(2000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_Diagnosisfloatwrap'))

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
		if(edit==0) {
			xpath3 = ('(//li[text()="' + diagnosis) + ' "])'
		}
		if(edit==1) {
			xpath3 = ('(//li[text()="' + diagnosis) + ' "])[2]'
		}
		TestObject t3 = new TestObject('Mild')

		t3.addProperty('xpath', ConditionType.EQUALS, xpath3)
		Thread.sleep(1000)
		WebUI.click(t3)

		WebUI.switchToDefaultContent()



		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/li_A00.0 (Cholera due to Vibrio cholerae 01_3705b3'),
		//				GlobalVariable.timeout)
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/li_A00.0 (Cholera due to Vibrio cholerae 01_3705b3'))
	}

	@And("I click on lab order specimen drop down")
	public void specimen_template_for_laborder() {
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_Specimen'))
	}

	@And("I enter (.*) in lab order collection date field")
	public void collection_date_for_lab_order(String c_date) {
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/input_Collection Date_specimenDate0'),c_date )
	}

	@And("I enter (.*) in lab order type field")
	public void specimen_type_for_lab_order(String type) {
		Thread.sleep(1000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_Specimentype'))
		Thread.sleep(1000)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath4
		if(edit==0) {
			xpath4 = ('//li[text()="' + type) +'"]'
		}
		if(edit==1) {
			xpath4 = ('(//li[text()="' + type) +'"])[2]'
		}

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/li_Serum'),
		//				GlobalVariable.timeout)
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/li_Serum'))
	}

	@And("I enter (.*) in lab order specimen no. field")
	public void specimen_number_for_lab_order(String specimenno) {
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/input_Specimen No._specimenNo0'), specimenno)
	}

	@And("I enter (.*) in lab order notes field")
	public void notes_for_laborder(String notes) {
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/input_Notes_specimenNotes0'), notes)
	}

	@And("I click on lab order Save All button")
	public void saveall_button_to_save_lab_order_record() {
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_button_Save'))
	}

	@Then("I should see success message for added lab order")
	public void saved_successfully_alert_popup_for_laborder() {
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/div_successRecord saved successfully.Hide - Copy'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/div_successRecord saved successfully.Hide - Copy'), 'successLab Order Saved SuccessfullyHide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/div_successRecord saved successfully.Hide - Copy'),
				GlobalVariable.timeout)
	}

	@Then("I should see success message for edit lab order")
	public void edit_successfully_alert_popup_for_laborder() {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/div_successRecord saved successfully.Hide - Copy'), GlobalVariable.timeout)
		Thread.sleep(1000)

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/div_successRecord saved successfully.Hide - Copy'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/div_successRecord saved successfully.Hide - Copy'),
				'successLab Order Saved SuccessfullyHide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/div_successRecord saved successfully.Hide - Copy'),
				GlobalVariable.timeout)
	}

	@Then("I should see success message for deleted lab order")
	def deleted_alerts_shoud_be_popup() {
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/div_successRecord delted successfully.Hide'), GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/div_successRecord delted successfully.Hide'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/div_successRecord delted successfully.Hide'),
				'successLab Order Deleted SuccessfullyHide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/div_successRecord delted successfully.Hide'),
				GlobalVariable.timeout)
	}



	@And("I should see the newly added (.*) and (.*) lab order on grid")
	public void added_data_visible_on_the_UI_for_laborder(String Laboratary, String Panel) {

		Date today = new Date()

		String nowTime = today.format('HH:mm')

		String nowDate = today.format('MM/dd/yyyy')

		//		def yourText = (((((findTestData('DF_CMRData/DF_ClinicalSection/TD_LabOrders').getValue(7, 1)) + nowDate) + ' ') + nowTime) + findTestData('DF_CMRData/DF_ClinicalSection/TD_LabOrders').getValue(8, 1)) + '\n'+ findTestData('DF_CMRData/DF_ClinicalSection/TD_LabOrders').getValue(9, 1)
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_td_labtest'),
		//			yourText)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_td_labortry'), Laboratary)
		String paneltext= WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_td_panel'))

		//    	WebUI.verifyMatch(paneltext, Panel, false)
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Lab_Order/Obj_td_panel'), Panel)





	}


	@And("I should see the deleted lab order not present on grid")
	def very_deleted_data_should_benot_visible_on_the_UI(){
		'Verify the record gone from UI'

		Thread.sleep(3000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Refresh button/Obj_refreshbutton'))

		//		WebElement refresh=driver.findElement(By.xpath("//span[@class='k-icon k-i-refresh']"))
		//		refresh.click()
		Thread.sleep(9000)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.labOrder']//table)[2]//tbody"))
		List<WebElement> Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.labOrder']//table)[2]//tbody//tr//td[2])"))
		Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.labOrder']//table)[2]//tbody//tr//td[2])"))
		s2=Table2.size()
		s1=s1-1
		WebUI.verifyEqual(s1, s2)
		WebUI.switchToDefaultContent()
	}
}