package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\sanja\\IdeaProjects\\29thNov_BDDFramework\\src\\test\\java\\Features\\LoginToApp.feature",
        glue = "Steps"
)
public class LoginRunner extends AbstractTestNGCucumberTests
{

}
