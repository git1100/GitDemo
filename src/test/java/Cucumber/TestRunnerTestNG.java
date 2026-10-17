package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:/Users/Rajan/eclipse-workspace/SeleniumFramework/src/test/java/Cucumber/Login.feature", 
glue = "StepDefinition")
public class TestRunnerTestNG extends AbstractTestNGCucumberTests{

}
