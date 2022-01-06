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



class Vitalsignsteps {
	WebDriver driver = DriverFactory.getWebDriver()

	public static int s1,s2

	public static int e=0;

	@When("I click on Vital Sign	tab")
	public void I_click_on_vital_sign_button() {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_Vital SignsTab'),
				GlobalVariable.timeout)
		Thread.sleep(2000)
		'Click on Vital Sign Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_Vital SignsTab'))
		Thread.sleep(2000)
			}

	@When("I click on vital sign Add button")
	public void addbutton_to_add_vitalsign() {
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_button_Add'),
				GlobalVariable.timeout)
		Thread.sleep(2000)
		'Click on Add Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_button_Add'))
		Thread.sleep(2000)
		}


	@When("I click on vital sign Edit button")
	public void addbutton_to_edit_vitalsign() {
		e=1;
		Thread.sleep(2000)
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/button_Edit'),
				GlobalVariable.timeout)

		'Click on Edit Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/button_Edit'))
		Thread.sleep(2000)
		}


	@When("I enter (.*) to delete record in vital signs")
	def I_click_on_delete_button(String Problem_Name) {
		Thread.sleep(5000)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.vital.all']//table)[2]//tbody"))
		List<WebElement> Table1=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.vital.all']//table)[2]//tbody//tr//td[3])"))

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
			String xpathd1 = "(//div[@data-mz-key='clinical.vital.all']//table)[2]//tr[" +i +"]//td[3]"

			td1.addProperty('xpath', ConditionType.EQUALS, xpathd1)

			text1= WebUI.getText(td1)

			if(text1==Problem_Name) {
				break
			}
		}
		TestObject td2 = new TestObject('delete')

		String xpathd2 = "(//div[@data-mz-key='clinical.vital.all']//table)[2]//tr[" +i +"]//td[13]//button"

		td2.addProperty('xpath', ConditionType.EQUALS, xpathd2)

		WebUI.click(td2)


		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) and (.*) in vital sign observation date field")
	public void I_enter_date_for_vital_signs(String date, String time) {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_date'),
				GlobalVariable.timeout)

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_date'))

		'Set the Date'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_date'), date)


		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_ObservationDate'))


		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath1 = ('//li[text()="' + time) + '"]'

		TestObject t1 = new TestObject('Mild')

		t1.addProperty('xpath', ConditionType.EQUALS, xpath1)

		WebUI.click(t1)

		WebUI.switchToDefaultContent()

		//
		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_time'),
		//				GlobalVariable.timeout)
		//
		//		'Set the Time'
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_time'))
	}

	//	@And("I set the time for vital signs")
	//	public void I_set_the_time_for_vitalsigns() {
	//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_ObservationDate'))
	//
	//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_time'),
	//				GlobalVariable.timeout)
	//
	//		'Set the Time'
	//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_time'))
	//	}

	@And("I enter (.*) in vital sign temp field")
	public void temprature_for_vitalsign(String temp) {


		if(e==0) {
			WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputemperature'), temp)
		}
		if(e==1) {

			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputemperatureEdit1'))

			WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputemperatureEdit2'))

			WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputemperatureEdit1'),temp)

		}

	}


	@And("I enter (.*) in vital sign pulse field")
	public void pulse_for_vital_sign(String pulse) {

		'Enter the pulse'
		if(e==0) {
			WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inpupulse'), pulse)
		}
		if(e==1) {

			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inpupulse'))

			WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inpupulseINputEdit'))

			WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inpupulse'), pulse)
		}
	}

	@And("I enter (.*) in vital sign resp rate field")
	public void resp_rate_for_vitalsign(String Resp_Rate) {
		if(e==0) {
			'Enter the Resp Rate'
			WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_input_Respiratory'), Resp_Rate)
		}
		if(e==1) {

			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_input_Respiratory'))

			WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_input_RespiratoryEdit'))

			WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_input_Respiratory'),Resp_Rate)
		}
	}

	@And("I enter (.*) in vital sign sys field")
	public void systolic_for_vitalsign(String Sys_Bloodpressure) {

		'Enter the Systolic BP'
		if(e==0) {
			WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputDecrease'), Sys_Bloodpressure)
		}
		if(e==1) {

			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputDecrease'))

			WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputDecreaseEdit'))

			WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputDecrease'), Sys_Bloodpressure)
		}
	}

	@And("I enter (.*) in vital sign dia field")
	public void Diasistolic_bp_for_vitalsign(String Dia_Bloodpressure) {

		'Enter the Diasistolic_BP'
		if(e==0) {
			WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_input_diastolic'), Dia_Bloodpressure)
		}
		if(e==1) {

			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_input_diastolic'))

			WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_input_diastolicEdit'))

			WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_input_diastolic'), Dia_Bloodpressure)
		}
	}

	@And("I enter (.*) in vital sign weight field")
	public void  weight_for_vitalsign(String Weight) {
		'Enter the Weight'
		if(e==0) {
			WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputweight'), Weight)
		}
		if(e==1) {

			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputweight'))

			WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputweightEdit'))

			WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputweight'), Weight)
		}
	}

	@And("I enter (.*) in vital sign height field")
	public void height_for_vitalsign(String Height) {

		'Enter the Height'
		if(e==0) {
			WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputHeight'), Height)
		}
		if(e==1) {

			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputHeight'))

			WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputHeightEdit'))

			WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputHeight'),Height)
		}
	}

	@And("I enter (.*) in vital sign bmi field")
	public void bmi_for_vitalsign(String BMI) {
		'Enter the BMI Value'
		if(e==0) {
			WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputBMI'),BMI)
		}
		if(e==1) {

			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputBMI'))

			WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputBMIEdit'))

			WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputBMI'), BMI)
		}
	}

	@And("I enter (.*) in vital sign bsa field")
	public void bsa_for_vitalsign(String BSA) {
		'Enter the BSA Value'
		if(e==0) {
			WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputBSA'), BSA)
		}
		if(e==1) {

			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputBSA'))

			WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputBSAEdit'))

			WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputBSA'), BSA)
		}
	}

	@And("I enter (.*) in vital sign o2 sats field")
	public void   o2saturation_for_vitalsign(String O2_Sats) {

		'Enter the O2 Saturation Value'
		if(e==0) {
			WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputo2Saturation'), O2_Sats)
		}
		if(e==1) {

			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputo2Saturation'))

			WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputo2SaturationEdit'))

			WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputo2Saturation'),O2_Sats)
		}
	}

	@And("I enter (.*) in vital sign inhaled o2 concern field")
	public void inhaled_Oxygen_Concentration_for_vitalsign(String InhaledO2_Concern) {

		'Enter the value_inhaledOxygenConcentration'
		if(e==0) {
			WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputinhaledOxygen'),InhaledO2_Concern)
		}
		if(e==1) {

			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputinhaledOxygen'))

			WebUI.clearText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputinhaledOxygenEdit'))

			WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_inputinhaledOxygen'),InhaledO2_Concern)
		}
	}

	@And("I click on vital signs Save All button")
	public void saveall_button_to_save_vitalsign_record() {
		'Click on Saved Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_button_Save All'))
	}

	@Then("I should see success message for added vital signs")
	public void successfully_alertpopup_for_vitalsign() {
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'), 'successRecord saved successfully.Hide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'),
				GlobalVariable.timeout)
	}


	@Then("I should see success message for edit vital signs")
	public void edit_successfully_alertpopup_for_vitalsign() {
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_AlertUpdate'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_AlertUpdate'), 'successRecord updated successfully.Hide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_AlertUpdate'),
				GlobalVariable.timeout)
	}



	@And("I should see the newly added (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) vital signs on grid")
	public void added_data_visibleon_UI_for_vitalsign(String time, String Tempr, String Pulse, String Resp_Rate, String Sys_Bloodpressure, String Dia_Bloodpressure, String Weight, String Height, String BMI, String BSA, String O2_Sats, String InhaledO2_Concern) {
		def now = new Date().format('MM/dd/yyyy')

		def	temp = (now +' '+ time)

		'Verification of the given Data Whether its Correct or Not'
//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_ODate'),
//				temp)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_temp'), Tempr)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_pulse'), Pulse)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_RRate'), Resp_Rate)
		
//        String bloopre = Sys_Bloodpressure/Dia_Bloodpressure
//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_blodPre'),bloopre)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_weight'), Weight)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_height'), Height)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_BMI'), BMI)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_BSA'), BSA)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_wO2sat'), O2_Sats)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_VitalSigns/Obj_td_inhaledO2'), InhaledO2_Concern)
	}


	@And("I should see the deleted vital signs not present on grid")
	def very_deleted_data_should_benot_visible_on_the_UI(){
		'Verify the record gone from UI'

		Thread.sleep(3000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Refresh button/Obj_refreshbutton'))

		//		WebElement refresh=driver.findElement(By.xpath("//span[@class='k-icon k-i-refresh']"))
		//		refresh.click()
		Thread.sleep(9000)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.vital.all']//table)[2]//tbody"))
		List<WebElement> Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.vital.all']//table)[2]//tbody//tr//td[3])"))
		Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.vital.all']//table)[2]//tbody//tr//td[3])"))
		s2=Table2.size()
		s1=s1-1
		WebUI.verifyEqual(s1, s2)
		WebUI.switchToDefaultContent()
	}
}