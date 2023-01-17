package practices.homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class review2 extends TestBase {
    // Create a new class : GoogleSearchTest
    //Create Test method and complete the following task.
    //When user goes to https://www.google.com/
    //Search for “porcelain teapot”
    //And print how many related results displayed on Google
    @Test
    public void test() {
        driver.get("https://www.google.com/");
//      locate search box and search for "porcelain teapot"
        driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("porcelain teapot"+ Keys.ENTER);

        driver.findElement(By.xpath("//*[@value='Google Search']")).click();
    }  }
