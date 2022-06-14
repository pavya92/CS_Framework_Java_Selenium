package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		features = ".//Feature/LoginFeature.feature",
		glue = "stepDefination",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty", "junit:target/cucumber-reports/report_xml.xml"})

//plugin = {"pretty", "html:target/cucumber-reports/reports1.html"}
//plugin = {"pretty", "json:target/cucumber-reports/report_json.json"}
public class Run {
	
	// This Class will be Empty

}
