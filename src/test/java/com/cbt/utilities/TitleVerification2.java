package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {

    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com", "https://westelm.com/");

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get(urls.get(0));
        String ExpectedTitle1=driver.getTitle();
        String url1=driver.getCurrentUrl();
        System.out.println(ExpectedTitle1);
        System.out.println(url1);
        if(url1.toLowerCase().contains(ExpectedTitle1.toLowerCase().replaceAll("\\s+",""))){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.get(urls.get(1));
        String ExpectedTitle2=driver.getTitle();
        String url2=driver.getCurrentUrl();
        System.out.println(ExpectedTitle2);
        System.out.println(url2);
        if(url2.toLowerCase().contains(ExpectedTitle2.toLowerCase().replaceAll("\\s+",""))){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }


        driver.get(urls.get(2));
        String ExpectedTitle3=driver.getTitle();
        String url3=driver.getCurrentUrl();
        System.out.println(ExpectedTitle3);
        System.out.println(url3);
        if(url3.toLowerCase().contains(ExpectedTitle3.toLowerCase().replaceAll("\\s+",""))){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }


        driver.get(urls.get(3));
        String ExpectedTitle4=driver.getTitle();
        String url4=driver.getCurrentUrl();
        System.out.println(ExpectedTitle4);
        System.out.println(url4);
        if(url4.toLowerCase().contains(ExpectedTitle4.toLowerCase().replaceAll("\\s+",""))){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.close();
    }
}
