$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/PatientGrid/SMSFunctionality/SMSFunctionalityCCgrid.feature");
formatter.feature({
  "name": "Verify SMS notification is working fine",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create appointment from CC grid to PWB",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreatAppointmentfromCCGrid"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "I search \u003cPatient\u003e using global search from CC",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on searched patient from CC",
  "keyword": "And "
});
formatter.step({
  "name": "I click on appointment tab",
  "keyword": "* "
});
formatter.step({
  "name": "I click on Add button to add appointment",
  "keyword": "* "
});
formatter.step({
  "name": "I set visit type as telehealth in PWB",
  "keyword": "* "
});
formatter.step({
  "name": "I verify that copy button and send sms button available and functional",
  "keyword": "* "
});
formatter.step({
  "name": "I set \u003cReason\u003e to schedual the appointment",
  "keyword": "* "
});
formatter.step({
  "name": "I set start date for appointment",
  "keyword": "* "
});
formatter.step({
  "name": "I set end date for appointment",
  "keyword": "* "
});
formatter.step({
  "name": "I set status \u003cStatus\u003e for appointment",
  "keyword": "* "
});
formatter.step({
  "name": "I enter \u003cComment\u003e in text area of appointment",
  "keyword": "* "
});
formatter.step({
  "name": "I click the save button to save Appointments",
  "keyword": "When "
});
formatter.step({
  "name": "I should see message of success for \u003cmodule\u003e record",
  "keyword": "Then "
});
formatter.step({
  "name": "I verify that appointment created successfully with \u003cReason\u003e and \u003cStatus\u003e and \u003cComment\u003e and with telehealth type",
  "keyword": "* "
});
formatter.step({
  "name": "I should see Edit appointment, Show log and Delete buttons are available and functional",
  "keyword": "* "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Filter",
        "Patient",
        "Language",
        "Phone",
        "Message_Text",
        "Status",
        "Comment",
        "module",
        "Reason"
      ]
    },
    {
      "cells": [
        "Contains",
        "Shelly, Shelly",
        "Spanish",
        "+19294154089",
        "Edit message",
        "Scheduled",
        "Appointment created through CC grid",
        "adding",
        "Abnormal menses"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Unable to set text \u0027mz@slt.com\u0027 of object \u0027Object Repository/OR_LoginPage/Obj_Username\u0027\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetTextKeyword.setText(SetTextKeyword.groovy:66)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetTextKeyword.execute(SetTextKeyword.groovy:37)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.setText(WebUiBuiltInKeywords.groovy:980)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$setText$2.call(Unknown Source)\r\n\tat patientGrid.SD_Login.PerformLogin(SD_Login.groovy:50)\r\n\tat patientGrid.SD_Login$PerformLogin.callCurrent(Unknown Source)\r\n\tat patientGrid.SD_Login.Browser(SD_Login.groovy:28)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.HookDefinitionMatch.runStep(HookDefinitionMatch.java:14)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:65)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:47)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:41)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:98)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:55)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:107)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:115)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:105)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runWithCucumberRunner_closure5.doCall(CucumberBuiltinKeywords.groovy:621)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runWithCucumberRunner_closure5.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:74)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runWithCucumberRunner(CucumberBuiltinKeywords.groovy:618)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runWithCucumberRunner$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runWithCucumberRunner(CucumberBuiltinKeywords.groovy:718)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runWithCucumberRunner.call(Unknown Source)\r\n\tat TC_CreatAppointmentfromCCGrid.run(TC_CreatAppointmentfromCCGrid:23)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:430)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:421)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:400)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:392)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:273)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:202)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:164)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:105)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:185)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat TempTestSuite1636437703865.run(TempTestSuite1636437703865.groovy:36)\r\nCaused by: com.kms.katalon.core.webui.exception.WebElementNotFoundException: Web element with id: \u0027Object Repository/OR_LoginPage/Obj_Username\u0027 located by \u0027//input[@id\u003d\u0027username\u0027]\u0027 not found\r\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findWebElement(WebUiCommonHelper.java:1368)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword.findWebElement(WebUIAbstractKeyword.groovy:27)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword.findWebElement(WebUIAbstractKeyword.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetTextKeyword$_setText_closure1.doCall(SetTextKeyword.groovy:51)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.SetTextKeyword$_setText_closure1.call(SetTextKeyword.groovy)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\r\n\t... 73 more\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I navigate to Care Coordination",
  "keyword": "Given "
});
formatter.match({
  "location": "SMSverification.I_navigat_to_patient_grid()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Create appointment from CC grid to PWB",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreatAppointmentfromCCGrid"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "I search Shelly, Shelly using global search from CC",
  "keyword": "Given "
});
formatter.match({
  "location": "SMSverification.search_Patient(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on searched patient from CC",
  "keyword": "And "
});
formatter.match({
  "location": "SMSverification.clickpatietn()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on appointment tab",
  "keyword": "* "
});
formatter.match({
  "location": "SMSverification.appointmenttab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on Add button to add appointment",
  "keyword": "* "
});
formatter.match({
  "location": "SMSverification.addappointment()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I set visit type as telehealth in PWB",
  "keyword": "* "
});
formatter.match({
  "location": "SMSverification.visittypecc()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify that copy button and send sms button available and functional",
  "keyword": "* "
});
formatter.match({
  "location": "SMSverification.veryfybuttons()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I set Abnormal menses to schedual the appointment",
  "keyword": "* "
});
formatter.match({
  "location": "SMSverification.reasonseselect(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I set start date for appointment",
  "keyword": "* "
});
formatter.match({
  "location": "SMSverification.adate()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I set end date for appointment",
  "keyword": "* "
});
formatter.match({
  "location": "SMSverification.edate()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I set status Scheduled for appointment",
  "keyword": "* "
});
formatter.match({
  "location": "SMSverification.statuseselect(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter Appointment created through CC grid in text area of appointment",
  "keyword": "* "
});
formatter.match({
  "location": "SMSverification.commentfield(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click the save button to save Appointments",
  "keyword": "When "
});
formatter.match({
  "location": "SMSverification.saveappointmentbutn()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should see message of success for adding record",
  "keyword": "Then "
});
formatter.match({
  "location": "ProblemListsteps.saved_alerts_shoud_be_popup(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify that appointment created successfully with Abnormal menses and Scheduled and Appointment created through CC grid and with telehealth type",
  "keyword": "* "
});
formatter.match({
  "location": "SMSverification.verifycreatedappointment(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should see Edit appointment, Show log and Delete buttons are available and functional",
  "keyword": "* "
});
formatter.match({
  "location": "SMSverification.verifyappointmentbuuton()"
});
formatter.result({
  "status": "skipped"
});
});