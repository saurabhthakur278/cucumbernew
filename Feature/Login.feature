Feature: Login verification of medable application

  Scenario: User try to login medable site with valid credentials
    Given user launch Chrome browser
    When User open URL "https://www.saucedemo.com/"
    And User enter Email as "standard_user" and Password as "secret_sauce"
    And click on login 
    Then User able to login  site app
   




