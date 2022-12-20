package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Day08_Actions1 extends TestBase {
            @Test
            public void rightClickTest(){
                driver.get("https://the-internet.herokuapp.com/context_menu");
            //When use Right clicks on the box
            //1. creating action object to do right click
                Actions actions = new Actions(driver);
            //2. locating the element that I want to right click
                WebElement box = driver.findElement(By.id("hot-spot"));
            //3. use actions object and appropriate function to right click
                actions.contextClick(box).perform();
            }}