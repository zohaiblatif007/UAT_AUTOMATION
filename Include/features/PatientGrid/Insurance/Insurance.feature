@Insurance
Feature: Insurance of a patient

Background: 
  Given I navigate to patient grid
  
  
   @Add
   @AddInsurance
   @Regression
   @Sanity
    Scenario Outline: Add new row in insurance section of patient with all fields
    
	  Given I search <Patient> using global search 
   When I click on Insurance tab to land on insurance section
	  And I click on add insurance button
	  *   I enter <Payer> in insurance payer field
	  *   I enter <Streetaddress> in insurance street address field
	  *   I enter <Cityaddress> in insurance city address field
	  *   I enter <Stateaddress> in insurance state address field
	  *   I enter <Zipaddress> in insurance zip address field
	  *   I enter <Countryaddress> in insurance country address field
	  *   I enter <Phone> in insurance phone field
	  *   I enter <Policytype> in insurance policy type field
	  *   I enter <Insurancerank> in insurance insurance rank field
	  *   I enter <Copay> in insurance copay field
	  *   I enter <SubscriberId> in insurance subscriber id field
	  *   I enter <Relationship> in insurance relationship field
	  *   I enter <GroupId> in insurance group id field
	  *   I enter <FinancialResParty> in insurance financial res party field
	  *   I enter <EffectiveFromdate> in insurance effective from field
	  *   I enter <EffectiveTodate> in insurance effective to field	 
    *   I click on save button to save insurance data
	 Then I should see success message for created insurance record
#		And I should see the newly created insurance record on grid
    
    Examples:
    |    Patient     |Payer|Streetaddress|Cityaddress|Stateaddress|Zipaddress|Countryaddress|    Phone   |Policytype|Insurancerank|Copay|SubscriberId|  Relationship  |GroupId|FinancialResParty|EffectiveFromdate|EffectiveTodate|   
    |AZMAAT, Jackson|AETNA|   Thokar    |   Lahore  |   punjab   |   054422 |   Pakistan   |015846377277|   AARP   |  Primary    | 21  |   34848    |Family dependent|  12   |    Affiliate    |   03142021      |     04122021  |  
   
   
   
   @Edit
   @EditInsurance
   @Regression
   @Sanity
    Scenario Outline: Edit existing row in insurance section of patient
    
	  Given I search <Patient> using global search 
   When I click on Insurance tab to land on insurance section
	  And I click on edit insurance button
	  *   I enter <Payer> in insurance payer field
	  *   I enter <Streetaddress> in insurance street address field
	  *   I enter <Cityaddress> in insurance city address field
	  *   I enter <Stateaddress> in insurance state address field
	  *   I enter <Zipaddress> in insurance zip address field
	  *   I enter <Countryaddress> in insurance country address field
	  *   I enter <Phone> in insurance phone field
	  *   I enter <Policytype> in insurance policy type field
	  *   I enter <Insurancerank> in insurance insurance rank field
	  *   I enter <Copay> in insurance copay field
	  *   I enter <SubscriberId> in insurance subscriber id field
	  *   I enter <Relationship> in insurance relationship field
	  *   I enter <GroupId> in insurance group id field
	  *   I enter <FinancialResParty> in insurance financial res party field
	  *   I enter <EffectiveFromdate> in insurance effective from field
	  *   I enter <EffectiveTodate> in insurance effective to field	 
    *   I click on save button to save insurance data
	 Then I should see success message for created insurance record
#		And I should see the newly created insurance record on grid
    
    Examples:
    |    Patient     |Payer|Streetaddress|Cityaddress|Stateaddress|Zipaddress|Countryaddress|    Phone   |Policytype|Insurancerank|Copay|SubscriberId|  Relationship  |GroupId|FinancialResParty|EffectiveFromdate|EffectiveTodate|   
    |AZMAAT, Jackson|CIGNA|   Thokar    |   Lahore  |   punjab   |   054422 |   Pakistan   |015844477277| AAF RENO |  Tertiary   | 40  |   44548    |Family dependent|  22   |    Affiliate    |   03142020      |     03022021  |  
   
   
   
   @Delete
   @DeleteInsurance
   @Regression
   @Sanity
    Scenario Outline: Delete the row in insurance section of patient
    
	Given I search <Patient> using global search 
   When I click on Insurance tab to land on insurance section
	  *   I delete insurance record with <Payer> of the insurance
	 Then I should see success message for deleted insurance record
#		And I should see deleted insurance record not present on grid
    
    Examples:
    |    Patient     |Payer|
    |AZMAAT, Jackson|CIGNA|  
     #
   