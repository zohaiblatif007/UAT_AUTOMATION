@LeftFilters
Feature: Left Filters

  Background: 
    Given I navigate to patient grid

   #Cases by zohaib  
   
     @UMP_Facility
  Scenario Outline: Applying Facility Filters
  
  Given I am on patient grid left filters
    And I click on reset button
   Then I should see left filter options are reset to default
   When I enter facility <Facility> for left filter
    And I click on apply button
   Then I should see <Facility> as Facility1 in left filter
   And I should see facility of filtered patients is <Facility>

    Examples: 
      | Facility   |
      |     Centinela Hospital Medical Center   |
      
      
    @UMP_MultiFacility
  Scenario Outline: Applying Multi Facility Filters
  
  Given I am on patient grid left filters
    And I click on reset button
   Then I should see left filter options are reset to default
   When I enter facility <Facility1> for left filter
    And I enter facility <Facility2> for left filter
      * I click on apply button
   Then I should see <Facility1> as Facility1 in left filter
   Then I should see <Facility2> as Facility2 in left filter
   And I should see multi facility of filtered patients is <Facility1> and <Facility2>

    Examples: 
      | Facility1                               | Facility2 |
      | Centinela Hospital Medical Center       | Alvarado Hospital Medical Center  |
       
      
      
  @UMP_Provider 
  Scenario Outline: Applying Provider Filters
  Given I am on patient grid left filters
   When I click on reset button
   Then I should see left filter options are reset to default
   When I enter provider <Provider> for left filter
    And I click on apply button
    Then I should see <Provider> as Provider in left filter

    Examples: 
      |  Provider    |
      |  Anbu Pandian  |
  
      
     
      @UM_AttributedProvider
  Scenario Outline: Verify that Attributed Provider Left Filter is working fine
  Given I am on patient grid left filters
   When I click on reset button 
   Then I should see left filter options are reset to default
   When I enter attributed provider <AttributedProvider> for left filter
    And I click on apply button
   Then I should see <AttributedProvider> as Attributed Provider in left filter
    And I should see Attributed Provider of filtered patients is <AttributedProvider>

    Examples: 
      |AttributedProvider|
      |  Oliver, Jacob   |
      
      
       @UM_AttributedFacility
  Scenario Outline: Applying Attributed Facility Filters
   Given I am on patient grid left filters  
    When I click on reset button
    Then I should see left filter options are reset to default
    When I enter attributed facility <AttributedFacility> for left filter
     And I click on apply button
    Then I should see <AttributedFacility> as Attributed Facility in left filter
    And I should see Attributed Facility of filtered patients is <AttributedFacility>

    Examples: 
      |AttributedFacility|
      |      MHPN        |
      
      
  
       @M_Program
  Scenario Outline: Applying Program Filter in left filter
   Given I am on patient grid left filters  
    When I click on reset button
    Then I should see left filter options are reset to default    
    When I enter program <Program> for left filter
     And I click on apply button
    Then I should see <Program> as Program in left filter
    And I should see program of filtered patients is <Program>

    Examples: 
      |  Program  |
      |    CCM   |

      
     @M_Program_Enrollment
  Scenario Outline: Applying Program and Enrolment Filters in left filter
   Given I am on patient grid left filters  
    When I click on reset button
    Then I should see left filter options are reset to default
    When I enter program <Program> for left filter
    And I enter enrollment <Enrollment1> for left filter
      * I click on apply button
    Then I should see <Program> as Program in left filter
    And I should see program of filtered patients is <Program> 
    Then I should see <Enrollment1> as Enrollment in left filter
     And I validate <Program> and <Enrollment1> in enrollment section
     When I click on reset button
    Then I should see left filter options are reset to default 
     When I enter program <Program> for left filter
    When I enter enrollment <Enrollment2> for left filter
    And I click on apply button 
    Then I should see <Program> as Program in left filter
    And I should see program of filtered patients is <Program>   
    Then I should see <Enrollment2> as Enrollment in left filter
    And I validate <Program> and <Enrollment2> in enrollment section
    

    Examples: 
      | Program|Enrollment1|Enrollment2|
      |   CCM | Eligible  |  Active   |
      
      
       @P_Program_Enrollment
  Scenario Outline: Applying Program and Enrolment Filters in left filter
   Given I am on patient grid left filters  
    When I click on reset button
    Then I should see left filter options are reset to default   
    When I enter program <Program> for left filter
     And I enter enrollment <Enrollment> for left filter
       * I click on apply button
    Then I should see <Enrollment1> as Enrollment in left filter 
     And I should see program of filtered patients is <Program>  
     And I validate <Program> and <Enrollment> in enrollment section
     
    Examples: 
      | Program|Enrollment|
      |   BPCI | Completed|
      
       @M_LOB
  Scenario Outline: Applying LOB Filter in left filter
   Given I am on patient grid left filters  
    When I click on reset button
    Then I should see left filter options are reset to default  
    When I enter LOB <LOB> for left filter
     And I click on apply button
    Then I should see <LOB> as LOB in left filter
    And I should see LOB of filtered patients is <LOB>

    Examples: 
      |     LOB    |
      | ACO (MHPN) |
      
      
       @M_LOB_LOBType
  Scenario Outline: Applying LOB Filter in left filter
   Given I am on patient grid left filters  
    When I click on reset button
    Then I should see left filter options are reset to default 
    When I enter LOB <LOB> for left filter
     And I enter LOBtype <LOBType> for left filter
       * I click on apply button
    Then I should see <LOB> as LOB in left filter
     And I should see LOB of filtered patients is <LOB>
     And I should see <LOBType> as LOB type in left filter
    When I click on filtered patient to open pateint
     And I should see LOB type of filtered patients is <LOBType>
       * I click cross icon to close opened patient page
    

    Examples: 
      |      LOB      |   LOBType    |
      | Non-ACO (MPP) | Aetna (MADV) |

      
         @Readmissions @P_Readmissions
  Scenario Outline: Applying Readmissions Filter in left filter
   Given I am on patient grid left filters  
    When I click on reset button
    Then I should see left filter options are reset to default  
    When I enter readmission <Readmission> for left filter
     And I click on apply button
    Then I should see <Readmission> as readmission in left filter
    And I should see readmission of filtered patients is <Readmission>

    Examples: 
      |     Readmission     |
      | Episode Readmission |
      
      
       @MP_HCCScore @Prime_HCCScore @McLalen_HCCScore
  Scenario Outline: Applying HCC Score Filter in left filter
   Given I am on patient grid left filters  
    When I click on reset button
    Then I should see left filter options are reset to default  
    When I enter HCC Score <HCCScore> for left filter
     And I click on apply button
    Then I should see <HCCScore> as HCC Score in left filter
    And I should see HCC Score of filtered patients is <HCCScore>

    Examples: 
      | HCCScore |
      |    Low   |
      
      
      
      
      
      
      
       #@LeftFiltersPatientGrid
   #
    #Scenario Outline: Applying Left Filters on Patient Grid
   #
  #Given I am on patient grid left filters
    #
    #And I click on reset button
   #Then I should see left filter options are reset to default
   #When I enter facility <Facility> for left filter
    #And I click on apply button
   #Then I should see <Facility> as Facility1 in left filter
    #And I should see facility of filtered patients is <Facility>
   #
    #And I click on reset button
   #Then I should see left filter options are reset to default
   #When I enter facility <Facility1> for left filter
    #And I enter facility <Facility2> for left filter
      #* I click on apply button
   #Then I should see <Facility1> as Facility1 in left filter
   #Then I should see <Facility2> as Facility2 in left filter
    #And I should see multi facility of filtered patients is <Facility1> and <Facility2>
   #
   #When I click on reset button
   #Then I should see left filter options are reset to default
   #When I enter provider <Provider> for left filter
    #And I click on apply button
   #Then I should see <Provider> as Provider in left filter
