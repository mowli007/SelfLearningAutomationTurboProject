package com.framework;

import com.stt.automation.BaseStt;
import com.stt.pages.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests extends BaseStt {
    LoginPage loginPage;

    @BeforeClass
    public void initializePage() {
        loginPage = new LoginPage(driver);
    }

    @Test
    public void validateLoginWithValidCred() {
        loginPage.loginToApplicationwithPageFactory("standard_user", "secret_sauce");
    }
}
