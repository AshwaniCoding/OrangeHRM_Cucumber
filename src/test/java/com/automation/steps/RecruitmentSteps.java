package com.automation.steps;

import com.automation.pages.RecruitmentPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RecruitmentSteps {

    RecruitmentPage recruitmentPage = new RecruitmentPage();

    @Then("verify user is on recruitment page")
    public void verifyUserIsOnRecruitmentPage() {
        Assert.assertTrue(recruitmentPage.isRecruitmentPageDisplayed());
    }

    @When("user click on add button of recruitment page")
    public void userClickOnAddButtonOfRecruitmentPage() {
        recruitmentPage.clickOnAddBtn();
    }

    @When("user write newly created candidate name")
    public void userWriteNewlyCreatedCandidateName() {
        recruitmentPage.writeCandidateName();
    }

    @And("click on search button of recruitment page")
    public void clickOnSearchButtonOfRecruitmentPage() {
        recruitmentPage.clickOnSearchBtn();
    }

    @Then("verify search result displays candidate name")
    public void verifySearchResultDisplaysCandidateName() {
        Assert.assertEquals(ConfigReader.getConfigValue("admin.candidate.name"),recruitmentPage.isUserDisplayed(ConfigReader.getConfigValue("admin.candidate.name")));
    }
}
