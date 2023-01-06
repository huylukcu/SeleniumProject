package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class Day14_ExplicitWait extends TestBase {
    /*
    Given
        Go to https://the-internet.herokuapp.com/dynamic_loading/1
    When
        User clicks on the "Start" button
    Then
        Assert the "Hello World!" Shows up on the screen
     */

     @Test
     public void explicitWaitTest(){
//         //Go to https://the-internet.herokuapp.com/dynamic_loading/1
//         driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
//        // User clicks on the "Start" button
//         driver.findElement(By.xpath("//div[@id='start']//button")).click();
//         String helloWorld = driver.findElement(By.xpath("//h4[.='Hello World!']")).getText();
//         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[.='Hello World!']")));
//         assertEquals("Hello World!",);
//




     }



}
