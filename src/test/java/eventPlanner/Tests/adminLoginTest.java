package eventPlanner.Tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "uses_case",
				 plugin =  {"html:target/cucumber/wekipedia.html"},
				 monochrome = true,
				 snippets = SnippetType.CAMELCASE,
				 glue = {"eventPlanner.Tests"})

public class adminLoginTest {
	
}
