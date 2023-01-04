package Practises.homework;
import org.junit.Test;
import org.openqa.selenium.By;
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
    // Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ui-id-4']/p")).getText().contains("Sed non urna."));
}}
//    @Test
//    public void test() {
//
////        When user goes to https://jqueryui.com/autocomplete/
//        driver.get("https://jqueryui.com/autocomplete/");
//
////        And type Apple
//        driver.switchTo().frame(0);
//
//        driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("Apple");
//
//        waitFor(3);
//
////        Then select Applescript
//
//        driver.findElement(By.xpath("(//*[text()='AppleScript'])[1]")).click();
//    }
