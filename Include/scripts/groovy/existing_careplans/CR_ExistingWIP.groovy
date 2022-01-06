package existing_careplans

import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber

@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/PatientGrid/CarePlan/ExistingCarePlan.feature",
glue="",
tags = "@SmokeUSMM_ExistingWIP",
plugin=["pretty", "html:ReportsFolder", "json:ReportsFolder/cucumber.json"])

public class CR_ExistingWIP {
}
