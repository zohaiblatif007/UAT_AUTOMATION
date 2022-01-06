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



class DischargeFunctionality {
	
	public static int admit_status=0
	
	@When("I click in checkbox to select the filtered patient")
	def MRNDropdown() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_patientcheckbox'),GlobalVariable.timeout)
		Thread.sleep(2000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_patientcheckbox'))

		Thread.sleep(1000)
	}
	
	@When("I click on dicharge tab in patient grid")
	def dischargetabpatientgrid() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Dischargetabpatientgrid'),GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Dischargetabpatientgrid'))

		Thread.sleep(2000)
	}
	
	
	@When("I click on thee dot discharge button against filtered patient on CC grid")
	def dischargethreedotbutonccgrid() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/patientgrid/Obj_Discharge_threedotbutton'),GlobalVariable.timeout)
		Thread.sleep(3000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/patientgrid/Obj_Discharge_threedotbutton'))
		
	}
	
	@When("I click on dicharge option on CC grid")
	def dischargetabccgrid() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/patientgrid/Obj_Discharge_tabli'),GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/patientgrid/Obj_Discharge_tabli'))

		Thread.sleep(2000)
	}
	
	@When("I click on SNF dicharge disposition")
	def dischargedispostion() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_SNFdischargedisposition'),GlobalVariable.timeout)
		Thread.sleep(2000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_SNFdischargedisposition'))

		Thread.sleep(1000)
	}
	@When("I enter (.*) against dicharge disposition")
	def dischargedispostionsnf1(String Facility) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_SNF1discharge'),GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_SNF1discharge'))

		Thread.sleep(1000)
	}
	
	@When("I click on proceed button to dicharge")
	def proceedbutton() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_proceedbutton'),GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_proceedbutton'))

		Thread.sleep(1000)
	}
	
	@When("I click on proceed button to dicharge on cc grid")
	def proceedbuttoncc() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_proceedbuttoncc'),GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_proceedbuttoncc'))

		Thread.sleep(1000)
	}
	
	@When("I select discharge date to discharge")
	def datedischarge() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_DischargeDate'),GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_DischargeDate'))

		Thread.sleep(1000)
	}
	
	@When("I select discharge date to discharge on cc grid")
	def datedischargecc() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_DischargeDatecc'),GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_DischargeDatecc'))

		Thread.sleep(1000)
	}
	
	@When("I enter discharge date to discharge")
	def datedischargefield() {

		String Date = '08/14/2021 11:30:45 AM'
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_DischargeDate-inputfield'),GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_DischargeDate-inputfield'))
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_DischargeDate-inputfield'), Date)
		
		Thread.sleep(1000)
	}
	
	@When("I enter discharge date to discharge on cc grid")
	def datedischargefieldcc() {

		String Date = '08/14/2021 11:30:45 AM'
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_DischargeDate-inputfieldcc'),GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_DischargeDate-inputfieldcc'))
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_DischargeDate-inputfieldcc'), Date)
		
		Thread.sleep(1000)
	}
	
	@When("I select expected discharge date to dicharge")
	def datedischargeexpected() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_DischargedateExpected'),GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_DischargedateExpected'))

		Thread.sleep(1000)
	}
	
	@When("I select expected discharge date to dicharge on cc grid")
	def datedischargeexpectedcc() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_DischargedateExpectedcc'),GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_DischargedateExpectedcc'))

		Thread.sleep(1000)
	}
	
	@When("I enter expected discharge date to discharge")
	def expecteddatedischargefield() {

		String Date = '08/14/2021 11:30:45 AM'
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_DischargedateExpected-inputfield'),GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_DischargedateExpected-inputfield'))
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_DischargedateExpected-inputfield'), Date)
		
		Thread.sleep(1000)
	}
	
	
	@When("I enter expected discharge date to discharge on cc grid")
	def expecteddatedischargefieldcc() {

		String Date = '08/14/2021 11:30:45 AM'
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_DischargedateExpected-inputfieldcc'),GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_DischargedateExpected-inputfieldcc'))
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_DischargedateExpected-inputfieldcc'), Date)
		
		Thread.sleep(1000)
	}
	
	
	@When("I enter (.*) to dicharge")
	def dischargenotes(String notes) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Dischargenotes'),GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Dischargenotes'), notes)

		Thread.sleep(1000)
	}
	
	@When("I enter (.*) to dicharge on cc grid")
	def dischargenotescc(String notes) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Dischargenotescc'),GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Dischargenotescc'), notes)

		Thread.sleep(1000)
	}
	
	
	@When("I click on discharge cases tab")
	def afterchargecases() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Dischargecases'),GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Dischargecases'))

		Thread.sleep(3000)
	}
	
	@When("I enter (.*) to filter discharged patient in left filter")
	def dischargepatientfilter(String P_Name) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Discharget_Patientnamefilter'),GlobalVariable.timeout)
		Thread.sleep(3000)
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Discharget_Patientnamefilter'), P_Name)

		Thread.sleep(1000)
	}
	
	@When("I click on apply button in discharge cases left filter")
	def afterchargecasesapplybutton() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Dischargecase_Applybutton'),GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Dischargecase_Applybutton'))

		Thread.sleep(3000)
	}
	
	@When("I click on expand icon to expand patient in discharge case")
	def afterchargecaseexpandbutton() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_CheckboxPAC'),GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_CheckboxPAC'))
		Thread.sleep(1000)
	}
	
	
	@When("I click on enterprise drop down and select Charlie Enterprise")
	def enterprisechange() {
		WebUI.waitForElementClickable(findTestObject('OR_HomePage/Obj_Enterprise'), 10)
		Thread.sleep(1000)
		WebUI.click(findTestObject('OR_HomePage/Obj_Enterprise'))
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_CharlieEnterprise'))
		Thread.sleep(2000)
	}
	
	@When("I navigate to patient Census grid from Care Coordination")
	def selectpatientcensus() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_CCDropdown'), 10)
		Thread.sleep(1000)
		WebUI.mouseOver(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_CCDropdown'))
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patient Census'))
		Thread.sleep(10000)
	}
	
	@When("I enter (.*) to filter in patient census left filter")
	def patientcensusfilter(String P_Name) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_patientcensusleftfilter'),GlobalVariable.timeout)
		Thread.sleep(3000)
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_patientcensusleftfilter'), P_Name)

		Thread.sleep(1000)
	}
	
	@When("I click on apply button in patientcensus left filter")
	def applybuttonpatientcensus() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientcensusfilter_Applybutton'), 10)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientcensusfilter_Applybutton'))
		Thread.sleep(3000)
	}
	
	@When("I click on reset button in patientcensus left filter")
	def resetbuttonpatientcensus() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientcensusfilter_resetbutton'), 10)
		Thread.sleep(3000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientcensusfilter_resetbutton'))
		Thread.sleep(2000)
	}
	
	@When("I set Status type All in patientcensus left filter")
	def statusdroppatientcensus() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientsensusfilter_statusdropdown'), 10)
		Thread.sleep(2000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientsensusfilter_statusdropdown'))
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientsensusfilter_statusdropdown_all'))
		Thread.sleep(1000)
	}
	
	@When("I set admitted date last two years in patientcensus left filter")
	def admitteddatepatientcensus() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientsensusfilter_admitteddate'), 10)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientsensusfilter_admitteddate'))
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientsensusfilter_admitteddate_2year'))
		Thread.sleep(1000)
	}
	
	@When("I click on three dots icon of patient in patient census")
	def threedotbutton() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientsensusthreedotbutton'), 10)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientsensusthreedotbutton'))
		Thread.sleep(1000)
	}
	
	@When("I click on edit button in patient census")
	def editbutton() {
		
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientsensuseditbutton'), 10)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientsensuseditbutton'))
		Thread.sleep(2000)
	}
	
	@When("I click on accept button in patient census")
	def acceptbutton() {
		admit_status = 1
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientcensusfilter_Acceptbutton_Update'), 10)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientcensusfilter_Acceptbutton_Update'))
		Thread.sleep(2000)
	}
	
	@When("I set (.*) in patientcensus update status field")
	def patientcensusupdatestatus(String U_status) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientsensusfilter_statusdropdownupdatecase'),GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientsensusfilter_statusdropdownupdatecase'))
		Thread.sleep(1000)
			
	    WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_frameCC'), 2)
		
	    String xpath3
		if(U_status=='Admitted' && admit_status==1) {
		xpath3 = ('(//li[text()="' + U_status) + '"])[3]'
		}
		else
		{
			xpath3 = ('(//li[text()="' + U_status) + '"])[2]'
		}
		TestObject t3 = new TestObject('Mild')
		t3.addProperty('xpath', ConditionType.EQUALS, xpath3)
		Thread.sleep(1000)
		WebUI.click(t3)

		WebUI.switchToDefaultContent()
	}
	
	@When("I enter (.*) in patientcensus update notes field")
	def updatenotes(String u_notes) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientsensusfilter_updatenotes'),GlobalVariable.timeout)
		Thread.sleep(3000)
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientsensusfilter_updatenotes'), u_notes)

		Thread.sleep(1000)
	}
	
	@When("I set Dischrge Disposition to Home in update window of patient census")
	def dischredisposition() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientsensus_dischargediposition_update'),GlobalVariable.timeout)
		Thread.sleep(2000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientsensus_dischargediposition_update'))
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientsensus_dischargediposition_lihome'))
		Thread.sleep(1000)
	}
	
	@When("I click on update button in patient census")
	def updatebutton() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientsensusfilter_updatebutton'), 10)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Patientsensusfilter_updatebutton'))
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Then("I should see success meassge of patient dischared successfully")
	def deleted_successfullydicharge() {
		Thread.sleep(1000)
		 WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Alertdischrged'), GlobalVariable.timeout)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Alertdischrged'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Alertdischrged'),
				"successPatient discharged successfullyHide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Alertdischrged'),
				GlobalVariable.timeout)
	}
	
	
	@Then("I should see success meassge of Discharge case updated successfully")
	def successfullydicharge() {
		
		 WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Alertdischrgedpatientcensus'), GlobalVariable.timeout)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Alertdischrgedpatientcensus'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Alertdischrgedpatientcensus'),
				"successDischarge case updated successfullyHide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_Alertdischrgedpatientcensus'),
				GlobalVariable.timeout)
	}
	
	@Then("I verify patient name is (.*) mrn is (.*), PAC status is (.*), Discharge facility is (.*) on patient grid")
	def Patientgridvalidations(String P_Name, String P_MRN, String pacStatus, String A_Facility) {
		Thread.sleep(2000)
		
		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_States_patientgrid_name'), GlobalVariable.timeout) 
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_States_patientgrid_name'), P_Name )

		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_States_patientgrid_mrn'), GlobalVariable.timeout)
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_States_patientgrid_mrn'), P_MRN )

		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_States_patientgrid_PACstatus'), GlobalVariable.timeout)
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_States_patientgrid_PACstatus'), pacStatus )

		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_States_patientgrid_dischargefacility'), GlobalVariable.timeout)
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_States_patientgrid_dischargefacility'), A_Facility )

		}
		
		
		@Then("I verify patient name is (.*) mrn is (.*), PAC status is (.*), Discharge facility is (.*) on cc grid")
		def Patientgridvalidationscc(String P_Name, String P_MRN, String pacStatus, String A_Facility) {
			Thread.sleep(2000)
			
			WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/patientgrid/Obj_td_ccgrid_name'), GlobalVariable.timeout)
			WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/patientgrid/Obj_td_ccgrid_name'), P_Name )
	
			WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/patientgrid/Obj_td_ccgrid_mrn'), GlobalVariable.timeout)
			WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/patientgrid/Obj_td_ccgrid_mrn'), P_MRN )
	
			WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/patientgrid/Obj_td_ccgrid_pac'), GlobalVariable.timeout)
			WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/patientgrid/Obj_td_ccgrid_pac'), pacStatus )
	
			WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/patientgrid/Obj_td_ccgrid_facility'), GlobalVariable.timeout)
			WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/patientgrid/Obj_td_ccgrid_facility'), A_Facility )
	
			}
		
		
		@Then("I verify patient name is (.*) mrn is (.*), Recieving facility is (.*) on patient census")
		def Patientsecsusvalidations(String P_Name, String P_MRN, String A_Facility) {
			Thread.sleep(2000)
			
			WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_Name'), GlobalVariable.timeout)
			WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_Name'), P_Name )
	
			WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_MRN'), GlobalVariable.timeout)
			WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_MRN'), P_MRN )
		
			WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_RecievingFacility'), GlobalVariable.timeout)
			WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_RecievingFacility'), A_Facility )
	
			}
			
			@Then("I verify Admitted date, Discharged disposition and discharged on date in recieving facility is empty on patient census")
			def Patientsecsusvalidationsdatedempty() {
				Thread.sleep(2000)
				
				WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_AdmittedonDate'), GlobalVariable.timeout)
				WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_AdmittedonDate'), '' )
				
				WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_DischargedonDate'), GlobalVariable.timeout)
				WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_DischargedonDate'), '' )
		
				WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_Dichargedisposition'), GlobalVariable.timeout)
				WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_Dichargedisposition'), '' )
			
				}
				@Then("I verify Admitted date in recieving facility on patient census")
				def Patientsecsusadmiteddate() {
					Thread.sleep(2000)
					
					String Ad_Date= WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_AdmittedonDate'))
				
					WebUI.verifyNotMatch(Ad_Date, '', false)
	
					}
				
				@Then("I verify Admitted date and discharged on date and (.*) in recieving facility on patient census")
				def Patientsecsusvalidationsdischrgel(String D_Disposition) {
					Thread.sleep(2000)
					
					String Ad_Date= WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_AdmittedonDate'))
					String D_Date= WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_DischargedonDate'))
					
					WebUI.verifyNotMatch(Ad_Date, '', false)
					WebUI.verifyNotMatch(D_Date, '', false)
					
					WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_Dichargedisposition'), GlobalVariable.timeout)
					WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_Dichargedisposition'), D_Disposition )
				
					}
	
			
			
			@Then("I verify patient name is (.*) mrn is (.*) on update window of patient census")
			def Patientsensusupdatevalidations(String P_Name, String P_MRN) {
				Thread.sleep(2000)
				
				WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_Name_updatepage'), GlobalVariable.timeout)
				WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_Name_updatepage'), P_Name )
		
				WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_MRN_updatepage'), GlobalVariable.timeout)
				WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_MRN_updatepage'), P_MRN )

				}
	
	@Then("I verify status in PAC is (.*)")
	def statspacdicharge(String Statuspac) {
		Thread.sleep(1000)
		 WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_StatesinPac'), GlobalVariable.timeout)
		
		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_StatesinPac'), Statuspac )

	}
	
	@Then("I verify status in patientcensus is (.*)")
	def statspatientcensus(String Statuspac) {
		
		 WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_States_patientcensus'), GlobalVariable.timeout)
		 Thread.sleep(2000)
		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_States_patientcensus'), Statuspac )
		Thread.sleep(1000)
	}
	
	
	@Then("I verify status of PAC is (.*) and assigned facility is (.*) after expanding patient")
	def statspacdichargeexpanded(String P_Status, String A_Facility) {
		Thread.sleep(1000)
		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_Assinedtopacfacility'), GlobalVariable.timeout)
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_Assinedtopacfacility'), A_Facility )

	    WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_StatusinPAC_Expanded'), GlobalVariable.timeout)
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_StatusinPAC_Expanded'), P_Status )
	}
	
	@Then("I verify discharge disposition in patientcensus is (.*)")
	def dischargedispositionpatientcensus(String D_disposition) {
		Thread.sleep(2000)
	     WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_Dischargedisposition'), GlobalVariable.timeout)
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/DischargeFunctionality/Obj_td_patientcensus_Dischargedisposition'), D_disposition )

	}
	
}