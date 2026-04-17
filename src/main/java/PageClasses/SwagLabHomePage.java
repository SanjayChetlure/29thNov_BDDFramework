package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

//pom/regular class 2
public class SwagLabHomePage
{
    @FindBy(xpath = "//div[@class='app_logo']") private WebElement logoText;  // private WebElement logoText = driver.findElement(By.xpath(""))
    @FindBy(xpath = "//div[@class='inventory_item_name ']") private List<WebElement> allProducts;
    @FindBy(xpath = "(//div[@class='inventory_item_price'])[1]") private WebElement backPackProductPrice;
    @FindBy(xpath = "//div[@class='inventory_item_price']") private List<WebElement> allProductsPrices;
    @FindBy(xpath = "//div[@class='app_logo']") private WebElement backPackAddToCartBtn;
    @FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement cartLink;

    public SwagLabHomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public String getLogoText()
    {
        String actLogoText = logoText.getText();
        return actLogoText;
    }

    public int getProductCount()
    {
        int allProductSize = allProducts.size();
        return allProductSize;
    }

    public double getBackPackProductPrice()
    {
        String price = backPackProductPrice.getText();    //$29.99   ->  String
        price=price.substring(1);       //29.99       -> String
        double priceInDouble = Double.parseDouble(price);       //convert String -> double
        return priceInDouble;
    }


    public double getAllProductsTotalPrice()
    {
        double totalProductPrice=0;

        for(WebElement singleProductPrice: allProductsPrices)
        {
            String price = singleProductPrice.getText();      //$29.9    -> String
            price=price.substring(1);              //29.9      removed $ Symbol ->String
            double priceInDouble = Double.parseDouble(price);   //29.9  -> Double

            totalProductPrice = totalProductPrice + priceInDouble;
        }
        return totalProductPrice;
    }

    public void clickOnBackPAckProductAddToCartBtn()
    {
        backPackAddToCartBtn.click();
    }

    public void clickOnCartLink()
    {
        cartLink.click();
    }





}
