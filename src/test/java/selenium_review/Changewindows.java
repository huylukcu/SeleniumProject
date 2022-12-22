package selenium_review;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;

public class Changewindows extends TestBase {
    @Test
    public void changeTab(){

        //Given user is on the https://the-internet.herokuapp.com/windows
        driver.get("https://the-internet.herokuapp.com/windows");
        //click on "Click Here"
        driver.findElement(By.linkText("Click Here")).click();

        //verify that new title is "New window"
        assertEquals("New Window",driver.getTitle());

        //verify that new title is not "The internet"


    }
}
