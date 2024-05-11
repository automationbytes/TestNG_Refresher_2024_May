package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depends_ON {

    @Test(priority = -1)
    public void Login() throws InterruptedException {
//        Assert.assertEquals(1, 11);

        System.out.println("Login");
    }



    @Test(dependsOnMethods = "Login")
    public void HomePage() throws InterruptedException {

        System.out.println("Homepage");
    }

}
