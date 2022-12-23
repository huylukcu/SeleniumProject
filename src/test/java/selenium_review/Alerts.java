package selenium_review;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Alerts extends TestBase {
    @Test
    public void acceptAlert() throws InterruptedException {
       // acceptAlert() ===>click on the first alert
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
        //verify the text “I am a JS Alert” ,
        String x = driver.switchTo().alert().getText();
        Assert.assertEquals("I am a JS Alert",x);
        //click OK ,
        driver.switchTo().alert().accept();
        //and Verify “You successfully clicked an alert”



    }
}
