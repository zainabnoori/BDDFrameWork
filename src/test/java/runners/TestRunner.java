package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:Features",  // path to feature files
glue = { "stepDefinitions" }, // path to step defininitions
tags = {"@tek"}, // tags to run  on feature level or scenario level
dryRun = false , //check if all the steps in feature file has steps in step definitions
monochrome = true, // display the console output in readable way if set to true
strict = false,
format = {"html:target"}) // if set to false will fail there are pending or undefined steps.

public class TestRunner {

}


