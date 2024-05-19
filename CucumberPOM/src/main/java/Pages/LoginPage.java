package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "Email")
    WebElement Email_WebEdit;

    @FindBy(id = "Password")
    WebElement Password_WebEdit;

    @FindBy(xpath = "//button[text()='Log in']")
    WebElement Login_Button;


    @FindBy(xpath = "//h1")
    WebElement Header_WebElement;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void enterUsername(String username){
        Email_WebEdit.clear();
        Email_WebEdit.sendKeys(username);
    }

    public void enterPassword(String password){
        Password_WebEdit.clear();
        Password_WebEdit.sendKeys(password);
    }

    public void clickLogin(){
        Login_Button.click();
    }

    public boolean isHeaderDisplayed(){
        return Header_WebElement.isDisplayed();
    }
















}
