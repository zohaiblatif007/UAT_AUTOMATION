package runnerPackage

import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber

@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/PatientGrid/SMSFunctionality/SMSFunctionality.feature", glue="",
tags="@VerifySMSEnglishreccurenceSchedualAppointment",
plugin=["pretty", "html:ReportsFolder/cucumber.jason"])



class Runner_SMSFuncionality_SMSEnglishrecurrenceSchedualAppointment {
}