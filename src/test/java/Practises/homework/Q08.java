package Practises.homework;

import org.junit.Test;
import utilities.TestBase;
import org.openqa.selenium.JavascriptExecutor;

public class Q08 extends TestBase {
    @Test
    public void test() {

        //When user goes to https://jqueryui.com/autocomplete/
        driver.get("https://jqueryui.com/autocomplete");

         JavascriptExecutor js = (JavascriptExecutor)driver;
        //And type Apple
        //Then select Applescript
    }
}