package PageObjects;

import baseClass.BaseTestClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    @FindBy(css = "select[data-test=\"product-sort-container\"]")
    WebElement product_sort_Dropdown;

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logOut;


    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        BaseTestClass.driver = driver;
    }

    public void Select_Filter(String value){
        Select dropdown = new Select(product_sort_Dropdown);
        dropdown.selectByVisibleText(value);
    }


    public void logout(){
        //JavascriptExecutor js = (JavascriptExecutor) driver;
      //  js.executeScript("")
    }
}
