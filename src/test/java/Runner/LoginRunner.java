package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\sanja\\IdeaProjects\\29thNov_BDDFramework\\src\\test\\java\\Features\\Ex12_RerunFailedScenarios.feature",

        glue = {"Steps","Hooks"},
        publish = true,
//        plugin = {"pretty","html:Reports/cucumber-reports/SampleReport.html"},
        plugin = {"rerun:target/FailedScenariosFiles/failed.txt"}


)
public class LoginRunner extends AbstractTestNGCucumberTests
{

}
