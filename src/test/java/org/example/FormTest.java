package org.example;
import org.example.enums.FormInputs;
import org.example.pom.FormPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FormTest {
    public static WebDriver driver;
    @BeforeClass
    public static void BeforeClass() {
        System.setProperty("webdriver.chrome.driver", "D:\\programs\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }
    @Test
    public void FormTest() {
        driver.get("https://demoqa.com/automation-practice-form");
        FormPage page = new FormPage(driver);

        page.setFirstNameElement(FormInputs.FIRST_NAME.getValue());
        page.setLastNameElement(FormInputs.LAST_NAME.getValue());
        page.setUserEmailElement(FormInputs.USER_EMAIL.getValue());
        page.selectMaleGender();
        page.setPhoneNumberElement(FormInputs.PHONE_NUMBER.getValue());
        page.setSubjectElement(FormInputs.SUBJECT.getValue());
    }
    @AfterClass
    public static void close() {
        driver.quit();
    }
}
