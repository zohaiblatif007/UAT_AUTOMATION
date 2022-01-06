package runnerPackage
import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber


@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/PatientGrid/LeftFilters.feature", glue="", tags = "@M_Program_Enrollment",
plugin=["pretty", "html:ReportsFolder", "json:ReportsFolder/cucumber.json"])


class Runner_LeftFilter_M_Program_Enrollment {
}