package org.example;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class FirstTest {

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite");
    }


    @AfterSuite
    public void AfterSuite(){
        System.out.println("After AfterSuite");
    }


    @BeforeTest
    public void BeforeTest(){
        System.out.println(" BeforeTest");
    }


    @AfterTest
    public void AfterTest(){
        System.out.println(" AfterTest");
    }





    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }


    @AfterClass
    public void AfterClass(){
        System.out.println("After Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }


    @AfterMethod
    public void AfterMethod(){
        System.out.println("After Method");
    }

    @Test
    public void xyz(){
        System.out.println("XYZ");
    }


    @Test
    public void abc(){
        System.out.println("ABC");
    }




}
