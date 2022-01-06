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



class Imagingordersteps {
	WebDriver driver = DriverFactory.getWebDriver()

	public static int s1,s2

	public static int e=0
	@When("I click on Imaging Order	tab")
	public void imaging_order_button() {
		Thread.sleep(2000)
		WebUI.click(findTestObject('OR_Telehealth/Obj_Telehealth'))

		WebUI.dragAndDropByOffset(findTestObject('OR_Telehealth/Obj_Telehealth'), -300, 0)

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Image Order'),
				GlobalVariable.timeout)

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Image Order'))
	}

	@And("I click on imaging order Add button")
	public void add_button_toadd_imaging_order() {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_button_Add'),
				GlobalVariable.timeout)

		Thread.sleep(2000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_button_Add'))
		Thread.sleep(2000)
	}


	@And("I click on imaging order Edit button")
	public void edit_button_toadd_imaging_order() {

		e=1
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/button_Edit'),
				GlobalVariable.timeout)
		Thread.sleep(2000)

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/button_Edit'))
		Thread.sleep(2000)
	}


	@When("I enter (.*) to delete record in imaging order")
	def I_click_on_delete_button(String Problem_Name) {
		Thread.sleep(5000)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.problem']//table)[2]//tbody"))
		List<WebElement> Table1=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.imagingOrder']//table)[2]//tbody//tr//td[2])"))

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
			String xpathd1 = "(//div[@data-mz-key='clinical.imagingOrder']//table)[2]//tr[" +i +"]//td[2]"

			td1.addProperty('xpath', ConditionType.EQUALS, xpathd1)

			text1= WebUI.getText(td1)

			if(text1==Problem_Name) {
				break
			}
		}
		TestObject td2 = new TestObject('delete')

		String xpathd2 = "(//div[@data-mz-key='clinical.imagingOrder']//table)[2]//tr[" +i +"]//td[7]//button"

		td2.addProperty('xpath', ConditionType.EQUALS, xpathd2)

		WebUI.click(td2)


		WebUI.switchToDefaultContent()

	}


	@And("I click on imaging order panel remove button")
	public void panelremove_imagingorder() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_removepanel'),
				GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_removepanel'))
		Thread.sleep(1000)
	}




	@And("I enter (.*) in imaging order imaging center field")
	public void select_imaging_center_from_dropdown(String Imaging_Center) {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Imagecenter'),
				GlobalVariable.timeout)
		Thread.sleep(2000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Imagecenter'))

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath1 = ('//li[text()="' + Imaging_Center) + '"]'

		TestObject t1 = new TestObject('Mild')

		t1.addProperty('xpath', ConditionType.EQUALS, xpath1)
		Thread.sleep(1000)

		WebUI.click(t1)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_li_Radiology'),
		//				GlobalVariable.timeout)
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_li_Radiology'))
	}

	@And("I enter (.*) in imaging order order provider field")
	public void select_orderprovider_from_dropdown(String Order_Provider) {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_OrderProvider'),
				GlobalVariable.timeout)

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_OrderProvider'))

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

	@And("I enter (.*) in imaging order date field")
	public void date_for_order_imagingorder(String Date) {

		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_inputOrderDate'),Date)
	}

	@And("I enter (.*) in imaging order bill type field")
	public void select_billtype_imagingorder(String Bill_Type) {
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Biiltype'))

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath3 = ('//li[text()="' + Bill_Type) + '"]'

		TestObject t3 = new TestObject('Mild')

		t3.addProperty('xpath', ConditionType.EQUALS, xpath3)
		Thread.sleep(1000)
		WebUI.click(t3)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_li_patient'),
		//				GlobalVariable.timeout)
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_li_patient'))
	}

	@And("I enter (.*) in imaging order imaging test type field")
	public void select_imagingtest_type_imagingorder(String Imaging_Test_Type) {
		Thread.sleep(1000)

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_imagetest'))

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath4 = ('//li[text()="' + Imaging_Test_Type) + '"]'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)
		Thread.sleep(1000)
		WebUI.click(t4)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_li_HPC'),
		//				GlobalVariable.timeout)
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_li_HPC'))
	}

	@And("I enter (.*) in imaging order imaging test field")
	public void select_test_imaging_order(String Imaging_Test) {

		Thread.sleep(1000)
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_inputlabobservations'),Imaging_Test)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath6 = ('//li[text()="' + Imaging_Test) + '"]'

		TestObject t6 = new TestObject('Mild')

		t6.addProperty('xpath', ConditionType.EQUALS, xpath6)
		Thread.sleep(1000)
		WebUI.click(t6)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_li_Outsidestate'),
		//				GlobalVariable.timeout)
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_li_Outsidestate'))
	}

	@And("I enter (.*) in imaging order effective date field")
	public void effectivedate_for_test_imagingorder(String Effective_Date) {
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_inputEffectiveDate'),Effective_Date)
		Thread.sleep(2000)
	}

	@And("I enter (.*) in imaging order diagnoses field")
	public void set_the_diagnoses_for_imaging_order(String Diagnoses) {
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Diagnosisfloatwrap'))

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath5

		if(e==0) {
			xpath5 = ('//span[text()="' + Diagnoses) + '"]'
		}
		if(e==1) {
			xpath5 = ('(//span[text()="' + Diagnoses) + '"])[2]'
		}

		TestObject t5 = new TestObject('Mild')

		t5.addProperty('xpath', ConditionType.EQUALS, xpath5)
		Thread.sleep(1000)
		WebUI.click(t5)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_liObj_Cholera'),
		//				GlobalVariable.timeout)
		//
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_liObj_Cholera'))
	}

	@And("I enter (.*) in imaging order body site field")
	public void enter_the_bodysite_for_imagingorder(String Body_Site) {
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_bodySite0'), Body_Site)

		Thread.sleep(3000)
	}

	@And("I enter (.*) in imaging order comments field")
	public void enter_comments_for_imagingorder(String Comments) {


		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Comments'), Comments)
		Thread.sleep(1000)
	}

	@And("I click on imaging order Update button")
	public void click_save_button_to_save_imagingorderrecord() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_button_Save'))
	}

	@And("I should see success message for added imaging order")
	public void record_savedsuccessfully_alert_popup_for_imagingorder() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Alertsaved'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Alertsaved'), 'successImaging Order Saved SuccessfullyHide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Alertsaved'),
				GlobalVariable.timeout)
	}


	@And("I should see success message for edit imaging order")
	public void record_editsuccessfully_alert_popup_for_imagingorder() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Alertsaved'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Alertsaved'),
				'successImaging Order Saved SuccessfullyHide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Alertsaved'),
				GlobalVariable.timeout)
	}


	@And("I should see success message for deleted imaging order")
	public void record_deletedsuccessfully_alert_popup_for_imagingorder() {

		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Alertdeleted'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Alertdeleted'),
				'successImaging Order Deleted SuccessfullyHide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_Alertdeleted'),
				GlobalVariable.timeout)
	}


	@And("I should see the newly added imaging order record (.*) and (.*) on grid")
	public void added_data_visible_on_UI_for_imagingorder(String Imaging_Center, String Date) {

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/td_oprovider'), Imaging_Center)

		String dat= Stringtext.planetext(Date)
		String webdate= WebUI.getText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_td_date'))
		String wdat = webdate.substring(0, 10)
		WebUI.verifyMatch(wdat, dat, false)

		//		'Verify that Alert Comes After Save Button Clicked'
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/Obj_td_date'),
		//				findTestData('DF_CMRData/DF_ClinicalSection/TD_ImagingOrder').getValue(8, 1))

		//		'Verify that Alert Comes After Save Button Clicked'
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/td_date - Copy'),
		//				findTestData('DF_CMRData/DF_ClinicalSection/TD_ImagingOrder').getValue(9, 1))
		//
		//		'Verify that Alert Comes After Save Button Clicked'
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/td_date - Copy (1)'),
		//				findTestData('DF_CMRData/DF_ClinicalSection/TD_ImagingOrder').getValue(10, 1))
		//
		//		'Verify that Alert Comes After Save Button Clicked'
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ImagingOrder/td_date - Copy (2)'),
		//				findTestData('DF_CMRData/DF_ClinicalSection/TD_ImagingOrder').getValue(11, 1))
	}

	@And("I should see the deleted imaging order not present on grid")
	def very_deleted_data_should_benot_visible_on_the_UI(){
		'Verify the record gone from UI'

		Thread.sleep(3000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Refresh button/Obj_refreshbutton'))

		//		WebElement refresh=driver.findElement(By.xpath("//span[@class='k-icon k-i-refresh']"))
		//		refresh.click()
		Thread.sleep(9000)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.imagingOrder']//table)[2]//tbody"))
		List<WebElement> Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.imagingOrder']//table)[2]//tbody//tr//td[2])"))
		Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.imagingOrder']//table)[2]//tbody//tr//td[2])"))
		s2=Table2.size()
		s1=s1-1
		WebUI.verifyEqual(s1, s2)
		WebUI.switchToDefaultContent()
	}
}