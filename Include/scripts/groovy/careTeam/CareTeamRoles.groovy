package careTeam
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.When
import groovypackage.Stringtext
import internal.GlobalVariable
import utility_Functions.UtilityFunctions



class CareTeamRoles {
	WebDriver driver = DriverFactory.getWebDriver()
	UtilityFunctions obj=new UtilityFunctions();

	String start_date;
	String end_date;
	TestObject careTeamTab=findTestObject('Object Repository/OR_CareTeam/CareTeam_Tab')
	TestObject buttonAdd=findTestObject('Object Repository/OR_CareTeam/buttonAdd')
	TestObject memberName=findTestObject('Object Repository/OR_CareTeam/MemberName')
	TestObject startDate=findTestObject('Object Repository/OR_CareTeam/startDate')
	TestObject endDate=findTestObject('Object Repository/OR_CareTeam/endDate')
	TestObject saveButton=findTestObject('Object Repository/OR_CareTeam/TickSave')
	TestObject editButton=findTestObject('Object Repository/OR_CareTeam/EditRecord')
	TestObject deleteButton=findTestObject('Object Repository/OR_CareTeam/DeleteRecord')
	TestObject inputMember=findTestObject('Object Repository/OR_CareTeam/InputMemberName')
	TestObject frame=findTestObject('Object Repository/OR_CareTeam/frameObject')

	@And("I click on Care Team	tab")
	void  Click_CareTeam_Tab() {

		WebUI.waitForElementClickable(careTeamTab, GlobalVariable.timeout)
		Thread.sleep(2000)
		// 'Click on Clinical tab'
		System.out.println("user click on Care Team Tab")
		WebUI.click(careTeamTab)

		Thread.sleep(1000)
		WebUI.verifyElementPresent(buttonAdd, GlobalVariable.timeout)
		System.out.println("user is on Care Team Tab")
		Thread.sleep(2000)
	}

	@When("I click on Care Team Add button")
	void Click_Add_Button() {
		'Click on Add Button'
		WebUI.click(buttonAdd)
	}

	@And("I enter (.*) in Care Team name field")
	void  user_enter_name_in_member_field(String Name){

		WebUI.click(memberName)
		Thread.sleep(2000)
		obj.setValues(inputMember,Name)
		Thread.sleep(2000);
		String xpath='//ul[contains(@id,"care_team_name_listbox")]//li'
		obj.selectdropdown(frame, xpath)
	}

	@And("I enter in  start date field while Start Date is less then current Date")
	void enter_start_date() {
		'Set the Start Date'
		//enter number with + sign if you want to go to future date and with - if in the past
		//10 days past the current date
		start_date=obj.modifyDate(-10);
		obj.setValues(startDate,start_date)
	}

	@And("I enter in  end date field while start Date is greater then current Date")
	void enter_greater_start_date() {
		'Set the Start Date'
		//5 days ahead of the current date
		start_date=obj.modifyDate(5);
		obj.setValues(startDate,start_date)
	}

	@And("I enter in  end date field while end Date is greater then current Date")
	void enter_end_date() {
		'Set the End Date'
		//10 days ahead of the current date
		end_date=obj.modifyDate(10);
		obj.setValues(endDate,end_date)
	}

	@And("I enter in  end date field while end Date is equal to current Date")
	void enter_current_date() {
		'Set the End Date'
		//10 days ahead of the current date
		end_date=obj.currentDate();
		obj.setValues(endDate,end_date)
	}

	@And("I enter in  end date field while end Date is less then current Date")
	void enter_lesser_end_date() {
		'Set the End Date'
		//10 days ahead of the current date
		end_date=obj.modifyDate(-5);
		obj.setValues(endDate,end_date)
	}

	@And("I click on tick button to save record")
	void click_save_button() {
		'Press the Save Button to save the things'
		WebUI.click(saveButton)
	}
	@And("I should see the newly added (.*) and (.*) and Start Date and End Date as a Care Team record on grid")
	void very_data_should_be_visible_on_the_UI(String Name,String Role){
		'Verify the Entered Data'
		Thread.sleep(2000)
		String verifyMemberName="//div[@data-mz-key='careTeam']//td[1]"
		obj.customVerify(frame,verifyMemberName,Name)

		String verifyRole="//div[@data-mz-key='careTeam']//td[2]"
		obj.customVerify(frame,verifyRole,Role)

		String date= Stringtext.planetext(start_date)
		String verifyStartDate= "//div[@data-mz-key='careTeam']//td[6]"
		obj.customVerify(frame,verifyStartDate,date)

		date=Stringtext.planetext(end_date)
		String verifyEndDate= "//div[@data-mz-key='careTeam']//td[7]"
		obj.customVerify(frame,verifyEndDate,date)
	}

	@And("I should see  (.*) under (.*) column on patient grid")
	void verify_name_appear_in_CareCoordinator(String member,String Role) {

		Thread.sleep(6000)
		if(Role=="Care Manager") {
			WebUI.scrollToElement(findTestObject('Object Repository/OR_CareTeam/verifycoordinator'), 3)
			WebUI.verifyElementText(findTestObject('Object Repository/OR_CareTeam/verifycoordinator'),member)
		}
		else if(Role=="Care Physician") {
			WebUI.scrollToElement(findTestObject('Object Repository/OR_CareTeam/verifyphysician'), 3)
			WebUI.verifyElementText(findTestObject('Object Repository/OR_CareTeam/verifyphysician'),member)
		}
		else if(Role=="Nurse") {
			WebUI.scrollToElement(findTestObject('Object Repository/OR_CareTeam/verifyphysician'), 3)
			WebUI.verifyElementText(findTestObject('Object Repository/OR_CareTeam/verifyNurse'),member)
		}

		Thread.sleep(2000)
	}
	@And("I should not see (.*) under (.*) column on patient grid")
	void verify_name_Doesnt_appear_in_CareCoordinator(String member,String Role) {
		if(Role=="Care Manager") {
			WebUI.scrollToElement(findTestObject('Object Repository/OR_CareTeam/verifycoordinator'), 3)
			WebUI.verifyElementText(findTestObject('Object Repository/OR_CareTeam/verifycoordinator'),"")
		}
		else if(Role=="Care Physician") {
			WebUI.scrollToElement(findTestObject('Object Repository/OR_CareTeam/verifyphysician'), 3)
			WebUI.verifyElementText(findTestObject('Object Repository/OR_CareTeam/verifyphysician'),"")
		}
		else if(Role=="Nurse") {
			WebUI.scrollToElement(findTestObject('Object Repository/OR_CareTeam/verifyphysician'), 3)
			WebUI.verifyElementText(findTestObject('Object Repository/OR_CareTeam/verifyNurse'),"")
		}
	}
	@When("I click on Care Edit button of (.*)")
	void Click_Edit_Button(String memberName) {
		String xpath='//td[text()="'+memberName+'"]//following-sibling::td[@class="text-center action-btns"]//a[@title="Edit"]'
		'Click on Edit Button'
		obj.customClick(frame, xpath)
	}

	@When("I click on Care Delete button of (.*)")
	void Click_Delete_Button(String memberName) {
		String xpath='//td[text()="'+memberName+'"]//following::td[@class="text-center action-btns"]//button[@title="Delete"]'
		'Click on Delete Button'
		obj.customClick(frame, xpath)
	}
}