package programEnrollment
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

//import org.apache.poi.ss.usermodel.ConditionType
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import groovypackage.Stringtext
import internal.GlobalVariable
import utility_Functions.UtilityFunctions





class ProgramEnrollment  {

	UtilityFunctions obj=new UtilityFunctions();
	String time=null;
	String date=null;

	TestObject enrollBtn=findTestObject('Object Repository/ProgramEnrollment/Enrollment_btn')
	TestObject enrollBtnOpen=findTestObject('Object Repository/ProgramEnrollment/OR_ByOpeningPatient/Enrollment_btn')
	TestObject frame=findTestObject('Object Repository/ProgramEnrollment/frameObject')
	TestObject dateinput=findTestObject('Object Repository/ProgramEnrollment/dateInput')
	TestObject reasondropdown=findTestObject('Object Repository/ProgramEnrollment/reasondropdown')
	TestObject submit=findTestObject('Object Repository/ProgramEnrollment/submitBtn')
	TestObject conditioninput=findTestObject('Object Repository/ProgramEnrollment/condition')

	@And("I click on Program Enrollment Button")
	void click_Enroll_btn() {
		WebUI.waitForElementClickable(enrollBtn,GlobalVariable.timeout);
		Thread.sleep(3000);
		WebUI.click(enrollBtn);
	}
	@And("I select the Program (.*)")
	void selectProgram(String Name) {
		Thread.sleep(5000);
		String xpath ='//div[@id="patient_header_enrollment_programs_pg"]//*[@class="panel panel-default"]//div[@data-program-name="'+Name+'"]'
		obj.customClick(frame, xpath)
	}
	@And("I verify that (.*) is already selected or not")
	void verifyOptionIsNotChecked(String status) {
		String xpath='//a[@data-action="'+status+'"]//i[@class="fa fa-check"]'
		boolean val =obj.customObjectPresent(frame, xpath);
		if(val==true) {
			println(status+"already selected");
		}
		else
			println(status+" not selected");
	}

	@And("I select (.*) from the selected program")
	void selectOption(String status) {
		String xpath='//a[@data-action="'+status+'"]'

		obj.customClick(frame,xpath)
	}

	@And("I verify that the expected Reason pop up appears")
	void verify_reason_popuop() {
		WebUI.waitForElementClickable(dateinput, 3)
		try {
			if(WebUI.verifyElementPresent(dateinput,4)==true)
				println("reason pop up appeared")
		}

		catch(Exception ex) {
			println("Catching the exception");
		}
	}

	@And("I get Date from Date Field")
	void input_date() {
		time=obj.currentTime()
		date=obj.currentDate()
		String concat=date+" "+time
		obj.setValues(dateinput,concat)
		println date;
	}

	@And("I select (.*) from Reason Dropdown")
	void input_reason(String Reason) {
		String xpath='//ul[@id="patient_status__input_reason_listbox"]//li[text()="'+Reason+'"]'
		Thread.sleep(2000);
		WebUI.click(reasondropdown);
		obj.selectdropdown(frame,xpath)
	}
	@And("I input (.*) in condition Field")
	void input_condition(String condition) {
		obj.setValues(conditioninput,condition)
	}

	@Then("I  click on submit button")
	void click_button() {
		WebUI.click(submit)
	}

	@Then("I should see the (.*) in the enrollment column on patient grid")
	void verify_patient_grid(String program){
		String xpath='//div[@class="k-tooltip-content"]//div[text()="'+program+'"]'
		WebUI.scrollToElement(findTestObject('Object Repository/ProgramEnrollment/verifyprogram_patientGrid'), 3)
		WebUI.mouseOver(findTestObject('Object Repository/ProgramEnrollment/verifyprogram_patientGrid'))
		obj.customVerify(frame,xpath,program)
	}
	
	
	/******************************************opening patient seperate funtions*************************************************************/
	@And("I click on Program Enrollment Button after opening the patient")
	void click_Enroll_btn_opening() {
		WebUI.waitForElementClickable(enrollBtnOpen,GlobalVariable.timeout);
		Thread.sleep(3000)
		WebUI.click(enrollBtnOpen);
	}

	@And("I select the Name (.*) from the opened patient")
	void selectProgram_opening(String Name) {
		String xpath ='//div[@id="patient_header_enrollment_programs"]//div[@data-program-name="'+Name+'"]'
		obj.customClick(frame, xpath)
	}
	

	/******************************************Verification*************************************************************/
	@Then("I verify that i see the latest added (.*),(.*) in the enrollment history")
	void verification1(String Name,String status)
	{
		String namexpath='(//div[@class="enrollment-history"]//span[text()="'+Name+'"])[1]'
		println namexpath;
		String optionxpath='(//div[@class="enrollment-history"]//span[text()="'+status+'"])[1]'
		println optionxpath;
		String change= Stringtext.planetext(date)       
				change=change+" "+time
		String datexpath='(//div[@class="enrollment-history"]//span[contains(text(),"'+ change +'")])[1]'
		println datexpath;
		
		obj.customVerify(frame,namexpath,Name);
		obj.customVerify(frame,optionxpath,status);
		
//		obj.customVerify(frame,datexpath,change);
	}
	
