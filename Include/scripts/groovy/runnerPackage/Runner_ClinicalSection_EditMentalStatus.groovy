package runnerPackage
import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber











@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/PatientGrid/ClinicalSection/MentalStatus.feature", glue="", tags = "@EditMentalStatus",
plugin=["pretty", "html:ReportsFolder", "json:ReportsFolder/cucumber.json"])


class Runner_ClinicalSection_EditMentalStatus {
}