package tests;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Day08_Actions03 extends TestBase {
   /* Create a class: ActionClass3
    Create test method : scrollUpDown()
    Go to techproeducation
    Scroll the page down
    Scroll the page up*/
    @Test
    public void pageUpDownTest() throws InterruptedException {
        driver.get("https://www.techproeducation.com/");
        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //CHAIN METHOD ==>Scrolling 3 times
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();

        //ARROW DOWN = scroll down a little bit. This scrolls less than page down
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(3000);

        //PAGE_UP = scroll up
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(3000);

       //ARROW_UP = scroll up a little bit. This scrolls less than page up
        actions.sendKeys(Keys.ARROW_UP).perform();

    }
}
