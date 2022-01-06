@DocumentationFunctionality
Feature: Add Edit and Delete in Functional Status

Background: 
  Given I navigate to patient grid
    
    @UploadDocument
    @Regression
    @Sanity
    Scenario Outline: Upload document
    
  Given I search <Patient> using global search
		And I click on Documentation tab
 	  	* I click on add document button
	    * I upload the file for documentation
	    * I select <Type> in documentation type dropdown
	    * I enter <Comment> in documentation comment section
	    * I click on save button to save file
   Then I should see success message for <module> record
	    * I should see <Type> and <Comment> for documment
	    
		
		
		Examples:
		|       Patient    |     Type      |  Comment  |module|
		|AZMAAT, Jackson|Patient Consent| File added|adding|
		
		
	  @UpdateDocument
    @Regression
    @Sanity
    Scenario Outline: Update document
    
  Given I search <Patient> using global search
		And I click on Documentation tab
 	  	* I click on edit document button
	    * I select <Type> in documentation type dropdown
	    * I enter <Comment> in documentation comment section
	    * I click on save button to save file
   Then I should see success message for <module> record
	    * I should see <Type> and <Comment> for documment
	    
		
		
		Examples:
		|       Patient    |     Type      |   Comment   |module|
		|AZMAAT, Jackson|Provider Notes | File edited |adding|
		
		
		@DeleteDocument
    @Regression
    @Sanity
    Scenario Outline: delete document
    
  Given I search <Patient> using global search
		And I click on Documentation tab
 	  	* I click on delete document button
   Then I should see success message for <module> record
      * I verify that deleted document not present on grid
	    
	    
		
		
		Examples:
		|       Patient    |     Type      |   Comment   |module |
		|AZMAAT, Jackson|Patient Consent| File edited |deleting|
#		