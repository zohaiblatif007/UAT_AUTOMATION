Feature: Existing Care Plan

  Background: 
    Given I navigate to patient grid

@SmokeUSMM_ExistingApproved
  Scenario Outline: Verify Existing Approved Care Plan
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    * I shoule see approved care plan as <ExistingCarePlan>

    Examples: 
      | Patient          | ExistingCarePlan |
      | adam, tom | TestApproved     |
@SmokeUSMM_ExistingDraft
  Scenario Outline: Verify Existing Draft Care Plan
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    * I shoule see draft care plan as <ExistingCarePlan>

    Examples: 
      | Patient          | ExistingCarePlan |
      | adam, tom | TestDraft        |

@SmokeUSMM_ExistingRejected
  Scenario Outline: Verify Existing  Rejected Care Plan
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    * I shoule see rejected care plan as <ExistingCarePlan>

    Examples: 
      | Patient          | ExistingCarePlan |
      | adam, tom | TestRejected     |
@SmokeUSMM_ExistingWIP
  Scenario Outline: Verify Existing WIP Care Plan
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    * I shoule see wip care plan as <ExistingCarePlan>

    Examples: 
      | Patient          | ExistingCarePlan |
      | adam, tom | TestWIP          |
