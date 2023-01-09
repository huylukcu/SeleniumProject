package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import utilities.TestBase;

import java.io.IOException;

public class Day13_JSExecutor extends TestBase {

    @Test
    public void scrollIntoViewTest() throws IOException, IOException {
            /*
    Given
        Go to https://techproeducation.com/"
    When
        Scroll into "WE OFFER"
    And
        Scroll into "LMS LOGIN"
    And
        Scroll into "WHY US"
    And
        Scroll back up to "Enroll Free"
    And
        Scroll all the way down
    And
        Scroll all the way up
    Then
        Take a screenshot of each step
     */
        driver.get("https://techproeducation.com/");
        waitFor(3);
//        1. create js executor object
        JavascriptExecutor js =(JavascriptExecutor)driver; //
//        2. execute the command
        waitFor(3);
//        scrolling We Offer element
        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//*[.='we offer']")));
        takeScreenshotOfPage();
        waitFor(3);
//        scrolling LMS LOGIN element
        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[.=' Enroll Free ']")));
        takeScreenshotOfPage();

        waitFor(3);
//        scrolling WHY US element
        scrollIntoViewJS(driver.findElement(By.xpath("//h3[.='WHY US?']")));
        takeScreenshotOfPage();
        waitFor(3);
//        scrolling back up to enroll free
        scrollIntoViewJS(driver.findElement(By.xpath("//span[.=' Enroll Free ']")));
        takeScreenshotOfPage();
     /*
     * What is JS Executor?
     * It is an API which is used to execute javascript comments in Selenium
     * JS Executor is coming from selenium
     *
     * Why are we learning JavaScript Executor?
     * We might need some js executor method to interact with some webElements
     * When traditional methods are not enough
     * click, scrolling into a specific element
     *
     * What can we do by using JS Executor?
     * Click. It is good especially when we want to click a hidden element.
     * Scroll onto a specific webelement, scroll down/up/right/left
     * Type an input
     * Change the value of an element
     * Hover over
     * Change background colour..
     * */

     /*

      */
    }
}
