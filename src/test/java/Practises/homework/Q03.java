package Practises.homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Q03 extends TestBase {
    /*
    Then create 3 different test methods using the following names.
    And Go to google.
    titleTest =>Verify if google title = “Google”
    imageTest => Verify if google image displays or not
    gmailLinkTest => Verify if the Gmail link is displayed or not
    Close the browser after each test
     */
    @Test
    public void titleTest() {
        driver.get("https://www.google.com/");
        //titleTest =>Verify if google title = “Google”
        //Assert.assertTrue(driver.getTitle().contains("Google"));
        //Verify if google title is "Google"
        String title = driver.getTitle();
        System.out.println("Title : " + title);
        Assert.assertEquals("Google", title);
    }
    //2.imageTest => Verify if google image displays or not
     @Test
     public void imageTest() {
        driver.get("https://www.google.com/");
        WebElement image = driver.findElement(By.id("hplogo"));
        Assert.assertTrue(image.isDisplayed());
     }
    //3.Verify if the Gmail link is displayed
    @Test
    public void linkTest() {
        driver.get("https://www.google.com/");
        WebElement gmail = driver.findElement(By.linkText("Gmail"));
        Assert.assertTrue(gmail.isDisplayed());

    }
}
