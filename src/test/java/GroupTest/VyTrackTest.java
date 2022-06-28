package GroupTest;

import Pages.VytrackPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.security.Key;

public class VyTrackTest{
@Test
public void test() throws InterruptedException {
    //1.Go to home page
    Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    VytrackPage vytrackPage=new VytrackPage();
    //2.Login with right credentials
    vytrackPage.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));


    //3.Hover over Fleet module

    JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
    executor.executeScript("arguments[0].click();", vytrackPage.fleetBtn);

    //4.Select "Vehicles Model "

    JavascriptExecutor executor1 = (JavascriptExecutor)Driver.getDriver();
    executor1.executeScript("arguments[0].click();", vytrackPage.vehicleModelPageBtn);

    //5.Create vehicles models

    JavascriptExecutor executor2 = (JavascriptExecutor)Driver.getDriver();
    executor2.executeScript("arguments[0].click();", vytrackPage.createVehicleModelBtn);


    //6.Model "Toyota"


   vytrackPage.modelField.sendKeys("Toyota");
   vytrackPage.modelField.isDisplayed();
   //7.Make "Corolla"

    vytrackPage.makeField.sendKeys("Corolla");
    vytrackPage.makeField.isDisplayed();

    //8.delete on the field next to "Model"  text
       vytrackPage.modelField.clear();

    //9.delete on the field next to "Make"  text
      vytrackPage.makeField.clear();

     Driver.closeDriver();


}

    }

