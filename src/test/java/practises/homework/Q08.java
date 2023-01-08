package practises.homework;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Q08 extends TestBase {
    @Test
    public void test() throws InterruptedException {
       /*
        When user goes to https://jqueryui.com/autocomplete/
        And type Apple
        Then select Applescript
       */

        driver.get("https://jqueryui.com/autocomplete/ ");
        driver.switchTo().frame(0);
        driver.findElement(By.id("tags")).sendKeys("Apple");
        waitFor(3);
        driver.findElement(By.id("ui-id-1")).click();;

    }    }
