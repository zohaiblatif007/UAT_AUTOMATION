package runnerPackage
import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber











@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/PatientGrid/ProgramEnrollment/ProgramEnrollment.feature", glue="", tags = "@EditProgramEnrollmentOpenedPatient",
plugin=["pretty", "html:ReportsFolder", "json:ReportsFolder/cucumber.json"])


class Runner_ProgramEnrollment_EditProgramEnrollmentOpenedPatient {
}