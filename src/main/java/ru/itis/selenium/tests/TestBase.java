package ru.itis.selenium.tests;

import org.junit.After;
import org.junit.Before;
import ru.itis.selenium.ApplicationManager;

public class TestBase {

    protected ApplicationManager app;

    @Before
    public void setUp() throws Exception {
        app = new ApplicationManager();
    }

    @After
    public void tearDown() throws Exception {
        app.stop();
    }
}
