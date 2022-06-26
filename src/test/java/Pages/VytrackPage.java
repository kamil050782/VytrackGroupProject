package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VytrackPage {
    public VytrackPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
     @FindBy(css = "input[id='prependedInput']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@id='prependedInput2']")
    public WebElement inputPassword;

    @FindBy(css = "button[id='_submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1']/a/span/i[@class='fa-asterisk menu-icon']")
    public WebElement fleetBtn;

    @FindBy(xpath = "//span[.='Vehicles Model']")
    public WebElement vehicleModelPageBtn;

    @FindBy(linkText = "Create Vehicles Model")
    public WebElement createVehicleModelBtn;

    @FindBy(css = "input[name='custom_entity_type[ModelName]']")
    public WebElement modelField;

    @FindBy(xpath = "//input[@name='custom_entity_type[Make]']")
    public WebElement makeField;

    public void login(String vytrackUsername,String vytrackPassword){

        inputUsername.sendKeys(vytrackUsername);
        inputPassword.sendKeys(vytrackPassword);
        loginBtn.click();
    }
}
