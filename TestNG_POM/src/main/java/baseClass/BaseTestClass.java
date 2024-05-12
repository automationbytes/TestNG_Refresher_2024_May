package baseClass;

import org.openqa.selenium.WebDriver;

import Util.ConfigReader;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTestClass {
    public static WebDriver driver;
    public static ConfigReader configReader;

//    public BaseTestClass(){
//
//    }

    public void initBrowser(){
        configReader = new ConfigReader();
        String browserName = configReader.getConfigProperty("browser");
        String url = configReader.getConfigProperty("url");
        String timeouts = configReader.getConfigProperty("timeouts");

        if (browserName.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }else {
            System.out.println("Unsupported Browser");
            return; //exit
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(timeouts)));
        driver.get(url);
    }


}
