Feature: Adding Meeting
  
Scenario: adding a new meeting
    Given the user is on the add meeting page
    When the user enter the meeting details and click on the add meeting button
    Then the Meeting added successfully message should be on output page
 