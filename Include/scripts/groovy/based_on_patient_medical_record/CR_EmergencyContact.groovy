package based_on_patient_medical_record

import org.junit.runner.RunWith

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber


@RunWith(Cucumber.class)
@CucumberOptions(features="Include/features/PatientGrid/CarePlan/Based On Patient Medical Record/EmergencyContact.feature",
glue="",
//tags = "@Smoke_USMM",
plugin=["pretty", "html:ReportsFolder", "json:ReportsFolder/cucumber.json"])

public class CR_EmergencyContact {
}
