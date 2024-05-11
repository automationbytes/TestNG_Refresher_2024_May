package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Eg {


    @Test
    public void qwe() throws InterruptedException {
        Assert.assertTrue(1 == 11);

        System.out.println("QWE");

    }


    @Test
    public void qwer() throws InterruptedException {
        Assert.assertEquals(1, 11);

        System.out.println("QWER");

    }

}
