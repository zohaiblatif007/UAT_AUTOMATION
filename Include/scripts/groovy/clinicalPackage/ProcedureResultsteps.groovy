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
import cucumber.api.java.en.When
import groovypackage.Stringtext
import internal.GlobalVariable



class ProcedureResultsteps {
	WebDriver driver = DriverFactory.getWebDriver()

	public static int s1,s2

	@When("I click on Procedure Results	tab")
	public void click_procedure_result_button() {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_Procedure ResultsTab'),
				GlobalVariable.timeout)
		WebUI.click(findTestObject('OR_Telehealth/Obj_Telehealth'))

		WebUI.dragAndDropByOffset(findTestObject('OR_Telehealth/Obj_Telehealth'), -300, 0)
		Thread.sleep(2000)
		'Click on Procedure Results Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_Procedure ResultsTab'))
		Thread.sleep(2000)
	}

	@And("I click on procedure results Add button")
	public void addbutton_add_procedure_result() {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_button_Add'),
				GlobalVariable.timeout)
		Thread.sleep(2000)

		'Click on Add Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_button_Add'))
		Thread.sleep(2000)
		}


	@And("I click on procedure results Edit button")
	public void addbutton_edit_procedure_result() {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/button_Edit'),
				GlobalVariable.timeout)
		Thread.sleep(2000)
		'Click on Edit Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/button_Edit'))
		Thread.sleep(2000)
		}


	@When("I enter (.*) to delete record in procedure results")
	def I_click_on_delete_button(String Problem_Name) {
		Thread.sleep(5000)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.procedure']//table)[2]//tbody"))
		List<WebElement> Table1=	driver.findElements(By.xpath("(//div[@data-mz-key='clinical.procedure']//table)[2]//span[@class='input-source persivia']//parent::td//parent::tr"))

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
		System.out.println(s1)
		for( ;i<=s1;i++) {
			String xpathd1 = "((//div[@data-mz-key='clinical.procedure']//table)[2]//span[@class='input-source persivia']//parent::td//parent::tr)[" +i +"]//td[2]"



			td1.addProperty('xpath', ConditionType.EQUALS, xpathd1)

			text1= WebUI.getText(td1)

			if(text1==Problem_Name) {
				break
			}
		}
		TestObject td2 = new TestObject('delete')

		String xpathd2 = "((//div[@data-mz-key='clinical.procedure']//table)[2]//span[@class='input-source persivia']//parent::td//parent::tr)[" +i +"]//td[13]//button"

		td2.addProperty('xpath', ConditionType.EQUALS, xpathd2)

		WebUI.click(td2)


		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in procedure results source field")
	public void source_for_procedureresult(String Source) {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_CodeSystem'),
				GlobalVariable.timeout)

		'Click on Source Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_CodeSystem'))

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath1 = ('//li[text()="' + Source) +'"]'

		TestObject t1 = new TestObject('Mild')

		t1.addProperty('xpath', ConditionType.EQUALS, xpath1)

		WebUI.click(t1)

		WebUI.switchToDefaultContent()
		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_li_HPC'),
		//				GlobalVariable.timeout)
		//
		//		'Select HPC'
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_li_HPC'))
	}

	@And("I enter (.*) in procedure results procedure field")
	public void enter_procedure_procedure_field(String Procedure) {

		'Set text a in the field of Procedure'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_inputcode'), Procedure)

		Thread.sleep(3000)

		WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_inputcode'), Keys.chord(
				Keys.TAB))
	}

	@And("I enter (.*) in procedure results date field")
	public void startdate_for_procedureresult(String Date) {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_Date'))

		'Set the Date'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_Date'), Date)
	}

	@And("I enter (.*) in procedure results target site field")
	public void targetsite_for_procedure_result(String Target_Site) {
		'Set the text a in Target Site'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_input_Site'),Target_Site)
		Thread.sleep(3000)

		WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_input_Site'), Keys.chord(
				Keys.TAB))
	}

	@And("I enter (.*) in procedure results status field")
	public void status_for_procedure_result(String Status) {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_Status'))

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
		String xpath2
		if(Status=='Active') {
			xpath2 = ('(//li[text()="' + Status) +'"])[5]'
		}
		if(Status=='Completed') {
			xpath2 = ('(//li[text()="' + Status) +'"])'
		}

		TestObject t2 = new TestObject('Mild')

		t2.addProperty('xpath', ConditionType.EQUALS, xpath2)

		WebUI.click(t2)

		WebUI.switchToDefaultContent()


		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_li_Active'),
		//				GlobalVariable.timeout)
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_li_Active'))
	}

	@And("I enter (.*) in procedure results reason field")
	public void reasons_procedureresult(String Reason) {

		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_inputreasonCode'),Reason)

		Thread.sleep(2000)

		WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_inputreasonCode'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in procedure results service delivery location field")
	public void service_deliverylocation_for_procedure_result(String Service_Delivery_Location) {

		'Select Service Delivery Location'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_inputserviceDelivery'),Service_Delivery_Location)
	}

	@And("I click on procedure result Update button")
	public void updatebutton_save_procedureresult_record() {
		'Click on Update Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_Update'))
	}


	@And("I should see success message for added procedure result")
	public void record_saved_successfully_alertpopup_procedureresult() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'), 'successRecord saved successfully.Hide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'),
				GlobalVariable.timeout)
	}


	@And("I should see success message for edit procedure result")
	public void record_edit_successfully_alertpopup_procedureresult() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_AlertUpdate'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_AlertUpdate'),
				'successRecord updated successfully.Hide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_AlertUpdate'),
				GlobalVariable.timeout)
	}


	@And("I should see the newly added (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) procedure result on grid")
	public void addeddata_visible_procedureresult(String Source, String Procedure, String Date, String Target_Site, String Status, String Reason, String Service_Delivery_Location) {

		'Verify the Entered Data'
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_td_source'), Source)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_td_procedure'), Procedure)

		String dat = Stringtext.planetext(Date)
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_td_startdate'), dat)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_td_targetsite'), Target_Site)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_td_status'), Status)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_td_reason'), Reason)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProcedureResult/Obj_td_serviceD_L'), Service_Delivery_Location)
	}


	@And("I should see the deleted procedure result not present on grid")
	def very_deleted_data_should_benot_visible_on_the_UI(){
		'Verify the record gone from UI'

		Thread.sleep(3000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Refresh button/Obj_refreshbutton'))

		//		WebElement refresh=driver.findElement(By.xpath("//span[@class='k-icon k-i-refresh']"))
		//		refresh.click()
		Thread.sleep(9000)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.procedure']//table)[2]//tbody"))
		List<WebElement> Table2=	driver.findElements(By.xpath("(//div[@data-mz-key='clinical.procedure']//table)[2]//span[@class='input-source persivia']//parent::td//parent::tr"))
		//		Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.procedure']//table)[2]//tbody//tr//td[2])"))
		s2=Table2.size()
		s1=s1-1
		WebUI.verifyEqual(s1, s2)
		WebUI.switchToDefaultContent()
	}
}