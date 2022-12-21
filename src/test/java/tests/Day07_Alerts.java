package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Day07_Alerts extends TestBase {
    @Test
    public void acceptAlert() throws InterruptedException {
        //acceptAlert() => click on the first alert,
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        //verify the text “I am a JS Alert” ,
        String actualAlertText = driver.switchTo().alert().getText();//special method
        Assert.assertEquals("I am a JS Alert",actualAlertText);

        //click OK ,
        driver.switchTo().alert().accept();

        //and Verify “You successfully clicked an alert”
        String actualResult = driver.findElement(By.id("result")).getText();
        Assert.assertEquals("You successfully clicked an alert",actualResult);

        Thread.sleep(2000);
    }
    @Test
    public void dismissAlert(){
       // dismissAlert()=> click on the second alert,
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//button[@onClick='jsConfirm()']"));
        //verify text "I am a JS Confirm”,
       //click cancel,
       //and Verify “You clicked: Cancel”
    }
}

