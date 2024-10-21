Feature: Create new admin and delete

  Scenario: verify user can create new admin and delete it
    Given user open website
    Then verify user is on login page
    When user login with username "Admin" and password "admin123"
    Then verify user is on Dashboard
    When user click on admin link
    Then verify user is on admin page
    When user click on add button
    Then verify user is on add user page
    Then user select user role as ess
    And user write employee name
    And user select the status as enabled
    And user use generated random username
    And user use generated random password
    And user click on save button
    Then verify success message "Successfully Saved" is displayed
    And verify user is on admin page
    When user user write newly created user name
    And click on search button
    Then verify newly created user displayed in search list
    When user click on delete icon of the newly created user
    And select yes delete button
    Then verify success message "Successfully Deleted" is displayed