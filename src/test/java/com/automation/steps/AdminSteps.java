package com.automation.steps;

import com.automation.pages.AdminPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AdminSteps {

    AdminPage adminPage = new AdminPage();

    @Then("verify user is on admin page")
    public void verifyUserIsOnAdminPage() {
        Assert.assertTrue(adminPage.isAdminPageDisplayed());
    }

    @When("user click on add button")
    public void userClickOnAddButton() {
        adminPage.clickOnAddBtn();
    }

    @When("user user write newly created user name")
    public void userUserWriteNewlyCreatedUserName() {
        adminPage.writeEmployeeName();
    }

    @And("click on search button")
    public void clickOnSearchButton() {
        adminPage.clickOnSearchBtn();
    }

    @Then("verify newly created user displayed in search list")
    public void verifyNewlyCreatedUserDisplayedInSearchList() {
        Assert.assertEquals(ConfigReader.getConfigValue("admin.employee.username"),adminPage.isUserDisplayed(ConfigReader.getConfigValue("admin.employee.username")));
    }

    @When("user click on delete icon of the newly created user")
    public void userClickOnDeleteIconOfTheNewlyCreatedUser() {
        adminPage.clickOnNewlyCreatedUserDeleteBtn(ConfigReader.getConfigValue("admin.employee.username"));
    }

    @And("select yes delete button")
    public void selectYesDeleteButton() {
        adminPage.clickOnYesDeleteBtn();
    }

}
