package com.myComp.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class RelativeLocators {

    @Test
    public void relative_locators_test() {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement googleSearchBox = driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]"));
        System.out.println(googleSearchBox.getAccessibleName());

        WebElement storeLink1 = driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]"));

        System.out.println("storeLink.getText() = " + storeLink1.getAccessibleName());

        WebElement storeLink2 = driver.findElement(RelativeLocator.with(By.xpath("(//input[@class='RNmpXc'])[2]")).toRightOf(googleSearchBox));
        System.out.println("storeLink.getText() = " + storeLink2.getAccessibleName());


    }

}
