$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TradeSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Check Trade Search results by date range",
  "description": "",
  "id": "check-trade-search-results-by-date-range",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify the list of instruments traded for specific date range",
  "description": "",
  "id": "check-trade-search-results-by-date-range;verify-the-list-of-instruments-traded-for-specific-date-range",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I Launch Trade search application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search for trades using date rage from \"29/11/2017\" and \"05/12/2017\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be able to see instrument wise trade details for \"IN1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TradeSearchTestDefinitions.i_Launch_Trade_search_application()"
});
formatter.result({
  "duration": 216533418,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "29/11/2017",
      "offset": 42
    },
    {
      "val": "05/12/2017",
      "offset": 59
    }
  ],
  "location": "TradeSearchTestDefinitions.iSearchForTradesUsingDateRageFromAnd(String,String)"
});
formatter.result({
  "duration": 5784323,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IN1",
      "offset": 59
    }
  ],
  "location": "TradeSearchTestDefinitions.i_should_be_able_to_see_instrument_wise_trade_details_for(String)"
});
formatter.result({
  "duration": 4637614,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify the list of instruments not traded for specific date range",
  "description": "",
  "id": "check-trade-search-results-by-date-range;verify-the-list-of-instruments-not-traded-for-specific-date-range",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I Launch Trade search application",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I search for instruments not traded by date rage from \"29/11/2017\" and \"05/12/2017\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should be able to see the list of instrument not traded Ex: \"IN2\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I should see instrument \"IN3\"",
  "keyword": "And "
});
formatter.match({
  "location": "TradeSearchTestDefinitions.i_Launch_Trade_search_application()"
});
formatter.result({
  "duration": 1348758,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "29/11/2017",
      "offset": 55
    },
    {
      "val": "05/12/2017",
      "offset": 72
    }
  ],
  "location": "TradeSearchTestDefinitions.iSearchForInstrumentsNotTradedByDateRageFromAnd(String,String)"
});
formatter.result({
  "duration": 322644,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IN2",
      "offset": 63
    }
  ],
  "location": "TradeSearchTestDefinitions.iShouldBeAbleToSeeTheListOfInstrumentNotTradedEx(String)"
});
formatter.result({
  "duration": 71229,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IN3",
      "offset": 25
    }
  ],
  "location": "TradeSearchTestDefinitions.iShouldSeeInstrument(String)"
});
formatter.result({
  "duration": 74049,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Verify the error message for invalid date format",
  "description": "",
  "id": "check-trade-search-results-by-date-range;verify-the-error-message-for-invalid-date-format",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "I Launch Trade search application",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I search for instruments not traded by date rage from \"DD/11/2017\" and \"05/12/2017\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I should be able to see error message \"Enter date format in DD/MM/YYYY\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TradeSearchTestDefinitions.i_Launch_Trade_search_application()"
});
formatter.result({
  "duration": 2106885,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DD/11/2017",
      "offset": 55
    },
    {
      "val": "05/12/2017",
      "offset": 72
    }
  ],
  "location": "TradeSearchTestDefinitions.iSearchForInstrumentsNotTradedByDateRageFromAnd(String,String)"
});
formatter.result({
  "duration": 1927049,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enter date format in DD/MM/YYYY",
      "offset": 39
    }
  ],
  "location": "TradeSearchTestDefinitions.iShouldBeAbleToSeeErrorMessage(String)"
});
formatter.result({
  "duration": 92033,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Verify the error message for No records",
  "description": "",
  "id": "check-trade-search-results-by-date-range;verify-the-error-message-for-no-records",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "I Launch Trade search application",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "I search for trades using date rage from \"11/11/2017\" and \"25/11/2017\"",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I should be able to see error message \"No Records found. Please change the date range and try\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TradeSearchTestDefinitions.i_Launch_Trade_search_application()"
});
formatter.result({
  "duration": 1150236,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "11/11/2017",
      "offset": 42
    },
    {
      "val": "25/11/2017",
      "offset": 59
    }
  ],
  "location": "TradeSearchTestDefinitions.iSearchForTradesUsingDateRageFromAnd(String,String)"
});
formatter.result({
  "duration": 327228,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "No Records found. Please change the date range and try",
      "offset": 39
    }
  ],
  "location": "TradeSearchTestDefinitions.iShouldBeAbleToSeeErrorMessage(String)"
});
formatter.result({
  "duration": 67350,
  "status": "passed"
});
});