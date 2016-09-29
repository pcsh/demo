package com.dbyl.libarary.pageAction;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.dbyl.libarary.utils.BasePage;
import com.dbyl.libarary.utils.Locator;

public class LoginPage extends BasePage {

    WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public LoginPage(WebDriver driver) throws IOException {
        super(driver);
        driver.get("http://test.onlyou.com:8081/partner/login/login.htm");
    }

    Locator loginEmailInputBox = new Locator("username");

    Locator loginPasswordInputBox = new Locator("password");
    Locator loginButton = new Locator("µÇÂ¼");
    Locator profile = new Locator("profile");

    public void typeEmailInputBox(String username) throws Exception {
    	System.out.println("ÓÃ»§Ãû..........................");
        type(loginEmailInputBox, username);
    }

    public void typePasswordInputBox(String password) throws Exception {
        type(loginPasswordInputBox, password);
    }

    public void clickOnLoginButton() throws Exception {
        click(loginButton);
    }

    public boolean isPrestentProfile() throws IOException {
        return isElementPresent(profile, 20);

    }

    public void waitForPageLoad() {
        super.getDriver().manage().timeouts()
                .pageLoadTimeout(90, TimeUnit.SECONDS);
    }

    
}
