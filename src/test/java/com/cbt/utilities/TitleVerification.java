package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

import static com.cbt.utilities.StringUtility.verifyEquals;


public class TitleVerification {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown", "http://practice.cybertekschool.com/login");

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get(urls.get(0));
        String ExpectedTitle1=driver.getTitle();
        String url1=driver.getCurrentUrl();
        driver.get(urls.get(1));
        String ExpectedTitle2=driver.getTitle();
        String url2=driver.getCurrentUrl();
        driver.get(urls.get(2));
        String ExpectedTitle3=driver.getTitle();
        String url3=driver.getCurrentUrl();
        verifyEquals(ExpectedTitle1,ExpectedTitle2);
        verifyEquals(ExpectedTitle2,ExpectedTitle3);

        if(url1.startsWith("http://practice.cybertekschool.com")&&url2.startsWith("http://practice.cybertekschool.com")&&url3.startsWith("http://practice.cybertekschool.com")){
           System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.close();
    }
}
