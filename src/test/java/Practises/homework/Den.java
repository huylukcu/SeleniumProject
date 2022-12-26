package Practises.homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class Den extends TestBase {
    @Test
    public void set() {
       /* Create a new class : GoogleSearchTest
        Create Test method and complete the following task.
        When user goes to https://www.google.com/
        Search for “porcelain teapot”
        And print how many related results displayed on Google
        */

        driver.get("https://www.google.com/");
        // Search for “porcelain teapot”
        driver.findElement(By.name("q")).sendKeys("porcelain teapot"+ Keys.ENTER);
        String searchItem = driver.findElement(By.id("result-stats")).getText();
        System.out.println(searchItem);

    }
}