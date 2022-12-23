package selenium_review;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Amz extends TestBase {
    @Test
    public void homework03(){
        //When user goes to https://www.google.com/
        driver.get("https://www.google.com/");
        //Search for "porcelain teapot"
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("porcelain teapot");
        driver.findElement(By.name("btnK")).click();
        System.out.println(driver.findElement(By.id("result-stats")).getText());

}}
