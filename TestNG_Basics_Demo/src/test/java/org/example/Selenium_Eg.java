package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium_Eg {

    WebDriver driver;
    @BeforeMethod
    public void initBrowser() {
        System.out.println("Before Method");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
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

        @AfterMethod
    public void closeBrowser(){

            System.out.println("After Method");
        driver.close();
        }

}
