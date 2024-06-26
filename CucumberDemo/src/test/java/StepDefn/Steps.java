package StepDefn;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Steps {

    WebDriver driver;

    @Before()
    public void initBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }


    @After(order = 0)
    public void tearDown(){
        driver.close();
        driver.quit();
    }

//
//    @After(order = 1)
//    public void takeScreenshot(Scenario scenario){
//        if(scenario.isFailed()){
//            byte[] source =     ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(source,"image/png",scenario.getName());
//        }
//
//    }




    @AfterStep(order = 1)
    public void takeScreenshot(Scenario scenario){
   //     if(scenario.isFailed()){
            byte[] source =     ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(source,"image/png",scenario.getName());
     //   }

    }




    @Given("the user launches the application")
    public void the_user_launches_the_application() {

        driver.get("https://www.facebook.com/");

    }
    @Then("the user verifies the facebook logo")
    public void the_user_verifies_the_facebook_logo() {
        Assert.assertTrue(driver.findElement(By.xpath("//img[@alt=\"Facebook\"]")).isDisplayed());
    }
    @When("the user enters the username in username webedit")
    public void the_user_enters_the_username_in_username_webedit() {
        driver.findElement(By.id("email")).sendKeys("John");
    }
    @When("the user enters the password in password webedit")
    public void the_user_enters_the_password_in_password_webedit() {
        driver.findElement(By.name("pass")).sendKeys("Helo");
    }
    @When("the user clicks on login button")
    public void the_user_clicks_on_login_button() {
        driver.findElement(By.name("login")).click();
    }



    @When("the user enters the {string} in username webedit")
    public void the_user_enters_the_in_username_webedit(String user) {
        driver.findElement(By.id("email")).sendKeys(user);

    }
    @When("the user enters the {string} in password webedit")
    public void the_user_enters_the_in_password_webedit(String pass) {
        driver.findElement(By.name("as")).sendKeys(pass);
    }



}
