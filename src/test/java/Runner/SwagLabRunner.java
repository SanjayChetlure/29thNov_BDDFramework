package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\sanja\\IdeaProjects\\29thNov_BDDFramework\\src\\test\\java\\Features\\REx1_LoginToApp.feature",
        glue = {"Steps","Hooks"},
        publish = true,
        plugin = {"pretty","html:Reports/cucumber-reports/SwagLabReport.html"}

)

public class SwagLabRunner extends AbstractTestNGCucumberTests
{
}
