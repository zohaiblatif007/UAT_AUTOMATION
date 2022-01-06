package clinicalPackage
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.When
import groovypackage.Stringtext
import internal.GlobalVariable



class FamilyHistorysteps {
	WebDriver driver = DriverFactory.getWebDriver()

	public static int s1,s2

	public static int e=0
	@And("I click on Family History tab")
	public void Family_History_tab() {
		'Click the button on family history'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_Family HistoryTab'))
	}


	@When("I click on family history Add button")
	public void familyhistory_Addbutton() {
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_button_Add'),
				GlobalVariable.timeout)

		Thread.sleep(2000)
		'Click on add button '
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_button_Add'))
		Thread.sleep(2000)
	}


	@When("I click on family history Edit button")
	public void familyhistory_Editbutton() {
		e=1
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/button_Edit'),
				GlobalVariable.timeout)
		Thread.sleep(2000)

		'Click on edit button '
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/button_Edit'))
		Thread.sleep(2000)
	}


	@When("I enter (.*) to delete record in family history")
	def I_click_on_delete_button(String Problem_Name) {
		Thread.sleep(5000)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.problem']//table)[2]//tbody"))
		List<WebElement> Table1=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.familyHistory']//table)[2]//tbody//tr//td[2])"))

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
			String xpathd1 = "(//div[@data-mz-key='clinical.familyHistory']//table)[2]//tr[" +i +"]//td[2]"

			td1.addProperty('xpath', ConditionType.EQUALS, xpathd1)

			text1= WebUI.getText(td1)

			if(text1==Problem_Name) {
				break
			}
		}
		TestObject td2 = new TestObject('delete')

		String xpathd2 = "(//div[@data-mz-key='clinical.familyHistory']//table)[2]//tr[" +i +"]//td[11]//button"

		td2.addProperty('xpath', ConditionType.EQUALS, xpathd2)

		WebUI.click(td2)


		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in family history source code field")
	public void familyhistory_sourcecodefield(String Source_Code) {

		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_CodeSystem'),
				GlobalVariable.timeout)
		Thread.sleep(2000)
		'Click on Source code'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_CodeSystem'))

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath1 = ('//li[text()="' + Source_Code) +'"]'

		TestObject t1 = new TestObject('Mild')

		t1.addProperty('xpath', ConditionType.EQUALS, xpath1)
		Thread.sleep(1000)
		WebUI.click(t1)

		WebUI.switchToDefaultContent()


		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_li_ICD-9'),
		//			GlobalVariable.timeout)
		//
		//		'Select LCD Source'
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_li_ICD-9'))
	}

	@And("I enter (.*) in family history code or name field")
	public void familyhistory_codename_field(String Code_Name) {

		'Enter text in code field \'a\''
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_inputcode'), Code_Name)

		Thread.sleep(3000)

		WebUI.sendKeys(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_inputcode'), Keys.chord(
				Keys.TAB))
	}

	@And("I enter (.*) in family history relationship field")
	public void familyhistory_relationshipfield(String Relationship) {

		'Click on Relationship Field'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_Relationship'))

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath2 = ('//li[text()="' + Relationship) +'"]'

		TestObject t2 = new TestObject('Mild')

		t2.addProperty('xpath', ConditionType.EQUALS, xpath2)

		WebUI.click(t2)

		WebUI.switchToDefaultContent()


		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_li_Fosterchild'),
		//			GlobalVariable.timeout)
		//
		//		'Select Foster Child'
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_li_Fosterchild'))
	}

	@And("I enter (.*) in family history gender field")
	public void familyhistorygender_field(String Gender) {

		'Click on Gender Field'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_genderselect'))

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		String xpath3 = ('(//li[text()="' + Gender) +'"])[2]'

		TestObject t3 = new TestObject('Mild')

		t3.addProperty('xpath', ConditionType.EQUALS, xpath3)

		WebUI.click(t3)

		WebUI.switchToDefaultContent()

		//		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_li_Male'),
		//			GlobalVariable.timeout)
		//
		//		'Select Male'
		//		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_li_Male'))

	}

	@And("I enter (.*) in family history start date field")
	public void familyhistory_startdatefield(String Start_Date) {

		'Set the Start Date'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_StartDateField'), Start_Date)
	}

	@And("I enter (.*) in family history end date field")
	public void familyhistory_enddate_field(String End_Date) {

		'Set End Date'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_EndDateField'),End_Date)
	}

	@And("I enter (.*) in family history negation field")
	public void familyhistory_negationfield(String Negation) {
		if(Negation=='Yes' && e==0) {
			'Select Negation'
			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_inputnegation'))
		}
		if(Negation=='No' && e==1) {
			'Select Negation'
			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_inputnegation'))
		}
	}

	@And("I enter (.*) in family history deceased field")
	public void familyhistory_deceasedfield(String Deceased) {
		if(Deceased=='Yes' && e==0) {
			'Select Deceased'
			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_inputdeceased'))
		}
		if(Deceased=='No' && e==1) {
			'Select Deceased'
			WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_inputdeceased'))
		}
	}

	@And("I enter (.*) in family history comments field")
	public void familyhistory_commentsfield(String Comments) {

		'Enter the Comments in Comment field'
		WebUI.setText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_inputtextNote'), Comments)
	}

	@And("I click on family history Update button")
	public void familyhistory_Updatebutton() {

		'Click on Update Button'
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_update'))
	}

	@And("I should see success message for added family history")
	public void successmessage_familyhistory() {
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'), GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'),'successRecord saved successfully.Hide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_Alertsaved'),
				GlobalVariable.timeout)
	}


	@And("I should see success message for edit family history")
	public void edit_successmessage_familyhistory() {
		WebUI.waitForElementClickable(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_AlertUpdate'), GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_AlertUpdate'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_AlertUpdate'),
				'successRecord updated successfully.Hide')

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_AlertUpdate'),
				GlobalVariable.timeout)
	}



	@And("I should see the newly added family history record (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*) and (.*) on grid")
	public void newlyaddedfamilyhistory_grid(String Source_Code, String Code_Name, String Relationship, String Gender, String Start_Date, String End_Date, String Negation, String Deceased, String Comments) {


		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_td_source'),Source_Code)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_td_code'), Code_Name)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_td_relation'),Relationship)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_td_gender'),Gender)
		String stdate= Stringtext.planetext(Start_Date)
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_td_startdate'),stdate)
		String edate= Stringtext.planetext(End_Date)
		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_td_endate'),edate)

		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_td_negation'),Negation)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_td_deceased'),Deceased)

		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_FamilyHistry/Obj_td_comment'),Comments)
	}

	@And("I should see the deleted family history not present on grid")
	def very_deleted_data_should_benot_visible_on_the_UI(){
		'Verify the record gone from UI'

		Thread.sleep(3000)

		/*WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Refresh button/Obj_refreshbutton'))
		 Thread.sleep(9000)*/

		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)

		//WebElement Table = driver.findElement(By.xpath("(//div[@data-mz-key='clinical.familyHistory']//table)[2]//tbody"))
		List<WebElement> Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.familyHistory']//table)[2]//tbody//tr//td[2])"))
		Table2=	driver.findElements(By.xpath("((//div[@data-mz-key='clinical.familyHistory']//table)[2]//tbody//tr//td[2])"))
		s2=Table2.size()
		s1=s1-1
		WebUI.verifyEqual(s1, s2)
		WebUI.switchToDefaultContent()
	}
}