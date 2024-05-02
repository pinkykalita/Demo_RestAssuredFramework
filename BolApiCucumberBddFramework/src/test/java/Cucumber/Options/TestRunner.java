package Cucumber.Options;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Feaures",plugin = "json:target/jsonReports/JsonTestReport.json",glue = {"StepDefinitions"},tags = "@uploadMandateFile")
public class TestRunner {

}
//tags = "@MandateInterchange"