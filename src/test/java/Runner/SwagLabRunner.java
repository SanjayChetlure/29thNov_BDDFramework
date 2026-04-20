package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\sanja\\IdeaProjects\\29thNov_BDDFramework\\src\\test\\java\\Features\\REx4_Product_E2E_ScenarioOutline.feature",
        glue = {"Steps","Hooks"},
        tags = "",
        publish = true,
        plugin = {"pretty","html:Reports/cucumber-reports/SwagLabReport.html"}

)

public class SwagLabRunner extends AbstractTestNGCucumberTests
{
}
