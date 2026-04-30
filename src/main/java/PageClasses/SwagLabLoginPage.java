package PageClasses;

import LibraryFiles.UtilityClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//pom/regular class 1
public class SwagLabLoginPage
{
    //Step1: variable declaration
    @FindBy(xpath = "//input[@name='user-name']") private WebElement UN ;     //private WebElement UN=driver.findElement(By.xpath(""))
    @FindBy(xpath = "//input[@name='password']") private WebElement PWD;       //private WebElement PWD=driver.findElement(By.xpath(""))
    @FindBy(xpath = "//input[@name='login-button']") private WebElement loginBtn; //private WebElement loginBtn=driver.findElement(By.xpath(""))
    @FindBy(xpath = "//h3[@data-test='error']") private WebElement errorMsg;
    @FindBy(xpath = "//select[@id='1234']") private WebElement country;
    @FindBy(xpath = "//select[@id='1234']") private WebElement year;
    @FindBy(xpath = "//select[@id='1234']") private WebElement srcElement;
    @FindBy(xpath = "//select[@id='1234']") private WebElement destElement;
    public WebDriver driver;            //global variable

    //Step2: initialization
    public SwagLabLoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);          //className.methodName(webDriverObject, thisKeyword)
        this.driver=driver;      //global=local  -> assign local variable info into global variable
    }

    //Step3: perform action
    public void enterUN(String username)
    {
        UN.sendKeys(username);
    }

    public void enterPWD(String password)
    {
        PWD.sendKeys(password);
    }

    public void clickOnLoginBtn()
    {
        loginBtn.click();
    }

    public String getErrorMsg()
    {
        String errorMsgText = errorMsg.getText();
        return errorMsgText;
    }


    public boolean getLoginButtonEnabled()
    {
        boolean result = loginBtn.isEnabled();
        return result;
    }


    public void selectCountry(String countryName)
    {
        UtilityClass.selectOptionByText(country,countryName);
    }

    public void selectYear(String yearValue)
    {
        UtilityClass.selectOptionByText(year,yearValue);
    }


    public void dragAndDropElements()
    {
        UtilityClass.mouseAction_DragAndDrop(driver,srcElement,destElement);
    }

}
