Feature: validate the login feature

  Scenario: validate the login feature with username and password
    Given user is on login page
    When user enters valid username "Abhishek@567"
    And user enters valid password "Abhishek"
    Then clicks on submit
