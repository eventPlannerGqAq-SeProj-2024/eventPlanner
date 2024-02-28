package eventPlanner.Tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "uses_case",
				 plugin =  {"html:target/cucumber/eventPlanner.html"},
				 monochrome = true,
				 snippets = SnippetType.CAMELCASE,
				 glue = {"eventPlanner.Tests"},
				 tags = "@Scenario1A")//Use this to change what scenarios you want to test

public class AcceptanceTest {
	
}
