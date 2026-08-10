package testRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import retryAnalyzer.RetryAnalyzer;

@CucumberOptions 
		(
		 features = "src/test/resources/features",
		 glue = "stepDefinitions",
		 dryRun = false,
		 plugin = {"pretty", "html:Cucumber-report/cucucmber.html"}		
		)


public class TestRunner extends AbstractTestNGCucumberTests {

//	@Test
//	public void runCucucmber() {
//		
//	}
}
