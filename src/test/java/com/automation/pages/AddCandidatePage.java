package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCandidatePage extends BasePage{

    @FindBy(xpath = "//input[@name=\"firstName\"]")
    WebElement firstNameInput;

    @FindBy(xpath = "//input[@name=\"middleName\"]")
    WebElement middleNameInput;

    @FindBy(xpath = "//input[@name=\"lastName\"]")
    WebElement lastNameInput;

    @FindBy(xpath = "//div[@class=\"oxd-select-text-input\"]")
    WebElement vacancyDropdown;

    @FindBy(xpath = "//div[@role=\"listbox\"]//span[text()=\"Software Engineer\"]")
    WebElement vacancySoftwareEngineerOption;

    @FindBy(xpath = "//label[text()=\"Email\"]//..//following-sibling::div/input")
    WebElement emailInput;

    @FindBy(xpath = "//label[text()=\"Contact Number\"]//..//following-sibling::div/input")
    WebElement contactNumberInput;

    @FindBy(xpath = "//label[text()=\"Resume\"]//..//following-sibling::div/input")
    WebElement resumeInput;

    @FindBy(xpath = "//label[text()=\"Keywords\"]//..//following-sibling::div/input")
    WebElement keywordsInput;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement saveBtn;


    public void fillDetails() {
        firstNameInput.sendKeys("Ashwani");
        middleNameInput.sendKeys("Kumar");
        lastNameInput.sendKeys("Dwivedi");
        vacancyDropdown.click();
        vacancySoftwareEngineerOption.click();
        emailInput.sendKeys("ashwanidwivedi7898@gmail.com");
        contactNumberInput.sendKeys("9039477540");
        keywordsInput.sendKeys("Java, Python, MySQL");
    }

    public void uploadResume() {
        resumeInput.sendKeys(System.getProperty("user.dir")+ "\\src\\test\\resources\\files\\Ashwani_Kumar_Dwivedi.pdf");
    }

    public void clickOnSaveBtn() {
        saveBtn.click();
    }

}
