package com.automation.steps;

import com.automation.pages.DashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DashboardSteps {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("verify user is on Dashboard")
    public void verifyUserIsOnDashboard() {
        Assert.assertTrue(dashboardPage.isDashboardPageDisplayed());
    }

    @When("user click on logout")
    public void userClickOnLogout() {
        dashboardPage.clickOnLogoutBtn();
    }

    @When("user click on admin link")
    public void userClickOnAdminLink() {
        dashboardPage.clickOnAdminLink();
    }

    @When("user click on recruitment link")
    public void userClickOnRecruitmentLink() {
        dashboardPage.clickOnRecruitmentLink();
    }
}
