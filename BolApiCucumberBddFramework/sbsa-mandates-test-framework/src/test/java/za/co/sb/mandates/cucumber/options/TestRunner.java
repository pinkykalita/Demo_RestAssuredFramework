package za.co.sb.mandates.cucumber.options;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",plugin = "json:target/jsonReports/JsonTestReport.json",glue = {"za.co.sb.mandates.stepdefinitions"},tags = "@endtoendCancelH2HMandate")
public class TestRunner {

}
//tags = "@MandateBatch"