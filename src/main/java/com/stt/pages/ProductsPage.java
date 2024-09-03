package com.stt.pages;

import com.stt.utilities.SeleniumActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    WebDriver driver;
    SeleniumActions seleniumActions;

    public ProductsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        seleniumActions = new SeleniumActions(driver);
    }


}
