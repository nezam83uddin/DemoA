package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = {"features"}, 
		glue = { "aaa.steps" },
		plugin = { "pretty", "html:report" },
		monochrome = true,
		dryRun= false,
		strict = false,
		tags = {"@smoke"}

)







public class TestRunner {

}
