@Encounter
Feature: Add Encounter of a patient

Background: 
  Given I navigate to patient grid

   @AddEncounter
   @Regression
   @Sanity
    Scenario Outline: Add encounter of a patient with all fields
    
  Given I search <Patient> using global search
   When I click on encounter tab button to land on enconter section
	  And I click on add encounter button of a patient
	  *   I enter <Source> in patient encounter source field  
	  *   I enter <Billable> in patient encounter billable chckbox
		*   I enter <Encounter> in patient encounter encounter field
		*   I enter <StartDate> in patient encounter start date field
		*   I enter <EndDate> in patient encounter end date field
		*   I enter <ServingFacility> in patient encounter serving facility field
		*   I enter <Disposition> in patient encounter disposition field
		*   I enter <Disfacility> in patient encounter dis facility field
		*   I enter <Location> in patient encounter location field
		*   I enter <POS> in patient encounter pos field
		*   I enter <VisitType> in patient encounter visit type field
		*   I enter <NoteType> in patient encounter note type field
		*   I enter <ApptProvider> in patient encounter appt provider field
		*   I enter <RendringProvider> in patient encounter rendring provider field
		*   I enter <RefrenceProvider> in patient encounter reference provider field
    *   I click on patient save button to save encounter
	 Then I should see success message for created encounter
#		And I should see the newly created encounter on grid
    
    Examples:
    |    Patient     |Source|Billable|                          Encounter                    |      StartDate     |       EndDate      |      ServingFacility      |Disposition| Disfacility |Location|      POS     | VisitType|   NoteType  |ApptProvider    |RendringProvider|RefrenceProvider|   
    |AZMAAT, Jackson |  C4  |  Yes   |Observation care, typically 30 minutes are spent::99218|12192020 01:30:00 AM|12072021 01:30:00 AM|Chino Valley Medical Center|    SNF    |    SNF 1    |pakistan|Allergy clinic|Telehealth|Referral Note|Zohaib, Muhammad| Mutuc, Desirae |  Dr. DAVID RAZI   |   
    
    
    
   @EditEncounter
   @Regression
   @Sanity
    Scenario Outline: Edit encounter of a patient with all fields
    
  Given I search <Patient> using global search 
   When I click on encounter tab button to land on enconter section
	  And I click on edit encounter button of a patient
	  *   I enter <Source> in patient encounter source field
	  *   I enter <Billable> in patient encounter billable chckbox
		*   I enter <Encounter> in patient encounter encounter field
		*   I enter <StartDate> in patient encounter start date field
		*   I enter <EndDate> in patient encounter end date field
		*   I enter <ServingFacility> in patient encounter serving facility field
		*   I enter <Disposition> in patient encounter disposition field
		*   I enter <Disfacility> in patient encounter dis facility field
		*   I enter <Location> in patient encounter location field
		*   I enter <POS> in patient encounter pos field
		*   I enter <VisitType> in patient encounter visit type field
		*   I enter <NoteType> in patient encounter note type field
		*   I enter <ApptProvider> in patient encounter appt provider field
		*   I enter <RendringProvider> in patient encounter rendring provider field
		*   I enter <RefrenceProvider> in patient encounter reference provider field
    *   I click on patient save button to save encounter
	 Then I should see success message for edit encounter
#		And I should see the newly created encounter on grid
    
    Examples:
    |    Patient     |Source|Billable|                          Encounter                    |      StartDate     |       EndDate      |   ServingFacility         |  Disposition| Disfacility |Location|      POS     | VisitType|   NoteType  |ApptProvider    |RendringProvider|RefrenceProvider|   
    |AZMAAT, Jackson |  C4  |  Yes   |Observation care, typically 30 minutes are spent::99218|12192020 01:30:00 AM|12072021 01:30:00 AM|Chino Valley Medical Center|     SNF     |     SNF 2   |pakistan|Allergy clinic|Telehealth|Referral Note|Zohaib, Muhammad| Mutuc, Desirae |    A JAFFER    |   
    
    
    
   @DeleteEncounter
   @Regression
   @Sanity
    Scenario Outline: Edit encounter of a patient with all fields
    
  Given I search <Patient> using global search 
   When I click on encounter tab button to land on enconter section
	  And I delete encounter with <Encounter> of a patient
	  *   I click on encounter delete confirm button
	 Then I should see success message for deleted encounter
#		And I should see deleted encounter not present on grid
    
    Examples:
    |    Patient     |                       Encounter                       |
    |AZMAAT, Jackson|Observation care, typically 30 minutes are spent::99218|
    