package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

import static com.cbt.utilities.StringUtility.verifyEquals;

public class NavigationTests {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://google.com");
        String ExpectedTitle=driver.getTitle();
        driver.get("http://etsy.com");
        String ExpectedTitle1=driver.getTitle();
        driver.navigate().back();
        String ActualTitle=driver.getTitle();
        verifyEquals(ExpectedTitle,ActualTitle);
        driver.navigate().forward();
        String ActualTitle1=driver.getTitle();
        verifyEquals(ExpectedTitle1,ActualTitle1);

        driver.close();


    }

}
