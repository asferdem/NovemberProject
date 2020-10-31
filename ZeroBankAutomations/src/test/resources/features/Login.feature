Feature:Only authorized users should be able to login to the application.

  Scenario: Login as a user
    Given user is on the login page
    When user logs in
    Then account summary page should be displayed


  Scenario:Login as a invalid username or password
    Given user is on the login page
    When user input invalid credential
    Then user shoudbe able to see "Login and/or password are wrong" message