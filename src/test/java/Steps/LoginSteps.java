package Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps
{
    @Given("open browser")
    public void open_browser()
    {
        System.out.println("open browser");
    }

    @When("user enter username")
    public void user_enter_username()
    {
        System.out.println("UN Entered");
    }

    @When("user enter password")
    public void user_enter_password()
    {
        System.out.println("PWD Entered");
    }

    @When("user click on login button")
    public void user_click_on_login_button()
    {
        System.out.println("Clicked on login button");
    }

    @Then("home page should be visible")
    public void home_page_should_be_visible()
    {
        System.out.println("Home page visible");
    }

}
