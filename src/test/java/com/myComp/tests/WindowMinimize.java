package com.myComp.tests;
import com.myComp.utilities.BrowserUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowMinimize {


    @Test
    public void window_minimize() {

        //We have to set up WebDriverManager with Selenium 3 version
        //WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        BrowserUtils.sleep(3);

        driver.manage().window().maximize();

        BrowserUtils.sleep(3);

        driver.manage().window().minimize();


    }
}
