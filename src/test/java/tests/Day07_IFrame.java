package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.Set;

public class Day07_IFrame extends TestBase {
    @Test
    public void iframeTest(){
        //Create a class: IFrame
        //Create a method: iframeTest
        //Go to https://the-internet.herokuapp.com/iframe
        driver.get("https://the-internet.herokuapp.com/iframe");

        //Verify the Bolded text contains “Editor”
        //Header is not in the iframe so do not switch to iframe
        String header = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertTrue(header.contains("Editor"));

        //NOTE: textbox is in the iframe so we have to switch to teh iframe
        driver.switchTo().frame(0);

        //Locate the text box
        WebElement box = driver.findElement(By.xpath("//p"));
        //Delete the text in the text box
        box.clear();//clear() is used to delete the text is the elements

        //Type “This text box is inside the iframe”
        //Verify the text Elemental Selenium text is displayed on the page

    }
}

