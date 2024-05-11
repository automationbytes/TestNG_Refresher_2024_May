package org.example;

import org.testng.annotations.Test;

public class Groups_Eg {

    @Test(groups = {"Regression"})
    public void xyz(){
        System.out.println("XYZ");
    }


    @Test(groups = {"Regression"})
    public void abc(){
        System.out.println("ABC");
    }

    @Test(groups = {"Sanity"},timeOut = 2000)
    public void qwe() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("QWE");
    }


    @Test(dependsOnGroups = "Sanity")
    public void ijkl(){
        System.out.println("ijkl");
    }

}
