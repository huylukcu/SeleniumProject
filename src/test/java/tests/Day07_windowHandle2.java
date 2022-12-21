package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Day07_windowHandle2 extends TestBase {
//    Method name:windowHandle
    @Test
    public void windowHandle(){
        //Given user is on the https://the-internet.herokuapp.com/windows
        driver.get("https://the-internet.herokuapp.com/windows");

        //Then user verifies the text : “Opening a new window”
        String window1Text = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("Opening a new window",window1Text);

        //Then user verifies the title of the page is “The Internet”
        Assert.assertEquals("The Internet",driver.getTitle());

        //When user clicks on the “Click Here” button
        driver.findElement(By.linkText("Click Here")).click();

        //Then user verifies the new window title is “New Window”











//    Then user verifies the new window title is “New Window”
//    Then user verifies the text:  “New Window”
//    When user goes back to the previous window and then verifies the title : “The Internet”
//
}}
