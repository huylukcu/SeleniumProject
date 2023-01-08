package practices.homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Q02 extends TestBase {
    @Test
    public void set() {
       /* Create a new class : GoogleSearchTest
        Create Test method and complete the following task.
        When user goes to https://www.google.com/
        Search for “porcelain teapot”
        And print how many related results displayed on Google
        */

       // When user goes to https://www.google.com/
        driver.get("https://www.google.com/");
        //Search for “porcelain teapot”
        driver.findElement(By.name("q")).sendKeys("porcelain teapot"+ Keys.ENTER);
        String searchItem = driver.findElement(By.id("result-stats")).getText();
        System.out.println(searchItem);
        //And print how many related results displayed on Google
        WebElement resultText = driver.findElement(By.id("result-stats"));
        String result = resultText.getText();
        System.out.println(result);
    }
}
