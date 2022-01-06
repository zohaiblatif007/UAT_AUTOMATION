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
import org.openqa.selenium.Keys as Keys

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import groovypackage.Stringtext



class Imagingresultsteps {
	WebDriver driver = DriverFactory.getWebDriver()

	public static int s1,s2

	@When("I click on Imaging Results	tab")
	public void imagingresults_button() {
		Thread.sleep(2000)
		WebUI.click(findTestObject('OR_Telehealth/Obj_Telehealth'))

		WebUI.dragAndDropByOffset(findTestObject('OR_Telehealth/Obj_Telehealth'), -300, 0)

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_Image Results'),
				GlobalVariable.timeout)

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_Image Results'))
	}

	@And("I click on imaging results Add button")
	public void add_button_to_add_imagingresults(){

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_button_Add'),
				GlobalVariable.timeout)

		Thread.sleep(2000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_button_Add'))
		Thread.sleep(2000)
	}


	@And("I click on imaging results Edit button")
	public void add_button_to_edit_imagingresults(){

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/button_Edit'),
				GlobalVariable.timeout)

		Thread.sleep(2000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/button_Edit'))
		Thread.sleep(2000)
	}

	@When("I enter (.*) to delete record in imaging result")
	def I_click_on_delete_button(String Problem_Name) {
		Thread.sleep(5000)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.imagingResult']//table)[2]//tbody"))
		List<WebElement> Table1=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.imagingResult']//table)[2]//tbody//tr//td[2])"))

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
			String xpathd1 = "(//div[@data-mz-key='clinical.imagingResult']//table)[2]//tr[" +i +"]//td[2]"

			td1.addProperty('xpath', ConditionType.EQUALS, xpathd1)

			text1= WebUI.getText(td1)

			if(text1==Problem_Name) {
				break
			}
		}
		TestObject td2 = new TestObject('delete')

		String xpathd2 = "(//div[@data-mz-key='clinical.imagingResult']//table)[2]//tr[" +i +"]//td[10]//button"

		td2.addProperty('xpath', ConditionType.EQUALS, xpathd2)

		WebUI.click(td2)


		WebUI.switchToDefaultContent()

	}

	@And("I enter (.*) in imaging results imaging test type field")
	public void imagingtest_type_for_imagingresult(String Imaging_Test_Type){

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_imagetest'),
				GlobalVariable.timeout)

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_imagetest'))


		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath1 = ('//li[text()="' + Imaging_Test_Type) + '"]'

		TestObject t1 = new TestObject('Mild')

		t1.addProperty('xpath', ConditionType.EQUALS, xpath1)

		WebUI.click(t1)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_li_HPC'),
		//				GlobalVariable.timeout)
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_li_HPC'))
	}

	@And("I enter (.*) in imaging results imaging test field")
	public void enter_imagingtest_for_imagingresult(String Imaging_Test){

		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/TestSelect'),Imaging_Test)

		Thread.sleep(2000)

		WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/TestSelect'), Keys.chord(
				Keys.TAB))
	}

	@And("I enter (.*) in imaging result date field")
	public void date_imaging_results(String Date){

		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_inputorderDate'), Date)
	}

	@And("I enter (.*) in imaging results order provider field")
	public void orderprovider_for_imagingresult(String Order_Provider){

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_OrderProvider'),
				GlobalVariable.timeout)

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_OrderProvider'))

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath2 = ('//li[text()="' + Order_Provider) + ' "]'

		TestObject t2 = new TestObject('Mild')

		t2.addProperty('xpath', ConditionType.EQUALS, xpath2)

		WebUI.click(t2)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_li_Care Manager)'),
		//				GlobalVariable.timeout)
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_li_Care Manager)'))
	}

	@And("I enter (.*) in imaging results status field")
	public void status_for_imagingresult(String Status){

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/span_select - Copy (1)'),
				GlobalVariable.timeout)

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/span_select - Copy (1)'))

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
		String xpath3
		if(Status=='Active') {
			xpath3 = ('(//li[text()="' + Status) + '"])[5]'
		}
		else {
			if(Status=='Completed') {
				xpath3 = ('(//li[text()="' + Status) + '"])'
			}else {
				xpath3 = ('(//li[text()="' + Status) + '"])'
			}
		}
		TestObject t3 = new TestObject('Mild')

		t3.addProperty('xpath', ConditionType.EQUALS, xpath3)

		WebUI.click(t3)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_li_active'),
		//				GlobalVariable.timeout)
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_li_active'))
	}

	@And("I enter (.*) in imaging results file field")
	public void attachfile_from_pc_imagingresult(String File){

		WebUI.uploadFile(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_Attachfilebutton'),File)
	}

	@And("I enter (.*) in imaging results results field")
	public void enter_results_for_imagingresult(String Results){

		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_inputsummry'),Results)
	}

	@And("I enter (.*) in imaging results interpretation field")
	public void interpretation_for_imagingresult(String Interpretation){

		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/textarea_Comments_comments'),Interpretation)
	}

	@And("I click on imaging results Save button")
	public void savebutton_imagingresult_record(){

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_button_Save'))
	}

	@Then("I should see success message for added imaging results")
	public void recordsavedsuccessfully_alertpopup_for_imagingresult(){

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_Alertsaved'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_Alertsaved'),'successImaging result saved.Hide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_Alertsaved'),
				GlobalVariable.timeout)

		'Verify that Alert Comes After Save Button Clicked'
	}


	@Then("I should see success message for edit imaging results")
	public void recordeditsuccessfully_alertpopup_for_imagingresult(){

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_Alertsaved'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_Alertsaved'),
				'successImaging result saved.Hide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_Alertsaved'),
				GlobalVariable.timeout)
	}


	@Then("I should see success message for deleted imaging result")
	public void recorddeltedsuccessfully_alertpopup_for_imagingresult(){

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_Alertdelete'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_Alertdelete'),
				'successImaging result deleted successfully.Hide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_Alertdelete'),
				GlobalVariable.timeout)
	}


	@And("I should see the newly added imaging results record (.*) and (.*) and (.*) and (.*) and (.*) present on grid")
	public void addeddata_visible_for_imagingresult(String Imaging_Test_Type, String Date, String Order_Provider, String Status, String File){

		System.out.println(Imaging_Test_Type)
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/td_Source'), Imaging_Test_Type)

		String dat= Stringtext.planetext(Date)
		String wdate= WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/td_date'))
		String wdat = wdate.subSequence(0, 10)
		WebUI.verifyMatch(wdat, dat, false)
		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/td_orderpr'),Order_Provider)

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/td_status'),Status)

		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_tdAtachedfilefafa'))

		'Verify that Alert Comes After Save Button Clicked'
		//		WebUI.verifyElementPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingResults/Obj_td_TestFile'), 2)
	}


	@And("I should see the deleted imaging result not present on grid")
	def very_deleted_data_should_benot_visible_on_the_UI(){
		'Verify the record gone from UI'

		Thread.sleep(3000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Refresh button/Obj_refreshbutton'))

		//		WebElement refresh=driver.findElement(By.xpath("//span[@class='k-icon k-i-refresh']"))
		//		refresh.click()
		Thread.sleep(9000)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.imagingResult']//table)[2]//tbody"))
		List<WebElement> Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.imagingResult']//table)[2]//tbody//tr//td[2])"))
		Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.imagingResult']//table)[2]//tbody//tr//td[2])"))
		s2=Table2.size()
		s1=s1-1
		WebUI.verifyEqual(s1, s2)
		WebUI.switchToDefaultContent()
	}
}