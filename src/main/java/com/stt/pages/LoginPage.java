package com.stt.pages;

import com.stt.utilities.SeleniumActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    SeleniumActions seleniumActions;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        seleniumActions = new SeleniumActions(driver);
    }

    private By userNameInputData = By.id("user-name");
    private By passwordNameInputData = By.id("password");
    private By submitButtonElement = By.cssSelector(".submit-button.btn_action");

    @FindBy(id="user-name")    private WebElement username;
    @FindBy(id="password")    private WebElement password;
    @FindBy(css=".submit-button.btn_action")    private WebElement submitButton;

    public void loginToApplication(String uName, String pwd) {
        driver.findElement(userNameInputData).sendKeys("uName");
        driver.findElement(passwordNameInputData).sendKeys("pwd");
        driver.findElement(submitButtonElement).click();

    }

    public void loginToApplicationwithPageFactory(String un, String pwd) {
        seleniumActions.sendKeysData(username,un);
        seleniumActions.sendKeysData(password,pwd);
        seleniumActions.clickOnWebElement(submitButton);
//        username.sendKeys(un);
//        password.sendKeys(pwd);
//        submitButton.click();

    }
}
