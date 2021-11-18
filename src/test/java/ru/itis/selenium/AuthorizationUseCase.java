package ru.itis.selenium;

import org.junit.Test;
import ru.itis.selenium.model.PersonalData;
import ru.itis.selenium.tests.TestBase;

public class AuthorizationUseCase extends TestBase {

    PersonalData person = new PersonalData(null, "Андроид-разработчик", null, "Россия", "Татарстан", "Казань", null, null);

    @Test
    public void authorizationTestCase() {
        app.getNavigation().openHomePage();
        app.getNavigation().openGroupPage();
        app.getAuth().login(user);
    }
}

