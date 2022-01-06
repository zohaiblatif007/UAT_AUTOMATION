package patientGrid

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable
import utility_Functions.UtilityFunctions





class SD_LeftFilters {
	
		UtilityFunctions obj=new UtilityFunctions();
		
		TestObject frame=findTestObject('Object Repository/ProgramEnrollment/frameObject')
	
		@And("I click on filtered patient to open pateint")
		public void click_openpatient() {
			Thread.sleep(1000)
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Obj_patientclick'))
			Thread.sleep(1000)
		}
	
	
	
		@And("I click on reset button")
		public void click_On_Reset_Button() {
	
	
			Thread.sleep(6000)
			WebUI.click(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/Obj_buttonReset'))
			Thread.sleep(4000)
		}
	
		@When("I enter facility (.*) for left filter")
		public void user_Enter_Facility(String Facility) {
	
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Facility/Obj_Facilitydro'),
					GlobalVariable.timeout)
			Thread.sleep(2000)
			'Click on Source drop down'
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Facility/Obj_Facilitydro'))
			String xpath1
			Thread.sleep(1000)
			WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
	
			if(Facility=='MHPN') {
				xpath1 = ('(//li[text()="' + Facility) + '"])[2]'
			}
			else {
				xpath1 = ('(//li[text()="' + Facility) + '"])[1]'
			}
	
			TestObject t1 = new TestObject('Mild')
	
			t1.addProperty('xpath', ConditionType.EQUALS, xpath1)
	
			WebUI.click(t1)
	
			WebUI.switchToDefaultContent()
			Thread.sleep(2000)
		}
	
