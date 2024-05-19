package Steps;

import Pages.HomePage;
import Pages.LoginPage;
import Utils.ConfigReader;
import WebDriverFactory.DriverFactory;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class DemoSteps {

    private ConfigReader configReader = new ConfigReader();
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private HomePage homePage = new HomePage(DriverFactory.getDriver());


    @Given("the user launches the NOPADMIN url")
    public void the_user_launches_the_nopadmin_url() {
        DriverFactory.getDriver().get(configReader.getConfigProp("url"));

    }
    @Then("the user verifies the header text")
    public void the_user_verifies_the_header_text() {
        Assert.assertTrue(loginPage.isHeaderDisplayed());
    }
    @When("the user enters {string} in email webEdit")
    public void the_user_enters_in_email_web_edit(String user) {
        loginPage.enterUsername(user);
    }
    @When("the user enters {string} in password webEdit")
    public void the_user_enters_in_password_web_edit(String pass) {
        loginPage.enterPassword(pass);
    }
    @When("the user clicks on login button")
    public void the_user_clicks_on_login_button() {
        loginPage.clickLogin();
    }
    @Then("the user verifies the homePage Logo")
    public void the_user_verifies_the_home_page_logo() {
        Assert.assertTrue(homePage.isHomePageLogoDisplayed());
    }
    @Then("the user logouts the application")
    public void the_user_logouts_the_application() {
        homePage.clickLogout();
    }

}
