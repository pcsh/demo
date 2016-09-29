package com.dbyl.libarary.action;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.dbyl.libarary.pageAction.HomePage;
import com.dbyl.libarary.pageAction.LoginPage;

public class CommonLogin {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    static LoginPage loginPage;

    public static HomePage login(String username, String password)
            throws Exception {
        loginPage = new LoginPage(getDriver());
        loginPage.waitForPageLoad();
        System.out.println("开始输入..........................");
        loginPage.typeEmailInputBox(username);
        loginPage.typePasswordInputBox(password);
        loginPage.clickOnLoginButton();
        Assert.assertTrue(loginPage.isPrestentProfile(), "login failed");
        return new HomePage(getDriver());
    }

    public static HomePage login() throws Exception {
    	System.out.println("登录信息输入..........................");
        return CommonLogin.login("pancs_qdz", "111111");
    }
    
    public static void setDriver(WebDriver driver) {
        CommonLogin.driver = driver;
    }

}