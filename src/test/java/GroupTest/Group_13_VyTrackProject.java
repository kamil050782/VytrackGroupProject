package GroupTest;

import org.openqa.selenium.By;
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
    }
}
