package step_definitions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = {"src/test/resources/features/login.feature","classpath:flightFinder.feature"},
		features = "classpath:features/",
		plugin = {"pretty", "html:target/cucumber-html-report.html"},
		tags = {}
		)
public class RunFeatureTest{

}