package Practises.homework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Q05 extends TestBase {
    @Test
    public void test(){

    //When user goes to https://jqueryui.com/accordion/
        driver.get("https://jqueryui.com/accordion/");
        driver.switchTo().frame(0);

    //And user clicks on Section2 accordion
        driver.findElement(By.id("ui-id-3")).click();

    // Verify the text contains “Sed non urna.”
      WebElement select2 = driver.findElement(By.("//p[contains((),'Sed non urna')]");
        Assert.assertEquals(co)
//Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ui-id-4']/p")).getText().contains("Sed non urna."));

}}
