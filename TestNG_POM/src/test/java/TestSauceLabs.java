import PageObjects.HomePage;
import PageObjects.LoginPage;
import baseClass.BaseTestClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Util.ConfigReader;
public class TestSauceLabs extends BaseTestClass {
    public LoginPage loginPage;
    public HomePage homePage;
    public ConfigReader configReader;

    @BeforeClass
    public void initializeBrwser(){
        initBrowser();
    }

    @Test(priority = 0)
    public void loginTest(){
        loginPage = new LoginPage(driver);

        configReader = new ConfigReader();
        loginPage.enterUsername(configReader.getConfigProperty("username"));
        loginPage.enterPassword(configReader.getConfigProperty("password"));
        loginPage.click_Login();

    }
    @Test(priority = 1)
    public void homePageTest(){
        homePage = new HomePage(driver);
        homePage.Select_Filter("Price (low to high)");


    }
}
