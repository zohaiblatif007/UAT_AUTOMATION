Feature: Care Plan - Add Emergency Contact

  Background: 
    Given I navigate to patient grid

  @Smoke_USMM
  Scenario Outline: Add New Emergency Contact While Show & Hide multiple Components
    When I search <Patient> using global search
    Then I am on PWB
    And I click on care plan tab
    And I click on add new care plan button
    And I click on basedonpatientmedicalrecord
    And I should see add new emergency contact
    When I hover on add new emergency contact
    Then I click on plussign button
    And I enter last name as <LastName>
    And I enter first name as <FirstName>
    And I enter home phone as <HomePhone>
    And I enter mobile phone as <MobilePhone>
    And I click on tickbox
    When I enter title <Title>
    And I click on save and close button
    Then I should see success message <SucessMessage> of CP
    When I click on title from care plan grid
    Then I should see emergency contact data LastName as <LastName> and FirstName as <FirstName> and HomePhone as <HomePhone> and MobilePhone as <MobilePhone> number

    Examples: 
      | Patient          | Title                 | LastName   | FirstName | HomePhone    | MobilePhone | SucessMessage                           |
      | ADam, Tom | New Emergence Contact | Automation | CMR       | 923019536782 | 30195366523 | successCare Plan Saved SuccessfullyHide |
