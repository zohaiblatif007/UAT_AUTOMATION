package patientGrid
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
import groovy.inspect.swingui.BytecodeCollector



class Documentationfunctionality {
	WebDriver driver = DriverFactory.getWebDriver()
	
		public static int s1,s2
		public static int e=0
	
		@When("I click on Documentation tab")
		def documentationtabd() {
			e=1
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Documentationfunctionality/Obj_Documentationtab'),GlobalVariable.timeout)
			Thread.sleep(9000)
			'Click on Add button'
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Documentationfunctionality/Obj_Documentationtab'))
			
			Thread.sleep(2000)
		}
		
		@When("I click on add document button")
		def documentationaddbton() {
			e=1
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Documentationfunctionality/Obj_AddDocumentbutton'),GlobalVariable.timeout)
			Thread.sleep(2000)
			'Click on Add button'
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Documentationfunctionality/Obj_AddDocumentbutton'))
			
			Thread.sleep(2000)
		}
		
		@When("I click on edit document button")
		def documentationeditbton() {
			e=1
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Documentationfunctionality/Obj_Editbutton'),GlobalVariable.timeout)
			Thread.sleep(2000)
			'Click on Add button'
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Documentationfunctionality/Obj_Editbutton'))
			
			Thread.sleep(2000)
		}
		
		@When("I click on delete document button")
		def documentationdeletebton() {
			
			WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
			List<WebElement> Table1=	driver.findElements(By.cssSelector("div[data-mz-key='document']>div:nth-child(3)>table>tbody>tr"))
			s1=Table1.size()
			System.out.println("before delete "+s1)
			WebUI.switchToDefaultContent()
			
			
			e=1
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Documentationfunctionality/Obj_Deletebutton'),GlobalVariable.timeout)
			Thread.sleep(2000)
			'Click on Add button'
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Documentationfunctionality/Obj_Deletebutton'))
			
			Thread.sleep(2000)
		}
		
		
		@When("I upload the file for documentation")
		def upoadfile() {
	
			Thread.sleep(3000)
			WebUI.uploadFile(findTestObject('Object Repository/OR_PatientGrid/Documentationfunctionality/Obj_Attachmentarea'), "C:\\Users\\muhammad.zohaib\\patientpic.PNG")
			Thread.sleep(1000)
		}
		
		@When("I select (.*) in documentation type dropdown")
		def documentationtype(String Type) {
			e=1
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Documentationfunctionality/Obj_TypeDropdown'),GlobalVariable.timeout)
			Thread.sleep(1000)
			'Click on Add button'
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Documentationfunctionality/Obj_TypeDropdown'))
			Thread.sleep(1000)
			
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)


		String xpath3 = ('//li[text()="' + Type) +'"]'

		TestObject t3 = new TestObject('Mild')

		t3.addProperty('xpath', ConditionType.EQUALS, xpath3)

		WebUI.click(t3)

		WebUI.switchToDefaultContent()

			
		}
		
		@When("I enter (.*) in documentation comment section")
		def documentationcomment(String Comment) {
			e=1
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Documentationfunctionality/Obj_Comments'),GlobalVariable.timeout)
			Thread.sleep(1000)
			'Click on Add button'
			WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/Documentationfunctionality/Obj_Comments'), Comment)
			
			Thread.sleep(1000)
		}
		
		@When("I click on save button to save file")
		def documentationsavebton() {
			e=1
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Documentationfunctionality/Obj_Savebutton'),GlobalVariable.timeout)
			Thread.sleep(1000)
			'Click on Add button'
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Documentationfunctionality/Obj_Savebutton'))
			
			Thread.sleep(1000)
		}
		
		@When("I should see (.*) and (.*) for documment")
		def documentationcommentvalidate(String Type, String Comment) {
			Thread.sleep(3000)
			WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/Documentationfunctionality/Obj_td_type'), Type)
			WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/Documentationfunctionality/Obj_td_comment'), Comment)
			
		}
		
		@When("I verify that deleted document not present on grid")
		def documentationdeltedverify() {
			Thread.sleep(3000)
			WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
			List<WebElement> Table2=	driver.findElements(By.cssSelector("div[data-mz-key='document']>div:nth-child(3)>table>tbody>tr"))
			s2 =Table2.size()
			System.out.println("after delete "+s2)
			s1= s1-1
			WebUI.verifyEqual(s1, s2)
			WebUI.switchToDefaultContent()
	
			
		}
}