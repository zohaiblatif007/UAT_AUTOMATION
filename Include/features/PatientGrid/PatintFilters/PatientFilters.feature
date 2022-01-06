@PatientFilters
Feature: Patient filtering through MRN or Name and exporting patient to Excel

Background: 
  Given I navigate to patient grid
        
  @ContainsFilteronMRN 
  @Regression 
  @Sanity
  Scenario Outline: Apply Contains filter on MRN to Filter Record
   Given I click on MRN coloumn dropdown
      * I click on filter option for mrn
      * I click on dropdown to set <Filter>
      * I enter <MRN> in text filed1
      * I click on filter button to filter record
   Then I should see the filtered patient for <MRN> on basis of mrn
    And I click on MRN coloumn dropdown
      * I click on filter option for mrn
      * I click on filter clear button
     
    Examples: 
      |    Filter    |         MRN    | 
      |  Contains    | EpisodeTest824 |  
      
      
  @ContainsFilteronMRNCarecordination
  @Regression 
  @Sanity
  Scenario Outline: Apply Contains filter on MRN to Filter Record from Care Coordination
  Given I click on Care Coordination
  Given I click on MRN coloumn dropdown in care coordination
      * I click on filter option for mrn
      * I click on dropdown to set <Filter>
      * I enter <MRN> in text filed1
      * I click on filter button to filter record
   Then I should see the filtered patient for <MRN> on basis of mrn
    And I click on MRN coloumn dropdown in care coordination
      * I click on filter option for mrn
      * I click on filter clear button
     
    Examples: 
      |    Filter    |         MRN    | 
      |  Contains    | EpisodeTest824 |   
    
      
      
  @IsequaltoFilteronMRN 
  @Regression 
  @Sanity
  Scenario Outline: Apply Is equal to filter on MRN to Filter Record
  Given I click on MRN coloumn dropdown
      * I click on filter option for mrn
      * I click on dropdown to set <Filter>
      * I enter <MRN> in text filed1
      * I click on filter button to filter record
   Then I should see the filtered patient for <MRN> on basis of mrn
    And I click on MRN coloumn dropdown
      * I click on filter option for mrn
      * I click on filter clear button
     
    Examples: 
      |    Filter    |         MRN    | 
      |  Is equal to | EpisodeTest824 |   
      
 @ContainsFilteronName
  @Regression 
  @Sanity
  Scenario Outline: Apply Contains filter on Name to Filter Record
  Given I click on Name coloumn dropdown
      * I click on filter option for name
      * I click on dropdown to set <Filter>
      * I enter <Name> in text filed1
      * I click on filter button to filter record
   Then I should see the filtered patient for <Name> on basis of name
      * I click on Name coloumn dropdown
      * I click on filter option for name
       * I click on filter clear button
    Examples: 
      |    Filter    |         Name       | 
      |  Contains    | Bull824, Ariyan824 |   
      
      
  @IsequaltoFilteronName
  @Regression 
  @Sanity
  Scenario Outline: Apply Contains filter on Name to Filter Record
  Given I click on Name coloumn dropdown
      * I click on filter option for name
      * I click on dropdown to set <Filter>
      * I enter <Name> in text filed1
      * I click on filter button to filter record
   Then I should see the filtered patient for <Name> on basis of name
      * I click on Name coloumn dropdown
      * I click on filter option for name
       * I click on filter clear button
     
    Examples: 
      |    Filter    |         Name       | 
      |Is equal to   | Bull824, Ariyan824 |  
      
      
  @ExportAllColoumnsExcelFile
  @Regression 
  @Sanity
  Scenario Outline: Export Excel File with all coloumns after Filtered Record
  Given I click on MRN coloumn dropdown
      * I click on filter option for mrn
      * I click on dropdown to set <Filter>
      * I enter <MRN> in text filed1
      * I click on filter button to filter record
   Then I should see the filtered patient for <MRN> on basis of mrn
      * I click on Export dropdown
      * I mouse hover on the Export Excel dropdown
      * I click on export all coloumns tab to download file
   Then I should see file is downloaded successfully
    And I click on MRN coloumn dropdown
      * I click on filter option for mrn
      * I click on filter clear button
      
   Examples: 
      |    Filter    |         MRN    | 
      |  Contains    | EpisodeTest824 | 
      
      
  @ExportSelectedColoumnsExcelFile
  @Regression 
  @Sanity
  Scenario Outline: Export Excel File with selected coloumns after Filtered Record
  Given I click on MRN coloumn dropdown
      * I click on filter option for mrn
      * I click on dropdown to set <Filter>
      * I enter <MRN> in text filed1
      * I click on filter button to filter record
   Then I should see the filtered patient for <MRN> on basis of mrn
      * I click on Export dropdown
      * I mouse hover on the Export Excel dropdown
      * I click on export selected coloumns tab to download file
   Then I should see file is downloaded successfully
    And I click on MRN coloumn dropdown
      * I click on filter option for mrn
      * I click on filter clear button
      
   Examples: 
      |    Filter    |         MRN    | 
      |  Contains    | EpisodeTest824 | 
      
      
      
