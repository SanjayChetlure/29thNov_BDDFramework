package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src\\test\\java\\Features",
        glue = {"Steps","Hooks"},
        tags = "@ProductE2e",
        publish = true,
        plugin = {"pretty","html:Reports/cucumber-reports/SwagLabReport.html"}

)

public class SwagLabRunner extends AbstractTestNGCucumberTests
{
}
