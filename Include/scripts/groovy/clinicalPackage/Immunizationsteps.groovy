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
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import groovypackage.Stringtext
import internal.GlobalVariable



class Immunizationsteps {
	WebDriver driver = DriverFactory.getWebDriver()

	public static int s1,s2

	@When("I click on Immunizations	tab")
	def immunization_button() {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_ImmunizationsTab'),
				GlobalVariable.timeout)

		'Click on Immunization Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_ImmunizationsTab'))
	}

	@And("I click on immunizations Add button")
	def add_button_to_add_immunization(){
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_button_Add'),
				GlobalVariable.timeout)

		Thread.sleep(2000)
		'Click on Add Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_button_Add'))
		Thread.sleep(2000)
			}

	@And("I click on immunizations Edit button")
	def add_button_to_edit_immunization(){

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/button_Edit'),
				GlobalVariable.timeout)

		Thread.sleep(2000)
		'Click on Edit Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/button_Edit'))
		Thread.sleep(2000)
		}

	@When("I enter (.*) to delete record in immunization")
	def I_click_on_delete_button(String Problem_Name) {
		Thread.sleep(5000)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.vaccine']//table)[2]//tbody"))
		List<WebElement> Table1=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.vaccine']//table)[2]//tbody//tr//td[2])"))

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
			String xpathd1 = "(//div[@data-mz-key='clinical.vaccine']//table)[2]//tr[" +i +"]//td[2]"

			td1.addProperty('xpath', ConditionType.EQUALS, xpathd1)

			text1= WebUI.getText(td1)

			if(text1==Problem_Name) {
				break
			}
		}
		TestObject td2 = new TestObject('delete')

		String xpathd2 = "(//div[@data-mz-key='clinical.vaccine']//table)[2]//tr[" +i +"]//td[11]//button"

		td2.addProperty('xpath', ConditionType.EQUALS, xpathd2)

		WebUI.click(td2)


		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in immunizations source field")
	def I_set_source_forimmunization(String Source){
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/span_select'),
				GlobalVariable.timeout)

		'Click on Source drop down'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/span_select'))

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath = ('//li[text()="' + Source) + '"]'

		TestObject t1 = new TestObject('Mild')

		t1.addProperty('xpath', ConditionType.EQUALS, xpath)

		WebUI.click(t1)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/li_ICD-9'),
		//				GlobalVariable.timeout)
		//
		//		'Select Source'
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/li_ICD-9'))
	}

	@And("I enter (.*) in immunizations vaccine field")
	def I_enter_vaccine_for_immunization(String Vaccine){
		'Enter the Desired Vaccine'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_inputcode'), Vaccine)

		Thread.sleep(2000)
	}

	@And("I enter (.*) in immunizations date field")
	def date_for_immunization(String Date){
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_Date'))

		'Enter the Date'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_Date'), Date)
	}

	@And("I enter (.*) in immunizations status field")
	def status_for_immunization(String Status){
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_selectstatus'))

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath2
		if(Status== 'Completed') {
			xpath2= ('(//li[text()="' + Status) + '"])[2]'
		}

		if(Status=='Active') {
			xpath2= ('(//li[text()="' + Status) + '"])[5]'
		}
		if(Status=='Normal'||Status=='Aborted'||Status=='Cancelled') {
			xpath2= ('(//li[text()="' + Status) + '"])[2]'
		}
		TestObject t2 = new TestObject('Mild')

		t2.addProperty('xpath', ConditionType.EQUALS, xpath2)

		WebUI.click(t2)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/li_Normal'),
		//				GlobalVariable.timeout)
		//
		//		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/li_Normal'))
	}

	@And("I enter (.*) in immunizations lot number field")
	def lot_number_for_immunization(String Lot_Number){
		'Enter the Lot Number'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_inputlotNumber'), Lot_Number)
	}

	@And("I enter (.*) in immunizations manufacture name field")
	def manufacture_name_for_immunization(String Manufacture_Name){
		'Enter the Vaccination\r\n'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_inputmanufacturer'),Manufacture_Name)
	}

	@And("I enter (.*) in immunizations comment field")
	def I_the_comments_for_immunization(String Comment){
		'Entered the Comments'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_inputtextNote'), Comment)
	}

	@And("I click on immunnizations Update button")
	def update_button_to_save_immunizationrecord(){
		'Click on Update Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_Update'))
	}

	@Then("I should see success message for added immunnizations")
	def  saved_successfully_alertpopup_for_immunization(){
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'),'successRecord saved successfully.Hide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'),
				GlobalVariable.timeout)
	}


	@Then("I should see success message for edit immunnizations")
	def  edit_successfully_alertpopup_for_immunization(){

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_AlertUpdate'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_AlertUpdate'),
				'successRecord updated successfully.Hide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_AlertUpdate'),
				GlobalVariable.timeout)
	}


	@And("I should see added record (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) for immunnizations on grid")
	def added_data_should_be_visible_on_the_UI_for_immunization(String Source, String Vaccine, String Date, String Status, String Lot_Number, String Manufacture_Name, String Comment){
		'Verify the Entered data'
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_td_source'), Source)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_td_vaccine'), Vaccine)

		String dat= Stringtext.planetext(Date)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_td_startdate'), dat)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_td_status'), Status)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_td_lot'), Lot_Number)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_td_manofcture'), Manufacture_Name)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Immunization/Obj_td_comment'), Comment)
	}


	@And("I should see the deleted immunization not present on grid")
	def very_deleted_data_should_benot_visible_on_the_UI(){
		'Verify the record gone from UI'

		Thread.sleep(3000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Refresh button/Obj_refreshbutton'))

		//		WebElement refresh=driver.findElement(By.xpath("//span[@class='k-icon k-i-refresh']"))
		//		refresh.click()
		Thread.sleep(9000)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.vaccine']//table)[2]//tbody"))
		List<WebElement> Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.vaccine']//table)[2]//tbody//tr//td[2])"))
		Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.vaccine']//table)[2]//tbody//tr//td[2])"))
		s2=Table2.size()
		s1=s1-1
		WebUI.verifyEqual(s1, s2)
		WebUI.switchToDefaultContent()
	}
}