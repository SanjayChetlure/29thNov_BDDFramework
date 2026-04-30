package LibraryFiles;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass
{

    //This method is use to get Test data from Property file
    //need to provide key Name as a input & return value as output
    //Author Name: @Sanjay
    public static String getPFData(String key) throws IOException
    {
        FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\LibraryFiles\\PropertyFile.properties");

        //Open property file
        Properties ProObj=new Properties();
        ProObj.load(file);

        String value = ProObj.getProperty(key);
        return value;
    }


    public static void selectOptionByText(WebElement ele,String text)
    {
        Select s=new Select(ele);
        s.selectByVisibleText(text);
    }

    public static void selectOptionByValue(WebElement ele,String value)
    {
        Select s=new Select(ele);
        s.selectByValue(value);
    }

    public static void selectOptionByIndex(WebElement ele,int index)
    {
        Select s=new Select(ele);
        s.selectByIndex(index);
    }


    public static void captureSS(WebDriver driver) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest=new File("C:\\Users\\sanja\\IdeaProjects\\29thNov_BDDFramework\\Screenshots");
        FileHandler.copy(src,dest);
    }


    public static void mouseAction_DragAndDrop(WebDriver driver,WebElement src, WebElement dest)
    {
        Actions act=new Actions(driver);
        act.dragAndDrop(src,dest).perform();
    }

    public static void mouseAction_leftClick(WebDriver driver,WebElement leftClickElement)
    {
        Actions act=new Actions(driver);
        act.click(leftClickElement).perform();
    }


    public static void mouseAction_rightClick(WebDriver driver,WebElement rightClickElement)
    {
        Actions act=new Actions(driver);
        act.contextClick(rightClickElement).perform();
    }



}
