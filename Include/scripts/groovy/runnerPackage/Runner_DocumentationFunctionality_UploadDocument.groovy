package runnerPackage
import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber











@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/PatientGrid/Documentation/Documentationfunctionality.feature", glue="", tags = "@UploadDocument",
plugin=["pretty", "html:ReportsFolder", "json:ReportsFolder/cucumber.json"])


class Runner_DocumentationFunctionality_UploadDocument {
}