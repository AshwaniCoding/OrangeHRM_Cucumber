Feature: User can create new candidate

  Scenario: verify user can create new candidate
    Given user open website
    Then verify user is on login page
    When user login with username "Admin" and password "admin123"
    Then verify user is on Dashboard
    When user click on recruitment link
    Then verify user is on recruitment page
    When user click on add button of recruitment page
    Then user fill the details of candidate
    And user upload the resume
    And click on save button
    Then verify success message "Successfully Saved" is displayed
    When user click on recruitment link
    Then verify user is on recruitment page
    When user write newly created candidate name
    And click on search button of recruitment page
    Then verify search result displays candidate name
