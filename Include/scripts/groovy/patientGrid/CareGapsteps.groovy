package patientGrid
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import groovypackage.Stringtext
import internal.GlobalVariable


class CareGapsteps {


	WebDriver driver = DriverFactory.getWebDriver()


	public static int s1,s2
	public static int e=0, careGOAL=0, goalcare=0

	@When("I click on Care Gaps tab")
	def buttoncaregaptab() {
		Stringtext.planetext('10101090')


		WebUI.waitForElementClickable( findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_caregaptab'),GlobalVariable.timeout)

		Thread.sleep(3000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_caregaptab'))
		
		Thread.sleep(3000)
	}
	//
	@When("I should see button of create task for (.*) care gap")
	def buttncreatetasksee(String caregap) {

		Thread.sleep(4000)
		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_frame'), GlobalVariable.timeout)

		String xpath
		xpath= ' //div[@data-mz-key]//a[text()="' +caregap+ '"]//parent::td//following-sibling::td[10]//button[2]'

		TestObject  bttn= new TestObject('bttn')
		bttn.addProperty("xpath", ConditionType.EQUALS, xpath)


		String title1=WebUI.getAttribute(bttn, 'title')
		System.out.println(title1)

		if(title1=='View user task') {

			careGOAL=1

			WebUI.click(bttn)
			WebUI.switchToDefaultContent()
			

			WebUI.waitForElementClickable( findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_buttondelete'),GlobalVariable.timeout)

			Thread.sleep(5000)

			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_buttondelete'))
			WebUI.waitForElementClickable( findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_buttondeleteconfirm'),GlobalVariable.timeout)

			Thread.sleep(2000)
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_buttondeleteconfirm'))

			Thread.sleep(7000)

		}
		else {
			

			WebUI.verifyElementAttributeValue(bttn, 'title', 'Create task', GlobalVariable.timeout)

			WebUI.switchToDefaultContent()
		}


	}

	@When("I click on create task button of (.*) care gap")
	def buttncreatetask(String caregap) {


		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_frame'), GlobalVariable.timeout)

		String xpath
		xpath= '//div[@data-mz-key]//a[text()="' +caregap+ '"]//parent::td//following-sibling::td[10]//button[2]'

		TestObject  bttn= new TestObject('bttn')
		bttn.addProperty("xpath", ConditionType.EQUALS, xpath)

		WebUI.click(bttn)

		WebUI.switchToDefaultContent()



		//		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_createtaskbutton'),GlobalVariable.timeout)
		//		Thread.sleep(2000)
		//		'Click on Add button'
		//		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_createtaskbutton'))
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_taskfield'),GlobalVariable.timeout)

	}


	@When("I should be on Create New Task form")
	def taskpgevalidation() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_taskfield'),GlobalVariable.timeout)

		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_createtaskpagevalidation'), "Create New Task")
	}



	@When("I enter (.*) in care gap task field")
	def buttoncreatetask(String Taskname) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_taskfield'),GlobalVariable.timeout)

		'Click on Add button'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_taskfield'), Taskname)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_taskfield'),Keys.chord(Keys.TAB))
	}

