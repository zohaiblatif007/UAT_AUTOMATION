@CareGap
Feature: Functionality of Care Gap section of a patient

  Background:
    Given I navigate to patient grid
  
  @CareGapTaskWithNoReccurence
  @Regression
  @Sanity
  Scenario Outline: Create task of a care gap with no recurrence
  
Given I search <Patient> using global search
 When I click on Care Gaps tab 
  And I should see button of create task for <CareGap> care gap                      
  And I click on create task button of <CareGap> care gap
  *   I should be on Create New Task form
  *   I enter <Taskname> in care gap task field
  *   I enter <Strtdate> in care gap task start date field
  *   I enter <Completeddate> in care gap task comleted on date field
  #*   I enter <Status> in care gap task status field
  *   I enter <Desription> in care gap task description field
  *   I click on create button to save data
 Then I should see success message for created task
  #And I should see button of view user task for <CareGap> care gap
  #*   I should be able to click on view user task button of <CareGap> care gap
  #*   I click on patient task tab in main menu
  #And I should see task <Taskname> with status <Status> and start date <Strtdate> end date <Completeddate> present in task section

 
  Examples:
  |   Patient    |                    CareGap                       |    Taskname    |     Strtdate    |   Completeddate |   Status  |       Desription        |
  |Haly, Patricia|Hypotension|do jim every day|03202021 04:54 AM|04202021 04:54 AM|In Progress|Task created from caregap|
  
  
  
  @CareGapTaskDailyRecurrence
   @Regression
    @Sanity
  Scenario Outline: Create task of a care gap with daily recurrence
    Given I search <Patient> using global search
    When I click on Care Gaps tab
  And I should see button of create task for <CareGap> care gap                        
  And I click on create task button of <CareGap> care gap     
  *   I should be on Create New Task form
    * I enter <Taskname> in care gap task field
    * I enter <Strtdate> in care gap task start date field
    * I enter <Completeddate> in care gap task comleted on date field
    #* I enter <Status> in care gap task status field
    * I enter <Desription> in care gap task description field
    * I set recurrence on <Recurrence> bases in care gap task
    * I enter <Days> in care gap task every day field
    * I enter <Ocurences> in care gap task ocurrences field
    * I click on create button to save data
 Then I should see success message for created task
  #And I should see button of view user task for <CareGap> care gap
  #*   I should be able to click on view user task button of <CareGap> care gap
  #*   I click on patient task tab in main menu
  #And I should see task <Taskname> with status <Status> and start date <Strtdate> end date <Completeddate> present in task section
 #
    Examples: 
      | Patient       |                               CareGap            |Taskname     | Strtdate          | Completeddate     | Status      | Desription                | Recurrence | Days | Ocurences |
      | Haly, Patricia|Hypotension| Task created | 03202021 04:54 AM | 04202021 04:54 AM | In Progress | Task created from caregap | Daily      |    3 |         4 |


  @CareGapTaskWeeklyRecurrence
  @Regression
  @Sanity
  Scenario Outline: Create task of a care gap with weekly recurrence
    Given I search <Patient> using global search
    When I click on Care Gaps tab
  And I should see button of create task for <CareGap> care gap            
  And I click on create task button of <CareGap> care gap     
  *   I should be on Create New Task form
    * I enter <Taskname> in care gap task field
    * I enter <Strtdate> in care gap task start date field
    * I enter <Completeddate> in care gap task comleted on date field
    #* I enter <Status> in care gap task status field
    * I enter <Desription> in care gap task description field
    * I set recurrence on <Recurrence> bases in care gap task
    * I enter <Weeks> in care gap task every week field
    * I enter <Ocurences> in care gap task ocurrences field
    * I click on create button to save data
 Then I should see success message for created task
  #And I should see button of view user task for <CareGap> care gap
  #*   I should be able to click on view user task button of <CareGap> care gap
  #*   I click on patient task tab in main menu
  #And I should see task <Taskname> with status <Status> and start date <Strtdate> end date <Completeddate> present in task section
 #
    Examples: 
      | Patient       |          CareGap            | Taskname     | Strtdate          | Completeddate     | Status      | Desription                | Recurrence | Weeks | Ocurences |
      | Haly, Patricia|Hypotension| Task created | 03202021 04:54 AM | 04202021 04:54 AM | In Progress | Task created from caregap | Weekly     |     3 |         4 |



  @CareGapTaskMonthlyRecurrence 
  @Regression 
  @Sanity
  Scenario Outline: Create task of a care gap with monthly recurrence
    Given I search <Patient> using global search
    When I click on Care Gaps tab
  And I should see button of create task for <CareGap> care gap                      
  And I click on create task button of <CareGap> care gap     
  *   I should be on Create New Task form
    * I enter <Taskname> in care gap task field
    * I enter <Strtdate> in care gap task start date field
    * I enter <Completeddate> in care gap task comleted on date field
    * I enter <Status> in care gap task status field
    * I enter <Desription> in care gap task description field
    * I set recurrence on <Recurrence> bases in care gap task
    * I enter <month> in care gap task every month field
    * I enter <Ocurences> in care gap task ocurrences field
    * I click on create button to save data
 Then I should see success message for created task
  #And I should see button of view user task for <CareGap> care gap
  #*   I should be able to click on view user task button of <CareGap> care gap
  #*   I click on patient task tab in main menu
  #And I should see task <Taskname> with status <Status> and start date <Strtdate> end date <Completeddate> present in task section
 #

    Examples: 
      | Patient       |          CareGap            | Taskname     | Strtdate          | Completeddate     | Status      | Desription                | Recurrence | month | Ocurences |
      | Haly, Patricia|Hypotension| Task created | 03202021 04:54 AM | 04202021 04:54 AM | In Progress | Task created from caregap | Monthly    |     3 |         4 |



  @CareGapTaskYearlyRecurrence 
  @Regression 
  @Sanity
  Scenario Outline: Create task of a care gap with yearly recurrence
    Given I search <Patient> using global search
    When I click on Care Gaps tab
  And I should see button of create task for <CareGap> care gap                 
  And I click on create task button of <CareGap> care gap     
  *   I should be on Create New Task form
    * I enter <Taskname> in care gap task field
    * I enter <Strtdate> in care gap task start date field
    * I enter <Completeddate> in care gap task comleted on date field
    * I enter <Status> in care gap task status field
    * I enter <Desription> in care gap task description field
    * I set recurrence on <Recurrence> bases in care gap task
    * I enter <year> in care gap task every year field
    * I enter <Ocurences> in care gap task ocurrences field
    * I click on create button to save data
 Then I should see success message for created task
  And I should see button of view user task for <CareGap> care gap
  *   I should be able to click on view user task button of <CareGap> care gap
  *   I click on patient task tab in main menu
  And I should see task <Taskname> with status <Status> and start date <Strtdate> end date <Completeddate> present in task section
 
    Examples: 
      | Patient      |         CareGap             | Taskname     | Strtdate          | Completeddate     | Status      | Desription                | Recurrence | year | Ocurences |
      |Haly, Patricia|Hypotension| Task created | 03202021 04:54 AM | 04202021 04:54 AM | In Progress | Task created from caregap | Yearly     |    3 |         4 |


 
















   @CareGapCreateGoalTaskboth
   @Regression 
   @Sanity
  Scenario Outline: Create goal and task of a patient
    Given I search <Patient> using global search 
    When I click on Care Gaps tab   
  And I should see button of create goal and task for <CareGap> care gap
  And I click on create goal and task button of <CareGap> care gap     
    * I am on create goal and task form
    * I enter <Goal> in  goal field
    * I enter <GoalTargetType> in  goal target type field
    * I enter <GoalStrtdate> in  goal start date field
    * I enter <GoalEnddate> in goal end date field
    * I enter <GoalPriority> in goal priority field
    * I enter <GoalOwner> in goal owner field
    * I enter <GoalComments> in goal comments field   
    * I enter <Task> in task field
    * I enter <TaskStartDate> in task start date field
    * I enter <TaskTrget> in task target field
    * I enter <TaskPriority> in task priority field
    #* I enter <TaskStatus> in task status field
    * I enter <TaskComments> in task comments field
    * I click on save button to save data of care gap goal and task
 Then I should see success message for created goal and task
  And I should see button of view task and goal for <CareGap> care gap
  #And I click on patient goal tab in PWB
              #******* I should see goal <Goal> with goal priority <GoalPriority> and goal start date <GoalStrtdate> end date <GoalEnddate> in PWB goal section
    #* I click on patient task tab in PWB
              #********* I should see task <Task> with status <TaskStatus> and task start date <TaskStartDate> end date <TaskTrget> present in PWB task section
    #* I click on Care Gaps tab  
    #* I should be able to click on view task and goal button of <CareGap> care gap
    #* I click on view task and goal button of <CareGap> care gap  
    #*   I click on delete button to delete goal
    #*   I click on yes button to cofirm delete goal task
 #Then I should see success message for deleted goal and task
               #******************And I should see button of create goal and task for <CareGap> care gap

    Examples: 
      | Patient      |                              CareGap             | Goal                      | GoalTargetType | GoalStrtdate | GoalEnddate | GoalPriority    | GoalOwner | GoalComments     | Task           | TaskStartDate | TaskTrget | TaskPriority | TaskStatus | TaskComments                           |
      |Haly, Patricia|Hypotension| Goal is to cure in a week | ST             |     04012021 |    04222022 | Normal Priority | Provider  | Goal has created | Blood pressure |      03122021 |   4122021 | High         | Active     | Goal and Task Created by gaol and task |

  @CreateCareGapPWBGoal
  @Regression 
  @Sanity
  Scenario Outline: Create goal of a patient
  