		@And("I select program")
		public void user_select_Program() {
	
	
			WebUI.click(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/OR_Programe/Obj_Program'))
	
			WebUI.click(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/OR_Programe/Obj_SelectProgram'))
		}
	
		@And("I click on apply button")
		public void click_On_Apply_Button() {
	
			WebUI.click(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/Obj_buttonApply'))
			WebUI.enableSmartWait()
	        
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Facility/Obj_td_Facility'), 60)
			Thread.sleep(2000)
			}
	
	
		@And("I select enrollment")
		public void user_select_Enrollment() {
	
			WebUI.click(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/OR_Enrollment/Obj_Enrollment'))
	
			WebUI.click(findTestObject('OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/OR_Enrollment/Obj_SelectEnrollment'))
		}
	
	
	
		@Then("I should see (.*) as Facility2 in left filter")
		public void Facility1_and_Program_filters_should_be_updated(String Facility) {
	
	
			String Actual_Text = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Facility/Obj_td_filter_Facility2'))
			WebUI.verifyEqual(Actual_Text, Facility)
		}
		@Then("I should see (.*) as Facility1 in left filter")
		public void Facility2_and_Program_filters_should_be_updated(String Facility) {
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Facility/Obj_td_filter_Facility1'), 30)
			Thread.sleep(3000)
	
			String Actual_Text = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Facility/Obj_td_filter_Facility1'))
			WebUI.verifyEqual(Actual_Text, Facility)
		}
	
	
	
		@Then("I should see facility of filtered patients is (.*)")
		public def Facility_patientgrid(String Facility) {
	
			Thread.sleep(4000)
			String Actual_facility = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Facility/Obj_td_Facility'))
			WebUI.verifyMatch(Actual_facility, Facility, false)
		}
	
		@Then("I should see multi facility of filtered patients is (.*) and (.*)")
		public def Facilitymultiple_patientgrid(String Facility1, String Facility2) {
	
			Thread.sleep(4000)
			String Actual_facility = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Facility/Obj_td_Facility'))
	
			if(Actual_facility==Facility1) {
				WebUI.verifyMatch(Actual_facility, Facility1, false)
			}
			else {
				WebUI.verifyMatch(Actual_facility, Facility2, false)
			}
		}
	
	
		@Then("I should see (.*) as Program")
		public void I_Should_see_Programy(String Program) {
	
	
			String Actual_Program = WebUI.getText(findTestObject('OR_PatientGrid/OR_LeftFilters/GridObjects/Obj_VerifyProgram'))
	
			//		if(!Actual_Program.contains(Program)) {
			//
			//			KeywordUtil.markFailed("Your searched program does not have expected program.")
			//		}
	
			if(!Actual_Program.contains(Program)) {
	
				WebUI.verifyEqual(Actual_Program, Program);
	
			}
	
		}
	
	
		@Then("I should see (.*) as Enrollment")
		public void I_Should_see_Enrollment(String Enrollment) {
	
	
			String Actual_Enrollment = WebUI.getText(findTestObject('OR_PatientGrid/OR_LeftFilters/GridObjects/Obj_VerifyEnrollment'))
	
			//		if(!Actual_Program.contains(Program)) {
			//
			//			KeywordUtil.markFailed("Your searched program does not have expected program.")
			//		}
	
			if(!Actual_Enrollment.contains(Enrollment)) {
	
				WebUI.verifyEqual(Actual_Enrollment, Enrollment);
	
			}
	
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		@Then("I am on patient grid left filters")
		public void verifyonleftfilter() {
	
			Thread.sleep(4000)
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/Obj_buttonReset'),
					GlobalVariable.timeout)
			WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/LeftFiltersObjects/Obj_buttonReset'), 5, FailureHandling.STOP_ON_FAILURE)
			Thread.sleep(4000)
		}
	
	
		@Then("I should see left filter options are reset to default")
		public void verifyonleftfilterreset() {
	
			Thread.sleep(3000)
	
			WebUI.verifyElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Obj_td_filter_attributedfacility'), 5)
	
		}
	
	
	
		@Then("I enter provider (.*) for left filter")
		public void Ienterprovider(String provider) {
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Obj_providerdro'),
					GlobalVariable.timeout)
	
			'Click on Source drop down'
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Obj_providerdro'))
	
			Thread.sleep(1000)
			WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
	
			String xpath = ('(//li[contains(text(),"' + provider) + '")])[1]'
	
			TestObject t1 = new TestObject('Mild')
	
			t1.addProperty('xpath', ConditionType.EQUALS, xpath)
	
			WebUI.click(t1)
	
			WebUI.switchToDefaultContent()
			Thread.sleep(2000)
	
		}
	
	
	
		@Then("I enter attributed provider (.*) for left filter")
		public void Ienterattriprovider(String attriprovider) {
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Obj_attributedproviderdro'),
					GlobalVariable.timeout)
	
			'Click on Source drop down'
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Obj_attributedproviderdro'))
	
			Thread.sleep(1000)
			WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
	
			String xpath = ('(//li[text()="' + attriprovider) + '"])[2]'
	
			TestObject t1 = new TestObject('Mild')
	
			t1.addProperty('xpath', ConditionType.EQUALS, xpath)
	
			WebUI.click(t1)
	
			WebUI.switchToDefaultContent()
			Thread.sleep(2000)
	
		}
	
	
		@Then("I enter attributed facility (.*) for left filter")
		public void Ienterattfacility(String attrifacility) {
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Obj_attributefacilitydro'),
					GlobalVariable.timeout)
	
			'Click on Source drop down'
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Obj_attributefacilitydro'))
	
			Thread.sleep(1000)
			WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
	
			String xpath = ('(//li[text()="' + attrifacility) + '"])[3]'
	
			TestObject t1 = new TestObject('Mild')
	
			t1.addProperty('xpath', ConditionType.EQUALS, xpath)
	
			WebUI.click(t1)
	
			WebUI.switchToDefaultContent()
			Thread.sleep(2000)
	
		}
	
	
		@Then("I enter program (.*) for left filter")
		public void leftProgram(String Program) {
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Program/Obj_Programdrop'),
					GlobalVariable.timeout)
	
			'Click on Source drop down'
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Program/Obj_Programdrop'))
	
			Thread.sleep(1000)
			WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
	
			String xpath = "//ul[@id='careType_listbox']//li[text()='" + Program + "']"
	
			TestObject t1 = new TestObject('Mild')
	
			t1.addProperty('xpath', ConditionType.EQUALS, xpath)
	
			WebUI.click(t1)
	
			WebUI.switchToDefaultContent()
			Thread.sleep(2000)
	
		}
	
	
		@Then("I enter enrollment (.*) for left filter")
		public void IenteratEnrollment1(String Enrollment1) {
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Enrollment/Obj_Enrollmentdro'),
					GlobalVariable.timeout)
			Thread.sleep(3000)
			'Click on Source drop down'
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Enrollment/Obj_Enrollmentdro'))
	
			Thread.sleep(1000)
			WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
	
			String xpath = "//ul[@id='enrollStatus_listbox']//li[text()='" + Enrollment1 + "']"
	
			TestObject t1 = new TestObject('Mild')
	
			t1.addProperty('xpath', ConditionType.EQUALS, xpath)
	
			WebUI.click(t1)
	
