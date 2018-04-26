# trade-search-test

A sample project for reading data from txt files and searching for sepcific trade details.

# Instructions

Clone the repo:

Git:
```
$ git clone https://github.com/akoppolu/trade-search-test.git
```

Or download a ZIP of master [manually](https://github.com/akoppolu/trade-search-test/archive/master.zip) and expand the contents someplace on your system


## Verify installation

## Use Maven

Open a command window and run:

    mvn test

This runs Cucumber features using Cucumber's JUnit runner. The `@RunWith(Cucumber.class)` annotation on the `RunCukesTest`
class tells JUnit to kick off Cucumber.

### Run a subset of Features or Scenarios

Specify a particular scenario by *line* (and use the pretty plugin, which prints the scenario back)

    -Dcucumber.options="classpath:skeleton/belly.feature:4 --plugin pretty"

This works because Maven puts `.src/com/tradesearch/resources/cucumber` on your `classpath`.
You can also specify files to run by filesystem path:

    -Dcucumber.options="src/com/tradesearch/resources/cucumber/TradeSearch.feature:4 --plugin pretty"

You can also specify what to run by *tag*:

    -Dcucumber.options="--tags @bar --plugin pretty"

### Running only the scenarios that failed in the previous run

    -Dcucumber.options="@target/rerun.txt"

This works as long as you have the `rerun` formatter enabled.

### Specify a different formatter:

For example a JUnit formatter:

  -Dcucumber.options="--plugin junit:target/cucumber-junit-report.xml"

    -Dcucumber.options="--plugin junit:target/cucumber-junit-report.xml"