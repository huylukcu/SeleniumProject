package practices.homework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Q04 extends TestBase {
/*
    Create a new class: AmazonSearch
    //TC01_As user I want to know how many item are there
    //on amazon in the first page after I search “porcelain teapot”?
    //TC02_Order the tea pot prices, find the min, max, and average price to the nearest cent.
 */
    @Test
    public void AmazonSearch(){
        driver.get("http://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("porcelain teapot"+ Keys.ENTER);

        //See how many result are there on the first page
        List<WebElement> result = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));

        System.out.println("Number of Products on the first page : " + result.size());


}}
