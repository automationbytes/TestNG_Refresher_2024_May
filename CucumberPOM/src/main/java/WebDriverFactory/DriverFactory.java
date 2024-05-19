package WebDriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory {

    public static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    public WebDriver init_Driver(String Browser){
      //  String browser =
        switch (Browser.toLowerCase()){
            case "chrome":
                threadLocal.set(new ChromeDriver());
                break;
            case "firefox":
                threadLocal.set(new FirefoxDriver());
                break;
            case "edge":
                threadLocal.set(new EdgeDriver());
                break;
            default:
                System.out.println("Supported Browser: Chrome, Edge and Firefox");

        }
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        getDriver().manage().window().maximize();
        return null;
    }


    public static synchronized WebDriver getDriver(){
        return threadLocal.get();
    }
}
