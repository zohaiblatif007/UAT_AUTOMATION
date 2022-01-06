package carecoordination_leftfilters

import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber

@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/PatientGrid/CarePlan/Care Coordination Left Filters/NotificationTypeFilters.feature",
glue="",
//tags = "@Smoke_USMM",
plugin=["pretty", "html:ReportsFolder", "json:ReportsFolder/cucumber.json"])

public class CR_NotificationTypeFilters {
}
