package org.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_Eg {


    @Test
    @Parameters({"num1","num2"})
    public void Sum(int num1, int num2) {
        int num = num1 + num2;
        System.out.println("Sum of provided in DP is " + num);
    }
}
