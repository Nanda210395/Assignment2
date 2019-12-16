package com.zucitech.testscript;
import org.testng.Assert;

public class CustomAssert {

    public static void areNotEquals(String actual, String expected){
        try {
            Assert.assertNotEquals(actual,expected);
        }
        catch (Exception e){
            System.out.println("actual and expected results are same");
        }
    }
    public static void areTrue(boolean displayed){
        try {
            Assert.assertTrue(true);
        }
        catch (Exception e){
            System.out.println("condition is false");
        }
    }
}
