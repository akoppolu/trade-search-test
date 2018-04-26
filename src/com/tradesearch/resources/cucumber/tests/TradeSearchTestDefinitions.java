package com.tradesearch.resources.cucumber.tests;

import com.tradesearch.domain.TradeSearch;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;


public class TradeSearchTestDefinitions {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    TradeSearch tradeSearch;
    String results;

    @Given("^I Launch Trade search application$")
    public void i_Launch_Trade_search_application() throws Throwable {
        tradeSearch = new TradeSearch();
    }

    @When("^I search for trades using date rage from \"(.*?)\" and \"(.*?)\"$")
    public void iSearchForTradesUsingDateRageFromAnd(String arg1, String arg2) throws Throwable {

        try{
            results=tradeSearch.GetTradeSearchResultsByDateRange(dateFormat.parse(arg1),dateFormat.parse(arg2));
        }
        catch (Exception e){
           results="Enter date format in DD/MM/YYYY" ;
            e.printStackTrace();
        }

    }

    @When("^I search for instruments not traded by date rage from \"(.*?)\" and \"(.*?)\"$")
    public void iSearchForInstrumentsNotTradedByDateRageFromAnd(String arg1, String arg2) throws Throwable {
        try{
            results=tradeSearch.GetInstrumentResultsNotTradedByDateRange(dateFormat.parse(arg1),dateFormat.parse(arg2));
        }
        catch (Exception e){
            results="Enter date format in DD/MM/YYYY" ;
            e.printStackTrace();
        }
    }

    @Then("^I should be able to see instrument wise trade details for \"(.*?)\"$")
    public void i_should_be_able_to_see_instrument_wise_trade_details_for(String arg1) throws Throwable {
        Assert.assertTrue(results.contains(arg1));
    }

    @Then("^I should be able to see the list of instrument not traded Ex: \"(.*?)\"$")
    public void iShouldBeAbleToSeeTheListOfInstrumentNotTradedEx(String arg1) throws Throwable {
        Assert.assertTrue(results.contains(arg1));
    }
    @Then("^I should see instrument \"(.*?)\"$")
    public void iShouldSeeInstrument(String arg1) throws Throwable {
        Assert.assertTrue(results.contains(arg1));
    }
    @Then("^I should be able to see error message \"(.*?)\"$")
    public void iShouldBeAbleToSeeErrorMessage(String arg1) throws Throwable {
        Assert.assertTrue(results.contains(arg1));
    }
}
