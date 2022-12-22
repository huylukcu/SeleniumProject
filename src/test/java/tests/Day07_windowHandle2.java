package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.util.Set;

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

        //GETTING THE WINDOW 1 HANDLE(UNIQUE PAGE ID)
        String window1handle =driver.getWindowHandle(); //RETURN THE CURRENT WINDOW ID
        System.out.println(window1handle);

        //When user clicks on the “Click Here” button
        driver.findElement(By.linkText("Click Here")).click();

        //Then user verifies the new window title is “New Window”
        //WE DO TESTING IN A NEW WINDOW, SO WE MUST SWITCH TO THAT WINDOW
        //AS OF NOW 2 WINDOWS OPEN. USE getWindowHandles() TO GET BOTH IDS
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles);
        //NOTE: Driver is on the window1 loop through all windows switch to the onethat is not window1 handle
        for(String eachhandle : allWindowHandles){  //looping through the windows
            if(!eachhandle.equals(window1handle)){   //if we are not window 1(means window 2)
                driver.switchTo().window(eachhandle); //then switch the window 2
            }
        }
        //Then user verifies the new window title is “New Window”












//    Then user verifies the text:  “New Window”
//    When user goes back to the previous window and then verifies the title : “The Internet”
//
}}
