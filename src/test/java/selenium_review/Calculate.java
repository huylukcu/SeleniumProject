package selenium_review;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Calculate extends TestBase {
    // ...Exercise3...
    //fill the date
    //choose your profession -> Automation Tester
    //choose your tool -> Selenium Webdriver
    //choose your continent -> Antartica
    //choose your command  -> Browser Commands
    //click submit button

    @Test
    public void Test() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //driver.findElement(By.id("number1")).sendKeys("6");
        //driver.findElement(By.id("function")).click();
        driver.findElement(By.id("calculatetest")).click();
        driver.findElement(By.id("number1")).sendKeys("20");
        driver.findElement(By.id("number2")).sendKeys("30");
        driver.findElement(By.id("calculate")).click();
        System.out.println(driver.findElement(By.id("answer")).getText());


    }


}