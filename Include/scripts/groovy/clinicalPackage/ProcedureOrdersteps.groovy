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



class ProcedureOrdersteps {
	WebDriver driver = DriverFactory.getWebDriver()

	public static int s1,s2

	public static int e=0
	@When("I click on Procedure Order	tab")
	public void procedureorder_button() {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Procedure OrderTab'),
				GlobalVariable.timeout)

		WebUI.click(findTestObject('OR_Telehealth/Obj_Telehealth'))

		WebUI.dragAndDropByOffset(findTestObject('OR_Telehealth/Obj_Telehealth'), -300, 0)
		Thread.sleep(2000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Procedure OrderTab'))
		Thread.sleep(2000)
		}

	@And("I click on Procedure order Add button")
	public void addbutton_to_add_procedureorder() {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_button_Add'),
				GlobalVariable.timeout)
		Thread.sleep(2000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_button_Add'))
		Thread.sleep(2000)
	}


	@And("I click on Procedure order Edit button")
	public void addbutton_to_edit_procedureorder() {
		e=1
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/button_Edit'),
				GlobalVariable.timeout)
		Thread.sleep(2000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/button_Edit'))
		Thread.sleep(1000)
	}


	@When("I enter (.*) to delete record in procedure order")
	def I_click_on_delete_button(String Problem_Name) {
		Thread.sleep(5000)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.procedureOrder']//table)[2]//tbody"))
		List<WebElement> Table1=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.procedureOrder']//table)[2]//tbody//tr//td[2])"))

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
			String xpathd1 = "(//div[@data-mz-key='clinical.procedureOrder']//table)[2]//tr[" +i +"]//td[2]"

			td1.addProperty('xpath', ConditionType.EQUALS, xpathd1)

			text1= WebUI.getText(td1)

			if(text1==Problem_Name) {
				break
			}
		}
		TestObject td2 = new TestObject('delete')

		String xpathd2 = "(//div[@data-mz-key='clinical.procedureOrder']//table)[2]//tr[" +i +"]//td[6]//button"

		td2.addProperty('xpath', ConditionType.EQUALS, xpathd2)
		Thread.sleep(1000)
		WebUI.click(td2)


