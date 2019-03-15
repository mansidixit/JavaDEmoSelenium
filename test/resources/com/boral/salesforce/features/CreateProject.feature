#Author: mansi.dixit@boral.com.au
@generateQuote11
Feature: AM Quote Generation for VIC-Metro - Project - Concrete111

  Background: 
    Given The user is logged in as "cpqautomation@boral.com.au.pp" and "Test@1234567"


  @tag1
  Scenario: create project
    Given I have all the details for creating a project
       When I complete action
   Then I can see a project