#
   #When I click on reset button 
   #Then I should see left filter options are reset to default
   #When I enter attributed provider <AttributedProvider> for left filter
    #And I click on apply button
   #Then I should see <AttributedProvider> as Attributed Provider in left filter
    #And I should see Attributed Provider of filtered patients is <AttributedProvider>
   #
    #When I click on reset button
    #Then I should see left filter options are reset to default
    #When I enter attributed facility <AttributedFacility> for left filter
     #And I click on apply button
    #Then I should see <AttributedFacility> as Attributed Facility in left filter
     #And I should see Attributed Facility of filtered patients is <AttributedFacility>
#
    #When I click on reset button
    #Then I should see left filter options are reset to default    
    #When I enter program <Program> for left filter
     #And I click on apply button
    #Then I should see <Program> as Program in left filter
     #And I should see program of filtered patients is <Program>
#
    #When I click on reset button
    #Then I should see left filter options are reset to default
    #When I enter program <Program> for left filter
     #And I enter enrollment <Enrollment1> for left filter
       #* I click on apply button
    #Then I should see <Program> as Program in left filter
     #And I should see program of filtered patients is <Program> 
    #Then I should see <Enrollment1> as Enrollment in left filter
     #And I validate <Program> and <Enrollment1> in enrollment section
    #When I click on reset button
    #Then I should see left filter options are reset to default 
    #When I enter program <Program> for left filter
    #When I enter enrollment <Enrollment2> for left filter
     #And I click on apply button 
    #Then I should see <Program> as Program in left filter
     #And I should see program of filtered patients is <Program>   
    #Then I should see <Enrollment2> as Enrollment in left filter
     #And I validate <Program> and <Enrollment2> in enrollment section
    #
   #
    #When I click on reset button
    #Then I should see left filter options are reset to default 
    #When I enter LOB <LOB> for left filter
     #And I enter LOBtype <LOBType> for left filter
       #* I click on apply button
    #Then I should see <LOB> as LOB in left filter
     #And I should see LOB of filtered patients is <LOB>
     #And I should see <LOBType> as LOB type in left filter
    #When I click on filtered patient to open pateint
     #And I should see LOB type of filtered patients is <LOBType>
       #* I click cross icon to close opened patient page
    #
    #When I click on reset button
    #Then I should see left filter options are reset to default  
    #When I enter readmission <Readmission> for left filter
     #And I click on apply button
    #Then I should see <Readmission> as readmission in left filter
     #And I should see readmission of filtered patients is <Readmission> 
#
    #When I click on reset button
    #Then I should see left filter options are reset to default  
    #When I enter HCC Score <HCCScore> for left filter
     #And I click on apply button
    #Then I should see <HCCScore> as HCC Score in left filter
     #And I should see HCC Score of filtered patients is <HCCScore>
#
   #
    #Examples: 
      #| Facility   | Facility1  | Facility2 |  Provider    |AttributedProvider|AttributedFacility|  Program  |Enrollment1|Enrollment2 |      LOB      |   LOBType    |     Readmission     | HCCScore |   
      #|     MHPN   | MHPN       | MHPN2     |Oliver, Jacob |  Oliver, Jacob   |      MHPN        |    CPIA   | Eligible  |   Active   | Non-ACO (MPP) | Aetna (MADV) | Episode Readmission |    Low   |     
   #
   #
   #
    #
   