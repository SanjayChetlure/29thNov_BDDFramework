package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom/regular class 2
public class SwagLabHomePage
{
    @FindBy(xpath = "//div[@class='app_logo']") private WebElement logoText;  // private WebElement logoText = driver.findElement(By.xpath(""))

    public SwagLabHomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }


    public String getLogoText()
    {
        String actLogoText = logoText.getText();
        return actLogoText;
    }

}
