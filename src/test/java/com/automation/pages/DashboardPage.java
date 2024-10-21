package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(xpath = "//span[@class=\"oxd-userdropdown-tab\"]")
    WebElement userDropdown;

    @FindBy(xpath = "//a[text()=\"Logout\"]")
    WebElement logoutBtn;

    @FindBy(xpath = "//span[text()=\"Admin\"]")
    WebElement adminLink;

    @FindBy(xpath = "//span[text()=\"Recruitment\"]")
    WebElement recruitmentLink;

    public boolean isDashboardPageDisplayed() {
        return userDropdown.isDisplayed();
    }

    public void clickOnLogoutBtn() {
        userDropdown.click();
        logoutBtn.click();
    }

    public void clickOnAdminLink() {
        adminLink.click();
    }

    public void clickOnRecruitmentLink() {
        recruitmentLink.click();
    }
}
