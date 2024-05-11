package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProv_Eg {

    @DataProvider(name = "SingleDP")
    public Object[][] SingleMethd(){
        return new Object[][]{{1},{19}};
    }

    @Test(dataProvider = "SingleDP")
    public void displaynum(int num){
        System.out.println("Number provided in DP is "+num);;
    }

    @DataProvider(name = "Multi")
    public Object[][] MultiDP(){
        return new Object[][]{{2, 5},{7,8}};
    }


    @Test(dataProvider = "Multi")
    public void Sum(int num1, int num2){
        int num = num1+num2;
        System.out.println("Sum of provided in DP is "+num);;
    }



}
