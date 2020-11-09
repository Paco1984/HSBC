import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/features/hsbc_01.feature", plugin = { "pretty",
		"html:target/cucumber-reports", "json:target/cucumber.json" }, monochrome = true, dryRun = false,
		tags = { "@Webpage" },
		glue = { "steps" })

public class hsbcRunTest extends AbstractTestNGCucumberTests {

}
