package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.List;

//pom/regular class 2
public class SwagLabHomePage
{
    @FindBy(xpath = "//div[@class='app_logo']") private WebElement logoText;  // private WebElement logoText = driver.findElement(By.xpath(""))
    @FindBy(xpath = "//div[@class='inventory_item_name ']") private List<WebElement> allProducts;
    @FindBy(xpath = "(//div[@class='inventory_item_price'])[1]") private WebElement backPackProductPrice;

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


}