	@Then("I click on expanding button on the enrollment history tab")
	void click_expanding_arrow()
	{
		WebUI.waitForElementClickable(findTestObject('Object Repository/ProgramEnrollment/expandArrow'),30)
	
			WebUI.scrollToElement(findTestObject('Object Repository/ProgramEnrollment/expandArrow'),3)
		WebUI.click(findTestObject('Object Repository/ProgramEnrollment/expandArrow'))
		Thread.sleep(3000);
	}
	
	@Then("I click cross icon to close opened patient page")
	void closeopenedpatient()
	{
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/ProgramEnrollment/obj_closeopendpatient'))
		Thread.sleep(1000)
	}
	
	@And("I click on edit button where status: (.*) program:and (.*)")
	void click_edit_button(String status,String Name)
	{
		String xpath='(//*[@class="k-grid-content k-auto-scrollable"]//*[text()="'+status+'"]//following-sibling::td[text()="'+Name+'"]//following-sibling::td//button)[1]'
		obj.customClick(frame,xpath)
	}
	
	
	@Then("I verify that i see the latest added (.*),(.*),(.*) after expanding the enrollment history")
	void verification2(String Name,String status,String Reason)
	{  
		String namexpath='(//*[@class="k-grid-content k-auto-scrollable"]//*[text()="'+Name+'"])[1]'
		String optionxpath='(//*[@class="k-grid-content k-auto-scrollable"]//*[text()="'+status+'"])[1]'
		String reasonxpath='(//*[@class="k-grid-content k-auto-scrollable"]//*[text()="'+Reason+'"])[1]'
		
		obj.customVerify(frame, namexpath, Name);
		obj.customVerify(frame, optionxpath, status);
		obj.customVerify(frame, reasonxpath, Reason);
		
	}
	
	
	@Then("I verify that i see the latest added (.*),(.*),(.*) after expanding the enrollment history on care coordination flow")
	void verification2_CC(String Name,String status,String Reason)
	{
		String namexpath='(//*[@class="k-grid-content k-auto-scrollable"]//*[text()="'+Name+'"])[2]'
		String optionxpath='(//*[@class="k-grid-content k-auto-scrollable"]//*[text()="'+status+'"])[1]'
		String reasonxpath='(//*[@class="k-grid-content k-auto-scrollable"]//*[text()="'+Reason+'"])[1]'
		
		obj.customVerify(frame, namexpath, Name);
		obj.customVerify(frame, optionxpath, status);
		obj.customVerify(frame, reasonxpath, Reason);
		
	}
	
	
	@Given("I click on Care Coordination")
	void click_coordination()
	{
		Thread.sleep(5000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CareCordinationTab'))
		Thread.sleep(10000)
	}
	
	@Then("I validate (.*) and (.*) in enrollment section")
	void verification2_CC(String Name,String status)
	{
		WebUI.scrollToElement(findTestObject('Object Repository/ProgramEnrollment/obj_verifyenrolment'), 4)
		WebUI.mouseOver(findTestObject('Object Repository/ProgramEnrollment/obj_verifyenrolment'))
	

		WebUI.switchToFrame(frame, 4)

		String completestring= ''+status +' '+'('+Name+''
		String xpath1 = '(//td[contains(text(),"' +completestring+ '")])[1]'
		
		TestObject to = new TestObject("objectName")
		to.addProperty("xpath",ConditionType.EQUALS,xpath1)
		
		WebUI.verifyElementPresent(to, 3)
		WebUI.switchToDefaultContent()
		
		
		
		
//		obj.customVerify(frame, xpaths, completestring);
		
	}
	
	@Then("I validate (.*) and (.*) in enrollment section in cc grid")
	void verification2_CCcc(String Name,String status)
	{
		WebUI.scrollToElement(findTestObject('Object Repository/ProgramEnrollment/obj_verifyenrolmentcc'), 4)
		WebUI.mouseOver(findTestObject('Object Repository/ProgramEnrollment/obj_verifyenrolmentcc'))
	
		WebUI.switchToFrame(frame, 4)
		String completestring= ''+status +' '+'('+Name+')'+''
	    String xpath1 = '//div[contains(text(),"' +completestring+ '")]'
		
		TestObject to = new TestObject("objectName")
		to.addProperty("xpath",ConditionType.EQUALS,xpath1)
		
		WebUI.verifyElementPresent(to, 3)
		WebUI.switchToDefaultContent()
//		obj.customVerify(frame, xpaths, completestring);
		
	}
	
}