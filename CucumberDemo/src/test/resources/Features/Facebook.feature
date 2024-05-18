Feature: Facebook Login

  Scenario: Verify facebook login

    Given the user launches the application
    Then the user verifies the facebook logo
    When the user enters the username in username webedit
    And the user enters the password in password webedit
    And the user clicks on login button



  Scenario Outline: Verify facebook login with <username>

    Given the user launches the application
    Then the user verifies the facebook logo
    When the user enters the "<username>" in username webedit
    And the user enters the "<password>" in password webedit
    And the user clicks on login button
    Examples:
      | username | password |
    |Tom       |admin     |
    |Jerry     |pass      |
    |Kohli     |virat     |