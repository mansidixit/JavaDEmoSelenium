#Author: ssasi@planittesting.com
Feature: Login with  valid and invalid credentials

  #Scenario: Login with valid credentials
  #Given the salesforce page loads
  #When I provide valid credentials
  #Then I am logged on to the site
  
  
  
  Scenario Outline: Login with invalid credentials
    Given the salesforce page loads
    When I provide "<invalid username>" and "<invalid password>" as credentials
    Then I verify the "<error message>"

    Examples: 
      | invalid username | invalid password | error message                                                                                              |
      | test             | tetdsds          | Please check your username and password. If you still can't log in, contact your Salesforce administrator. |
