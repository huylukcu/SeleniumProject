package selenium_review;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Action extends TestBase {
    @Test
    public void rightClickTest(){
        driver.get("https://the-internet.herokuapp.com/context_menu");
        //Right-click on the box
        Actions actions = new Actions(driver);
        WebElement box = driver.findElement(By.id("hot-spot"));
        actions.contextClick(box).perform();
        String text = driver.switchTo().alert().getText();
        Assert.assertEquals("You selected a context menu",text);
        driver.switchTo().alert().accept();



    }
}