	@When("I enter (.*) in care gap task start date field")
	def Strtdatetask(String Strtdate) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_startdate'), Strtdate)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_startdate'),Keys.chord(Keys.TAB))
	}


	@When("I enter (.*) in care gap task comleted on date field")
	def Completeddatetask(String Completeddate) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_datecompletedon'), Completeddate)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_datecompletedon'),Keys.chord(Keys.TAB))
	}


	@When("I enter (.*) in care gap task status field")
	def statustask(String status) {

		
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_statusdropdown'))
		Thread.sleep(1000)
		
		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_frame'), GlobalVariable.timeout)

		String xpath1
		if(careGOAL==0) {
			xpath1 = '(//li[text()="' +status+ '"])'
		}
		if(careGOAL==1) {
			xpath1 = '(//li[text()="' +status+ '"])[2]'
		}

		TestObject t1 = new TestObject('mild')

		t1.addProperty('xpath', ConditionType.EQUALS, xpath1)

		WebUI.click(t1)

		WebUI.switchToDefaultContent()
	}

	@When("I enter (.*) in care gap task description field")
	def Desriptionetask(String Desription) {

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_description'), Desription)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_description'),Keys.chord(Keys.TAB))
	}


	@When("I set recurrence on (.*) bases in care gap task")
	def recurrencetask(String recurrence) {

		Thread.sleep(1000)
		
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_recurrence'))
		
		Thread.sleep(1000)
		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_frame'), GlobalVariable.timeout)

		String xpath2
		
		if(careGOAL==0) {
		xpath2 = '(//li[text()="' +recurrence+ '"])'
		}
		if(careGOAL==1) {
		xpath2 = '(//li[text()="' +recurrence+ '"])[2]'
		}
		TestObject t2 = new TestObject('Mild')

		t2.addProperty('xpath', ConditionType.EQUALS, xpath2)

		WebUI.click(t2)

		WebUI.switchToDefaultContent()
	}


	@When("I enter (.*) in care gap task every day field")
	def everydaytask(String Days) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_everyday1'))
		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_everyday2'))

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_everyday1'), Days)
	}

	@When("I enter (.*) in care gap task every week field")
	def everyweektask(String week) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_everyweek1'))
		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_everyweek2'))

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_everyweek1'), week)
	}

	@When("I enter (.*) in care gap task every month field")
	def everymonthtask(String month) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_everymonth1'))
		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_everymonth2'))

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_everymonth1'), month)
	}

	@When("I enter (.*) in care gap task every year field")
	def everyyeartask(String year) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_everyyear1'))
		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_everyyear2'))

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_everyyear1'), year)
	}

	@When("I enter (.*) in care gap task ocurrences field")
	def occurencetask(String ocurrences) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_occurences1'))
		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_occurences2'))

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_occurences1'), ocurrences)
	}


	@When("I click on create button to save data")
	def buttonsavetask() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_buttoncreate'),GlobalVariable.timeout)

		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_buttoncreate'))
	}
	//
	@When("I should see button of view user task for (.*) care gap")
	def buttnviewtask(String caregap) {
		Thread.sleep(2000)

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_frame'), GlobalVariable.timeout)

		String xpath
		xpath= ' //div[@data-mz-key]//a[text()="' +caregap+ '"]//parent::td//following-sibling::td[10]//button[2]'

		TestObject  bttn= new TestObject('bttn')
		bttn.addProperty("xpath", ConditionType.EQUALS, xpath)

		WebUI.verifyElementAttributeValue(bttn, 'title', 'View user task', GlobalVariable.timeout)

		//		WebUI.click(bttn)

		WebUI.switchToDefaultContent()

	}

	@When("I should be able to click on view user task button of (.*) care gap")
	def buttnviewtaskclickablecheck(String caregap) {
		Thread.sleep(2000)

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_frame'), GlobalVariable.timeout)

		String xpath
		xpath= ' //div[@data-mz-key]//a[text()="' +caregap+ '"]//parent::td//following-sibling::td[10]//button[2]'

		TestObject  bttn= new TestObject('bttn')
		bttn.addProperty("xpath", ConditionType.EQUALS, xpath)

		WebUI.verifyElementClickable(bttn)

		WebUI.switchToDefaultContent()

	}



	@When("I click on view task button of (.*) care gap")
	def buttnviewtaskclick(String caregap) {
		Thread.sleep(1000)

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_frame'), GlobalVariable.timeout)

		String xpath
		xpath= ' //div[@data-mz-key]//a[text()="' +caregap+ '"]//parent::td//following-sibling::td[10]//button[2]'

		TestObject  bttn= new TestObject('bttn')
		bttn.addProperty("xpath", ConditionType.EQUALS, xpath)

		WebUI.click(bttn)

		WebUI.switchToDefaultContent()

	}



	@When("I click on delete button to delete task")
	def buttondeletetask() {


		WebUI.waitForElementClickable( findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_buttondelete'),GlobalVariable.timeout)
		Thread.sleep(3000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_buttondelete'))
	
		}


	@When("I click on okay button to delete task")
	def buttondeletetaskok() {


		WebUI.waitForElementClickable( findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_buttondeleteconfirm'),GlobalVariable.timeout)
		Thread.sleep(2000)
		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_buttondeleteconfirm'))
	}




















	@When("I should see entered details of (.*) task")
	def enteredtaskedetail(String caregap) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_taskfield'),GlobalVariable.timeout)
		Thread.sleep(2000)
		//	String task1= WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_taskfield'))

		String task1=WebUI.getAttribute(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_taskfield'), 'value')


		System.out.println(" tasktext= " +task1)
	}



	//		@When("I am on Create New Task form")
	//		def taskpagevalidation() {
	//
	//			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_taskfield'),GlobalVariable.timeout)
	//
	//			WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_createtaskpagevalidation'), "Create New Task")
	//		}





	@When("I click on patient task tab in main menu")
	public void clickontakmenutab() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_tasktababovebar'),GlobalVariable.timeout)


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_tasktababovebar'))


		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_td_task'),GlobalVariable.timeout)

		Thread.sleep(1000)

	}


	@When("I should see task (.*) with status (.*) and start date (.*) end date (.*) present in task section")
	def validationtask(String task, String status, String Strtdate, String Enddate) {

		Thread.sleep(2000)

		String smonth = Strtdate.substring(0, 2);
		String   sday = Strtdate.substring(2, 4);
		String  syear = Strtdate.substring(4, 8);

		String sdate1= ''+smonth+'/'+sday+'/'+syear+''

		System.out.println(sdate1)

		String emonth = Enddate.substring(0, 2);
		String   eday = Enddate.substring(2, 4);
		String  eyear = Enddate.substring(4, 8);

		String edate1= ''+emonth+'/'+eday+'/'+eyear+''

		System.out.println(edate1)



		Thread.sleep(2000)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
		List<WebElement> Table1=	driver.findElements(By.xpath("//div[@id='grid_campaign']//tbody//tr//td[1]"))


		TestObject td1 = new TestObject('Mild')

		int i=1, size, size2
		String text1
		size=Table1.size()
		System.out.println(size)
		for( ;i<=size;i++) {
			String xpathd1 = "//div[@id='grid_campaign']//tbody//tr[" +i +"]//td[1]"

			td1.addProperty('xpath', ConditionType.EQUALS, xpathd1)

			text1= WebUI.getText(td1)

			if(text1==task) {

				break
			}
		}

		TestObject td3 = new TestObject('delete')

		String xpathd3 = "//div[@id='grid_campaign']//tbody//tr[" +i +"]//td[1]"

		td3.addProperty('xpath', ConditionType.EQUALS, xpathd3)

		WebUI.verifyElementText(td3, task)


		TestObject td2 = new TestObject('delete')

		String xpathd2 = "//div[@id='grid_campaign']//tbody//tr[" +i +"]//td[6]"

		td2.addProperty('xpath', ConditionType.EQUALS, xpathd2)

		WebUI.verifyElementText(td2, status)



		TestObject datest = new TestObject('datest')

		String xpathd4 = "//div[@id='grid_campaign']//tbody//tr[" +i +"]//td[8]"

		datest.addProperty('xpath', ConditionType.EQUALS, xpathd4)

		String Webdatest = WebUI.getText(datest)

		String Webdatest1 = Webdatest.substring(0, 10)

		System.out.println(Webdatest1)

		WebUI.verifyMatch(Webdatest1, sdate1, false)



		TestObject dateend = new TestObject('dateend')

		String xpathd5 = "//div[@id='grid_campaign']//tbody//tr[" +i +"]//td[9]"

		dateend.addProperty('xpath', ConditionType.EQUALS, xpathd5)

		String Webdayeend=WebUI.getText(dateend)

		String Webdayeend1= Webdayeend.substring(0, 10)

		System.out.println(Webdatest1)

		WebUI.verifyMatch(Webdayeend1, edate1, false)




		WebUI.switchToDefaultContent()
		//		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_td_task'), task)
		//
		//		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_td_status'), status)

	}

	@When("I click on patient tab in main menu")
	def buttonpatienttab() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_patienttab'),GlobalVariable.timeout)

		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_patienttab'))
	
		Thread.sleep(1000)
		}









	@When("I should see button of create goal and task for (.*) care gap")
	def buttongaolvald(String CareGap) {
        Thread.sleep(3000)
		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_frame'), GlobalVariable.timeout)

		String xpath
		xpath= ' //div[@data-mz-key]//a[text()="' +CareGap+ '"]//parent::td//following-sibling::td[10]//button[1]'

		TestObject  bttn= new TestObject('bttn')
		bttn.addProperty("xpath", ConditionType.EQUALS, xpath)

		String title1=WebUI.getAttribute(bttn, 'title')
		System.out.println(title1)

		if(title1=='View patient goal/task') {

			goalcare=1

			WebUI.click(bttn)
			WebUI.switchToDefaultContent()

			Thread.sleep(5000)
			
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Taskcheckbox'),GlobalVariable.timeout)
			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_butondelete'),GlobalVariable.timeout)

			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_butondelete'))


			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_butondelete'),GlobalVariable.timeout)

			Thread.sleep(1000)
			
			WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_buttondeleteconfirm'))

			Thread.sleep(7000)
		}

		else {

			WebUI.verifyElementAttributeValue(bttn, 'title', 'Create patient goal/task', GlobalVariable.timeout)


			WebUI.switchToDefaultContent()

		}












		//		WebUI.verifyElementAttributeValue(bttn, 'title', 'Create patient goal/task', GlobalVariable.timeout)

		//		WebUI.click(bttn)

		//		WebUI.switchToDefaultContent()

	}




	@When("I click on create goal and task button of (.*) care gap")
	def buttongaol(String CareGap) {

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_frame'), GlobalVariable.timeout)

		String xpath
		xpath= ' //div[@data-mz-key]//a[text()="' +CareGap+ '"]//parent::td//following-sibling::td[10]//button[1]'

		TestObject  bttn= new TestObject('bttn')
		bttn.addProperty("xpath", ConditionType.EQUALS, xpath)

		WebUI.click(bttn)

		WebUI.switchToDefaultContent()
	}

	@When ("I am on create goal and task form")
	public void taskpage() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Goalfiled'), GlobalVariable.timeout)

		Thread.sleep(5000)
		//		String title= WebUI.getWindowTitle()
		//
		//		System.out.println(title)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Alertpagevalidation'))
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Alertpagevalidation'), "Add Goal & Task")
		//		WebUI.switchToWindowIndex(0)

		//		WebUI.verifyTextPresent("Add Goal & Task", false, FailureHandling.STOP_ON_FAILURE)

	}




	@When("I enter (.*) in  goal field")
	def goalfield(String goal) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Goalfiled'), GlobalVariable.timeout)

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Goalfiled'), goal)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Goalfiled'),Keys.chord(Keys.TAB))
	}


	@When("I enter (.*) in  goal target type field")
	def goaltrgettype(String trgettype) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Targettype'))
		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_frame'), GlobalVariable.timeout)

		String xpath2

		if(goalcare==0) {
			xpath2 = '(//li[text()="' +trgettype+ '"])'
		}

		if(goalcare==1) {
			xpath2 = '(//li[text()="' +trgettype+ '"])[2]'
		}

		TestObject t2 = new TestObject('Mild')

		t2.addProperty('xpath', ConditionType.EQUALS, xpath2)

		WebUI.click(t2)

		WebUI.switchToDefaultContent()
	}


	@When("I enter (.*) in  goal start date field")
	def goalstartdatefield(String startdate) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_GoalStartdate'), GlobalVariable.timeout)

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_GoalStartdate'), startdate)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_GoalStartdate'),Keys.chord(Keys.TAB))
	}


	@When("I enter (.*) in goal end date field")
	def goalenddatefield(String enddat) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Goalendate'), GlobalVariable.timeout)

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Goalendate'), enddat)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Goalendate'),Keys.chord(Keys.TAB))
	}


	@When("I enter (.*) in goal priority field")
	def goalpriority(String priority) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_GoalPeriority'))
		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_frame'), GlobalVariable.timeout)

		String xpath2
		if(goalcare==0) {
			xpath2 = '(//li[text()="' +priority+ '"])'
		}
		if(goalcare==1) {
			xpath2 = '(//li[text()="' +priority+ '"])[2]'
		}

		TestObject t2 = new TestObject('Mild')

		t2.addProperty('xpath', ConditionType.EQUALS, xpath2)

		WebUI.click(t2)

		WebUI.switchToDefaultContent()
	}


	@When("I enter (.*) in goal owner field")
	def goalowner(String owner) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Owner'))
		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_frame'), GlobalVariable.timeout)

		String xpath2

		if(goalcare==0) {
			xpath2 = '(//li[text()="' +owner+ '"])'
		}
		if(goalcare==1) {
			xpath2 = '(//li[text()="' +owner+ '"])[2]'
		}
		TestObject t2 = new TestObject('Mild')

		t2.addProperty('xpath', ConditionType.EQUALS, xpath2)

		WebUI.click(t2)

		WebUI.switchToDefaultContent()
	}


	@When("I enter (.*) in goal comments field")
	def goalcommentsfield(String comments) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Goalcomment'), GlobalVariable.timeout)

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Goalcomment'), comments)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Goalcomment'),Keys.chord(Keys.TAB))
	}


	@When("I enter (.*) in task field")
	def taskfield(String task) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Taskfield'), GlobalVariable.timeout)

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Taskfield'), task)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Taskfield'),Keys.chord(Keys.TAB))
	}


	@When("I enter (.*) in task start date field")
	def taskstartdatefield(String startdate) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Tasksratrtdate'), GlobalVariable.timeout)

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Tasksratrtdate'), startdate)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Tasksratrtdate'),Keys.chord(Keys.TAB))
	}


	@When("I enter (.*) in task target field")
	def tasktargetdatefield(String targetdate) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Tasktargetdate'), GlobalVariable.timeout)

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Tasktargetdate'), targetdate)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Tasktargetdate'),Keys.chord(Keys.TAB))
	}


	@When("I enter (.*) in task priority field")
	def taskpriority(String priority) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Taskperiority'))
		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_frame'), GlobalVariable.timeout)

		String xpath2

		if(goalcare==0) {
			xpath2 = '(//li[text()="' +priority+ '"])[3]'
		}
		if(goalcare==1) {
			xpath2 = '(//li[text()="' +priority+ '"])[4]'
		}

		TestObject t2 = new TestObject('Mild')

		t2.addProperty('xpath', ConditionType.EQUALS, xpath2)

		WebUI.click(t2)

		WebUI.switchToDefaultContent()
	}


	@When("I enter (.*) in task status field")
	def taskstatus(String status) {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Taskstatus'))
		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_frame'), GlobalVariable.timeout)

		String xpath2
		if(goalcare==0) {
			xpath2 = '(//li[text()="' +status+ '"])[3]'
		}
		if(goalcare==1) {
			xpath2 = '(//li[text()="' +status+ '"])[4]'
		}
		TestObject t2 = new TestObject('Mild')

		t2.addProperty('xpath', ConditionType.EQUALS, xpath2)

		WebUI.click(t2)

		WebUI.switchToDefaultContent()
	}


	@When("I enter (.*) in task comments field")
	def taskcommentsfield(String taskcomments) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Taskcomment'), GlobalVariable.timeout)

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Taskcomment'), taskcomments)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Taskcomment'),Keys.chord(Keys.TAB))
	}

	@When("I click on save button to save data of care gap goal and task")
	def buttonsavegaol() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Savebuton'),GlobalVariable.timeout)

		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Savebuton'))
	}


	@When("I click in task check box to disable the task")
	def checkboxtask() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Taskcheckbox'),GlobalVariable.timeout)

		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Taskcheckbox'))
	}


	@When("I click in goal check box to disable the goal")
	def checkboxgaol() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Goalcheckbox'),GlobalVariable.timeout)

		'Click on Add button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Goalcheckbox'))
	}



	@When("I should see button of view task and goal for (.*) care gap")
	def buttnviewgoal(String caregap) {

		Thread.sleep(3000)
		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_frame'), GlobalVariable.timeout)

		String xpath
		xpath= ' //div[@data-mz-key]//a[text()="' +caregap+ '"]//parent::td//following-sibling::td[10]//button[1]'

		TestObject  bttn= new TestObject('bttn')
		bttn.addProperty("xpath", ConditionType.EQUALS, xpath)

		WebUI.verifyElementAttributeValue(bttn, 'title', 'View patient goal/task', GlobalVariable.timeout)

		//		WebUI.click(bttn)

		WebUI.switchToDefaultContent()

	}

	@When("I should be able to click on view task and goal button of (.*) care gap")
	def buttnviewgoalclickablecheck(String caregap) {
		Thread.sleep(3000)

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_frame'), GlobalVariable.timeout)

		String xpath
		xpath= ' //div[@data-mz-key]//a[text()="' +caregap+ '"]//parent::td//following-sibling::td[10]//button[1]'

		TestObject  bttn= new TestObject('bttn')
		bttn.addProperty("xpath", ConditionType.EQUALS, xpath)

		WebUI.verifyElementClickable(bttn)

		WebUI.switchToDefaultContent()

	}



	@When("I click on view task and goal button of (.*) care gap")
	def buttnviewgaolclick(String caregap) {

		Thread.sleep(2000)

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_frame'), GlobalVariable.timeout)

		String xpath
		xpath= ' //div[@data-mz-key]//a[text()="' +caregap+ '"]//parent::td//following-sibling::td[10]//button[1]'

		TestObject  bttn= new TestObject('bttn')
		bttn.addProperty("xpath", ConditionType.EQUALS, xpath)
		Thread.sleep(1000)
		WebUI.click(bttn)

		WebUI.switchToDefaultContent()

	}

	@When("I click on delete button to delete goal")
	def deletebtngoal() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Taskcheckbox'),GlobalVariable.timeout)
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_butondelete'),GlobalVariable.timeout)

		Thread.sleep(5000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_butondelete'))

	}

	//
	@When("I click on yes button to cofirm delete goal task")
	def edeleteconfirm() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_butondelete'),GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_buttondeleteconfirm'))

	}








	@When("I click on patient goal tab in PWB")
	def pwbgoal() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Goalvalidation'),GlobalVariable.timeout)
		Thread.sleep(2000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_Goalvalidation'))


		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_td_goalvalidation'),GlobalVariable.timeout)
	}

	@When("I should see goal (.*) with goal priority (.*) and goal start date (.*) end date (.*) in PWB goal section")
	def validationgoalforgoaltask(String goal, String periority, String Strtdate, String Enddate) {

		String smonth = Strtdate.substring(0, 2);
		String   sday = Strtdate.substring(2, 4);
		String  syear = Strtdate.substring(4, 8);

		String sdate1= ''+smonth+'/'+sday+'/'+syear+''

		System.out.println(sdate1)

		String emonth = Enddate.substring(0, 2);
		String   eday = Enddate.substring(2, 4);
		String  eyear = Enddate.substring(4, 8);

		String edate1= ''+emonth+'/'+eday+'/'+eyear+''

		System.out.println(edate1)


		Thread.sleep(2000)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
		List<WebElement> Table1=	driver.findElements(By.xpath("(//div[@data-mz-key='goal']//tbody//span[@class='input-source persivia']//parent::td//parent::tr)//td[2]"))


		TestObject td1 = new TestObject('Mild')

		int i=1, size, size2
		String text1
		size=Table1.size()

		for( ;i<=size;i++) {
			String xpathd1 = "(//div[@data-mz-key='goal']//tbody//span[@class='input-source persivia']//parent::td//parent::tr)[" +i +"]//td[2]"

			td1.addProperty('xpath', ConditionType.EQUALS, xpathd1)

			text1= WebUI.getText(td1)

			if(text1==goal) {

				break
			}
		}

		TestObject td3 = new TestObject('goal')

		String xpathd3 = "(//div[@data-mz-key='goal']//tbody//span[@class='input-source persivia']//parent::td//parent::tr)[" +i +"]//td[2]"

		td3.addProperty('xpath', ConditionType.EQUALS, xpathd3)

		WebUI.verifyElementText(td3, goal)



		TestObject td2 = new TestObject('periority')

		String xpathd2 = "(//div[@data-mz-key='goal']//tbody//span[@class='input-source persivia']//parent::td//parent::tr)[" +i +"]//td[9]"

		td2.addProperty('xpath', ConditionType.EQUALS, xpathd2)

		WebUI.verifyElementText(td2, periority)



		TestObject sdate = new TestObject('sdate')

		String xpathd4 = "(//div[@data-mz-key='goal']//tbody//span[@class='input-source persivia']//parent::td//parent::tr)[" +i +"]//td[7]"

		sdate.addProperty('xpath', ConditionType.EQUALS, xpathd4)

		String websdate= WebUI.getText(sdate)

		String websdate1= websdate.substring(0, 10)

		WebUI.verifyMatch(websdate1, sdate1, false)





		TestObject edate = new TestObject('edate')

		String xpathd5 = "(//div[@data-mz-key='goal']//tbody//span[@class='input-source persivia']//parent::td//parent::tr)[" +i +"]//td[8]"

		edate.addProperty('xpath', ConditionType.EQUALS, xpathd5)

		String webedate= WebUI.getText(edate)

		String webedate1= webedate.substring(0, 10)

		WebUI.verifyMatch(webedate1, edate1, false)



		WebUI.switchToDefaultContent()
		//		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_td_task'), task)
		//
		//		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_td_status'), status)

	}


	@When("I click on patient task tab in PWB")
	def pwbtask() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_TaskValidation'),GlobalVariable.timeout)


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_TaskValidation'))


		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_td_taskvalidation'),GlobalVariable.timeout)
	}


	@When("I should see task (.*) with status (.*) and task start date (.*) end date (.*) present in PWB task section")
	def validationtaskforgoaltask(String task, String status, String Strtdate, String Enddate) {

		String smonth = Strtdate.substring(0, 2);
		String   sday = Strtdate.substring(2, 4);
		String  syear = Strtdate.substring(4, 8);

		String sdate1= ''+smonth+'/'+sday+'/'+syear+''

		System.out.println(sdate1)

		String emonth = Enddate.substring(0, 1);
		String   eday = Enddate.substring(1, 3);
		String  eyear = Enddate.substring(3, 7);

		String edate1= '0'+emonth+'/'+eday+'/'+eyear+''

		System.out.println(edate1)


		Thread.sleep(2000)
		WebUI.switchToFrame(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_ProblemList/Obj_frame'), 2)
		List<WebElement> Table1=	driver.findElements(By.xpath("//div[@data-mz-key='task']//tbody//tr//td[1]"))


		TestObject td1 = new TestObject('Mild')

		int i=1, size, size2
		String text1
		size=Table1.size()

		for( ;i<=size;i++) {
			String xpathd1 = "//div[@data-mz-key='task']//tbody//tr[" +i +"]//td[1]"

			td1.addProperty('xpath', ConditionType.EQUALS, xpathd1)

			text1= WebUI.getText(td1)

			if(text1==task) {

				break
			}
		}

		TestObject td3 = new TestObject('goal')

		String xpathd3 = "//div[@data-mz-key='task']//tbody//tr[" +i +"]//td[1]"

		td3.addProperty('xpath', ConditionType.EQUALS, xpathd3)

		WebUI.verifyElementText(td3, task)


		TestObject td2 = new TestObject('periority')

		String xpathd2 = "//div[@data-mz-key='task']//tbody//tr[" +i +"]//td[5]"

		td2.addProperty('xpath', ConditionType.EQUALS, xpathd2)

		WebUI.verifyElementText(td2, status)


		TestObject sdate = new TestObject('sdate')

		String xpathd4 = "//div[@data-mz-key='task']//tbody//tr[" +i +"]//td[2]"

		sdate.addProperty('xpath', ConditionType.EQUALS, xpathd4)

		String Websdate = WebUI.getText(sdate)

		WebUI.verifyMatch(Websdate, sdate1, false)




		TestObject edate = new TestObject('edate')

		String xpathd5 = "//div[@data-mz-key='task']//tbody//tr[" +i +"]//td[3]"

		edate.addProperty('xpath', ConditionType.EQUALS, xpathd5)

		String Webedate = WebUI.getText(edate)

		WebUI.verifyMatch(Webedate, edate1, false)


		WebUI.switchToDefaultContent()
		//		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_td_task'), task)
		//
		//		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_td_status'), status)

	}



























	@When("I click on (.*) care gap name")
	def button_to_caregap(String caregapname) {
		e=1
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_td_Caregapfirstpage'),GlobalVariable.timeout)
		Thread.sleep(3000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_td_Caregapfirstpage'))
		//			WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Addsportperson'), GlobalVariable.timeout)
		//			WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/Or_Contacts/Obj_Addsportperson'), GlobalVariable.timeout)
		Thread.sleep(2000)
		}


	@When("I click on close button against a (.*) care gap")
	def buttoneclose_caregap(String caregap) {
		e=1
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_Editbutton'),GlobalVariable.timeout)

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_frame'), GlobalVariable.timeout)

		String xpath
		xpath= '//div[@data-mz-key]//a[text()="' +caregap+ '"]//parent::td//following-sibling::td[10]//button[3]'

		TestObject  bttn= new TestObject('bttn')
		bttn.addProperty("xpath", ConditionType.EQUALS, xpath)

		WebUI.click(bttn)

		WebUI.switchToDefaultContent()

	}











	@When("I click on edit button of a (.*) care gap")
	def buttonedit_caregap(String caregap) {
		Thread.sleep(3000)

		WebUI.click(findTestObject('OR_Telehealth/Obj_Telehealth'))

		WebUI.dragAndDropByOffset(findTestObject('OR_Telehealth/Obj_Telehealth'), -300, 0)
		e=1
		//		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_Editbutton'),GlobalVariable.timeout)

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_frame'), GlobalVariable.timeout)

		String xpath
		xpath= '(//a[text()="' +caregap+ '"]//parent::td//following-sibling::td[10]//a//span)[1]'

		System.out.println("xpath= " +xpath)
		TestObject  bttn= new TestObject('bttne')
		bttn.addProperty("xpath", ConditionType.EQUALS, xpath)
		Thread.sleep(3000)
		WebUI.click(bttn)

		WebUI.switchToDefaultContent()


		//		'Click on Add button'
		//		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_Editbutton'))
		//		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_reasondropdown'), GlobalVariable.timeout)
		//		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_reasondropdown'), GlobalVariable.timeout)
	}





	@And("I enter (.*) in care gap status field")



	def statusfield(String status) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_Statusdropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4

		xpath4 = ('(//li[text()="' + status) +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in care gap resolutions field")


	def resolutionfield(String resolutions) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_resolutiondropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4

		xpath4 = ('(//li[text()="' + resolutions) +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in care gap reason field")
	def reasonfield(String reason) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_reasondropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4


		if(reason=='') {
			xpath4 = '(//li[text()="Counseled Patient"])[2]//preceding-sibling::li'
		}
		else {
			xpath4 = ('(//li[text()="' + reason) +'"])[2]'
		}

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}

	@And("I enter (.*) reason to close care gap")
	def reasonfieldclosebtton(String reason) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_reasondropdownclosebutton'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4



		xpath4 = ('(//li[text()="' + reason) +'"])'


		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}

	@And("I click on save button to close care gap")
	def savebutton() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_closedsavebtn'))
	}


	@And("I click on update button to save status of care gap")
	def updatebutton() {
		Thread.sleep(1000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_Updatebutton'))
		Thread.sleep(1000)
	}

	@And("I click on export button to exoprt care gap data file")
	def exportfilebutton() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_exportbutton'), GlobalVariable.timeout)
		Thread.sleep(2000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_exportbutton'))
		Thread.sleep(1000)
		}



	@Then("I verify that care gap file downloaded successfully")
	def Veryfiyingfiledownlaoded() {
		//				Methods.verifyDownloadedfile('C:\\Users\\muhammad.zohaib\\Downloads', '.pdf')
//		Stringtext.planetext('101010')
	}

	@And("I should see status as (.*) for (.*) care gap")

	def validatestatuschangeornot(String status, String caregap) {
		

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_td_statusfirstpage'), GlobalVariable.timeout, FailureHandling.STOP_ON_FAILURE)
		Thread.sleep(6000)
		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_frame'), GlobalVariable.timeout)

		String xpath
		xpath= '//div[@data-mz-key]//a[text()="' +caregap+ '"]//parent::td//following-sibling::td[6]'

		TestObject  bttn= new TestObject('bttn')
		bttn.addProperty("xpath", ConditionType.EQUALS, xpath)

		WebUI.verifyElementText(bttn, status)

		WebUI.switchToDefaultContent()

		//		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_td_statusfirstpage'), status)
	}


	@Then("I should see success message for created goal and task")
	def createtaskgoal_alert_should_popup() {
		Thread.sleep(1000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_AlertGoalsaved'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_AlertGoalsaved'),
				"successGoal saved successfully.Hide")


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_Alerttasksaved'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_Alerttasksaved'),
				"successTask saved successfullyHide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_Alerttasksaved'),
				GlobalVariable.timeout)
	}


	@Then("I should see success message for deleted goal and task")
	def deletedtaskgoal_alert_should_popup() {
		Thread.sleep(1000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_AlertGoaldelete'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_AlertGoaldelete'),
				"successGoal deleted successfully.Hide")


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_Alerttaskdelete'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_Alerttaskdelete'),
				"successTask deleted successfully.Hide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_Alerttaskdelete'),
				GlobalVariable.timeout)
	}




	@Then("I should see success message for deleted PWB goal")
	def deletedgoal_alert_should_popup() {
		Thread.sleep(1000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_AlertGoaldelete'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_AlertGoaldelete'),
				"successGoal deleted successfully.Hide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_AlertGoaldelete'),
				GlobalVariable.timeout)
	}

	@Then("I should see success message of deleted PWB task")
	def deletedtask_alert_should_popup() {
		Thread.sleep(1000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_Alerttaskdelete'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_Alerttaskdelete'),
				"successTask deleted successfully.Hide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_Alerttaskdelete'),
				GlobalVariable.timeout)
	}





	//
	@Then("I should see success message for created task")
	def createtask_alert_should_popup() {
		Thread.sleep(1000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_Alerttasksaved'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_Alerttasksaved'),
				"successTask saved successfully.Hide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_Alerttasksaved'),
				GlobalVariable.timeout)
	}

	@Then("I should see success message for created PWB task")
	def createpwbtask_alert_should_popup() {
		Thread.sleep(1000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_Alerttasksaved'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_Alerttasksaved'),
				"successTask saved successfullyHide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_Alerttasksaved'),
				GlobalVariable.timeout)
	}

	//
	@Then("I should see success message for deleted task")
	def deltedtask_alert_should_popup() {
		Thread.sleep(1000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_Alerttaskdelete'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_Alerttaskdelete'),
				"successTask deleted successfullyHide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Task/Obj_Alerttaskdelete'),
				GlobalVariable.timeout)
	}




	@Then("I should see success message for created Goal")
	def creatgoal_alert_should_popup() {
		Thread.sleep(1000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_AlertGoalsaved'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_AlertGoalsaved'),
				"successGoal saved successfully.Hide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/OR_Goal/Obj_AlertGoalsaved'),
				GlobalVariable.timeout)
	}


	@Then("I should see success message for changed status of care gap")
	def caregap_successfully_alert_should_popup() {
//		Thread.sleep(1000)
		// WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertupdatedemo'), GlobalVariable.timeout)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_Alertstatuschange'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_Alertstatuschange'),
				"successCare Gap has been updated successfully.Hide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_Alertstatuschange'),
				GlobalVariable.timeout)
	}



	@Then("I should see success message for closed status of care gap")
	def caregap_successfully_alert_should_closed() {
		Thread.sleep(1000)
		// WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertupdatedemo'), GlobalVariable.timeout)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_Alertstatuscolsed'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_Alertstatuscolsed'),
				"infoPatient Alert has been closed.Hide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_Alertstatuscolsed'),
				GlobalVariable.timeout)
	}







	@When("I validate (.*) details")
	def validatedatacaregap(String caregap) {
		e=1
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_td_Name'),GlobalVariable.timeout)
		//		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_td_Name'), caregap)

		String caregapname=WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_td_Guidline'))
		if(caregapname=='') {
			System.out.println('caregap name empty')
			WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_td_Name'), caregap)
		}
		else {
			System.out.println('caregap name has been verified')
		}

		String guidline=WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_td_Guidline'))

		if(guidline=='') {
			System.out.println('guidline empty')
			WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_td_Guidline'), 'Guidline')
		}
		else {
			System.out.println('guidline has given properly')
		}


		String severity=WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_td_severity'))

		if(severity=='') {
			System.out.println('severity empty')
			WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_td_severity'), 'severity')
		}
		else {
			System.out.println('severity has given properly')
		}

		String treatmenentplan=WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_td_plantreatment'))

		if(treatmenentplan=='') {
			System.out.println('treatmenent plan empty')
			WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_td_plantreatment'), '')
		}
		else {
			System.out.println('treatmenent plan has given properly')
		}

		String refernces=WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_td_references'))

		if(refernces=='') {
			System.out.println('refernces empty')
			WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_CareGap/Obj_td_references'), 'refernces')
		}
		else {
			System.out.println('refernces has given properly')
		}
	}
}