$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/PatientGrid/ClinicalSection/Medication.feature");
formatter.feature({
  "name": "Add Edit and Delete in Medication",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Medication"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Delete the specific record in medication",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@DeleteMedication"
    },
    {
      "name": "@Delete"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "I search \u003cPatient\u003e using global search",
  "keyword": "Given "
});
formatter.step({
  "name": "I click on Clinical tab",
  "keyword": "And "
});
formatter.step({
  "name": "I click on Medication\ttab",
  "keyword": "* "
});
formatter.step({
  "name": "I enter \u003cSource_Type\u003e to delete record in medication",
  "keyword": "* "
});
formatter.step({
  "name": "I should see success message for deleted record",
  "keyword": "Then "
});
formatter.step({
  "name": "I should see the deleted medication not present on grid",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Patient",
        "Source_Type"
      ]
    },
    {
      "cells": [
        "Aabram, Allyson",
        "HPC"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
