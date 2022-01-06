@Demographics
Feature: Demographic record of a patient

Background: 
  Given I navigate to patient grid

   @CreateNewPatient
   @Regression
   @Sanity
    Scenario Outline: Create new patient with all fields
    
	 When I click on patient create button
	  And I enter <MRN> in patient mrn field
		*   I enter <First_Name> in patient first name field
		*   I enter <Midddle_Name> in patient middle name field
		*   I enter <Last_Name> in patient last name field
		*   I enter <Suffix> in patient suffix field
		*   I enter <Birth_Name> in patient birth name field
		*   I enter <Gender> in patient gender field
		*   I enter <DOB> in patient dob field
		*   I enter <Gender_Identity> in patient gender identity field
		*   I enter <Sexual_Orientation> in patient sexual orientation field
		*   I enter <Bith_Address> in patient birth address field
		*   I enter <Bith_State> in patient birth state field
		*   I enter <Bith_Country> in patient birth country field
		*   I enter <Marital_Status> in patient marital status field
		*   I enter <Language> in patient language field
	  *   I enter <Race> in patient race field
		*   I enter <Detailed_Race> in patient detailed race field
		*   I enter <Ethnicity> in patient ethnicity field
		*   I enter <Detailed_Ethnicity> in patient detailed ethnicity field
		*   I enter <Religion> in patient religion field
		*   I enter <Facility> in patient facility field
		*   I enter <Street_Address> in patient street address field
		*   I enter <City_Address> in patient city address field
		*   I enter <State_Address> in patient state address field
		*   I enter <ZIP_Address> in patient zip address field
		*   I enter <Country_Address> in patient country address field
		*   I enter <Home_Phone> in patient home phone field
		*   I enter <Work_Phone> in patient work phone field
		*   I enter <Mobile_Phone> in patient mobile phone field
		*   I enter <Preffered_Phone> in patient preffered phone field
		*   I enter <Email> in patient email field
		*   I enter <Comments> in patient comments field
    *   I click on patient save button
    #**********   I click on patient proceed button button
	 #*********Then I should see success message for created patient
                      #**********************		And I should see the newly created patient on grid
    
    Examples:
    | MRN |First_Name|Midddle_Name|Last_Name|Suffix|Birth_Name|Gender|   DOB  |Gender_Identity|   Sexual_Orientation   |Bith_Address|Bith_State|Bith_Country|Marital_Status|Language|Race |Detailed_Race|    Ethnicity     |Detailed_Ethnicity|Religion|Facility|Street_Address| City_Address|State_Address|ZIP_Address|Country_Address|Home_Phone|Work_Phone|Mobile_Phone|Preffered_Phone|   Email   |    Comments   |
    |Robeb|   anar67   |   ahi77   |  K29ri   |  Mr  |  Wikllian |Male|12032020|     Female    |Straight or Heterosexual|   Lahore   | Punjab   |  Pakistan  |    Married   |English |Asian|  Pakistani  |Hispanic or Latino|    Asturian      | Islam  |  Test CCM  | Thiokar niaz | north punjab|   Punjab    |    0123   |  Near Iran    |0139848973|0174888888|013344333333|       Home    |test@ss.com|add new patient|   
    



   @EditPatientdemographicRecord
   @Regression
   @Sanity
    Scenario Outline: Edit demographics record of patient with all fields
    
  Given I search <Patient> using global search
	 When I click on patient record Edit button
		*   I enter <First_Name> in patient record first name field
		*   I enter <Midddle_Name> in patient record middle name field
		*   I enter <Last_Name> in patient record last name field
		*   I enter <Suffix> in patient record suffix field
		*   I enter <Birth_Name> in patient record birth name field
#		*   I enter <Status> in patient record status field
                                       #***************		*   I enter <MRN> in patient record mrn field
		*   I enter <Gender> in patient record gender field
		*   I enter <Language> in patient record language field
		*   I enter <Sexual_Orientation> in patient record sexual orientation field
		*   I enter <Gender_Identity> in patient record gender identity field
		*   I enter <Detailed_Race> in patient record detailed race field
		*   I enter <Race> in patient record race field
		*   I enter <Detailed_Ethnicity> in patient record detailed ethnicity field
		*   I enter <Ethnicity> in patient record ethnicity field
		*   I enter <Marital_Status> in patient record marital status field
		*   I enter <Religion> in patient record religion field
		*   I enter <Attributed_Provider> in patient record attributed provider field
		*   I enter <Bith_Address> in patient record birth address field
		*   I enter <Bith_State> in patient record birth state field
		*   I enter <Bith_Country> in patient record birth country field
		*   I enter <Street_Address> in patient record street address field
		*   I enter <City_Address> in patient record city address field
		*   I enter <State_Address> in patient record state address field
		*   I enter <ZIP_Address> in patient record zip address field
		*   I enter <Country_Address> in patient record country address field
		*   I enter <Home_Phone> in patient record home phone field
		*   I enter <Work_Phone> in patient record work phone field
		*   I enter <Mobile_Phone> in patient record mobile phone field
		*   I enter <Preffered_Phone> in patient record preffered phone field
		*   I enter <Email> in patient record email field
		*   I enter <Comments> in patient record comments field
    *   I click on patient record Update button
	 Then I should see success message for edit patient record
