package com.automation.steps;

import com.automation.pages.AddCandidatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddCandidateSteps {

    AddCandidatePage addCandidatePage = new AddCandidatePage();

    @Then("user fill the details of candidate")
    public void userFillTheDetailsOfCandidate() {
        addCandidatePage.fillDetails();
    }

    @And("user upload the resume")
    public void userUploadTheResume() {
        addCandidatePage.uploadResume();
    }

    @And("click on save button")
    public void clickOnSaveButton() {
        addCandidatePage.clickOnSaveBtn();
    }

}
