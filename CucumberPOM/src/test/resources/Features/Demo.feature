Feature: nopcommerce
  Scenario Outline: Login the NOP Admin Website
    Given the user launches the NOPADMIN url
#    Then the user verifies the header text
#    When the user enters "<username>" in email webEdit
#    And the user enters "<password>" in password webEdit
#    And the user clicks on login button
#    Then the user verifies the homePage Logo
#    And the user logouts the application

    Examples:
    |username|password|
    |admin@yourstore.com|admin|
    |devlabs@yourstore.com|admin|
