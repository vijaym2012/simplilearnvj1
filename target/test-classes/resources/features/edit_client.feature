Feature: Editing Client
  
Scenario: Editing a client
    Given the user is on the view client page
    And the user click on edit button and open the edit client page
    When the user enter the client details and click on the update client button
    Then the Client updated successfully message should be on output page
  