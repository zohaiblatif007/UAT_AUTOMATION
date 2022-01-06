package patientRecord

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
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
//import internal.GlobalVariable


class PatientDemographicssteps {
	WebDriver driver = DriverFactory.getWebDriver()

	public static int s1,s2
	public static int e=0

	@When("I click on patient create button")
	def button_to_add_patientrecord() {

		e=1
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Patientcreatebutton'),GlobalVariable.timeout)

		Thread.sleep(10000)

		WebUI.refresh()
		Thread.sleep(5000)
		WebUI.mouseOver(findTestObject('OR_LandingPage/OR_CMR/Obj_CMR'))
		WebUI.click(findTestObject('Object Repository/OR_LandingPage/OR_CMR/Obj_Patients'))
		Thread.sleep(20000)
		'Click on Add button'

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Patientcreatebutton'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_firstName'), GlobalVariable.timeout)
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_firstName'), GlobalVariable.timeout)
		Thread.sleep(1000)












		//		e=1
		//		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Patientcreatebutton'),GlobalVariable.timeout)
		//		Thread.sleep(13000)
		//		'Click on Add button'
		//		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Patientcreatebutton'))
		//		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_firstName'), GlobalVariable.timeout)
		//		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_firstName'), GlobalVariable.timeout)
		//		Thread.sleep(9000)
	}


	@And("I enter (.*) in patient mrn field")
	def mrnaddpatient(String MRN) {

		'Enter MRN name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_MRN'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_MRN'), MRN)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_MRN'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in patient first name field")
	def firstnameadd(String First_Name) {


		'Enter First name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_firstName'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_firstName'), First_Name)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_firstName'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in patient middle name field")
	def middlenameadd(String Midddle_Name) {

		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_MiddleName'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_MiddleName'), Midddle_Name)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_MiddleName'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in patient last name field")
	def lastnameadd(String Last_Name) {

		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_lastName'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_lastName'), Last_Name)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_lastName'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in patient suffix field")
	def suffixnameadd(String suffix) {

		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Suffix'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Suffix'), suffix)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Suffix'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient birth name field")
	def birthnameadd(String Birth_Name) {

		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_BirthName'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_BirthName'), Birth_Name)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_BirthName'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in patient gender field")
	def gender_for_patientrecordadd(String Gender) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Gender_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)


		String xpath4 = '(//li[text()="' + Gender +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}

	@And("I enter (.*) in patient dob field")
	def dobadd(String dob) {

		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_DOB'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_DOB'), dob)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_DOB'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in patient gender identity field")
	def genderidentity_add_patientrecord(String genderidentity) {
		//'Click on status'


		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Gender_Identity_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)


		WebElement Table5=	driver.findElement(By.xpath("//div[@class='col-xs-6 no-padding readonly clear-left gender-identity']//ul//ul//label[text()='" + genderidentity +"']//input"))
		Table5.click()

		WebUI.switchToDefaultContent()
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Done_GenderIdentity_btn'))



	}



	@And("I enter (.*) in patient sexual orientation field")
	def sexualorientation_add_patientrecord(String sexualorientation) {
		//'Click on status'

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Sex_orientation_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)



		WebElement Table5=	driver.findElement(By.xpath("//div[@class='col-xs-6 no-padding readonly sexual-orientation']//ul//ul//label[text()='" + sexualorientation +"']//input"))
		Table5.click()

		WebUI.switchToDefaultContent()
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Done_SexualOrientation_btn'))

	}

	@And("I enter (.*) in patient birth address field")
	def Bith_Address_for_patient(String Bith_Address) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Birthplace_Address'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Birthplace_Address'), Bith_Address)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Birthplace_Address'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient birth state field")
	def Bith_state_add_patientrecord(String Bith_State) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Birthplace_State'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Birthplace_State'), Bith_State)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Birthplace_State'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient birth country field")
	def Bith_country_for_patient(String Bith_country) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Birthplace_Country'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Birthplace_Country'), Bith_country)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Birthplace_Country'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient marital status field")
	def Marital_Status_for_patient(String Marital_Status) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Maritalstatus_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)


		String xpath4 = ('(//li[text()="' + Marital_Status) +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in patient language field")
	def language_for_patient(String language) {
		//'Click on status'

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Language_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		WebElement Table5=	driver.findElement(By.xpath("//div[@class='col-xs-6 no-padding language']//ul//ul//label[text()='" + language +"']//input"))
		Table5.click()

		WebUI.switchToDefaultContent()
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Done_Language_btn'))


	}

	@And("I enter (.*) in patient race field")
	def race_for_patient(String race) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Race_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)


		String xpath4 = '//li[text()="' + race +'"]'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in patient detailed race field")
	def Detailed_Race_for_patient(String Detailed_Race) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Detailed_Race_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		WebElement Table5=	driver.findElement(By.xpath("//div[@class='col-xs-6 no-padding granular-race']//ul//ul//label[text()='" + Detailed_Race +"']//input"))
		Table5.click()

		WebUI.switchToDefaultContent()
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Done_DetailedRace_btn'))



	}


	@And("I enter (.*) in patient ethnicity field")
	def Ethnicity_for_patient(String Ethnicity) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Ethnicity_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)


		String xpath4 = ('(//li[text()="' + Ethnicity) +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in patient detailed ethnicity field")
	def Detailed_Ethnicity_for_patient(String Detailed_Ethnicity) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Detailed_Ethnicity_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)



		WebElement Table5=	driver.findElement(By.xpath("//div[@class='col-xs-6 no-padding granular-ethnicity']//ul//ul//label[text()='" + Detailed_Ethnicity +"']//input"))
		Table5.click()

		WebUI.switchToDefaultContent()
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Done_DetailedEthnicity_btn'))



	}

	@And("I enter (.*) in patient religion field")
	def religionaddpatient(String religion) {

		'Enter religion name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Religion'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Religion'), religion)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Religion'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in patient facility field")
	def facility_for_patient(String facility) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_facilitydropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4
		if(facility=='Test CCM') {
			xpath4 = ('(//li[text()="' + facility) +'"])'}
		else {
			xpath4 = ('(//li[text()="' + facility) +'"])'
		}
		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in patient street address field")
	def Street_Address_for_patient(String Street_Address) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Address_Street'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Address_Street'), Street_Address)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Address_Street'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient city address field")
	def City_Address_for_patient(String City_Address) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Address_City'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Address_City'), City_Address)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Address_City'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient state address field")
	def State_Address_for_patient(String State_Address) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Address_State'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Address_State'), State_Address)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Address_State'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient zip address field")
	def ZIP_Address_for_patient(String ZIP_Address) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Address_Zipcode'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Address_Zipcode'), ZIP_Address)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Address_Zipcode'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient country address field")
	def Country_Address_for_patient(String Country_Address) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Address_Country'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Address_Country'), Country_Address)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Address_Country'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient home phone field")
	def Home_Phone_for_patient(String Home_Phone) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Phone_home'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Phone_home'), Home_Phone)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Phone_home'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in patient work phone field")
	def work_Phone_for_patient(String work_Phone) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Phone_work'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Phone_work'), work_Phone)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Phone_work'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient mobile phone field")
	def mobile_Phone_for_patient(String mobile_Phone) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Phone_Mobile'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Phone_Mobile'), mobile_Phone)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Phone_Mobile'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in patient preffered phone field")
	def Preffered_Phone_for_patient(String Preffered_Phone) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_PreferedPhone_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)


		String xpath4 = ('(//li[text()="' + Preffered_Phone) +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()
	}


	@And("I enter (.*) in patient email field")
	def Email_for_patient(String Email) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Email'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Email'), Email)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Email'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient comments field")
	def comments_for_patient(String comments) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Comments'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Comments'), comments)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Comments'),
				Keys.chord(Keys.TAB))
	}

	@And("I click on patient save button")
	def savedbtn_for_patient() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Savebutton'))
	}


	@And("I click on patient proceed button button")
	def proceedbtn_for_patient() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Proceedbtn'), GlobalVariable.timeout)

		Thread.sleep(1000)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_Proceedbtn'))
	}



	@Then("I should see success message for created patient")
	def patientcreated_successfully_alert_should_popup() {
		Thread.sleep(1000)
		// WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertupdatedemo'), GlobalVariable.timeout)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_AlertnewPatientsaved'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_AlertnewPatientsaved'),
				"successPatient Saved SuccessfullyHide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/AddPatient/Obj_AlertnewPatientsaved'),
				GlobalVariable.timeout)
	}



	@When("I click on patient record Edit button")
	def button_to_edit_patientrecord() {
		e=1
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Editbutton'),30)
		Thread.sleep(5000)
		'Click on Edit button'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Editbutton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_firstName'), GlobalVariable.timeout)
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_firstName'), GlobalVariable.timeout)

	}

	@And("I enter (.*) in patient record first name field")
	def firstname(String First_Name) {


		'Enter First name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_firstName'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_firstName'), First_Name)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_firstName'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in patient record middle name field")
	def middlename(String Midddle_Name) {

		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_MiddleName'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_MiddleName'), Midddle_Name)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_MiddleName'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in patient record last name field")
	def lastname(String Last_Name) {

		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_lastName'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_lastName'), Last_Name)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_lastName'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in patient record suffix field")
	def suffixname(String suffix) {

		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Suffix'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Suffix'), suffix)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Suffix'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient record birth name field")
	def birthname(String Birth_Name) {

		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_BirthName'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_BirthName'), Birth_Name)

		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_BirthName'),
				Keys.chord(Keys.TAB))
	}



	@And("I enter (.*) in patient record status field")
	def status_for_patientrecord(String Status) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Status_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)


		String xpath4 = ('(//li[text()="' + Status) +'"])[2]'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in patient record mrn field")
	def mrnpatient(String MRN) {

		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_MRN'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_MRN'), MRN)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_MRN'),
				Keys.chord(Keys.TAB))
	}



	@And("I enter (.*) in patient record gender field")
	def gender_for_patientrecord(String Gender) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Gender_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)


		String xpath4 = ('(//li[text()="' + Gender) +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in patient record language field")
	def language_for_patientrecord(String language) {
		//'Click on status'
		Thread.sleep(3000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Language_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)


		WebElement Table1=	driver.findElement(By.xpath("//div[@class='dropdown patient-language editable mz-checkbox-list open']//span[@class='value-text pull-left single-line-text text-left']"))

		String Text=Table1.getText()


		List<WebElement> Table2=	driver.findElements(By.xpath("//div[@class='dropdown patient-language editable mz-checkbox-list open']//ul//ul//li"))

		int size, i=1, j=0
		size=Table2.size()


		for( ;i<=size;i++) {
			String xpathd1 = "(//div[@class='dropdown patient-language editable mz-checkbox-list open']//ul//ul//li)[" +i +"]"

			WebElement Table3=	driver.findElement(By.xpath(xpathd1))


			String text1= Table3.getText()
			if(Text=='Select') {
				break
			}

			Text = Text.replace(" | ", "@")
			String[] arrOfStr = Text.split("@", );

			for(j=0;j<arrOfStr.size();j++)
			{


				if(text1==arrOfStr[j]) {
					WebElement Table4=	driver.findElement(By.xpath("(//div[@class='dropdown patient-language editable mz-checkbox-list open']//ul//ul//li["+i+"]//input)[1]"))
					Table4.click()
					break
				}
			}


			//			if(text1==Text) {
			//			WebElement Table4=	driver.findElement(By.xpath("(//div[@class='dropdown patient-language editable mz-checkbox-list open']//ul//ul//li["+i+"]//input)[1]"))
			//				Table4.click()
			//
			//			}
		}

		WebElement Table5=	driver.findElement(By.xpath("//div[@class='dropdown patient-language editable mz-checkbox-list open']//ul//ul//label[text()='" + language +"']//input"))
		Table5.click()

		WebUI.switchToDefaultContent()
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Done_Language_btn'))


	}


	@And("I enter (.*) in patient record sexual orientation field")
	def sexualorientation_for_patientrecord(String sexualorientation) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Sex_orientation_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		WebElement Table1=	driver.findElement(By.xpath("//div[@class='col-xs-6 no-padding sexual-orientation']//span[@class='value-text pull-left single-line-text text-left']"))

		String Text=Table1.getText()


		List<WebElement> Table2=	driver.findElements(By.xpath("//div[@class='col-xs-6 no-padding sexual-orientation']//ul//ul//li"))

		int size, i=1, j=0
		size=Table2.size()


		for( ;i<=size;i++) {
			String xpathd1 = "(//div[@class='col-xs-6 no-padding sexual-orientation']//ul//ul//li)[" +i +"]"

			WebElement Table3=	driver.findElement(By.xpath(xpathd1))


			String text1= Table3.getText()
			if(Text=='Select') {
				break
			}

			Text = Text.replace(" | ", "@")
			String[] arrOfStr = Text.split("@", );

			for(j=0;j<arrOfStr.size();j++)
			{


				if(text1==arrOfStr[j]) {
					WebElement Table4=	driver.findElement(By.xpath("(//div[@class='col-xs-6 no-padding sexual-orientation']//ul//ul//li)[" +i +"]//input"))
					Table4.click()
					break
				}
			}


			//			if(text1==Text) {
			//			WebElement Table4=	driver.findElement(By.xpath("(//div[@class='dropdown patient-language editable mz-checkbox-list open']//ul//ul//li["+i+"]//input)[1]"))
			//				Table4.click()
			//
			//			}
		}

		WebElement Table5=	driver.findElement(By.xpath("//div[@class='col-xs-6 no-padding sexual-orientation']//ul//ul//label[text()='" + sexualorientation +"']//input"))
		Table5.click()

		WebUI.switchToDefaultContent()
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Done_SexualOrientation_btn'))




	}


	@And("I enter (.*) in patient record gender identity field")
	def genderidentity_for_patientrecord(String genderidentity) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Gender_Identity_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)


		WebElement Table1=	driver.findElement(By.xpath("//div[@class='col-xs-6 no-padding gender-identity clear-left']//span[@class='value-text pull-left single-line-text text-left']"))

		String Text=Table1.getText()


		List<WebElement> Table2=	driver.findElements(By.xpath("//div[@class='col-xs-6 no-padding gender-identity clear-left']//ul//ul//li"))

		int size, i=1, j=0
		size=Table2.size()


		for( ;i<=size;i++) {
			String xpathd1 = "(//div[@class='col-xs-6 no-padding gender-identity clear-left']//ul//ul//li)[" +i +"]"

			WebElement Table3=	driver.findElement(By.xpath(xpathd1))


			String text1= Table3.getText()
			if(Text=='Select') {
				break
			}

			Text = Text.replace(" | ", "@")
			String[] arrOfStr = Text.split("@", );

			for(j=0;j<arrOfStr.size();j++)
			{


				if(text1==arrOfStr[j]) {
					WebElement Table4=	driver.findElement(By.xpath("(//div[@class='col-xs-6 no-padding gender-identity clear-left']//ul//ul//li["+i+"]//input)[1]"))
					Table4.click()
					break
				}
			}


			//			if(text1==Text) {
			//			WebElement Table4=	driver.findElement(By.xpath("(//div[@class='dropdown patient-language editable mz-checkbox-list open']//ul//ul//li["+i+"]//input)[1]"))
			//				Table4.click()
			//
			//			}
		}

		WebElement Table5=	driver.findElement(By.xpath("//div[@class='col-xs-6 no-padding gender-identity clear-left']//ul//ul//label[text()='" + genderidentity +"']//input"))
		Table5.click()

		WebUI.switchToDefaultContent()
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Done_GenderIdentity_btn'))



	}

	@And("I enter (.*) in patient record detailed race field")
	def Detailed_Race_for_patientrecord(String Detailed_Race) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Detailed_Race_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)


		WebElement Table1=	driver.findElement(By.xpath("//div[@class='col-xs-6 no-padding granular-race']//span[@class='value-text pull-left single-line-text text-left']"))

		String Text=Table1.getText()


		List<WebElement> Table2=	driver.findElements(By.xpath("//div[@class='col-xs-6 no-padding granular-race']//ul//ul//li"))

		int size, i=1, j=0
		size=Table2.size()


		for( ;i<=size;i++) {
			String xpathd1 = "(//div[@class='col-xs-6 no-padding granular-race']//ul//ul//li)[" +i +"]"

			WebElement Table3=	driver.findElement(By.xpath(xpathd1))


			String text1= Table3.getText()
			if(Text=='Select') {
				break
			}

			Text = Text.replace(" | ", "@")
			String[] arrOfStr = Text.split("@", );

			for(j=0;j<arrOfStr.size();j++)
			{


				if(text1==arrOfStr[j]) {
					WebElement Table4=	driver.findElement(By.xpath("(//div[@class='col-xs-6 no-padding granular-race']//ul//ul//li["+i+"]//input)[1]"))
					Table4.click()
					break
				}
			}


			//			if(text1==Text) {
			//			WebElement Table4=	driver.findElement(By.xpath("(//div[@class='dropdown patient-language editable mz-checkbox-list open']//ul//ul//li["+i+"]//input)[1]"))
			//				Table4.click()
			//
			//			}
		}

		WebElement Table5=	driver.findElement(By.xpath("//div[@class='col-xs-6 no-padding granular-race']//ul//ul//label[text()='" + Detailed_Race +"']//input"))
		Table5.click()

		WebUI.switchToDefaultContent()
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Done_DetailedRace_btn'))



	}


	@And("I enter (.*) in patient record race field")
	def race_for_patientrecord(String race) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Race_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)


		String xpath4 = '//li[text()="' + race +'"]'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in patient record detailed ethnicity field")
	def Detailed_Ethnicity_for_patientrecord(String Detailed_Ethnicity) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Detailed_Ethnicity_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)


		WebElement Table1=	driver.findElement(By.xpath("//div[@class='col-xs-6 no-padding granular-ethnicity']//span[@class='value-text pull-left single-line-text text-left']"))

		String Text=Table1.getText()


		List<WebElement> Table2=	driver.findElements(By.xpath("//div[@class='col-xs-6 no-padding granular-ethnicity']//ul//ul//li"))

		int size, i=1, j=0
		size=Table2.size()


		for( ;i<=size;i++) {
			String xpathd1 = "(//div[@class='col-xs-6 no-padding granular-ethnicity']//ul//ul//li)[" +i +"]"

			WebElement Table3=	driver.findElement(By.xpath(xpathd1))


			String text1= Table3.getText()
			if(Text=='Select') {
				break
			}

			Text = Text.replace(" | ", "@")
			String[] arrOfStr = Text.split("@", );

			for(j=0;j<arrOfStr.size();j++)
			{


				if(text1==arrOfStr[j]) {
					WebElement Table4=	driver.findElement(By.xpath("(//div[@class='col-xs-6 no-padding granular-ethnicity']//ul//ul//li["+i+"]//input)[1]"))
					Table4.click()
					break
				}
			}


			//			if(text1==Text) {
			//			WebElement Table4=	driver.findElement(By.xpath("(//div[@class='dropdown patient-language editable mz-checkbox-list open']//ul//ul//li["+i+"]//input)[1]"))
			//				Table4.click()
			//
			//			}
		}

		WebElement Table5=	driver.findElement(By.xpath("//div[@class='col-xs-6 no-padding granular-ethnicity']//ul//ul//label[text()='" + Detailed_Ethnicity +"']//input"))
		Table5.click()

		WebUI.switchToDefaultContent()
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Done_DetailedEthnicity_btn'))



	}


	@And("I enter (.*) in patient record ethnicity field")
	def Ethnicity_for_patientrecord(String Ethnicity) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Ethnicity_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)


		String xpath4 = ('(//li[text()="' + Ethnicity) +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in patient record marital status field")
	def Marital_Status_for_patientrecord(String Marital_Status) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Maritalstatus_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)


		String xpath4 = ('(//li[text()="' + Marital_Status) +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in patient record religion field")
	def Religion_for_patientrecord(String Religion) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Religion_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)


		String xpath4 = ('(//li[text()="' + Religion) +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in patient record attributed provider field")
	def Attributed_Provider_for_patientrecord(String Attributepro) {
		//'Click on status'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_AtributedProvider_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)


		String xpath4 = ('(//li[text()="' + Attributepro) +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()

	}


	@And("I enter (.*) in patient record birth address field")
	def Bith_Address_for_patientrecord(String Bith_Address) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Birthplace_Address'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Birthplace_Address'), Bith_Address)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Birthplace_Address'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient record birth state field")
	def Bith_state_for_patientrecord(String Bith_State) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Birthplace_State'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Birthplace_State'), Bith_State)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Birthplace_State'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient record birth country field")
	def Bith_country_for_patientrecord(String Bith_country) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Birthplace_Country'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Birthplace_Country'), Bith_country)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Birthplace_Country'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient record street address field")
	def Street_Address_for_patientrecord(String Street_Address) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Address_Street'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Address_Street'), Street_Address)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Address_Street'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient record city address field")
	def City_Address_for_patientrecord(String City_Address) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Address_City'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Address_City'), City_Address)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Address_City'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient record state address field")
	def State_Address_for_patientrecord(String State_Address) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Address_State'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Address_State'), State_Address)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Address_State'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient record zip address field")
	def ZIP_Address_for_patientrecord(String ZIP_Address) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Address_Zipcode'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Address_Zipcode'), ZIP_Address)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Address_Zipcode'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient record country address field")
	def Country_Address_for_patientrecord(String Country_Address) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Address_Country'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Address_Country'), Country_Address)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Address_Country'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient record home phone field")
	def Home_Phone_for_patientrecord(String Home_Phone) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Phone_home'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Phone_home'), Home_Phone)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Phone_home'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in patient record work phone field")
	def work_Phone_for_patientrecord(String work_Phone) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Phone_work'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Phone_work'), work_Phone)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Phone_work'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient record mobile phone field")
	def mobile_Phone_for_patientrecord(String mobile_Phone) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Phone_Mobile'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Phone_Mobile'), mobile_Phone)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Phone_Mobile'),
				Keys.chord(Keys.TAB))
	}

	@And("I enter (.*) in patient record preffered phone field")
	def Preffered_Phone_for_patientrecord(String Preffered_Phone) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_PreferedPhone_dropdown'))

		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)


		String xpath4 = ('(//li[text()="' + Preffered_Phone) +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()
	}


	@And("I enter (.*) in patient record email field")
	def Email_for_patientrecord(String Email) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Email'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Email'), Email)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Email'),
				Keys.chord(Keys.TAB))
	}


	@And("I enter (.*) in patient record comments field")
	def comments_for_patientrecord(String comments) {
		'Enter Middle name'
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Comments'))

		'Select Allergy'
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Comments'), comments)
		Thread.sleep(2000)
		WebUI.sendKeys(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Comments'),
				Keys.chord(Keys.TAB))
	}

	@And("I click on patient record Update button")
	def updatebtn_for_patientrecord() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Updatebutton'))
	}

	@Then("I should see success message for edit patient record")
	def record_edit_successfully_alert_should_popup() {
		Thread.sleep(1000)
		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertupdatedemo'),
				GlobalVariable.timeout)
		// WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertupdatedemo'), GlobalVariable.timeout)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertupdatedemo'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertupdatedemo'),
				"successPatient's demographics updated successfullyHide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertupdatedemo'),
				GlobalVariable.timeout)
	}

	@And("I should see the newly edit patient record on grid")
	def newlyedit_patientrecord_on_grid() {

		//		'Verify the Entered Data'
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_ts_type'), findTestData(
		//				'DF_CMRData/DF_ClinicalSection/TD_Allergy').getValue(7, 1))
		//
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_td_source'), findTestData(
		//				'DF_CMRData/DF_ClinicalSection/TD_Allergy').getValue(8, 1))
		//
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_td_Allergy'), findTestData(
		//				'DF_CMRData/DF_ClinicalSection/TD_Allergy').getValue(9, 1))
		//
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_td_reaction'), findTestData(
		//				'DF_CMRData/DF_ClinicalSection/TD_Allergy').getValue(10, 1))
		//
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_severity'), findTestData(
		//				'DF_CMRData/DF_ClinicalSection/TD_Allergy').getValue(11, 1))
		//
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_td_status'), findTestData(
		//				'DF_CMRData/DF_ClinicalSection/TD_Allergy').getValue(12, 1))
		//
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_td_startdate'), findTestData(
		//				'DF_CMRData/DF_ClinicalSection/TD_Allergy').getValue(13, 1))
		//
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_td_endate'), findTestData(
		//				'DF_CMRData/DF_ClinicalSection/TD_Allergy').getValue(14, 1))
		//
		//		WebUI.verifyElementText(findTestObject('OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Alergies/Obj_td_comment'), findTestData(
		//				'DF_CMRData/DF_ClinicalSection/TD_Allergy').getValue(15, 1))
	}


	@When("I upload picture of patient in the picture fame")
	def upoadpicture() {

		Thread.sleep(3000)
		WebUI.uploadFile(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Upload_picbutton'), "C:\\Users\\muhammad.zohaib\\patientpic.PNG")

	}

	@When("I deleted picture of patient in the picture fame")
	def deletepicture() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Uploaded_picarea'),GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.mouseOver(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Uploaded_picarea'))

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_DeletePicbutton'))

	}

	@When("I click on refresh button")
	def refreshbutton() {
		Thread.sleep(3000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_Clinical Section/OR_Refresh button/Obj_refreshbutton'))
		Thread.sleep(3000)
	}

	@And("I Verify that picture deleted successfully")
	def deleteveryfiypicture() {

		WebUI.verifyElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Uploaded_picarea'),GlobalVariable.timeout)

		//	String a=	WebUI.getAttribute(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Uploaded_picarea'), 'style')
		//
		//	System.out.println(a)
	}


	@And("I Verify that picture uploaded successfully")
	def upoadveryfiypicture() {

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Uploaded_picarea'),GlobalVariable.timeout)

		//	String a=	WebUI.getAttribute(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Uploaded_picarea'), 'style')
		//
		//	System.out.println(a)
	}

	@And("I click on optoutsms checkbox to set patient preference")
	def clickcheckbox() {

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Checkbox_Opt_out_sms'))

		//	String a= WebUI.getAttribute(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Checkbox_Opt_out_sms'), 'checked')
		//	System.out.println(a)
		//	WebUI.verifyElementChecked(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Checkbox_Opt_out_sms'), 5)

	}

	@Then("I should see success message for patient preference")
	def Veryfiyingcheckbox() {

		Thread.sleep(1000)
		// WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertupdatedemo'), GlobalVariable.timeout)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertcheckbox'))

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertcheckbox'),
				"successPatient preference added successfullyHide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertcheckbox'),
				GlobalVariable.timeout)
		//	String a= WebUI.getAttribute(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Checkbox_Opt_out_sms'), 'checked')
		//	System.out.println(a)
		//	WebUI.verifyElementChecked(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Checkbox_Opt_out_sms'), 5)
	}

	@And("I click on export source CDD button to exoprt file")
	def clickexportbutton() {
		Thread.sleep(5000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_ExportCCD_button'))

	}

	@Then("I Verify that file downloaded successfully")
	def Veryfiyingfiledownlaoded() {
		//		Methods.verifyDownloadedfile('C:\\Users\\muhammad.zohaib\\Downloads', '.xml')
	}

	@And("I click on patient account button to send email")
	def clickaccounttbutton() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_patientaccount_button'), GlobalVariable.timeout)
		Thread.sleep(5000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_patientaccount_button'))

	}

	@And("I click on send invitation button to send email")
	def clickinvitationtbutton() {
		Thread.sleep(2000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_sentinvitation_button'))

		Thread.sleep(3000)
	}

	@And("I click on resend invitation button to send email")
	def clickresendinvitationtbutton() {
		Thread.sleep(2000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_resentinvitation_button'))
		Thread.sleep(3000)
	}


	@Then("I should see message email is not set")
	def Veryfiyingemailnotset() {

		String a=	WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_td_Email'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertsendinvitefailed'), GlobalVariable.timeout)

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertsendinvitefailed'),
				"errorEmail does not existHide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertsendinvitefailed'),
				GlobalVariable.timeout)
		Thread.sleep(2000)

	}


	@Then("I should see success message email is sent")
	def Veryfiyingemailsent() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertsendinvitesuccess'), GlobalVariable.timeout)

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertsendinvitesuccess'),
				"successInvitation sent successfullyHide")

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_Alertsendinvitesuccess'),
				GlobalVariable.timeout)
		Thread.sleep(2000)

	}

}
