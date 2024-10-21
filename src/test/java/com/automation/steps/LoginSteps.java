package com.automation.steps;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("user open website")
    public void userOpenWebsite() {
        loginPage.openWebsite();
    }

    @Then("verify user is on login page")
    public void verifyUserIsOnLoginPage() {
        Assert.assertTrue(loginPage.isLoginBtnDisplayed());
    }

    @When("user login with username {string} and password {string}")
    public void userLoginWithUsernameAndPassword(String username, String password) {
        loginPage.doLogin(username, password);
    }
}
