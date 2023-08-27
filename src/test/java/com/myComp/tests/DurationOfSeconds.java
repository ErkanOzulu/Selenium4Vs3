package com.myComp.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class DurationOfSeconds {
    @Test
    public void duration_of_seconds_test(){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://google.com");

        //selenium 4 implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // selenium 4 explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        // selenium 3 implicit wait
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // selenium 3 explicit wait
        // WebDriverWait wait = new WebDriverWait(driver,10);


    }
}
