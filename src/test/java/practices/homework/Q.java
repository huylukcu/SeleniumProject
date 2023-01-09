package practices.homework;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Q extends TestBase {
    @Test
    public void test() {

//        When user goes to https://jqueryui.com/autocomplete/
        driver.get("https://jqueryui.com/autocomplete/");

//        And type Apple
        driver.switchTo().frame(0);

        driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("Apple");

        waitFor(3);
        driver.findElement(By.xpath("(//*[text()='AppleScript'])[1]")).click();
    }

//        Then select Applescript
}
