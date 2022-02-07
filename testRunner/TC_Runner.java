package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

	@CucumberOptions(features = "src/test/java/testFeatures", glue = "testSteps", monochrome = true, dryRun = false,
	snippets = SnippetType.CAMELCASE, publish = true, tags = "@regression or @smoke")
	public class TC_Runner extends AbstractTestNGCucumberTests
	{
	
	}
