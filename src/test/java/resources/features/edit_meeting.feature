Feature: Editing Meeting
  
Scenario: Editing a Meeting
    Given the user is on the view meeting page
    And the user click on edit button and open the edit meeting page
    When the user enter the meeting details and click on the update meeting button
    Then the Meeting updated successfully message should be on output page
  