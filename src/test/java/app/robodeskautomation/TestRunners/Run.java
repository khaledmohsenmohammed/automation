package app.robodeskautomation.TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/main/resources/Features"},
        glue = {"app.robodeskautomation.StepDefs"},
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json",
                "junit:target/cucumber-reports/cucumber.xml",
                "rerun:target/cucumber-reports/rerun.txt"},
        tags = "@SmokeTest"
)
public class Run extends AbstractTestNGCucumberTests  {

}
