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

        //textbox is in the iframe so we have to switch to teh iframe
        //GETTING IN THE IFRAME
         driver.switchTo().frame(0);//INDEX
        //driver.switchTo().frame("mce_0_ifr");
        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        //Locate the text box
        WebElement box = driver.findElement(By.xpath("//p"));

        //Delete the text in the text box
        box.clear();//clear() is used to delete the text is the element

        //type "I write this text"
        box.sendKeys("I write this text");

        //SO FAR DRIVER IS IN THE IFRAME,BUT Elemental Selenium text IS OUTSIDE OF THE FRAME
        driver.switchTo().parentFrame();//getting out of the frame

        //Verify the text Elemental Selenium text is displayed on the page
        Assert.assertTrue(driver.findElement(By.linkText("Elemental Selenium")).isDisplayed());
        //driver.switchTo().defaultContent()== driver tamamen framin(butun framelerin disina cikar)


        //INTERVIEW QUESTIONS
        //1)what might be the reason for your test case to fail
        //--wait problem, the page mignt be very slow
        //--locator might be incorrect
        //--data issue.typo
        //there may be iframe or alerts
        //internet can be slow

    }
}

