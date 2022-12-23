package Practises;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;

public class Q06_Alert extends TestBase {
    /*
    Given
        Go to "http://webdriveruniversity.com/Popup-Alerts/index.html"
    When
        Click "CLICK ME" of JavaScript Alert
    And
        Get the pop-up text
    Then
        Verify that message is "I am an alert box!"
    When
        Accept pop-up
     */

    @Test
    public void test(){
        //Go to "http://webdriveruniversity.com/Popup-Alerts/index.html"
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");

        //Click "CLICK ME" of JavaScript Alert
        driver.findElement(By.id("button1")).click();

        //Get the Alert text
        String alertMessage = driver.switchTo().alert().getText();

        //Verify that message is "I am an alert box!"
        assertEquals("I am an alert box!",alertMessage);

        //Accept Alert
        driver.switchTo().alert().accept();

    }
}







