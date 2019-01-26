Feature: Login validation for facebook
  This login feature is to test.

  Scenario: Facebook Login Validation
    Given User need to be on Facebook Login Page
    #And Load username and password
    When Enter the "kiranknn@" username
    And Enter the "kumar" password
    Then click the login button
    And Check the user launch on login page