Given I search <Patient> using global search
 When I click on Care Gaps tab
  And I should see button of create goal and task for <CareGap> care gap
  And I click on create goal and task button of <CareGap> care gap
    * I am on create goal and task form
    * I enter <Goal> in  goal field
    * I enter <GoalTargetType> in  goal target type field
    * I enter <GoalStrtdate> in  goal start date field
    * I enter <GoalEnddate> in goal end date field
    * I enter <GoalPriority> in goal priority field
    * I enter <GoalOwner> in goal owner field
    * I enter <GoalComments> in goal comments field
    * I click in task check box to disable the task
    * I click on save button to save data of care gap goal and task
 Then I should see success message for created Goal
  #And I should see button of view task and goal for <CareGap> care gap
  #And I click on patient goal tab in PWB
               #************* I should see goal <Goal> with goal priority <GoalPriority> and goal start date <GoalStrtdate> end date <GoalEnddate> in PWB goal section
    #* I click on Care Gaps tab  
    #* I should be able to click on view task and goal button of <CareGap> care gap
    #* I click on view task and goal button of <CareGap> care gap  
    #*   I click on delete button to delete goal
    #*   I click on yes button to cofirm delete goal task
 #Then I should see success message for deleted PWB goal
              #**********And I should see button of create goal and task for <CareGap> care gap

    Examples: 
      | Patient       |                              CareGap             | Goal                      | GoalTargetType | GoalStrtdate | GoalEnddate | GoalPriority    | GoalOwner | GoalComments     |
      | Haly, Patricia|Hypotension| Goal is to cure in a week | ST             |     04022021 |    04222022 | Normal Priority | Provider  | Goal has created |

  @CreateCareGapPWBTask 
  @Regression 
  @Sanity
  Scenario Outline: Create task of a patient
   
   Given I search <Patient> using global search
    When I click on Care Gaps tab
     And I should see button of create goal and task for <CareGap> care gap
     And I click on create goal and task button of <CareGap> care gap
       * I am on create goal and task form
       * I click in goal check box to disable the goal
       * I enter <Task> in task field
       * I enter <TaskStartDate> in task start date field
       * I enter <TaskTrget> in task target field
       * I enter <TaskPriority> in task priority field
       #* I enter <TaskStatus> in task status field
       * I enter <TaskComments> in task comments field
       * I click on save button to save data of care gap goal and task
     And I should see success message for created PWB task
     #And I should see button of view task and goal for <CareGap> care gap
       #* I click on patient task tab in PWB
                #*************** I should see task <Task> with status <TaskStatus> and task start date <TaskStartDate> end date <TaskTrget> present in PWB task section
        #* I click on Care Gaps tab  
    #* I should be able to click on view task and goal button of <CareGap> care gap
    #* I click on view task and goal button of <CareGap> care gap  
    #*   I click on delete button to delete goal
    #*   I click on yes button to cofirm delete goal task
    #Then I should see success message of deleted PWB task
                #***********And I should see button of create goal and task for <CareGap> care gap
   #
    Examples: 
      | Patient       | Task           |                                 CareGap          | TaskStartDate | TaskTrget | TaskPriority | TaskStatus | TaskComments                  |
      | Haly, Patricia| Blood pressure |Hypotension|      03022021 |   9112022 | High         | Active     | Task Created by gaol and task |





















  @CareGapValidation 
  @Regression
   @Sanity
  Scenario Outline: validate the data of a care gap
    Given I search <Patient> using global search
    When I click on Care Gaps tab 
    And I click on <Care_Gap> care gap name
    Then I validate <Care_Gap> details

    Examples: 
      | Patient      | Care_Gap                                          |
      |Haly, Patricia| Hypotension|


        
        
      @CareGapStatusEditOpenClosed 
      @Regression 
      @Sanity
  Scenario Outline: status change to closed of an open care gap
    Given I search <Patient> using global search
    When I click on Care Gaps tab  
    And I click on edit button of a <CareGap> care gap
    * I enter <Status> in care gap status field
    * I enter <Resolutions> in care gap resolutions field
    * I enter <Reason> in care gap reason field
    * I click on update button to save status of care gap
    #Then I should see success message for changed status of care gap
    #And I should see status as <Status> for <CareGap> care gap

    Examples: 
      | Patient       |                 CareGap                          |Status | Resolutions            | Reason       |
      | Haly, Patricia|Urinary tract infections| Open  | Follow up with patient |              |
      | Haly, Patricia|Urinary tract infections|Closed | Follow up with patient | Goal Created |
      | Haly, Patricia|Urinary tract infections| Open  | Follow up with patient |              |
      
    @CareGapstatusclosedbuttun
     @Regression 
     @Sanity
  Scenario Outline: status change to closed of an open care gap with cross button
    Given I search <Patient> using global search
    When I click on Care Gaps tab  
    And I click on close button against a <CareGap> care gap
    * I enter <Reason> reason to close care gap
    * I click on save button to close care gap
    Then I should see success message for closed status of care gap
    #And I should see status as <Status> for <CareGap> care gap

    Examples: 
      | Patient      |                       CareGap                    |Status |   Reason   |
      |Haly, Patricia|Urinary tract infections|Closed |Goal Created|
     

  @CareGapexportfile 
  @Regression 
  @Sanity
  Scenario Outline: Export file of care gap data for a patient
    Given I search <Patient> using global search
    When I click on Care Gaps tab
    And I click on <Care_Gap> care gap name
    When I click on export button to exoprt care gap data file
 Then I verify that care gap file downloaded successfully
    Examples: 
      | Patient       |
      | Haly, Patricia|
    
    
    
      