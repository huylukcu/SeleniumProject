package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Day08_Actions02 extends TestBase {
    /*
        Given
                ("https://www.amazon.com/");//go to url
        When
                Hover over "Hover Div"
        And
                Click on “Can you click me?” link.
        Then
                Verify the text "Action Complete".
        */
    @Test
    public void hoverOverTest() throws InterruptedException {
        driver.get("https://www.amazon.com/");//go to url
        //when we click on "Account" link
        WebElement account =driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);//Action yada Webelementin basta yada burda olmasi sorun degil
        actions.moveToElement(account).perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Account")).click();
        //then verify the page title contains "Your Account"
        Assert.assertTrue(driver.getTitle().contains("Your Account"));






    }

}
