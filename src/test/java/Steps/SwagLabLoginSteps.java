package Steps;

import LibraryFiles.DriverFactory;
import LibraryFiles.UtilityClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class SwagLabLoginSteps
{

    @Given("user is on Swag lab login")
    public void user_is_on_swag_lab_login() throws IOException {
        String urlValue=UtilityClass.getPFData("URL");       //get url from property file
        DriverFactory.driver.get(urlValue);
    }

    @When("user enter username on swaglab login page {string}")
    public void user_enter_username_on_swaglab_login_page(String string) {

    }

    @When("user enter password on swaglab login page {string}")
    public void user_enter_password_on_swaglab_login_page(String string) {

    }

    @When("user click on login btn on swaglab login page")
    public void user_click_on_login_btn_on_swaglab_login_page() {

    }

    @Then("home page visible with logo text {string}")
    public void home_page_visible_with_logo_text(String string) {

    }


}
