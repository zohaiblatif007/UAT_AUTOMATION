Feature: Care Plan - Add Cellulitis Assessment

  Background: 
    Given I navigate to patient grid

  
  @Smoke_USMM2
  Scenario Outline: Add Assessments Cellulitis
    When I search <Patient> using global search
    Then I am on PWB
    * I click on assessment
    * I click on add
    * I click on other assessment tempelate
    * I checked Cellulitis
    * I click on procced
    * I enter <Title> title
    * I click billable radio button
    * I select dropdown values
    * I enter <Comment> comment
    * I click save button
    * I click on care plan tab
    * I click on add new care plan button
    * I click on basedonpatientmedicalrecord
    * I mouse hover on assessment
    * I click on assessment icon
    * I select multiple assessment checkboxes
    * I click on OK button
    Then I should see assessment data

    Examples: 
      | Patient          | Title                 | Comment                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
      | ADam, Tom | Cellulitis Assessment | Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industrys standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum. |
