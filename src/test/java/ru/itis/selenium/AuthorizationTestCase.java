package ru.itis.selenium;

import org.junit.Test;
import ru.itis.selenium.model.AccountData;
import ru.itis.selenium.tests.TestBase;

public class AuthorizationTestCase extends TestBase {

    AccountData user = new AccountData("xannanov.albert@mail.ru", "qwerty007");

    @Test
    public void AuthorizationTestCase() throws Exception {
        app.getNavigation().openHomePage();
        app.getNavigation().openGroupPage();
        app.getAuth().login(user);
    }

}

