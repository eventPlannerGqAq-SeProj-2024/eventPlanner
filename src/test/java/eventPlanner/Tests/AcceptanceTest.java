package eventPlanner.Tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "uses_case/signupFeature.feature",
				 plugin =  {"html:target/cucumber/eventPlanner.html"},
				 monochrome = true,
				 snippets = SnippetType.CAMELCASE,
				 glue = {"eventPlanner.Tests"},
				 tags = "@t4")//Use this to change what scenarios you want to test, make the string empty to test all scenarios

public class AcceptanceTest {
	
}
