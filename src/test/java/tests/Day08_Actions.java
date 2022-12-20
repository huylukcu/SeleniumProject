package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Day08_Actions extends TestBase {
    @Test
    public void rightClickMethod() {

        //Given user is on the https://the-internet.herokuapp.com/context_menu
        driver.get("https://the-internet.herokuapp.com/context_menu");

        //When use Right clicks on the box
        Actions action = new Actions(driver);
        WebElement box = driver.findElement(By.id("hot-spot"));
        actions.contexClick(box, action)
        //Then verify the alert message is “You selected a context menu”

        //Then accept the alert


    }
}