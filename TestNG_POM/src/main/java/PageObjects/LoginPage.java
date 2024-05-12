package PageObjects;

import baseClass.BaseTestClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTestClass {

    @FindBy(xpath = "//input[@id='user-name']")
    WebElement username_webEdit;

    By username_editbox = By.xpath("//input[@id='user-name']");
    By password_editbox = By.xpath("//input[@id='password']");
    By login_button = By.xpath("//input[@name=\"login-button\"]");


    public LoginPage(WebDriver driver){
        //findBy
        PageFactory.initElements(driver,this);
        //by
        BaseTestClass.driver = driver;

    }


    //findBy
    public void enterUsername(String user){
        username_webEdit.sendKeys(user);
    }

    //by
    public void enterPassword(String password){
        driver.findElement(password_editbox).sendKeys(password);
    }


    public void click_Login(){
        driver.findElement(login_button).click();
    }

}
