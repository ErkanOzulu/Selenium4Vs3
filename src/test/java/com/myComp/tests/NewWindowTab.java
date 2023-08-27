package com.myComp.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewWindowTab {
    @Test
    public void new_window_tab_Name() {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.get("https://etsy.com");

        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("https://tesla.com");

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://amazon.com");


    }
}
