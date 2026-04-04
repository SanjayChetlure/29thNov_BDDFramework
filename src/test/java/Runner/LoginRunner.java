package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\sanja\\IdeaProjects\\29thNov_BDDFramework\\src\\test\\java\\Features\\Ex3_PassInputsOrTestData_FromFeature_to_SDClass.feature",
        glue = "Steps"
)
public class LoginRunner extends AbstractTestNGCucumberTests
{

}
