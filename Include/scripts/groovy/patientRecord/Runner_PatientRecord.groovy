package patientRecord
import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber









@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/PatientGrid/PatientRecord/PatientDemographics.feature", glue="", plugin=["pretty", "html:ReportsFolder", "json:ReportsFolder/cucumber.json"])


class Runner_PatientRecord {
}