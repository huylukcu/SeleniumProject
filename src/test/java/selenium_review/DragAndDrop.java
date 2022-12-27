package selenium_review;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class DragAndDrop extends TestBase {
    @Test
    public void dragAndDropTest() {
        driver.get("https://jqueryui.com/droppable/");
        //belows elements in the iframes so switch to iframe first
        driver.switchTo().frame(0);

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();
    }
    @Test
            public void test2() {

        driver.get("https://jqueryui.com/droppable/");
        //belows elements in the iframes so switch to iframe first
        driver.switchTo().frame(0);

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        action.clickAndHold(source).moveToElement(target).build().perform();


    }}