package Practises.homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class Den extends TestBase {
    @Test
    public void set() {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("porcelain teapot"+ Keys.ENTER);
        String searchItem = driver.findElement(By.id("result-stats")).getText();
        System.out.println(searchItem);

    }
}