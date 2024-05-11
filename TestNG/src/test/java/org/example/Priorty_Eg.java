package org.example;

import org.testng.annotations.Test;

public class Priorty_Eg {

    @Test(priority = -1)
    public void xyz(){
        System.out.println("XYZ");
    }


    @Test(priority = 100)
    public void abc(){
        System.out.println("ABC");
    }

    @Test(timeOut = 2000)
    public void qwe() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("QWE");
    }


    @Test
    public void ijkl(){
        System.out.println("ijkl");
    }


}
