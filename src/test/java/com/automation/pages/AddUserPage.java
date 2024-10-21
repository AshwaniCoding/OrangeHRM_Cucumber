package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage extends BasePage{

    @FindBy(xpath = "//h6[text()=\"Add User\"]")
    WebElement addUserLabel;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement saveBtn;

    @FindBy(xpath = "//label[text()=\"User Role\"]/..//following-sibling::div")
    WebElement userRoleDropdown;

    @FindBy(xpath = "//span[text()=\"ESS\"]")
    WebElement essOption;

    @FindBy(xpath = "//label[text()=\"Status\"]/..//following-sibling::div")
    WebElement statusDropdown;

    @FindBy(xpath = "//span[text()=\"Enabled\"]")
    WebElement selectEnabledStatus;

    @FindBy(xpath = "//input[@placeholder=\"Type for hints...\"]")
    WebElement employeeNameInput;

    @FindBy(xpath = "//label[text()=\"Username\"]/..//following-sibling::div/input")
    WebElement usernameInput;

    @FindBy(xpath = "//label[text()=\"Password\"]/..//following-sibling::div/input")
    WebElement passwordInput;

    @FindBy(xpath = "//label[text()=\"Confirm Password\"]/..//following-sibling::div/input")
    WebElement confirmPasswordInput;

    @FindBy(xpath = "//div[@role=\"listbox\"]/div/span")
    WebElement selectEmployeeName;

    @FindBy(xpath = "//div[@id=\"oxd-toaster_1\"]//p[@class=\"oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text\"]")
    WebElement successMessageElement;

    public boolean isAddUserPageDisplayed() {
        return addUserLabel.isDisplayed();
    }

    public void clickOnSaveBtn() {
        saveBtn.click();
    }

    public void selectRoleEss() {
        userRoleDropdown.click();
        essOption.click();
    }

    public void writeEmployeeName() {
        employeeNameInput.sendKeys(ConfigReader.getConfigValue("admin.employee.name"));
        selectEmployeeName.click();
    }

    public void selectStatusEnabled() {
        statusDropdown.click();
        selectEnabledStatus.click();
    }

    public void generateRandomUsername() {
        usernameInput.sendKeys(ConfigReader.getConfigValue("admin.employee.username"));
    }

    public void generateRandomPassword() {
        passwordInput.sendKeys(ConfigReader.getConfigValue("admin.employee.password"));
        confirmPasswordInput.sendKeys(ConfigReader.getConfigValue("admin.employee.password"));
    }

    public String getMessage() {
        return successMessageElement.getText();
    }
}
