package ru.itis.selenium.helpers;

import org.openqa.selenium.By;
import ru.itis.selenium.ApplicationManager;

public class NavigationHelper extends HelperBase {

    private String baseUrl;

    public NavigationHelper(ApplicationManager manager, String baseUrl) {
        super(manager);
        this.baseUrl = baseUrl;

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

}
