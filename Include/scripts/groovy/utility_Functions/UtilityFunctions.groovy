package utility_Functions

import org.openqa.selenium.Keys

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.Then
import groovy.time.TimeCategory
import internal.GlobalVariable

public class UtilityFunctions {



	void verifyNotificationMessage(String dynamicId,String message) {
		String xpath1 = '//div[contains(text(),"'+dynamicId+'")]'
		TestObject to = new TestObject("objectName")
		to.addProperty("xpath",ConditionType.EQUALS,xpath1)

		'Waiting for element to be clickable'
		WebUI.waitForElementClickable(to, 5)
		WebUI.click(to)

		'Verify that Alert Comes After Save Button Clicked'
		WebUI.verifyElementText(to,message)

		'Wait until Alert Disapear'
		WebUI.waitForElementNotPresent(to,GlobalVariable.timeout)
	}

	void selectdropdown(TestObject frame,String xpath) {
		WebUI.switchToFrame(frame, 2)

		TestObject t1 = new TestObject('value')
		t1.addProperty('xpath', ConditionType.EQUALS, xpath)
		WebUI.click(t1)
		WebUI.switchToDefaultContent()
	}





	void setValues(TestObject object,String value) {
		'wait for element to appear'
		WebUI.waitForElementClickable(object,GlobalVariable.timeout)

		'Set the text in the field'
		WebUI.setText(object,value)
	}





	void pressTab(TestObject object) {
		WebUI.sendKeys(object,Keys.chord(Keys.TAB))
	}

	String currentDate() {
		String ret;
		def today=null;
		use(TimeCategory, {
			today = new Date()
			ret=today.format('MMddyyyy')
		})
		println ret
		return ret;
	}


	String modifyDate(int Days) {
		String ret;
		def today=null;

		use(TimeCategory, {
			today = new Date()
			def change = (today+Days.days)
			ret=change.format('MMddyyyy')
		})




		println ret
		return ret;
	}



	void customClick(TestObject frame,String xpath) {

		WebUI.switchToFrame(frame, 2)
		TestObject t1 = new TestObject('value')
		t1.addProperty('xpath', ConditionType.EQUALS,xpath)
		WebUI.waitForElementClickable(t1,GlobalVariable.timeout)
		WebUI.scrollToElement(t1,3)
		WebUI.click(t1)
		WebUI.switchToDefaultContent()
	}

	void customVerify(TestObject frame,String xpath,String message) {
		WebUI.switchToFrame(frame, 2)
		TestObject t1 = new TestObject('value')
		t1.addProperty('xpath', ConditionType.EQUALS,xpath)
		WebUI.waitForElementClickable(t1,GlobalVariable.timeout)
		WebUI.verifyElementText(t1,message)
		WebUI.switchToDefaultContent()
	}

	boolean customObjectPresent(TestObject frame,String xpath) {
		boolean val
		WebUI.switchToFrame(frame, 2)
		TestObject t1 = new TestObject('value')
		t1.addProperty('xpath', ConditionType.EQUALS,xpath)
		try {
			val=WebUI.verifyElementPresent(t1,0);
		}

		catch(Exception ex) {
			println("Catching the exception");
		}

		WebUI.switchToDefaultContent()
		return val;
	}


	String currentTime() {
		Date today = new Date()
		String nowTime = today.format('hh:mm a')
		return nowTime;
	}


	

	public UtilityFunctions() {
	}
}
