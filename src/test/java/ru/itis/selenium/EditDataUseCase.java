package ru.itis.selenium;

import org.junit.Test;
import ru.itis.selenium.model.PersonalData;
import ru.itis.selenium.tests.TestBase;

public class EditDataUseCase extends TestBase {

    PersonalData person = new PersonalData(null, "Андроид-разработчик", null, "Россия", "Татарстан", "Казань", null, null);

    @Test
    public void editData() {
        app.getNavigation().goToAccount();
        app.getContact().editDataFields(person);
    }
}
