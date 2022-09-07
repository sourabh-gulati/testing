package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/functionalTesting",
        glue = {"stepDefinitions"},
        plugin = { "pretty", "html:reports/cucumber-report" },
        strict = true
)
public class ApiTestRunner {

}
	