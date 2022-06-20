package GroupTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Group_13_VyTrackProject {
    @Test
    public void vyTrackTest(){
        //1.Go to home page
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        //2.Login with right credentials
        WebElement inputUserName=Driver.getDriver().findElement(By.cssSelector("input[id='prependedInput']"));
        inputUserName.sendKeys(ConfigurationReader.getProperty("username"));

        WebElement inputPassword=Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));

        WebElement loginBtn=Driver.getDriver().findElement(By.cssSelector("button[id='_submit']"));
        loginBtn.click();

        //3.Hover over Fleet module

        WebElement fleetBtn=Driver.getDriver().findElement(By.xpath("//li[@class='dropdown dropdown-level-1']/a/span/i[@class='fa-asterisk menu-icon']"));
        JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
        executor.executeScript("arguments[0].click();", fleetBtn);
//4.Select "Vehicles Model "
        WebElement vehicleModelPage=Driver.getDriver().findElement(By.xpath("//span[.='Vehicles Model']"));
        JavascriptExecutor executor1 = (JavascriptExecutor)Driver.getDriver();
        executor1.executeScript("arguments[0].click();", vehicleModelPage);


        //5.Create vehicles models
        WebElement createVehicle=Driver.getDriver().findElement(By.linkText("Create Vehicles Model"));
        JavascriptExecutor executor2 = (JavascriptExecutor)Driver.getDriver();
        executor2.executeScript("arguments[0].click();", createVehicle);

        //6.Model "Toyota"

        WebElement toyota=Driver.getDriver().findElement(By.cssSelector("input[name='custom_entity_type[ModelName]']"));
        toyota.sendKeys("Toyota");
        toyota.isDisplayed();

        //7.Make "Corolla"
        WebElement corolla=Driver.getDriver().findElement(By.xpath("//input[@name='custom_entity_type[Make]']"));
        corolla.sendKeys("Corolla");
        corolla.isDisplayed();

        //8.delete on the field next to "Model"  text
        toyota.clear();

    }
}
