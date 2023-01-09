package practices.homework;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import static org.junit.Assert.assertTrue;

public class Q05 extends TestBase {
    @Test
    public void test(){

    //When user goes to https://jqueryui.com/accordion/
        driver.get("https://jqueryui.com/accordion/");
        driver.switchTo().frame(0);

    //And user clicks on Section2 accordion
        driver.findElement(By.id("ui-id-3")).click();

        waitFor(2);
     //Verify the text contains “Sed non urna.”
        String text = driver.findElement(By.xpath("//*[@id='ui-id-4']")).getText();
        assertTrue(text.contains("Sed non urna."));
    }
}