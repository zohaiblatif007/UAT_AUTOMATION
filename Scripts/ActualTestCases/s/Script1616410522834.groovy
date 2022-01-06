import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String dates=  '03202021'

String month = dates.substring(0, 2);
String   day = dates.substring(2, 4);
String  year = dates.substring(4, 8);

String date1= ''+month+'/'+day+'/'+year+''

System.out.println(date1)






System.out.println("before formate= "+dates)
dates = new SimpleDateFormat("MM-dd-yyyy")
String newDate = dates.format('MM-dd-yyyy')

System.out.println("after formate= "+dates)



String str = "Abkhazian";

str = str.replace(" | ", "@")
	   String[] arrOfStr = str.split("@", );
 
	   for(i=0;i<arrOfStr.size();i++)
	   {
		   System.out.println(arrOfStr[i]);
   }



int ind=1
String xpath = "(//div[@data-mz-key='clinical.problem']//table)[2]//tr[" +ind +"]//td[3]"
ind=2
System.out.println(ind)