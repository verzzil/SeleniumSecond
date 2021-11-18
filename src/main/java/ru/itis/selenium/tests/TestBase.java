package ru.itis.selenium.tests;

import org.junit.Before;
import ru.itis.selenium.ApplicationManager;
import ru.itis.selenium.model.AccountData;

public class TestBase {

    public ApplicationManager app;
    protected AccountData user = new AccountData("xannanov.albert@mail.ru", "qwerty007");

    @Before
    public void setUp() throws Exception {
        app = ApplicationManager.getInstance();
    }
}
