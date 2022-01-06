package runnerPackage
import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber


@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/PatientGrid/CareTeam/Nurse.feature", glue="", tags = "EditNurseSDateLesstoCDateEDateLessToCDate",
plugin=["pretty", "html:ReportsFolder", "json:ReportsFolder/cucumber.json"])


class Runner_CareTeam_Nurse_EditNurseSDateLesstoCDateEDateEqualToCDate {
}