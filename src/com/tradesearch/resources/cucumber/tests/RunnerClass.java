package com.tradesearch.resources.cucumber.tests;

import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/com/tradesearch/resources/cucumber"
        },
        snippets = SnippetType.CAMELCASE, plugin = {"pretty", "html:out"}
)


public class RunnerClass {
}
