Feature: About in application

  Scenario: User try to reach contat pages 
    Given user launch Chrome browser
    When User open URL "https://www.saucedemo.com/"
    And User enter Email as "standard_user" and Password as "secret_sauce"
    And click on login 
    When user click ok burger menu
    And click on About
    Then user goes to contact sales page
    
  
    Scenarios: user create contact sales
    Given user launch Chrome browser
    When User open URL "https://www.saucedemo.com/"
    And User enter Email as "standard_user" and Password as "secret_sauce"
    And click on login 
    When user click ok burger menu
    And click on About
    Then user goes to contact sales page
    When user click on contact sales 
    And user fill all details
    Then suer reaches felling information page

 
   