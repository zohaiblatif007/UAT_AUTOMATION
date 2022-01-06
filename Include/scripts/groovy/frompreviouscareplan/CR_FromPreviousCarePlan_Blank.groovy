package frompreviouscareplan

import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber


@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/PatientGrid/CarePlan/FromPreviousCarePlan.feature",
glue="",
tags = "@SmokeUSMM_PreviousCP_Blank",
plugin=["pretty", "html:ReportsFolder", "json:ReportsFolder/cucumber.json"])

public class CR_FromPreviousCarePlan_Blank {
}
