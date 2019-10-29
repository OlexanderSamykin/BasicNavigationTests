package com.cbt.utilities;

public class StringUtility {
//    String expected="";
//    String actual="";

    public static void verifyEquals(String expected,String actual) {
//        //String expected;
//        //String actual;

        if (expected.equals(actual)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