			WebUI.switchToDefaultContent()
			Thread.sleep(2000)
	
		}
	
	
		@Then("I enter LOB (.*) for left filter")
		public void IenterattLOB(String LOB) {
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/LOB/Obj_LOBdro'),
					GlobalVariable.timeout)
	
			'Click on Source drop down'
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/LOB/Obj_LOBdro'))
	
			Thread.sleep(1000)
			WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
	
			String xpath = ('(//li[text()="' + LOB) + '"])'
	
			TestObject t1 = new TestObject('Mild')
	
			t1.addProperty('xpath', ConditionType.EQUALS, xpath)
	
			WebUI.click(t1)
	
			WebUI.switchToDefaultContent()
			Thread.sleep(2000)
	
		}
	
	
		@Then("I enter LOBtype (.*) for left filter")
		public void IenteratLOBType(String LOBType) {
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/LOB/Obj_LOBtypedro'),
					GlobalVariable.timeout)
	
			'Click on Source drop down'
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/LOB/Obj_LOBtypedro'))
	
			Thread.sleep(1000)
			WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
	
			String xpath = ('(//li[text()="' + LOBType) + '"])[1]'
	
			TestObject t1 = new TestObject('Mild')
	
			t1.addProperty('xpath', ConditionType.EQUALS, xpath)
	
			WebUI.click(t1)
	
			WebUI.switchToDefaultContent()
			Thread.sleep(2000)
	
		}
	
		@Then("I enter readmission (.*) for left filter")
		public void Ienterattreadmission(String readmission) {
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Readmisions/Obj_Readmisionsdrop'),
					GlobalVariable.timeout)
	
			'Click on Source drop down'
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Readmisions/Obj_Readmisionsdrop'))
	
			Thread.sleep(1000)
			WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
	
			String xpath = ('(//li[text()="' + readmission) + '"])[1]'
	
			TestObject t1 = new TestObject('Mild')
	
			t1.addProperty('xpath', ConditionType.EQUALS, xpath)
	
			WebUI.click(t1)
	
			WebUI.switchToDefaultContent()
			Thread.sleep(2000)
	
		}
	
	
		@Then("I enter HCC Score (.*) for left filter")
		public void IenterattHCCScore(String HCCScore) {
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/HCCScore/Obj_HCCScoredro'),
					GlobalVariable.timeout)
	
			'Click on Source drop down'
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/HCCScore/Obj_HCCScoredro'))
	
			Thread.sleep(1000)
			WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
	
			String xpath = ('(//li[text()="' + HCCScore) + '"])[2]'
	
			TestObject t1 = new TestObject('Mild')
	
			t1.addProperty('xpath', ConditionType.EQUALS, xpath)
	
			WebUI.click(t1)
	
			WebUI.switchToDefaultContent()
			Thread.sleep(2000)
	
		}
	
		@Then("I should see (.*) as Provider in left filter")
		public void I_Should_see_provider(String provider) {
	
			Thread.sleep(5000)
			WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Obj_td_filter_provider'), 10)
	
		}
	
		@Then("I should see (.*) as Attributed Provider in left filter")
		public void I_Should_see_attributproviderinfilter(String attributedprovider) {
	
			Thread.sleep(5000)
			WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Obj_td_filter_attributedprovider'), 10)
	
		}
	
		@Then("I should see Attributed Provider of filtered patients is (.*)")
		public void I_Should_see_attriprovider(String attributeprovider) {
			Thread.sleep(4000)
	
			String Actual_attributeprovider = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Obj_td_attributedprovider'))
	
			//		if(!Actual_Program.contains(Program)) {
			//
			//			KeywordUtil.markFailed("Your searched program does not have expected program.")
			//		}
	
			//			if(!Actual_Enrollment.contains(Enrollment)) {
			Thread.sleep(1000)
			WebUI.verifyEqual(Actual_attributeprovider, attributeprovider);
	
			//			}
	
		}
	
	
		@Then("I should see (.*) as Attributed Facility in left filter")
		public void I_Should_see_attrifacilityinfilter(String attributefacility) {
	
			Thread.sleep(5000)
			WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Obj_td_filter_attributedfacility'), 10)
	
		}
	
		@Then("I should see Attributed Facility of filtered patients is (.*)")
		public void I_Should_see_attrifacility(String attributefacility) {
	
			Thread.sleep(1000)
			String Actual_attributefacility = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Obj_td_attributedfacility'))
			Thread.sleep(1000)
	
			WebUI.verifyEqual(Actual_attributefacility, attributefacility);
	
		}
	
	
		@Then("I should see (.*) as Program in left filter")
		public void I_Should_see_Programinfilter(String Program) {
	
			Thread.sleep(5000)
			WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Program/Obj_td_filter_Program'), 10)
	
		}
	
		@Then("I should see program of filtered patients is (.*)")
		public void I_Should_see_Program(String Program) {
	
			Thread.sleep(1000)
			WebUI.mouseOver(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Program/Obj_td_Program'))
			Thread.sleep(1000)
	
			WebUI.switchToFrame(frame, 4)
			//			String completestring= ''+status +' '+'('+Name+')'+''
			String xpath1 = '//td[contains(text(),"' +Program+ '")]'
	
			TestObject to = new TestObject("objectName")
			to.addProperty("xpath",ConditionType.EQUALS,xpath1)
	
			WebUI.verifyElementPresent(to, 3)
			WebUI.switchToDefaultContent()
	
		}
	
		@Then("I should see (.*) as Enrollment in left filter")
		public void I_Should_see_Enrollmentinfilter(String Enrollment1) {
	
			Thread.sleep(5000)
			WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Enrollment/Obj_td_filter_Enrollment'), 10)
	
		}
	
	
		@Then("I should see (.*) as LOB in left filter")
		public void I_Should_see_LOBinfilter(String LOB) {
	
			Thread.sleep(5000)
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/LOB/Obj_td_filter_LOB'), 30)
			Thread.sleep(3000)
	
			String Actual_Text = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/LOB/Obj_td_filter_LOB'))
			WebUI.verifyEqual(Actual_Text, LOB)
		}
	
		@Then("I should see LOB of filtered patients is (.*)")
		public void I_Should_see_Actual_LOB(String LOB) {
	
			Thread.sleep(1000)
			String Actual_LOB = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/LOB/Obj_td_LOB'))
			Thread.sleep(1000)
			WebUI.verifyEqual(Actual_LOB, LOB);
		}
	
		@Then("I should see (.*) as LOB type in left filter")
		public void I_Should_see_LOBtypeinfilter(String LOBtype) {
	
			Thread.sleep(5000)
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/LOB/Obj_td_filter_LOBtype'), 30)
			Thread.sleep(3000)
	
			String Actual_Text = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/LOB/Obj_td_filter_LOBtype'))
			WebUI.verifyEqual(Actual_Text, LOBtype)
		}
	
		@Then("I should see LOB type of filtered patients is (.*)")
		public void I_Should_see_Actual_LOBtype (String LOBtype) {
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/LOB/Obj_td_LOBtype'), 30)
			Thread.sleep(1000)
			String Actual_LOBtype = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/LOB/Obj_td_LOBtype'))
			Thread.sleep(1000)
			WebUI.verifyEqual(Actual_LOBtype, LOBtype);
		}
	
		@Then("I should see (.*) as readmission in left filter")
		public void I_Should_see_readmissioninfilter(String readmission) {
	
			Thread.sleep(5000)
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Readmisions/Obj_td_filter_Readmisions'), 30)
			Thread.sleep(3000)
	
			String Actual_Text = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Readmisions/Obj_td_filter_Readmisions'))
			WebUI.verifyEqual(Actual_Text, readmission)
		}
	
		@Then("I should see readmission of filtered patients is (.*)")
		public void I_Should_see_Actual_readmission (String readmission) {
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Readmisions/Obj_td_Readmisions'), 30)
			Thread.sleep(1000)
			WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Readmisions/Obj_td_Readmisions'), 30)
			//			String Actual_LOBtype = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/Readmisions/Obj_td_Readmisions'))
			//			Thread.sleep(1000)
			//			WebUI.verifyEqual(Actual_LOBtype, LOBtype);
		}
	
		@Then("I should see (.*) as HCC Score in left filter")
		public void I_Should_see_HCCScoreinfilter(String HCCScore) {
	
			Thread.sleep(5000)
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/HCCScore/Obj_td_filter_HCCScore'), 30)
			Thread.sleep(3000)
	
			String Actual_Text = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/HCCScore/Obj_td_filter_HCCScore'))
			WebUI.verifyEqual(Actual_Text, HCCScore)
		}
	
		@Then("I should see HCC Score of filtered patients is (.*)")
		public void I_Should_see_Actual_HCCScore (String HCCScore) {
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/HCCScore/Obj_td_HCCScore'), 30)
	
			Thread.sleep(1000)
			String Actual_HCCScore = WebUI.getAttribute(findTestObject('Object Repository/OR_PatientGrid/OR_LeftFilters/Leffilter_new_cases/HCCScore/Obj_td_HCCScore'), 'class')
	
	
			if(HCCScore=='Low')
				WebUI.verifyEqual(Actual_HCCScore, 'circle-legend green');
	
			if(HCCScore=='High')
				WebUI.verifyEqual(Actual_HCCScore, 'circle-legend red');
		}
}