package org.example.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {
    @FindBy(id = "firstName")
    private WebElement firstNameElement;

    @FindBy(id = "lastName")
    private WebElement lastNameElement;

    @FindBy(id = "userEmail")
    private WebElement userEmailElement;

    @FindBy(xpath = "//label[@for='gender-radio-2']")
    private WebElement femaleGenderElement;

    @FindBy(id = "userNumber")
    private WebElement phoneNumberElement;

    @FindBy(id = "subjectsInput")
    private WebElement subjectElement;
    public static WebDriver driver;

    public FormPage(WebDriver driver) {
        FormPage.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setFirstNameElement(String firstName) {
        firstNameElement.sendKeys(firstName);
    }

    public void setLastNameElement(String lastName) {
        lastNameElement.sendKeys(lastName);
    }

    public void setUserEmailElement(String userEmail) {
        userEmailElement.sendKeys(userEmail);
    }

    public void selectMaleGender() {
        femaleGenderElement.click();
    }

    public void setPhoneNumberElement(String phoneNumber) {
        phoneNumberElement.sendKeys(phoneNumber);
    }

    public void setSubjectElement(String subject) {
        subjectElement.sendKeys(subject);
    }
}
