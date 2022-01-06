package careplan_blank

import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber


@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/PatientGrid/CarePlan/Blank.feature",
glue="",
tags = "@SmokeUSMM_ExportWhileWIP_Blank",
plugin=["pretty", "html:ReportsFolder", "json:ReportsFolder/cucumber.json"])

public class CR_ExportByWIPStatus {
}
