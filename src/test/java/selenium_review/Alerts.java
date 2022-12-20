package selenium_review;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Alerts extends TestBase {
    @Test
    public void acceptAlert(){
       // acceptAlert() ===>click on the first alert
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        driver.findElement(By.xpath("//button[@class='btn btn-primary'][1]")).click();
        //verify the text "I am a Js Alert"
        String actualAlertText= driver.switchTo().alert().getText();//special
        Assert.assertEquals("I am a Js Alert",actualAlertText);
        //click OK,
        driver.switchTo().alert().accept();

    }
}