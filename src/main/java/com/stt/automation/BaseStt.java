package com.stt.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseStt {
    public WebDriver driver;

    @BeforeSuite
    public void initializeDriver() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterSuite
    public void killDriverSession() {
        driver.quit();
    }

    @BeforeSuite
    public void launchUrl() {
        driver.get("https://www.saucedemo.com/");
    }
}

