#Author: sarath.sasil@boral.com.au
@generateQuote
Feature: AM Quote Generation for VIC-Metro - Project - Concrete

  Background: 
    Given The user is logged in as "username" and "password"

  @tag1
  Scenario Outline: Verify that a correct quote is generated for VIC-Metro - Project Concrete
    Given The user creates a project <project_name> having <address>
    And The user creates an opportunity for Concrete_Project with details <opp_name>,<Account_name>,<stage_name>,<Close_Date>
    And The user updates PSD for <psd_name>
    When The user clicks Create Quote from opportunity page
    And The user selects the nearest plant
    And The user adds products to the cart <products_list>
    And The user clicks on Go To Pricing
    And The user gives a discount in percent 5
    And The user clicks Reprice
    And the user edits the service fees to <service_fee>
    And the user clicks Finalize
    And the User clicks Generate
    And The user creates a new Prososal Document
    Then The user can get a Quote file downloaded

    Examples: 
      | AM_username                   | AM_password  | project_name | address   | opp_name | Account_name |
      | cpqautomation@boral.com.au.pp | Test@1234567 | SDFSD        | SDFGSDFSD | SDFSDF   | SDFSDFSDF    |
