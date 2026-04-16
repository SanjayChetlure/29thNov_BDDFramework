package Steps;

import LibraryFiles.DriverFactory;
import PageClasses.SwagLabHomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SwagLabProductsSteps
{
    SwagLabHomePage home= new SwagLabHomePage(DriverFactory.driver);

    @When("wait for {int} seconds")
    public void wait_for_seconds(Integer timeInSec) throws InterruptedException {
        Thread.sleep(timeInSec*1000);
    }


    @Then("user can see {int} products on home page")
    public void user_can_see_products_on_home_page(Integer expProductCount)
    {
        int actProductCount=home.getProductCount();
        Assert.assertEquals(actProductCount,expProductCount,"Product count mismatch");
    }


    @Then("price of the SauceLabBackPack product should {double}")
    public void price_of_the_sauce_lab_back_pack_product_should(Double expProductPrice)
    {
        double actProductPrice = home.getBackPackProductPrice();
        Assert.assertEquals(actProductPrice,expProductPrice,"act & exp Product price mismatch");
    }


}
