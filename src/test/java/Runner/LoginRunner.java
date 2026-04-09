package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//        features = "C:\\Users\\sanja\\IdeaProjects\\29thNov_BDDFramework\\src\\test\\java\\Features",
        features = {"C:\\Users\\sanja\\IdeaProjects\\29thNov_BDDFramework\\src\\test\\java\\Features\\Ex2_LoginToApp_MultipleScenario.feature",
                "C:\\Users\\sanja\\IdeaProjects\\29thNov_BDDFramework\\src\\test\\java\\Features\\Ex3_PassInputsOrTestData_FromFeature_to_SDClass.feature",
                ""},
        glue = {"Steps","Hooks"},
//        tags = "@regression",
//        tags = "@Sanity or @Smoke",
//        tags = "@Smoke and @regression",
        tags = "not @Smoke",
        publish = true
)
public class LoginRunner extends AbstractTestNGCucumberTests
{

}
