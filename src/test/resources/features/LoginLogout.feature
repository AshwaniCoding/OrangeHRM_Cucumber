Feature: User can login and logout

  Scenario: verify user can login and logout
    Given user open website
    Then verify user is on login page
    When user login with username "Admin" and password "admin123"
    Then verify user is on Dashboard
    When user click on logout
    Then verify user is on login page