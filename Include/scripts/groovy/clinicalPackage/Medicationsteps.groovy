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

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import groovypackage.Stringtext



class Medicationsteps {
	WebDriver driver = DriverFactory.getWebDriver()

	public static int s1,s2
	public static int edit=0;
	@When ("I click on Medication	tab")
	def I_click_on_medication_button(){
		'Press the Medication Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_MedicationsTab'))
	}


	@And("I click on medication Add button")
	def add_button_medication() {
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_button_Add'),
				GlobalVariable.timeout)
		Thread.sleep(2000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_button_Add'))
		Thread.sleep(2000)
		}

	@And("I click on medication Edit button")
	def edit_button_medication() {
		edit=1;

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/button_Edit'),
				GlobalVariable.timeout)

		Thread.sleep(2000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/button_Edit'))
		Thread.sleep(2000)
		}


	@When("I enter (.*) to delete record in medication")
	def I_click_on_delete_button(String Problem_Name) {
		Thread.sleep(5000)
		
		
		WebUI.click(findTestObject('OR_Telehealth/Obj_Telehealth'))
		WebUI.dragAndDropByOffset(findTestObject('OR_Telehealth/Obj_Telehealth'), -300, 0)
		
		
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.problem']//table)[2]//tbody"))
		List<WebElement> Table1=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.medication']//table)[2]//tbody//tr//td[3])"))

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
		System.out.println('before delete s1= '+ s1)
		for( ;i<=size;i++) {
			String xpathd1 = "(//div[@data-mz-key='clinical.medication']//table)[2]//tr[" +i +"]//td[3]"

			td1.addProperty('xpath', ConditionType.EQUALS, xpathd1)

			text1= WebUI.getText(td1)

			if(text1==Problem_Name) {
				break
			}
		}
		TestObject td2 = new TestObject('delete')

		String xpathd2 = "(//div[@data-mz-key='clinical.medication']//table)[2]//tr[" +i +"]//td//button"

		td2.addProperty('xpath', ConditionType.EQUALS, xpathd2)

		WebUI.click(td2)


		WebUI.switchToDefaultContent()

	}



	@And("I enter (.*) in medication source type field")
	def I_set_source_from_source_dropdown(String Source){
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_CodeSystem'),
				GlobalVariable.timeout)

		Thread.sleep(1000)
		'Click on the source field'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_CodeSystem'))



		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)


		String xpath = ('//li[text()="' + Source) + '"]'

		TestObject t1 = new TestObject('Mild')

		t1.addProperty('xpath', ConditionType.EQUALS, xpath)
		Thread.sleep(1000)
		WebUI.click(t1)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_li_MMSL'),
		//				GlobalVariable.timeout)
		//
		//		'Select the source value'
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_li_MMSL'))
	}


	@And("I enter (.*) in medication name field")
	def I_enter_name_of_medication(String Name){
		'enter medication name'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_cmtake_code'), Name)
		Thread.sleep(1000)
	}

	@And("I enter (.*) in medication frequency field")
	def I_set_frquenccy_from_dropdown(String Frequency){
		'Click on Frequency field'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_frquency'))

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)


		String xpath2 = ('//li[text()="' + Frequency) + '"]'

		TestObject t2 = new TestObject('Mild')

		t2.addProperty('xpath', ConditionType.EQUALS, xpath2)

		WebUI.click(t2)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_li_frquency'),
		//				GlobalVariable.timeout)
		//
		//		'Select frequency'
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_li_frquency'))

		Thread.sleep(1000)
	}

	@And("I enter (.*) in medication route field")
	def I_set_route_from_dropdown(String Route){
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_RouteSelect'))


		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)


		String xpath3 = ('//li[text()="' + Route) + '"]'

		TestObject t3 = new TestObject('Mild')

		t3.addProperty('xpath', ConditionType.EQUALS, xpath3)
		Thread.sleep(1000)
		WebUI.click(t3)

		WebUI.switchToDefaultContent()


		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_Aricular'),
		//				GlobalVariable.timeout)
		//
		//		'Select the Route'
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_Aricular'))
	}

	@And("I enter (.*) in medication start date field")
	def I_enter_start_date(String s_Date){
		'Set the Date'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_Date'), s_Date)
	}


	@And("I enter (.*) in medication prescribed by type field")
	def I_set_prescribed_by_from_dropdown(String Presribedby){
		'Click on Prescribed by filed'
		Thread.sleep(1000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_li_yet, another'))


		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)


		String xpath4 = '(//li[contains(text(),"' + Presribedby + '")])[2]'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_li_Mason'),
		//				GlobalVariable.timeout)
		//
		//		'Select who Prescribed the Medication'
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_li_Mason'))
	}

	@And("I enter (.*) in medication cpoe field")
	def I_click_in_check_box_to_check_the_CPOE(String cpoe){
		'Select CPOAE'
		if(edit==1 && cpoe=='No') {
			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_CPOAE'))
		}
		if(edit==0 && cpoe=='Yes') {
			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_CPOAE'))
		}
	}

	@And("I enter (.*) in medication esent field")
	def I_click_in_check_box_to_check_the_eSent(String esent){

		'Select eSent'
		if(edit==1 && esent=='No') {
			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_CmtakeEsent'))
		}
		if(edit==0 && esent=='Yes') {
			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_CmtakeEsent'))
		}
	}


	@And("I enter (.*) in medication drug formulacy status field")
	def I_click_in_check_box_to_check_the_Drug_formulacy(String drugformulacy){
		'Select DrugFormulacy'

		if(edit==1 && drugformulacy=='No') {
			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_CmtakeFormulary'))
		}
		if(edit==0 && drugformulacy=='Yes') {
			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_CmtakeFormulary'))
		}
	}

	@And("I enter (.*) in medication directions field")
	def I_enter_the_directions_for_medication(String direction){
		'Entered  the Dierctions'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_cmtake_comments'), direction)
	}

	@And("I click on medication Save All button")
	def I_click_on_save_all_button_to_save_medication_record(){

		'Click on Saved Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_button_Save All'))
	}



	@And("I should see success message for added medication")
	def saved_alerts_shoud_be_popup_if_medication_record_saved(){

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_AlertSavedchanges'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_AlertSavedchanges'),'successChanges saved successfully.Hide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'),
				GlobalVariable.timeout)
	}

	@And("I should see success message for edit medication")
	def edit_alerts_shoud_be_popup_if_medication_record_saved(){

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_AlertSavedchanges'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_AlertSavedchanges'),
				'successChanges saved successfully.Hide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'),
				GlobalVariable.timeout)
	}




	@And("I should see the newly added (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) medication on grid")
	def very_data_of_medication_should_be_visible_on_the_UI(String Source_Type, String Name, String Frequency, String Route, String Start_Date, String CPOE, String eSent, String Drug_Formulacy, String Directions){

		'Verify the Entered Data'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_source'), Source_Type)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_name'),Name)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_frequency'), Frequency)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_route'), Route)

		String sdate = Stringtext.planetext(Start_Date)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_startdate'), sdate)

		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_prescribedby'),findTestData(
		//				'DF_CMRData/DF_ClinicalSection/TD_ADDMedication').getValue(10, 1))

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_spoea'), CPOE)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_esent'), eSent)
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_drug'), Drug_Formulacy)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Medication/Obj_td_direction'), Directions)
	}

	@And("I should see the deleted medication not present on grid")
	def very_deleted_data_should_benot_visible_on_the_UI(){
		'Verify the record gone from UI'

		Thread.sleep(3000)
		s1=s1-1
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Refresh button/Obj_refreshbutton'))

		//		WebElement refresh=driver.findElement(By.xpath("//span[@class='k-icon k-i-refresh']"))
		//		refresh.click()
		Thread.sleep(9000)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.problem']//table)[2]//tbody"))
		List<WebElement> Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.medication']//table)[2]//tbody//tr//td[3])"))
		Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.medication']//table)[2]//tbody//tr//td[3])"))
		s2=Table2.size()

		System.out.println("After delte s1= "+s1)

		System.out.println("After delte s2= "+s2)
		WebUI.verifyEqual(s1, s2)
		WebUI.switchToDefaultContent()
	}


}