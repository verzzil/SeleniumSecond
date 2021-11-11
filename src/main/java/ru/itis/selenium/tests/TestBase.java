package ru.itis.selenium.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.itis.selenium.model.AccountData;
import ru.itis.selenium.model.PersonalData;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class TestBase {

    private WebDriver driver = new ChromeDriver() {
    };
    private StringBuffer verificationErrors;
    JavascriptExecutor js;
    private boolean acceptNextAlert = true;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Games\\chromedriver.exe");
        driver = new ChromeDriver();
        String baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        verificationErrors = new StringBuffer();
        js = (JavascriptExecutor) driver;
    }

    public void editDataFields(PersonalData person) {
        driver.findElement(By.name("speciality")).click();
        driver.findElement(By.name("speciality")).clear();
        driver.findElement(By.name("speciality")).sendKeys(person.getSpecialization());
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/main/div/div/div/div/div/div[3]/div/form/div")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Местоположение'])[1]/following::*[name()='svg'][2]")).click();
        driver.findElement(By.name("locationCountryId")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Местоположение'])[1]/following::*[name()='svg'][2]")).click();
        driver.findElement(By.name("locationRegionId")).click();
        driver.findElement(By.name("locationCityId")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public void login(AccountData user) {
        driver.findElement(By.id("email_field")).click();
        driver.findElement(By.id("email_field")).clear();
        driver.findElement(By.id("email_field")).sendKeys(user.getEmail());
        driver.findElement(By.id("password_field")).clear();
        driver.findElement(By.id("password_field")).sendKeys(user.getPassword());
        driver.findElement(By.name("go")).click();
    }

    public void openGroupPage() {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Научпоп'])[1]/following::*[name()='svg'][2]")).click();
        driver.findElement(By.linkText("Войти")).click();
    }

    public void openHomePage() {
        driver.get("https://habr.com/ru/all/");
    }

    public void goToAccount() {
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div/img")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div[5]/a/span")).click();
    }

    @After
    public void tearDown() throws Exception {
        driver.close();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }


}
