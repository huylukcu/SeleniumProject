package practises.practice03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;

public class Q01_DragDrop extends TestBase {
    @Test
    public void dragAndDropTest() {
        /*
    Given
        Go to https://demo.guru99.com/test/drag_drop.html
    When
        Drag orange elements on proper boxes below them
    Then
        Verify they are dropped.
 */
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        WebElement bank = driver.findElement(By.id("credit2"));
        WebElement debitAccount = driver.findElement(By.id("bank"));
        WebElement sales = driver.findElement(By.id("credit1"));
        WebElement creditAccount = driver.findElement(By.id("loan"));
        WebElement price = driver.findElement(By.id("fourth"));
        WebElement debitAmount = driver.findElement(By.id("amt7"));
        WebElement creditAmount = driver.findElement(By.id("amt8"));

        //Create actions obj
        Actions actions = new Actions(driver);

        //Drag sources to target:
        //actions.clickAndHold(source).moveToElement(target).perform();
        actions.dragAndDrop(bank,debitAccount).perform();
        actions.dragAndDrop(sales,creditAccount).perform();
        actions.dragAndDrop(price,debitAmount).perform();
        actions.dragAndDrop(price,creditAmount).perform();

        //Verify they are dropped.
        WebElement perfect = driver.findElement(By.id("equal"));
        assertEquals("Perfect!", perfect.getText());
    }
}