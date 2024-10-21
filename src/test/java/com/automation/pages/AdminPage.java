package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminPage extends BasePage{

    @FindBy(xpath = "//h5[text()=\"System Users\"]")
    WebElement systemUserText;

    @FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
    WebElement employeeNameInput;

    @FindBy(xpath = "//div[@role=\"listbox\"]//div//span")
    WebElement selectEmployeeName;

    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
    WebElement addBtn;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement searchBtn;

    @FindBy(xpath = "//button[text()=\" Yes, Delete \"]")
    WebElement yesDeleteBtn;

    @FindBy(xpath = "//div[@role=\"cell\"]//div[contains(text(),\"james\")]")
    List<WebElement> allUsers;

    @FindBy(xpath = "//i[@class=\"oxd-icon bi-trash\"]")
    List<WebElement> deleteBtnList;

    public boolean isAdminPageDisplayed() {
        return systemUserText.isDisplayed();
    }

    public void clickOnAddBtn() {
        addBtn.click();
    }

    public void writeEmployeeName() {
        employeeNameInput.sendKeys(ConfigReader.getConfigValue("admin.employee.name"));
        selectEmployeeName.click();
    }

    public void clickOnSearchBtn() {
        searchBtn.click();
    }

    public String isUserDisplayed(String username) {
        for (WebElement user : allUsers){
            if(user.getText().equals(username)){
                return user.getText();
            }
        }
        return "Not found";
    }

    public void clickOnNewlyCreatedUserDeleteBtn(String username) {
        for(int i = 0; i< allUsers.size(); i++){
            if (allUsers.get(i).getText().equals(username)){
                deleteBtnList.get(i).click();
            }
        }
    }

    public void clickOnYesDeleteBtn() {
        yesDeleteBtn.click();
    }
}
