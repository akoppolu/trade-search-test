Feature: Check Trade Search results by date range

  Scenario: Verify the list of instruments traded for specific date range

    Given I Launch Trade search application
    When I search for trades using date rage from "29/11/2017" and "05/12/2017"
    Then I should be able to see instrument wise trade details for "IN1"

  Scenario: Verify the list of instruments not traded for specific date range

    Given I Launch Trade search application
    When I search for instruments not traded by date rage from "29/11/2017" and "05/12/2017"
    Then I should be able to see the list of instrument not traded Ex: "IN2"
    And I should see instrument "IN3"

  Scenario: Verify the error message for invalid date format

    Given I Launch Trade search application
    When I search for instruments not traded by date rage from "DD/11/2017" and "05/12/2017"
    Then I should be able to see error message "Enter date format in DD/MM/YYYY"

  Scenario: Verify the error message for No records

    Given I Launch Trade search application
    When I search for trades using date rage from "11/11/2017" and "25/11/2017"
    Then I should be able to see error message "No Records found. Please change the date range and try"