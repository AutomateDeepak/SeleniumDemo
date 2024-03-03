package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/Login.feature", glue = "StepDefinitions")
public class Runner extends AbstractTestNGCucumberTests {

}
