package patientGrid
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Given
import cucumber.api.java.en.When
import internal.GlobalVariable



class SMSverification {

	@Given("I navigate to Care Coordination")
	public void I_navigat_to_patient_grid() {

		WebUI.waitForElementClickable(findTestObject('OR_HomePage/Obj_Enterprise'), 10)
		Thread.sleep(5000)
		WebUI.click(findTestObject('OR_HomePage/Obj_Enterprise'))
		Thread.sleep(1000)
		if(GlobalVariable.Enterprise=='MHPN') {

			WebUI.click(findTestObject('OR_HomePage/Obj_SelectMHPN'))
		}
		if(GlobalVariable.Enterprise=='Support Test Ent') {

			WebUI.click(findTestObject('Object Repository/OR_HomePage/Obj_SelectSupportTestEnt'))
		}

		Thread.sleep(3000)

		Thread.sleep(3000)
		WebUI.click(findTestObject('OR_Alert/Obj_Hide'))
		WebUI.getUrl()

		String ActualText = WebUI.getText(findTestObject('OR_LandingPage/OR_CMR/Obj_CMR'))
		WebUI.verifyEqual(ActualText, 'CMR')
		WebUI.mouseOver(findTestObject('OR_LandingPage/OR_CMR/Obj_CMR'))

		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_Carecoordination modulemosehover'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_HomePage/Obj_Logo'), 3)
		WebUI.enableSmartWait()
		Thread.sleep(5000)
	}


	@When("I search (.*) using global search from CC")
	public void search_Patient(String Patient) {

		//		WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/OR_Input_Search_Field/Obj_inputSearch'))


		Thread.sleep(10000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCpatientsearch'))
		Thread.sleep(1000)

		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCpatientsearch'), Patient)

		Thread.sleep(5000)



		WebUI.click(findTestObject('OR_PatientGrid/OR_SearchPatient/OR_Search/Select_Filters/Select_Search'))



		Thread.sleep(4000)
	}


	@When("I set (.*) to schedual the appointment")
	public void reasonseselect(String reason) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCReasondropdown') ,GlobalVariable.timeout)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCReasondropdown'))

		Thread.sleep(1000)


		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4

		xpath4 = '(//li[text()="' + reason +'"])'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()
	}


	@When("I set start date for appointment")
	public void adate() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCstartdate') ,GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCstartdate'))
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCtimestart_9'))
	}

	@When("I set end date for appointment")
	public void edate() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCendtime') ,GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCendtime'))
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCtimeend_10'))
	}



	
	@When("I set status (.*) for appointment")
	public void statuseselect(String status) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCStatusdropdown') ,GlobalVariable.timeout)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCStatusdropdown'))

		Thread.sleep(1000)


		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4

		xpath4 = '(//li[text()="' + status +'"])[2]'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()
	}


	@When("I enter (.*) in text area of appointment")
	public void commentfield(String Comment) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCcomment') ,GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCcomment'), Comment)
	}



	@When("I Validate phone is set properly on demographics")
	public void verifyhomephone() {

		WebUI.waitForElementPresent(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_td_homephone') ,GlobalVariable.timeout)

		Thread.sleep(3000)
		String text1, text2=0
		text1 = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_td_homephone'))
		WebUI.verifyNotMatch(text1, text2, false)
		Thread.sleep(3000)
	}

	@When("I enter (.*) to send message")
	public void sphonefield(String phone) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCphonefield') ,GlobalVariable.timeout)
		Thread.sleep(3000)
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCphonefield'), phone)
	}

	@When("I click the save button to save Appointments")
	public void saveappointmentbutn() {
		Thread.sleep(5000)
		//				WebUI.click(findTestObject('OR_Telehealth/Obj_Telehealth'))
		//			    WebUI.dragAndDropByOffset(findTestObject('OR_Telehealth/Obj_Telehealth'), -300, 0)

		//				WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCsaveappointmentbutton') ,GlobalVariable.timeout)
		//				Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCsaveappointmentbutton'))
		Thread.sleep(3000)
	}


	@When("I click the cancel button to cancel Appointments")
	public void caecelappointmentbutn() {
		Thread.sleep(5000)
		//				WebUI.click(findTestObject('OR_Telehealth/Obj_Telehealth'))
		//			    WebUI.dragAndDropByOffset(findTestObject('OR_Telehealth/Obj_Telehealth'), -300, 0)

		//				WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCsaveappointmentbutton') ,GlobalVariable.timeout)
		//				Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCcancelappointmentbutton'))
		Thread.sleep(3000)
	}


	@When("I click cross icon to close expanded patient page")
	public void closeopedpatient() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCcloseexpandedpatient') ,GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCcloseexpandedpatient'))
		Thread.sleep(2000)
	}

	@When("I click on Schedule Tab")
	public void scedualtabclick() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_Schedualtab') ,GlobalVariable.timeout)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_Schedualtab'))

		Thread.sleep(3000)
	}

	@When("I select current appointment")
	public void sendsmsbtcurrentappointmentsn() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_currentappointmentbutton') ,GlobalVariable.timeout)
		Thread.sleep(3000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_currentappointmentbutton'))

		Thread.sleep(2000)
	}


	@When("I click on appointment tab")
	public void  appointmenttab() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCAppointment') ,GlobalVariable.timeout)
		Thread.sleep(3000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCAppointment'))
		Thread.sleep(3000)
	}

	@When("I click on searched patient from CC")
	public void clickpatietn() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCPatientclick') ,GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCPatientclick'))
		Thread.sleep(2000)
	}


	@When("I click on Add button to add appointment")
	public void addappointment() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCAddappointmentbutton') ,GlobalVariable.timeout)
		Thread.sleep(2000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCAddappointmentbutton'))
		Thread.sleep(2000)
	}

	@When("I click on edit button to edit appointment")
	public void editappointment() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCEditbutton') ,GlobalVariable.timeout)
		Thread.sleep(2000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCEditbutton'))
		Thread.sleep(2000)
	}



	@When("I set visit type as telehealth")
	public void visittype() {


		//			try
		//			{
		//				ejwfnwejfnwekjo
		//
		////				WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_visittypedropdown') ,GlobalVariable.timeout)
		//				Thread.sleep(3000)
		//				 WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_visittypedropdown'))
		//				 Thread.sleep(1000)
		//				 WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_telehealth'))
		//				 Thread.sleep(1000)
		//
		//			} catch (Exception ob) {

		//WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_currentappointmentbutton') ,GlobalVariable.timeout)
		//				Thread.sleep(3000)
		// WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_currentappointmentbutton'))

		Thread.sleep(2000)

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_visittypedropdown') ,GlobalVariable.timeout)
		Thread.sleep(3000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_visittypedropdown'))
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_telehealth'))
		Thread.sleep(1000)

		//						}

	}



	@When("I set visit type as telehealth in PWB")
	public void visittypecc() {


		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCTypedropdown') ,GlobalVariable.timeout)
		Thread.sleep(3000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCTypedropdown'))
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCtelehealth'))
		Thread.sleep(1000)

		//						}

	}



	@When("I click the Send SMS button from schedual appointment")
	public void sendsmsbtn() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_sendsmsbutton') ,GlobalVariable.timeout)
		//Thread.sleep(2000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_sendsmsbutton'))

		Thread.sleep(3000)

	}

	@When("I should see the Invite Via Text Message window")
	public void Invite_via_Text_Message() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_languagedropdown') ,GlobalVariable.timeout)

		Thread.sleep(2000)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_td_inviteviatextmessagewindow'), GlobalVariable.timeout)
	}

	@When("I select the (.*) in which the invitation is to be sent from language dropdown")
	public void languageselect(String Language) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_languagedropdown') ,GlobalVariable.timeout)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_languagedropdown'))

		Thread.sleep(1000)


		WebUI.switchToFrame(findTestObject('Object Repository/OR_PatientGrid/OR_PatientData/OR_PatientdemographicRecord/Obj_frame_appCCM'), 2)

		String xpath4

		xpath4 = '(//div[@id="sendSMSLanguagePicker-list"]//li[text()="' + Language +'"])[1]'

		TestObject t4 = new TestObject('Mild')

		t4.addProperty('xpath', ConditionType.EQUALS, xpath4)

		WebUI.click(t4)

		WebUI.switchToDefaultContent()
	}

	@When("I click the Send SMS button")
	public void lsendsmsbuttonnextpopuppaget() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_sendsmsonpopupwindowbutton') ,GlobalVariable.timeout)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_sendsmsonpopupwindowbutton'))
	}

	@When("I verify that copy button and send sms button available and functional")
	public void veryfybuttons() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_sendsmsbutton') ,GlobalVariable.timeout)
		WebUI.verifyElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_sendsmsbutton'))

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_copybutton') ,GlobalVariable.timeout)
		WebUI.verifyElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_copybutton'))
	}

	@When("I click the Send SMS button after edit")
	public void lsendsmsbuttonne() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_sendsmsbuttoneditcase') ,GlobalVariable.timeout)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_sendsmsbuttoneditcase'))
	}


	@When("I click the Cancel button from the Edit Appointment window")
	public void cancelbutton() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_cancelbutton') ,GlobalVariable.timeout)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_cancelbutton'))
	}

	@When("I select SMS log from communication center dropdwon")
	public void smslog() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_communicationcenterdrop') ,GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_communicationcenterdrop'))
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_smslog'))
	}


	@When("I apply left filter to refresh the sms sent record")
	public void filterapply() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_leftfilterapplybutton') ,GlobalVariable.timeout)
		Thread.sleep(10000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_leftfilterapplybutton'))
		Thread.sleep(3000)
	}



	@When("I click on view button to view sent meassage")
	public void viewsmsbutton() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_viewsmsbutton') ,GlobalVariable.timeout)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_viewsmsbutton'))
		Thread.sleep(2000)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_td_smstextarea'), GlobalVariable.timeout)

		WebUI.verifyElementPresent(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_td_phonefromsmswindow'), GlobalVariable.timeout)
	}


	@When("I click on resend button to send message again")
	public void resendsmsbutton() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_resendsmsbutton') ,GlobalVariable.timeout)
		Thread.sleep(2000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_resendsmsbutton'))
	}


	@When("I click the cancel button to cancel view screen")
	public void cancelviewscreen() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_cancelsmsviewscreenbutton') ,GlobalVariable.timeout)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_cancelsmsviewscreenbutton'))
		Thread.sleep(1000)
	}


	@When("I click on edit button to send meassage")
	public void editmessagebutton() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_editbuttonsms') ,GlobalVariable.timeout)

		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_editbuttonsms'))
		Thread.sleep(2000)
	}


	@When("I Update message (.*) in meassage box")
	public void updatetextmessage(String message) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_td_smstextarea') ,GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.clearText(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_td_smstextarea'))
		WebUI.setText(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_smstextarea'), message)
	}


	@When("I should see the Message sent successfully notification")
	public void sendnotificationmessage() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_Messagesentnotification') ,GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_Messagesentnotification'))
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_Messagesentnotification'), 'successMessage Sent Successfully.Hide' )
	}

	@When("I should see the Message sent successfully notification after edit")
	public void sendnotificationmessageedit() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_Messagesentnotificationedit') ,GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_Messagesentnotificationedit'))
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_Messagesentnotificationedit'), 'successMessage sent successfullyHide' )
	}

	@When("I verify message status for (.*) is changed into delivered")
	public void verifysentmessage(String Patient) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_td_patientname') ,GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_td_patientname'), Patient )

		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_td_status'), 'DELIVERED' )
	}

	@When("I should see edit message as (.*) on the UI")
	public void verifyeditmessage(String Message_Text) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_td_message') ,GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_td_message'), Message_Text )
	}

	@When("I should see attempts count increases")
	public void countverifytmessage() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_td_attempts') ,GlobalVariable.timeout)
		Thread.sleep(1000)
		String te
		te = WebUI.getText(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_td_attempts') )

		WebUI.verifyGreaterThan(te, 0)
	}

	@When("I verify that appointment created successfully with (.*) and (.*) and (.*) and with telehealth type")
	public void verifycreatedappointment(String Reason, String Status, String Comment) {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_td_cc_reason') ,GlobalVariable.timeout)
		Thread.sleep(1000)
		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_td_cc_reason'), Reason )

		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_td_cc_status'), Status )

		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_td_cc_comment'), Comment )

		WebUI.verifyElementText(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_td_cc_type'), 'Telehealth' )
	}

	@When("I should see Edit appointment, Show log and Delete buttons are available and functional")
	public void verifyappointmentbuuton() {

		WebUI.waitForElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCviewlogbutton') ,GlobalVariable.timeout)
		Thread.sleep(1000)

		WebUI.verifyElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCviewlogbutton'))

		WebUI.verifyElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCEditbutton'))

		WebUI.verifyElementClickable(findTestObject('Object Repository/OR_PatientGrid/SMSVerification/Obj_CCdeletebutton'))
	}
}