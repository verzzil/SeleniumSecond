package ru.itis.selenium.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import ru.itis.selenium.ApplicationManager;
import ru.itis.selenium.model.PersonalData;

public class ContactHelper extends HelperBase{

    public ContactHelper(ApplicationManager manager) {
        super(manager);
    }

    public void editDataFields(PersonalData person) {
        driver.findElement(By.name("speciality")).click();
        driver.findElement(By.name("speciality")).clear();
        driver.findElement(By.name("speciality")).sendKeys(person.getSpecialization());
        driver.findElement(By.xpath("//div[@id='app']/div/div[2]/main/div/div/div/div/div/div[3]/div/form/div")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Местоположение'])[1]/following::*[name()='svg'][2]")).click();
        driver.findElement(By.name("locationCountryId")).click();
        new Select(driver.findElement(By.name("locationCountryId"))).selectByVisibleText(person.getCountry());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Местоположение'])[1]/following::*[name()='svg'][2]")).click();
        driver.findElement(By.name("locationRegionId")).click();
        new Select(driver.findElement(By.name("locationRegionId"))).selectByVisibleText(person.getRegion());
        driver.findElement(By.name("locationCityId")).click();
        new Select(driver.findElement(By.name("locationCityId"))).selectByVisibleText(person.getCity());
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
