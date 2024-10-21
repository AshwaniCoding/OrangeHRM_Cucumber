package com.automation.steps;

import com.automation.pages.AddUserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AddUserSteps {

    AddUserPage addUserPage = new AddUserPage();

    @Then("verify user is on add user page")
    public void verifyUserIsOnAddUserPage() {
        Assert.assertTrue(addUserPage.isAddUserPageDisplayed());
    }

    @Then("user select user role as ess")
    public void userSelectUserRoleAsEss() {
        addUserPage.selectRoleEss();
    }

    @And("user click on save button")
    public void userClickOnSaveButton() {
        addUserPage.clickOnSaveBtn();
    }

    @And("user select the status as enabled")
    public void userSelectTheStatusAsEnabled() {
        addUserPage.selectStatusEnabled();
    }

    @And("user write employee name")
    public void userWriteEmployeeName() {
        addUserPage.writeEmployeeName();
    }

    @And("user use generated random username")
    public void userUseGeneratedRandomUsername() {
        addUserPage.generateRandomUsername();
    }

    @And("user use generated random password")
    public void userUseGeneratedRandomPassword() {
        addUserPage.generateRandomPassword();
    }

    @Then("verify success message {string} is displayed")
    public void verifySuccessMessageIsDisplayed(String message) {
        Assert.assertEquals(message, addUserPage.getMessage());
    }
}
