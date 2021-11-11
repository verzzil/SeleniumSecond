package ru.itis.selenium.helpers;

import org.openqa.selenium.By;
import ru.itis.selenium.ApplicationManager;
import ru.itis.selenium.model.AccountData;

public class LoginHelper extends HelperBase{

    public LoginHelper(ApplicationManager manager) {
        super(manager);
    }

    public void login(AccountData user) {
        driver.findElement(By.id("email_field")).click();
        driver.findElement(By.id("email_field")).clear();
        driver.findElement(By.id("email_field")).sendKeys(user.getEmail());
        driver.findElement(By.id("password_field")).clear();
        driver.findElement(By.id("password_field")).sendKeys(user.getPassword());
        driver.findElement(By.name("go")).click();
    }
}
