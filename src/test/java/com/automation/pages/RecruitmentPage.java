package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RecruitmentPage extends BasePage{

    @FindBy(xpath = "//h6[text()=\"Recruitment\"]")
    WebElement recruitmentText;

    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
    WebElement addBtn;

    @FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
    WebElement candidateInput;

    @FindBy(xpath = "//div[@role=\"listbox\"]//div/span")
    WebElement selectCandidate;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement searchBtn;

    @FindBy(xpath = "//div[@class=\"oxd-table-cell oxd-padding-cell\"]//div")
    List<WebElement> allUsers;

    public boolean isRecruitmentPageDisplayed() {
        return recruitmentText.isDisplayed();
    }


    public void clickOnAddBtn() {
        addBtn.click();
    }

    public void writeCandidateName() {
        candidateInput.sendKeys("Ashwani");
        selectCandidate.click();
    }

    public void clickOnSearchBtn() {
        searchBtn.click();
    }

    public String isUserDisplayed(String name) {
        for (WebElement user : allUsers){
            if(user.getText().equals(name)){
                return user.getText();
            }
        }
        return "Not found";
    }
}
