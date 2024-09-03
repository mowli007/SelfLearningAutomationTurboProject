package com.stt.utilities;

import com.stt.automation.BaseStt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumActions {
    WebDriver driver;

    public SeleniumActions(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnWebElement(By by) {
        driver.findElement(by).click();
    }

    public void clickOnWebElement(WebElement element){
        element.click();
    }

    public  void sendKeysData(By by, String data){
        driver.findElement(by).sendKeys(data);
    }
    public void sendKeysData(WebElement element, String data){
        element.sendKeys(data);
    }
    public int getElementSize(By by){
        return driver.findElements(by).size();
    }

    public int getElementSize(List<WebElement> elements){
        return  elements.size();
    }
}
