package patientGrid
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.DateFormat
import java.text.SimpleDateFormat

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.When
import groovypackage.Stringtext
import internal.GlobalVariable


class Assessment {


	WebDriver driver = DriverFactory.getWebDriver()


	public static int s1,s2
	public static int e=0, careGOAL=0, goalcare=0

	@When("I click on Assessment tab")
	def buttoncaregaptab() {
		Stringtext.planetext('10101090')


		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_AssessmentTab') ,GlobalVariable.timeout)

		Thread.sleep(2000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_AssessmentTab'))

		Thread.sleep(4000)

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
		List<WebElement> Table1=	driver.findElements(By.xpath("//div[@class='section assessment relative k-content k-state-active']//div[@class='k-grid-content k-auto-scrollable']//tbody//tr"))
		s1=Table1.size()
		Thread.sleep(1000)
		WebUI.switchToDefaultContent()
	}

	@And("I click on Assessment Add button")

	public void Assementadd() {
		
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_AddButton') ,GlobalVariable.timeout)

		Thread.sleep(2000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_AddButton'))

		Thread.sleep(3000)
	}


	@And("I click on Recommended Assessment tab to add assessment")

	public void recommendedassessment() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obje_recommendedAssessment') ,GlobalVariable.timeout)

		Thread.sleep(2000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obje_recommendedAssessment'))

		Thread.sleep(3000)
	}


	@And("I click on Other Assessment Templates tab to add Assessment")

	public void otherassementTemplate() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obje_OtherAssessmentTemplates') ,GlobalVariable.timeout)

		Thread.sleep(2000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obje_OtherAssessmentTemplates'))

		Thread.sleep(3000)
	}

	@And("I click on Custom Assessment tab to add Assessment")

	public void customassessment() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obje_customAssessment') ,GlobalVariable.timeout)

		Thread.sleep(2000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obje_customAssessment'))

		Thread.sleep(3000)
	}


	@And("I click on Based on Previous Assessment tab to add Assessment")

	public void basedonpreviousssessment() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obje_basedonpreviousAssessment') ,GlobalVariable.timeout)

		Thread.sleep(2000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obje_basedonpreviousAssessment'))

		Thread.sleep(3000)
	}
	
	
	@And("I click on Assessment Compare button")
	
		public void comparesssessment() {
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Comparebutton') ,GlobalVariable.timeout)
	
			Thread.sleep(3000)
			'Click on Add button'
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Comparebutton'))
	
			Thread.sleep(3000)
		}

		@And("I click on assessment to compare with other assessment")
		
			public void comparewithsssessment() {
				WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_comparewithAssessment') ,GlobalVariable.timeout)
		
				Thread.sleep(3000)
				'Click on Add button'
				WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_comparewithAssessment'))
		
				Thread.sleep(3000)
			}
	
		
		
		
		
	@And("I should see the Questionaire is loaded against relevant assessment")
	public void questionaire() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj__Rec_assessment_Questionaire') ,GlobalVariable.timeout)

		Thread.sleep(2000)
		'Click on Add button'
		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj__Rec_assessment_Questionaire') ,GlobalVariable.timeout, FailureHandling.STOP_ON_FAILURE)

		Thread.sleep(3000)
	}


	@And("I should see Cancel, Save & Close and Save buttons available and functional")
	public void buttonsvalidations() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_button_Saveand') ,GlobalVariable.timeout)
		Thread.sleep(3000)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_button_Cancel') ,GlobalVariable.timeout, FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_button_Cancel'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_buttonsaveandclose') ,GlobalVariable.timeout, FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_buttonsaveandclose'))



		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_button_Saveand') ,GlobalVariable.timeout, FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_button_Saveand'))
	}

	@And("I should see question removing cross sign available and functional")
	public void Questionremovesign() {

		for(int i=0; i<4;i++) {
			Thread.sleep(1000)
			WebUI.mouseOver(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_deleteQ6div'))
			WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_deleteQ6') ,GlobalVariable.timeout, FailureHandling.STOP_ON_FAILURE)
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_deleteQ6'))
		}
	}






	@And("I select check box of (.*) Billable Assessment")

	public void assementcheckbox(String B_Assessment) {


		Thread.sleep(6000)
		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Iframe_AppCCM'), GlobalVariable.timeout)

		String xpath = '//label[text()="' +B_Assessment+ '"]//input'

		System.out.println("xpath= "+ xpath)

		TestObject assessmentcheckbox = new TestObject('assessmentcheckbox')
		assessmentcheckbox.addProperty('xpath', ConditionType.EQUALS, xpath)

		WebUI.click(assessmentcheckbox)
		WebUI.switchToDefaultContent()

		Thread.sleep(1000)
	}

	@And("I click on Proceed button to save assessment template")

	public void proceedbutton() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Proceedbtn') ,GlobalVariable.timeout)

		Thread.sleep(1000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Proceedbtn'))

		Thread.sleep(3000)
	}







	@And("I enter answer (.*) to question 1 in RecommendedAssessment")

	public void Ansquestion1rec(String question) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_FirstClick') ,GlobalVariable.timeout)

		Thread.sleep(1000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_FirstClick'))

		Thread.sleep(1000)

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Iframe_AppCCM'), GlobalVariable.timeout)

		String xpath = '(//li[text()="'+question+'"])[2]'

		System.out.println("xpath= "+ xpath)

		TestObject Question = new TestObject('Quetion')
		Question.addProperty('xpath', ConditionType.EQUALS, xpath)

		WebUI.click(Question)
		WebUI.switchToDefaultContent()
	}

	@And("I enter answer (.*) to question 2 in RecommendedAssessment")

	public void Ansquestion2rec(String question) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_SecondClick') ,GlobalVariable.timeout)

		Thread.sleep(1000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_SecondClick'))

		Thread.sleep(1000)

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Iframe_AppCCM'), GlobalVariable.timeout)

		String xpath = '(//li[text()="'+question+'"])[1]'

		System.out.println("xpath= "+ xpath)

		TestObject Question = new TestObject('Quetion')
		Question.addProperty('xpath', ConditionType.EQUALS, xpath)

		WebUI.click(Question)
		WebUI.switchToDefaultContent()
	}

	@And("I enter answer (.*) to question 3 in RecommendedAssessment")

	public void Ansquestion3rec(String question) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_ThirdClick') ,GlobalVariable.timeout)

		Thread.sleep(1000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_ThirdClick'))

		Thread.sleep(1000)

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Iframe_AppCCM'), GlobalVariable.timeout)

		String xpath = '(//li[text()="'+question+'"])[2]'

		System.out.println("xpath= "+ xpath)

		TestObject Question = new TestObject('Quetion')
		Question.addProperty('xpath', ConditionType.EQUALS, xpath)

		WebUI.click(Question)
		WebUI.switchToDefaultContent()
	}

	@And("I enter answer (.*) to question 4 in RecommendedAssessment")

	public void Ansquestion4rec(String question) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_ForthClick') ,GlobalVariable.timeout)

		Thread.sleep(1000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_ForthClick'))

		Thread.sleep(1000)

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Iframe_AppCCM'), GlobalVariable.timeout)

		String xpath = '(//li[text()="'+question+'"])[3]'

		System.out.println("xpath= "+ xpath)

		TestObject Question = new TestObject('Quetion')
		Question.addProperty('xpath', ConditionType.EQUALS, xpath)

		WebUI.click(Question)
		WebUI.switchToDefaultContent()
	}

	@And("I enter answer (.*) to question 5 in RecommendedAssessment")

	public void Ansquestion5rec(String question) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_FifthClick') ,GlobalVariable.timeout)

		Thread.sleep(1000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_FifthClick'))

		Thread.sleep(1000)

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Iframe_AppCCM'), GlobalVariable.timeout)

		String xpath = '(//li[text()="'+question+'"])[4]'

		System.out.println("xpath= "+ xpath)

		TestObject Question = new TestObject('Quetion')
		Question.addProperty('xpath', ConditionType.EQUALS, xpath)

		WebUI.click(Question)
		WebUI.switchToDefaultContent()
	}












	@And("I enter answer (.*) to question 1")

	public void Ansquestion1(String question) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_FirstClick') ,GlobalVariable.timeout)

		Thread.sleep(1000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_FirstClick'))

		Thread.sleep(1000)

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Iframe_AppCCM'), GlobalVariable.timeout)

		String xpath = '(//li[text()="'+question+'"])'

		System.out.println("xpath= "+ xpath)

		TestObject Question = new TestObject('Quetion')
		Question.addProperty('xpath', ConditionType.EQUALS, xpath)

		WebUI.click(Question)
		WebUI.switchToDefaultContent()
	}

	@And("I enter answer (.*) to question 2")

	public void Ansquestion2(String question) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_SecondClick') ,GlobalVariable.timeout)

		Thread.sleep(1000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_SecondClick'))

		Thread.sleep(1000)

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Iframe_AppCCM'), GlobalVariable.timeout)

		String xpath = '(//li[text()="'+question+'"])[2]'

		System.out.println("xpath= "+ xpath)

		TestObject Question = new TestObject('Quetion')
		Question.addProperty('xpath', ConditionType.EQUALS, xpath)

		WebUI.click(Question)
		WebUI.switchToDefaultContent()
	}

	@And("I enter answer (.*) to question 3")

	public void Ansquestion3(String question) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_ThirdClick') ,GlobalVariable.timeout)

		Thread.sleep(1000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_ThirdClick'))

		Thread.sleep(1000)

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Iframe_AppCCM'), GlobalVariable.timeout)

		String xpath = '(//li[text()="'+question+'"])'

		System.out.println("xpath= "+ xpath)

		TestObject Question = new TestObject('Quetion')
		Question.addProperty('xpath', ConditionType.EQUALS, xpath)

		WebUI.click(Question)
		WebUI.switchToDefaultContent()
	}

	@And("I enter answer (.*) to question 4")

	public void Ansquestion4(String question) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_ForthClick') ,GlobalVariable.timeout)

		Thread.sleep(1000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_ForthClick'))

		Thread.sleep(1000)

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Iframe_AppCCM'), GlobalVariable.timeout)

		String xpath = '(//li[text()="'+question+'"])[3]'

		System.out.println("xpath= "+ xpath)

		TestObject Question = new TestObject('Quetion')
		Question.addProperty('xpath', ConditionType.EQUALS, xpath)

		WebUI.click(Question)
		WebUI.switchToDefaultContent()
	}

	@And("I enter answer (.*) to question 5")

	public void Ansquestion5(String question) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_FifthClick') ,GlobalVariable.timeout)

		Thread.sleep(1000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Dropdown_FifthClick'))

		Thread.sleep(1000)

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Iframe_AppCCM'), GlobalVariable.timeout)

		String xpath = '(//li[text()="'+question+'"])[4]'

		System.out.println("xpath= "+ xpath)

		TestObject Question = new TestObject('Quetion')
		Question.addProperty('xpath', ConditionType.EQUALS, xpath)

		WebUI.click(Question)
		WebUI.switchToDefaultContent()
	}

	@And("I enter (.*) in assessment title field")

	public void Title(String Title) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_input_title') ,GlobalVariable.timeout)

		Thread.sleep(1000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_input_title'))

		Thread.sleep(1000)

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_input_title'), Title)
	}


	@And("I enter (.*) in assessment billable type field")

	public void BillableType(String BillableType) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_YesNo_Checkbox') ,GlobalVariable.timeout)

		Thread.sleep(1000)
		if(BillableType== 'Yes') {
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_YesNo_Checkbox'))
		}
		Thread.sleep(1000)
	}

	@And("I enter type of assessment as non billable")
	
		public void BillableTypeno() {
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_YesNo_Checkbox') ,GlobalVariable.timeout)
	
			Thread.sleep(1000)
			
				WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_YesNo_Checkbox'))
			
			Thread.sleep(1000)
		}

	@And("I enter (.*) in assessment CPTCode field")

	public void CPTCode(String CPTCode) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_cptcode') ,GlobalVariable.timeout)

		Thread.sleep(1000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_cptcode'))

		Thread.sleep(1000)

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_cptcode'), CPTCode)
	}



	@And("I enter (.*) in assessment comment field")

	public void comment(String Comment) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_textarea_select_notes') ,GlobalVariable.timeout)

		Thread.sleep(1000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_textarea_select_notes'))

		Thread.sleep(1000)

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_textarea_select_notes'), Comment)
	}


	@And("I click on Save button to save assessment")

	public void Obj_buttonsaveand() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_button_Saveand') ,GlobalVariable.timeout)

		Thread.sleep(1000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_button_Saveand'))
	}

	@And("I click on Cancel button to cancel the saved assessment")

	public void Obj_buttoncancel() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_button_Cancel') ,GlobalVariable.timeout)

		Thread.sleep(1000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_button_Cancel'))
		Thread.sleep(3000)
	}


	@And("I click on Save and Close button to save assessment")

	public void Obj_buttonsaveandclose() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_buttonsaveandclose') ,GlobalVariable.timeout)

		Thread.sleep(1000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_buttonsaveandclose'))
	}

	@And("I should see success message for added assessment")

	public void addadalert() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Alertsaved') ,GlobalVariable.timeout)

		Thread.sleep(2000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Alertsaved'))


		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Alertsaved'), 'successRecord saved successfullyHide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Alertsaved'),
				GlobalVariable.timeout)
	}


	@And("I should not see the canceled assessment present on the grid")

	public void cancelassessmentverify() {

		Thread.sleep(2000)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
		List<WebElement> Table2=	driver.findElements(By.xpath("//div[@class='section assessment relative k-content k-state-active']//div[@class='k-grid-content k-auto-scrollable']//tbody//tr"))
		s2=Table2.size()
		Thread.sleep(1000)

		WebUI.verifyEqual(s1, s2)
		WebUI.switchToDefaultContent()
	}



	@And("I should see Edit button available and functional")

	public void editbuttonassessmentverify() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_v_nameAssessment'), GlobalVariable.timeout)

		Thread.sleep(5000)

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Editbutton') ,GlobalVariable.timeout)
		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_Editbutton') ,GlobalVariable.timeout)
	}
	
	
	
	@And("I should see the name of assessment1")	
		public void assessment1nameverify() {
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_compare_title1'), GlobalVariable.timeout)
	
			Thread.sleep(4000)

			WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_compare_title1'), GlobalVariable.timeout)
	
		}
	
		@And("I should see the date at which assessment1 is created")
		public void assessment1dateverify() {
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_comapre_date1'), GlobalVariable.timeout)
	
			Thread.sleep(2000)

			WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_comapre_date1'), GlobalVariable.timeout)
	
		}
		
		
		@And("I should see the name of assessment2")
		public void assessment2nameverify() {
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_compare_title2'), GlobalVariable.timeout)
	
			Thread.sleep(2000)

			WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_compare_title2'), GlobalVariable.timeout)
	
		}
	
		@And("I should see the date at which assessment2 is created")
		public void assessment2dateverify() {
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_comapre_date2'), GlobalVariable.timeout)
	
			Thread.sleep(2000)

			WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_comapre_date2'), GlobalVariable.timeout)
	
		}
		
		@And("I should see stop compare button of assessment")
		public void assessmentstopcomprebtunverify() {
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_compare_stopcross'), GlobalVariable.timeout)
	
			Thread.sleep(1000)

			WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_compare_stopcross'), GlobalVariable.timeout)
	
		}
		
		@And("I click on stop compare button of assessment")
		public void assessmentcomparecross() {
	
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_compare_stopcross'), GlobalVariable.timeout)
	

			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_compare_stopcross'))
	
		}



	@And("I should see the newly added (.*) and (.*) and (.*) for assessment on grid")

	public void Addassessmentverify(String Title, String BillableType, String CPTCode) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_v_nameAssessment'), GlobalVariable.timeout)


		Thread.sleep(2000)

		// Create object of SimpleDateFormat class and decide the format
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		//get current date time with Date()
		Date date = new Date();
		// Now format the date
		String date1= dateFormat.format(date);
		// Print the Date
		System.out.println(date1);




		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_v_date'), date1)

		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_v_nameAssessment'), Title)

		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_v_billable'), BillableType)

		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_v_cptcode'), CPTCode)


	}
	

	@And("I should see (.*) and current system Date and No of Q Ans and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) for assessment in the right pan")

	public void Addassessmentverifyrightpan(String Title, String Ans1, String Ans2, String Ans3, String Ans4, String Ans5, String Comment) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_v_nameAssessment'), GlobalVariable.timeout)


		Thread.sleep(1000)

		// Create object of SimpleDateFormat class and decide the format
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		//get current date time with Date()
		Date date = new Date();
		// Now format the date
		String date1= dateFormat.format(date);
		// Print the Date
		System.out.println(date1);
		String datebrackets = '('+date1+')'


		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_v_rightpan_title'), Title)

		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_v_rightpan_date'), datebrackets)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_v_rightpan_colorcode'), GlobalVariable.timeout)

		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_v_rightpan_q1'), Ans1)

		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_v_rightpan_q2'), Ans2)

		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_v_rightpan_q3'), Ans3)

		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_v_rightpan_q4'), Ans4)

		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_v_rightpan_q5'), Ans5)

		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/Assessment/OR_Assessment/Obj_v_rightpan_comment'), Comment)
	}
















//	public void ClickonButton(String locatortype, String Locator) {
//		
//		// log print clicking on this button	
//		// wait for button to be click able
//		// click on the button
//		// Verify button is clicked
//		
//		//logs implement in listeners
//		
//	}
}



