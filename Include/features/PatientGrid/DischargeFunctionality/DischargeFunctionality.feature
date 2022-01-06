@Discharge
Feature: Discharge functionality

  Background: 
    Given I navigate to patient grid


   
   @DischargewithDischargeDate
   @Regression  
   @Sanity
    Scenario Outline: Discharge a patient from specified facility with dischage date
    
 Given I click on Name coloumn dropdown
      * I click on filter option for name
      * I click on dropdown to set <Filter>
      * I enter <P_Name> in text filed1
      * I click on filter button to filter record  
      
      * I click in checkbox to select the filtered patient
      * I click on dicharge tab in patient grid
      * I click on SNF dicharge disposition
      * I enter <A_Facility> against dicharge disposition
      * I select discharge date to discharge
       #** I enter discharge date to discharge
      * I enter <DischargeNotes> to dicharge
      * I click on proceed button to dicharge
      * I should see success meassge of patient dischared successfully
      * I verify patient name is <P_Name> mrn is <P_MRN>, PAC status is <Ac_Status>, Discharge facility is <A_Facility> on patient grid
      
      * I click on Name coloumn dropdown
      * I click on filter option for name
      * I click on filter clear button
      
      * I click on discharge cases tab
      * I enter <P_Name> to filter discharged patient in left filter
      * I click on apply button in discharge cases left filter
      * I verify status in PAC is <Ac_Status>
      * I click on expand icon to expand patient in discharge case
      * I verify status of PAC is <Ac_Status> and assigned facility is <A_Facility> after expanding patient
      
      * I click on enterprise drop down and select Charlie Enterprise 
      * I navigate to patient Census grid from Care Coordination 
      * I click on reset button in patientcensus left filter
      * I set Status type All in patientcensus left filter
      * I set admitted date last two years in patientcensus left filter
      * I click on apply button in patientcensus left filter
      * I enter <P_Name> to filter in patient census left filter
      * I click on apply button in patientcensus left filter
      * I verify status in patientcensus is <Ac_Status>
      * I verify patient name is <P_Name> mrn is <P_MRN>, Recieving facility is <A_Facility> on patient census
      * I verify Admitted date, Discharged disposition and discharged on date in recieving facility is empty on patient census
      
      * I click on three dots icon of patient in patient census 
      * I click on edit button in patient census
      * I verify patient name is <P_Name> mrn is <P_MRN> on update window of patient census  
      * I set <Ad_Status> in patientcensus update status field
      * I enter <update_notes> in patientcensus update notes field
      * I click on update button in patient census
      * I should see success meassge of Discharge case updated successfully
      * I verify status in patientcensus is <Ad_Status>
      * I verify Admitted date in recieving facility on patient census
      
      * I click on three dots icon of patient in patient census 
      * I click on edit button in patient census
      * I verify patient name is <P_Name> mrn is <P_MRN> on update window of patient census  
      * I set <D_Status> in patientcensus update status field
      * I set Dischrge Disposition to Home in update window of patient census 
      * I enter <update_notes> in patientcensus update notes field
      * I click on update button in patient census
      * I should see success meassge of Discharge case updated successfully
      * I verify status in patientcensus is <D_Status>
      * I verify discharge disposition in patientcensus is <D_disposition>
      * I verify Admitted date and discharged on date and <D_disposition> in recieving facility on patient census
      
    Examples: 
      |    Filter    |   P_Name     |  P_MRN         |   DischargeNotes   | Ac_Status | Ad_Status |  D_Status  |   A_Facility  |D_disposition|      update_notes      |
      |  Contains    |CCM710, USMANl710| EpisodeTest710 | Need other facility|  Accepted | Admitted  | Discharged | Charlie SNF 1 |     Home    | status select admitted |
     
     
   @DischargewithExpectedDischargeDate
   @Regression  
   @Sanity
    Scenario Outline: Discharge a patient from specified facility with expected dischage date
    
 Given I click on Name coloumn dropdown
      * I click on filter option for name
      * I click on dropdown to set <Filter>
      * I enter <P_Name> in text filed1
      * I click on filter button to filter record  
      
      * I click in checkbox to select the filtered patient
      * I click on dicharge tab in patient grid
      * I click on SNF dicharge disposition
      * I enter <A_Facility> against dicharge disposition
      * I select expected discharge date to dicharge
        #** I enter expected discharge date to discharge
      * I enter <DischargeNotes> to dicharge
      * I click on proceed button to dicharge
      * I should see success meassge of patient dischared successfully
      * I verify patient name is <P_Name> mrn is <P_MRN>, PAC status is <InP_Status>, Discharge facility is <A_Facility> on patient grid
      
      * I click on Name coloumn dropdown
      * I click on filter option for name
      * I click on filter clear button
      
      * I click on discharge cases tab
      * I enter <P_Name> to filter discharged patient in left filter
      * I click on apply button in discharge cases left filter
      * I verify status in PAC is <P_Status>
      * I click on expand icon to expand patient in discharge case
      * I verify status of PAC is <P_Status> and assigned facility is <A_Facility> after expanding patient
      
      * I click on enterprise drop down and select Charlie Enterprise 
      * I navigate to patient Census grid from Care Coordination 
      * I click on reset button in patientcensus left filter
      * I set Status type All in patientcensus left filter
      * I set admitted date last two years in patientcensus left filter
      * I click on apply button in patientcensus left filter
      * I enter <P_Name> to filter in patient census left filter
      * I click on apply button in patientcensus left filter
      * I verify status in patientcensus is <P_Status>
      * I verify patient name is <P_Name> mrn is <P_MRN>, Recieving facility is <A_Facility> on patient census
      * I verify Admitted date, Discharged disposition and discharged on date in recieving facility is empty on patient census
      
      * I click on three dots icon of patient in patient census 
      * I click on accept button in patient census 
      * I verify patient name is <P_Name> mrn is <P_MRN> on update window of patient census  
      * I enter <update_notes> in patientcensus update notes field
      * I click on update button in patient census
      * I should see success meassge of Discharge case updated successfully
      * I verify status in patientcensus is <Ac_Status>
     
      * I click on three dots icon of patient in patient census 
       * I click on edit button in patient census
      * I verify patient name is <P_Name> mrn is <P_MRN> on update window of patient census  
      * I set <Ad_Status> in patientcensus update status field
      * I enter <update_notes> in patientcensus update notes field
      * I click on update button in patient census
      * I should see success meassge of Discharge case updated successfully
      * I verify status in patientcensus is <Ad_Status>
      * I verify Admitted date in recieving facility on patient census
     
      * I click on three dots icon of patient in patient census 
      * I click on edit button in patient census
      * I verify patient name is <P_Name> mrn is <P_MRN> on update window of patient census  
      * I set <D_Status> in patientcensus update status field
      * I set Dischrge Disposition to Home in update window of patient census 
      * I enter <update_notes> in patientcensus update notes field
      * I click on update button in patient census
      * I should see success meassge of Discharge case updated successfully
      * I verify status in patientcensus is <D_Status>
      * I verify discharge disposition in patientcensus is <D_disposition>
      * I verify Admitted date and discharged on date and <D_disposition> in recieving facility on patient census
      
    Examples: 
      |    Filter    |   P_Name          |  P_MRN          |   DischargeNotes   | InP_Status | P_Status | Ac_Status | Ad_Status |  D_Status  |   A_Facility  |D_disposition|      update_notes      |
      |  Contains    |CCM710, USMANl710  | EpisodeTest710  | Need other facility| In Progress|  Pending |  Accepted | Admitted  | Discharged | Charlie SNF 1 |     Home    | status select admitted |
     
  
  
   @DischargewithDischargeDateCCGrid
   @Regression  
   @Sanity
    Scenario Outline: Discharge a patient from specified facility with dischage date from CC Grid
    
  Given I click on Care Coordination
    And I click on MRN coloumn dropdown in care coordination
      * I click on filter option for mrn
      * I click on dropdown to set <Filter>
      * I enter <P_MRN> in text filed1
      * I click on filter button to filter record
 
      * I click on thee dot discharge button against filtered patient on CC grid
      * I click on dicharge option on CC grid
      * I click on SNF dicharge disposition
      * I enter <A_Facility> against dicharge disposition
      * I select discharge date to discharge on cc grid
      #**** I enter discharge date to discharge on cc grid
      * I enter <DischargeNotes> to dicharge on cc grid
      * I click on proceed button to dicharge on cc grid
   Then I should see success meassge of patient dischared successfully
    And I verify patient name is <P_Name> mrn is <P_MRN>, PAC status is <Ac_Status>, Discharge facility is <A_Facility> on cc grid
      
      * I click on MRN coloumn dropdown in care coordination
      * I click on filter option for mrn
      * I click on filter clear button
      
      * I click on discharge cases tab
      * I enter <P_Name> to filter discharged patient in left filter
      * I click on apply button in discharge cases left filter
      * I verify status in PAC is <Ac_Status>
      * I click on expand icon to expand patient in discharge case
   Then I verify status of PAC is <Ac_Status> and assigned facility is <A_Facility> after expanding patient
      
      * I click on enterprise drop down and select Charlie Enterprise 
      * I navigate to patient Census grid from Care Coordination 
      * I click on reset button in patientcensus left filter
      * I set Status type All in patientcensus left filter
      * I set admitted date last two years in patientcensus left filter
      * I click on apply button in patientcensus left filter
      * I enter <P_Name> to filter in patient census left filter
      * I click on apply button in patientcensus left filter
   Then I verify status in patientcensus is <Ac_Status>
    And I verify patient name is <P_Name> mrn is <P_MRN>, Recieving facility is <A_Facility> on patient census
      * I verify Admitted date, Discharged disposition and discharged on date in recieving facility is empty on patient census
      
      * I click on three dots icon of patient in patient census 
      * I click on edit button in patient census
      * I verify patient name is <P_Name> mrn is <P_MRN> on update window of patient census  
      * I set <Ad_Status> in patientcensus update status field
      * I enter <update_notes> in patientcensus update notes field
      * I click on update button in patient census
   Then I should see success meassge of Discharge case updated successfully
    And I verify status in patientcensus is <Ad_Status>
      * I verify Admitted date in recieving facility on patient census
      
      * I click on three dots icon of patient in patient census 
      * I click on edit button in patient census
      * I verify patient name is <P_Name> mrn is <P_MRN> on update window of patient census  
      * I set <D_Status> in patientcensus update status field
      * I set Dischrge Disposition to Home in update window of patient census 
      * I enter <update_notes> in patientcensus update notes field
      * I click on update button in patient census
   Then I should see success meassge of Discharge case updated successfully
    And I verify status in patientcensus is <D_Status>
      * I verify discharge disposition in patientcensus is <D_disposition>
      * I verify Admitted date and discharged on date and <D_disposition> in recieving facility on patient census
      
    Examples: 
      |    Filter    |   P_Name          |   P_MRN |   DischargeNotes   | Ac_Status | Ad_Status |  D_Status  |   A_Facility  |D_disposition|      update_notes      |
      |  Contains    |Hims, Artiya       |CJR601 | Need other facility|  Accepted | Admitted  | Discharged | Charlie SNF 1 |     Home    | status select admitted |
     
     
   @DischargewithExpectedDischargeDateCCGRID
   @Regression  
   @Sanity
    Scenario Outline: Discharge a patient from specified facility with expected dischage date from CC Grid
    
  Given I click on Care Coordination
    And I click on MRN coloumn dropdown in care coordination
      * I click on filter option for mrn
      * I click on dropdown to set <Filter>
      * I enter <P_MRN> in text filed1
      * I click on filter button to filter record
 
      * I click on thee dot discharge button against filtered patient on CC grid
      * I click on dicharge option on CC grid
      * I click on SNF dicharge disposition
      * I enter <A_Facility> against dicharge disposition
      * I select expected discharge date to dicharge on cc grid
      #*** I enter expected discharge date to discharge on cc grid
      * I enter <DischargeNotes> to dicharge on cc grid
      * I click on proceed button to dicharge on cc grid
      * I should see success meassge of patient dischared successfully
      * I verify patient name is <P_Name> mrn is <P_MRN>, PAC status is <InP_Status>, Discharge facility is <A_Facility> on cc grid
      
      * I click on MRN coloumn dropdown in care coordination
      * I click on filter option for mrn
      * I click on filter clear button
      
      * I click on discharge cases tab
      * I enter <P_Name> to filter discharged patient in left filter
      * I click on apply button in discharge cases left filter
      * I verify status in PAC is <P_Status>
      * I click on expand icon to expand patient in discharge case
      * I verify status of PAC is <P_Status> and assigned facility is <A_Facility> after expanding patient
      
      * I click on enterprise drop down and select Charlie Enterprise 
      * I navigate to patient Census grid from Care Coordination 
      * I click on reset button in patientcensus left filter
      * I set Status type All in patientcensus left filter
      * I set admitted date last two years in patientcensus left filter
      * I click on apply button in patientcensus left filter
      * I enter <P_Name> to filter in patient census left filter
      * I click on apply button in patientcensus left filter
      * I verify status in patientcensus is <P_Status>
      * I verify patient name is <P_Name> mrn is <P_MRN>, Recieving facility is <A_Facility> on patient census
      * I verify Admitted date, Discharged disposition and discharged on date in recieving facility is empty on patient census
      
      
      * I click on three dots icon of patient in patient census 
      * I click on accept button in patient census 
      * I verify patient name is <P_Name> mrn is <P_MRN> on update window of patient census  
      * I enter <update_notes> in patientcensus update notes field
      * I click on update button in patient census
      * I should see success meassge of Discharge case updated successfully
      * I verify status in patientcensus is <Ac_Status>
     
      * I click on three dots icon of patient in patient census 
       * I click on edit button in patient census
      * I verify patient name is <P_Name> mrn is <P_MRN> on update window of patient census  
      * I set <Ad_Status> in patientcensus update status field
      * I enter <update_notes> in patientcensus update notes field
      * I click on update button in patient census
      * I should see success meassge of Discharge case updated successfully
      * I verify status in patientcensus is <Ad_Status>
      * I verify Admitted date in recieving facility on patient census
     
      * I click on three dots icon of patient in patient census 
      * I click on edit button in patient census
      * I verify patient name is <P_Name> mrn is <P_MRN> on update window of patient census  
      * I set <D_Status> in patientcensus update status field
      * I set Dischrge Disposition to Home in update window of patient census 
      * I enter <update_notes> in patientcensus update notes field
      * I click on update button in patient census
      * I should see success meassge of Discharge case updated successfully
      * I verify status in patientcensus is <D_Status>
      * I verify discharge disposition in patientcensus is <D_disposition>
      * I verify Admitted date and discharged on date and <D_disposition> in recieving facility on patient census
        
    Examples: 
      |    Filter    |     P_Name       |  P_MRN          |   DischargeNotes   | InP_Status | P_Status | Ac_Status | Ad_Status |  D_Status  |   A_Facility  |D_disposition|      update_notes      |
      #|  Contains    |Ddanso101, Zic101 | TCMStatus101    | Need other facility| In Progress|  Pending |  Accepted | Admitted  | Discharged | Charlie SNF 1 |     Home    | status select admitted |
     #
  