package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Selenium_2 {

    WebDriver driver;
    @BeforeClass
    public void initBrowser() {
        System.out.println("Before Class");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test(enabled = false)
    public void LaunchGoogle(){
        driver.get("https://www.google.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().equals("Google"));
    }


    @Test
    public void LaunchBing(){
        driver.get("https://www.bing.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(),"Bing");
    }

    @AfterClass
    public void closeBrowser(){

        System.out.println("After Class");
        driver.close();
    }

}
