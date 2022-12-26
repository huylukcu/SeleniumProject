package selenium_review;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class Register extends TestBase {
    @Test
    public void test(){
        driver.get("http://automationexercise.com");
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hay");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("hayuycu@gmail.com");
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
    }

    }

