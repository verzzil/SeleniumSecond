package ru.itis.selenium.helpers;

import org.openqa.selenium.*;
import ru.itis.selenium.ApplicationManager;

public class HelperBase {

    protected ApplicationManager manager;
    protected WebDriver driver;
    protected boolean acceptNextAlert = true;

    public HelperBase(ApplicationManager manager) {
        this.manager = manager;
        this.driver = manager.getDriver();
    }
}
