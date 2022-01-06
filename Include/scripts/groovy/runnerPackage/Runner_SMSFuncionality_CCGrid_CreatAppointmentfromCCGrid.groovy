package runnerPackage

import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber

@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/PatientGrid/SMSFunctionality/SMSFunctionalityCCgrid.feature", glue="",
tags="@CreatAppointmentfromCCGrid",
plugin=["pretty", "html:ReportsFolder/cucumber.jason"])



class Runner_SMSFuncionality_CCGrid_CreatAppointmentfromCCGrid {
}