package com.automation.pages;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement loginBtn;

    @FindBy(xpath = "//input[@name=\"username\"]")
    WebElement usernameInput;

    @FindBy(xpath = "//input[@name=\"password\"]")
    WebElement passwordInput;

    public void openWebsite() {
        DriverManager.getDriver().get(ConfigReader.getConfigValue("application.url"));
    }

    public boolean isLoginBtnDisplayed() {
        return loginBtn.isDisplayed();
    }

    public void doLogin(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }
}