		WebUI.switchToDefaultContent()

	}


	@And("I click on procedure order panel remove button")
	public void panelremove_procedureorder() {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_removepanel'),
				GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_removepanel'))
		Thread.sleep(1000)
	}


	@And("I enter (.*) in procedure order order provider field")
	public void order_provider_for_procedureorder(String Order_Provider) {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_OrderProvider'),
				GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_OrderProvider'))
		Thread.sleep(1000)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath1 = ('//li[text()="' + Order_Provider) + ' "]'

		TestObject t1 = new TestObject('Mild')

		t1.addProperty('xpath', ConditionType.EQUALS, xpath1)

		WebUI.click(t1)

		WebUI.switchToDefaultContent()
		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_li_Care Manager'),
		//				GlobalVariable.timeout)
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_li_Care Manager'))
	}

	@And("I enter (.*) in procedure order date field")
	public void date_procedureorder(String Date) {
		Thread.sleep(1000)
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_orderDate'), Date)
	}

	@And("I enter (.*) in procedure order procedure test type field")
	public void test_type_for_procedureorder(String Procedure_Test_Type) {
		Thread.sleep(1000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Procedure'))
		Thread.sleep(1000)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath2 = ('//li[text()="' + Procedure_Test_Type) + '"]'

		TestObject t2 = new TestObject('Mild')

		t2.addProperty('xpath', ConditionType.EQUALS, xpath2)


		WebUI.click(t2)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_li_HPC'),
		//				GlobalVariable.timeout)
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_li_HPC'))
	}

	@And("I enter (.*) in procedure order procedure test field")
	public void test_procedureorder(String Procedure_Test) {

		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_lab-observations'), Procedure_Test)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath4 = ('//li[text()="' + Procedure_Test) + '"]'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)
		Thread.sleep(1000)
		WebUI.click(t4)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_li_Outside state'),
		//				GlobalVariable.timeout)
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_li_Outside state'))
	}

	@And("I enter (.*) in procedure order effective date field")
	public void effectivedate_for_test_procedureorder(String Effective_Date) {
		Thread.sleep(1000)
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_effectiveDate0'),Effective_Date)
	}

	@And("I enter (.*) in procedure order diagnoses field")
	public void diagnoses_for_procedureorder(String Diagnoses) {
		Thread.sleep(1000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Diagnosisfloatwrap'))
		Thread.sleep(1000)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath3
		if(e==0) {
			xpath3 = ('//span[text()="' + Diagnoses) + '"]'
		}
		if(e==1) {
			xpath3 = ('(//span[text()="' + Diagnoses) + '"])[2]'
		}
		TestObject t3 = new TestObject('Mild')

		t3.addProperty('xpath', ConditionType.EQUALS, xpath3)
		Thread.sleep(1000)
		WebUI.click(t3)

		WebUI.switchToDefaultContent()
		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_li_A00.0 Cholera'),
		//				GlobalVariable.timeout)
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_li_A00.0 Cholera'))
	}

	@And("I enter (.*) in procedure order body site field")
	public void bodysite_for_procedureorder(String Body_Site) {

		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_input_Body Site'), Body_Site)


		Thread.sleep(2000)

		WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_input_Body Site'),
				Keys.chord(Keys.TAB))
		Thread.sleep(1000)
	}

	@And("I enter (.*) in procedure order comments field")
	public void comments_for_procedureorder(String Comments) {
		Thread.sleep(1000)
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Comments'), Comments)
		Thread.sleep(1000)
	}

	@And("I click on procedure order Save button")
	public void savebutton_to_procedureorder_record() {
		Thread.sleep(1000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_button_Save'))
	}

	@And("I should see success message for added procedure order")
	public void recordsaved_successfullyalertpopup_for_procedureorder() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Alertsavedy'))
		Thread.sleep(1000)
		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Alertsavedy'), 'successProcedure Order Saved SuccessfullyHide')


		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Alertsavedy'),
				GlobalVariable.timeout)

		'Verify that Alert Comes After Save Button Clicked'
	}


	@And("I should see success message for edit procedure order")
	public void recordedit_successfullyalertpopup_for_procedureorder() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Alertsavedy'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Alertsavedy'),
				'successProcedure Order Saved SuccessfullyHide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Alertsavedy'),
				GlobalVariable.timeout)
	}



	@And("I should see success message for deleted procedure order")
	public void recorddeleted_successfullyalertpopup_for_procedureorder() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Alertdeleted'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Alertdeleted'),
				'successProcedure order deleted successfully.Hide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/Obj_Alertdeleted'),
				GlobalVariable.timeout)
	}


	@And("I should see the newly added (.*) and (.*) and (.*) and (.*) and (.*) procedure order on grid")
	public void addeddata_onUI_for_procedureorder(String Order_Provider, String Date, String Prcedurevaidation1validation, String Prcedurevaidation2validation, String Prcedurevaidation3validation) {

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/td_oprovider'), Order_Provider)

		String dat = Stringtext.planetext(Date)
		String datweb= WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/td_date'))
		String dateweb = datweb.substring(0 , 10)
		WebUI.verifyMatch(dateweb, dat, false)


		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/td_proceduretest1'), Prcedurevaidation1validation)


		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/td_proceduretest2'), Prcedurevaidation2validation)


		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Procedure_Order/td_proceduretest3'), Prcedurevaidation3validation)
	}


	@And("I should see the deleted procedure order not present on grid")
	def very_deleted_data_should_benot_visible_on_the_UI(){
		'Verify the record gone from UI'

		Thread.sleep(3000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Refresh button/Obj_refreshbutton'))

		//		WebElement refresh=driver.findElement(By.xpath("//span[@class='k-icon k-i-refresh']"))
		//		refresh.click()
		Thread.sleep(9000)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.procedureOrder']//table)[2]//tbody"))
		List<WebElement> Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.procedureOrder']//table)[2]//tbody//tr//td[2])"))
		Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.procedureOrder']//table)[2]//tbody//tr//td[2])"))
		s2=Table2.size()
		s1=s1-1
		WebUI.verifyEqual(s1, s2)
		WebUI.switchToDefaultContent()
	}
}