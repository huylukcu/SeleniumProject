package selenium_review;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C_DoubleClick extends TestBase {
    @Test
    public void Test1() throws InterruptedException {
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        //"Double-click me to change my text color." it is framework
        driver.switchTo().frame("iframeResult");
        Actions actions = new Actions(driver);
        //find element
        WebElement text = driver.findElement(By.id("demo"));
        //double click
        actions.doubleClick(text).perform();

        Assert.assertTrue(text.getAttribute("style").contains("red"));
    }
}

