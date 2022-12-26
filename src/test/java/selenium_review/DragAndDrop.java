package selenium_review;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class DragAndDrop extends TestBase {
    @Test
    public void dragAndDropTest() {
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement sourse = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
    }

}