#		And I should see the newly edit patient record on grid
    
    Examples:
    |       Patient    |  First_Name |Midddle_Name|Last_Name|Suffix|Birth_Name|Status| MRN |Gender| Language|   Sexual_Orientation   |Gender_Identity|Detailed_Race| Race|Detailed_Ethnicity|    Ethnicity     |Marital_Status|Religion|Attributed_Provider|Bith_Address|Bith_State|Bith_Country|Street_Address| City_Address|State_Address|ZIP_Address|Country_Address|Home_Phone|Work_Phone|Mobile_Phone|Preffered_Phone|   Email   |      Comments     |
    |     amiredit     |   amiredit  |   Deni     |   khan  | Mrs  |  William |Active|Robit|Female|Abkhazian|Straight or Heterosexual|     Female    |  Acoma      |Asian|    Asturian      |Hispanic or Latino|Interlocutory | Islam  |   EMILY SMITH     |   Lahore   | Punjab   |  Pakistan  | Thiokar niaz | north punjab|   Punjab    |    0123   |  Near Iran    |0139848973|0174888888|013344333333|       Home    |test@ss.com|Edit patient record|   
    
    
   @UploadPatientPic
   @Regression  
   @Sanity
    Scenario Outline: pic upload in demographics record of patient
    
  Given I search <Patient> using global search
   When I upload picture of patient in the picture fame
   Then I Verify that picture uploaded successfully
   
   Examples:
    |    Patient   |
    |Haly, Patricia| 
    
    
   @DeletePatientPic
   @Regression  
   @Sanity
    Scenario Outline: pic upload in demographics record of patient
    
  Given I search <Patient> using global search
   When I deleted picture of patient in the picture fame
   Then I click on refresh button
   Then I Verify that picture deleted successfully
   
   Examples:
    |    Patient   |
    |Haly, Patricia| 
    
   @SetPreference
   @Regression  
   @Sanity
    Scenario Outline: Set patient preference in demographics record of patient
    
  Given I search <Patient> using global search
   When I click on optoutsms checkbox to set patient preference
   Then I should see success message for patient preference
   
   Examples:
    |    Patient   |
    |Haly, Patricia| 
    
   @ExportFile
   @Regression  
   @Sanity
    Scenario Outline: Export file in demographics record of patient
    
  Given I search <Patient> using global search
   When I click on export source CDD button to exoprt file
   Then I Verify that file downloaded successfully
  
Examples:
    |    Patient   |
    |Haly, Patricia| 
    
   @EmailSendWhenEmailNotSet
   @Sanity
    Scenario Outline: Email send when email is not set in demographics record of patient
    
  Given I search <Patient> using global search
   When I click on patient record Edit button
    *   I enter <Email> in patient record email field
    *   I click on patient record Update button
   When I click on patient account button to send email
    And I click on send invitation button to send email
   Then I should see message email is not set
   
   Examples:
    |    Patient   |Email|
    |Haly, Patricia|     |
   
   @EmailSendWhenEmailSet 
   @Sanity
    Scenario Outline: Email send when email is set in demographics record of patient
    
  Given I search <Patient> using global search
   When I click on patient record Edit button
    *   I enter <Email> in patient record email field
    *   I click on patient record Update button
   When I click on patient account button to send email
    And I click on send invitation button to send email
   Then I should see success message email is sent
   
   Examples:
    |    Patient   |       Email      |
    |Haly, Patricia|test@testmail.com |
    
   @EmailResend
   @Sanity
    Scenario Outline: Email resend when email in demographics record of patient
     Given I search <Patient> using global search
   When I click on patient record Edit button
    *   I enter <Email> in patient record email field
    *   I click on patient record Update button
   When I click on patient account button to send email
    And I click on send invitation button to send email
   Then I should see success message email is sent
   When I click on patient account button to send email 
    And I click on resend invitation button to send email
   Then I should see success message email is sent
   
     Examples:
    |    Patient   |       Email      |
    |Haly, Patricia|test@testmail.com |
   
   