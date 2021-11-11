package ru.itis.selenium;

import org.junit.Test;
import ru.itis.selenium.model.AccountData;
import ru.itis.selenium.model.PersonalData;
import ru.itis.selenium.tests.TestBase;

public class EditDataTestCase extends TestBase {

    PersonalData person = new PersonalData(null, "Андроид-разработчик", null, "Россия", "Татарстан", "Казань", null, null);

    AccountData user = new AccountData("xannanov.albert@mail.ru", "qwerty007");

    @Test
    public void editData() {
        openHomePage();
        openGroupPage();
        login(user);
        goToAccount();
        editDataFields(person);
    }

}

