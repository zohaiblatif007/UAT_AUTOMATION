package runnerPackage
import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber











@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/PatientGrid/ClinicalSection/FunctionalStatus.feature", glue="", tags = "@DeleteFunctionalStatus",
plugin=["pretty", "html:ReportsFolder", "json:ReportsFolder/cucumber.json"])


class Runner_ClinicalSection_DeleteFunctionalStatus {
}